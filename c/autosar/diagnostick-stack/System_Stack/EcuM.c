/*
 * EcuM.c
 *
 *  Created on: 14.10.2021
 */

#include "Platform_Types.h"
#include "EcuM.h"
#include "Os.h"

void EcuM_StartUp_Two(void)
{
   /*  Home Work -> System Stack Curs 2 :
    *  Call the needed Interface, check the Training documentation -> Stari Generale.
    *  One interface shall be called here for BswM and one for Autosar_CDD module
    * */

   /* Starting Home Work */

   Autosar_CDD_Init();

   BswM_Init(NULL_PTR);
   /* Ending Home Work */

}

void EcuM_Init(void)
{
   /*  Home Work -> System Stack Curs 2 :
    *  Call the specific OS Interface, check the Training documentation -> Stari Generale.
    *  Two interfaces shall be called here
    * */

   /* Starting Home Work */

   StartCore(0);

   StartOs();
   /* Ending Home Work */

}

void EcuM_RequestRun(void)
{

}

void EcuM_Shutdown(void)
{

}
