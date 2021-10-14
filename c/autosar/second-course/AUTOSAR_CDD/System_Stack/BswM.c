/*
 * BswM.c
 *
 *  Created on: 14.10.2021
 */

#include "Platform_Types.h"

uint8 BswM_IgnitionOff_Status;

/*This Action will call the needed functions to enter in Sleep*/
static void BswM_Action_TriggerSleep()
{
   /*  Home Work -> System Stack Curs 2 :
    *  Call the specific EcuM and AUTOSAR_CDD Interfaces, check the Training documentation -> Slide 20
    * */

   /* Starting Home Work */
	Autosar_CDD_Stop();
	EcuM_Shutdown();
   /* Ending Home Work */

}


/*This Expression is checking the precondition to enter in Sleep*/
static uint8 BswM_Expression_CheckSleep()
{
   uint8 return_value;

   if(TRUE == BswM_IgnitionOff_Status)
   {
      return_value = TRUE;
   }
   else
   {
      return_value = FALSE;
   }

   return return_value;
}

/*This rule will check the Expression and if it is true will trigger the Action to enter in Sleep*/
static void BswM_Rule_CheckSleep()
{
   if(TRUE == BswM_Expression_CheckSleep())
   {
      BswM_Action_TriggerSleep();
   }
   else
   {
      /*Do Nothing*/
   }

}


void BswM_MainFunction()
{

   /*The Rule is called cyclic*/
   BswM_Rule_CheckSleep();
}

void BswM_Init(BswM_ConfigType * ConfigPtr)
{

}

