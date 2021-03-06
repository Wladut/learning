/*
 * Rte.c
 *
 *  Created on: 22.10.2021
 */

#include "Rte.h"


Task(OS_StartUp_Task)
{
   /*  Home Work -> System Stack Curs 2 :
    *  Call the specific EcuM Interface, check the Training documentation -> Stari Generale
    * */

   /* Starting Home Work */

   EcuM_StartUp_Two();
   /* Ending Home Work */

}


Task(OS_10ms_Cyclic_Task)
{
   /*This is the Task body context*/

   NvM_MainFunction();
   Fee_MainFunction();
   Ea_MainFunction();
   Eep_MainFunction();
   Fls_MainFunction();

   BswM_MainFunction();

   /*  Home Work -> System Stack Curs 2 :
    *  Call the specific AUTOSAR_CDD_Interface
    * */

   /* Starting Home Work */

   Autosar_CDD_MainFunction();

   /* Ending Home Work */

}


Std_ReturnType Rte_Call_AUTOSAR_CDD_NvM_Engine_Block_WriteBlock(const void *data)
{
   return NvM_WriteBlock( 7,data); /*The value 499 will be automatically generated by the RTE*/
}
Std_ReturnType Rte_Call_AUTOSAR_CDD_NvM_Kilometer_Block_WriteBlock(data)
{
   return NvM_WriteBlock( 5,data); /*The value 499 will be automatically generated by the RTE*/
}
Std_ReturnType Rte_Call_AUTOSAR_CDD_NvM_Speed_Block_WriteBlock(data)
{
 return NvM_WriteBlock( 6,data); /*The value 499 will be automatically generated by the RTE*/
}

/*  Home Work -> RTE Curs 5 :
 *  Define the needed interfaces for all Rte_Call_AUTOSAR_CDD_NvM_ * _Block_ReadBlock()
 * */
Std_ReturnType Rte_Call_AUTOSAR_CDD_NvM_Engine_Block_ReadBlock(uint8* data)
{
	return NvM_ReadBlock(7, data);
}

Std_ReturnType Rte_Call_AUTOSAR_CDD_NvM_Kilometer_Block_ReadBlock(uint8* data)
{
	return NvM_ReadBlock(5, data);
}

Std_ReturnType Rte_Call_AUTOSAR_CDD_NvM_Speed_Block_ReadBlock(uint8* data)
{
	return NvM_ReadBlock(6,data);
}
/* Starting Home Work */
/* Ending Home Work */

Std_ReturnType Rte_Read_ReadKilometerPort_Kilometer(uint8 * data)
{
   (void) Com_ReceiveSignal(6,data);

   return 0;
}

/*  Home Work -> RTE Curs 5 :
 *  Define the needed interfaces for all Rte_Read_Read*_*()
 * */

/* Starting Home Work */
Std_ReturnType Rte_Read_ReadEnginePort_Engine(uint8* data)
{
	(void) Com_ReceiveSignal(7,data);
	return 0;
}

Std_ReturnType Rte_Read_ReadSpeedPort_Speed(uint8* data)
{
	(void) Com_ReceiveSignal(5,data);
	return 0;
}
/* Ending Home Work */
