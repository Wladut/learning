/*
 * Autosar_CDD.c
 *
 *  Created on: 17 feb. 2019
 *      Author: Suciu Mihai
 */


#include "Platform_Types.h"
#include "Autosar_CDD.h"
#include "Rte_Autosar_CDD.h"

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
   if(Autosar_CDD_Global_State)
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
