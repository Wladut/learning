/*
 * Autosar_CDD.c
 *
 *  Created on: 14.10.2021
 */


#include "Platform_Types.h"
#include "Autosar_CDD.h"
#include "Rte_Autosar_CDD.h"

#define AUTOSAR_CDD_KILOMETER_VALUE_TO_COMPARE 100 /*This value will be checked to compare the COM Kilometer value with the NvM Kilometer Value*/

uint8 Autosar_CDD_Global_State = 0; /*Store the Autosar_CDD global state*/

/*NvM related RAM Global Variables*/
uint32 Autosar_CDD_Engine_NvM_Value;
uint32 Autosar_CDD_Kilometer_NvM_Value;
uint32 Autosar_CDD_Speed_NvM_Value;


/*COM related RAM Global Variables*/
uint32 Autosar_CDD_Engine_COM_Value;
uint32 Autosar_CDD_Kilometer_COM_Value;
uint32 Autosar_CDD_Speed_COM_Value;



/******************************************
 * Name                       : Autosar_CDD_Init
 * Description                : This function shall be called by BswM after the ReadAll phase is finished
 * Parameters                 : Void
 * Return                     : Void
 * Critical                   : none
 ******************************************/
void Autosar_CDD_Init(void)
{
   /*If Autosar_CDD_Init() is called then the ECU is started and we can read the data from NvM */


   /*Read the Engine value that was stored in the non-volatile memory*/
   AUTOSAR_CDD_NvM_Read_Engine_Block(&Autosar_CDD_Engine_NvM_Value);

   /*  Home Work -> Memory Stack Curs 1 :
    *  Read the Kilometer and Speed block
    * */

   /* Starting Home Work */

   /*Read the Kilometer value that was stored in the non-volatile memory*/
   AUTOSAR_CDD_NvM_Read_Kilometer_Block(&Autosar_CDD_Kilometer_NvM_Value);

   /*Read the Speed value that was stored in the non-volatile memory*/
   AUTOSAR_CDD_NvM_Read_Speed_Block(&Autosar_CDD_Speed_NvM_Value);


   /* Ending Home Work */

   Autosar_CDD_Global_State = 1; /*Mark that the Autosar_CDD module is initialized*/
}

/******************************************
 * Name                       : Autosar_CDD_MainFunction
 * Description                : This function shall be called in a cyclic 10ms Task
 * Parameters                 : Void
 * Return                     : Void
 * Critical                   : none
 ******************************************/
void Autosar_CDD_MainFunction(void)
{
   if(Autosar_CDD_Global_State == 1)
   {
      /*Read COM Engine signal */
      AUTOSAR_CDD_COM_Read_Engine_Value(&Autosar_CDD_Engine_COM_Value);

      /*Compare the value from COM with the value from NvM. If the COM value is greater then NvM value, then update the NvM value */
      if(Autosar_CDD_Engine_COM_Value > Autosar_CDD_Engine_NvM_Value)
      {
         Autosar_CDD_Engine_NvM_Value = Autosar_CDD_Engine_COM_Value;
      }


      /*  Home Work -> Memory Stack Curs 1 :
       *  Read the Kilometer and Speed COM signal and update the NvM data if the COM data is greater than NvM data
       * */

/* Starting Home Work */

      /*Read COM Kilometer signal */
      AUTOSAR_CDD_COM_Read_Kilometer_Value(&Autosar_CDD_Kilometer_COM_Value);

      /*Compare the value from COM with the value from NvM. If the COM value is greater then NvM value, then update the NvM value */
      if(Autosar_CDD_Kilometer_COM_Value > Autosar_CDD_Kilometer_NvM_Value)
      {
         Autosar_CDD_Kilometer_NvM_Value = Autosar_CDD_Kilometer_COM_Value;
      }

      /*Read COM Speed signal */
      AUTOSAR_CDD_COM_Read_Speed_Value(&Autosar_CDD_Speed_COM_Value);

      /*Compare the value from COM with the value from NvM. If the COM value is greater then NvM value, then update the NvM value */
      if(Autosar_CDD_Speed_COM_Value > Autosar_CDD_Speed_NvM_Value)
      {
         Autosar_CDD_Speed_NvM_Value = Autosar_CDD_Speed_COM_Value;
      }


/* Ending Home Work */

      /*Compare the Kilometer value that is read from the COM with the value stored in the NvM*/
      if(Autosar_CDD_Speed_COM_Value < (Autosar_CDD_Speed_NvM_Value - AUTOSAR_CDD_KILOMETER_VALUE_TO_COMPARE))
      {
         /*The values is less than expected, the Kilometer was changed, set an Error, a DTC*/

         /*  Home Work -> Diagnostic Stack Curs 3 :
          *  Call the proper DEM interface in order to set a DTC, check in the Autosar_CDD.h the needed interface
          *  !Parameter EventStatus shall be with the value 0x01 to mark the DTC as failed. 0x00 means passed.
          * */

         /* Starting Home Work */

         /* Ending Home Work */
      }
   }


}

/******************************************
 * Name                       : Autosar_CDD_Stop
 * Description                : This function shall be called in when the ECU enters in Sleep.
 *                              It shall be called before the interface NvM_WriteAll() is called
 * Parameters                 : Void
 * Return                     : Void
 * Critical                   : none
 ******************************************/
void Autosar_CDD_Stop(void)
{
   /*If the Autosar_CDD_Stop() is called we can write all the blocks*/

   /*Write NvM Engine Block */
   AUTOSAR_CDD_NvM_Write_Engine_Block(&Autosar_CDD_Engine_NvM_Value);

   /*  Home Work -> Memory Stack Curs 1 :
    *  Write the Kilometer and Speed block
    * */

   /* Starting Home Work */

   /*Write NvM Kilometer Block */
   AUTOSAR_CDD_NvM_Write_Kilometer_Block(&Autosar_CDD_Kilometer_NvM_Value);

   /*Write NvM Speed Block */
   AUTOSAR_CDD_NvM_Write_Speed_Block(&Autosar_CDD_Speed_NvM_Value);

   /* Ending Home Work */
}

/******************************************
 * Name                       : Autosar_CDD_ReadDataByIdentifierKilometer
 * Description                : This function shall be called by DCM if the Kilometer value shall be provided to the tester.
 * Parameters                 : uint8 OpStatus, uint8 *Data
 * Return                     : Std_ReturnType
 * Critical                   : none
 ******************************************/
Std_ReturnType Autosar_CDD_ReadDataByIdentifierKilometer(uint8 OpStatus, uint8 *Data)
{
   *Data[0] = (uint8)(Autosar_CDD_Kilometer_NvM_Value>>24); /*Take the highest 8 bit Value from the 32 bit variable*/
   *Data[1] = (uint8)(Autosar_CDD_Kilometer_NvM_Value>>16);
   *Data[2] = (uint8)(Autosar_CDD_Kilometer_NvM_Value>>8);
   *Data[3] = (uint8)(Autosar_CDD_Kilometer_NvM_Value);     /*Take the lowest 8 bit Value from the 32 bit variable*/

   return E_OK;
}



/******************************************
 * Name                       : Autosar_CDD_ReadDataByIdentifierSpeed
 * Description                : This function shall be called by DCM if the Speed value shall be provided to the tester.
 * Parameters                 : uint8 OpStatus, uint8 *Data
 * Return                     : Std_ReturnType
 * Critical                   : none
 ******************************************/
Std_ReturnType Autosar_CDD_ReadDataByIdentifierSpeed(uint8 OpStatus, uint8 *Data)
{
   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Update the DCM command with the actual value of the Speed. The value that is stored in the non-volatile memory
    * */

   /* Starting Home Work */

   /* Ending Home Work */

   return E_OK;
}


/******************************************
 * Name                       : Autosar_CDD_ReadDataByIdentifierEngine
 * Description                : This function shall be called by DCM if the Engine value shall be provided to the tester.
 * Parameters                 : uint8 OpStatus, uint8 *Data
 * Return                     : Std_ReturnType
 * Critical                   : none
 ******************************************/
Std_ReturnType Autosar_CDD_ReadDataByIdentifierEngine(uint8 OpStatus, uint8 *Data)
{
   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Update the DCM command with the actual value of the Engine. The value that is stored in the non-volatile memory
    * */

   /* Starting Home Work */

   /* Ending Home Work */

   return E_OK;
}

