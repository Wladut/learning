/*
 * EcuM.c
 *
 *  Created on: 19.10.2021
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

   /*  Home Work -> Communication Stack Curs 4 :
    *  Call the needed interfaces for NvM, Fee, Fee, EA, Fls, Eep, DEM, DCM, COM. Please search in the Memory,Diagnostic and COM Presentations.
    * */

   /* Starting Home Work */
   Dem_PreInit();
   NvM_Init();
   Fee_Init();
   Ea_Init();
   Fls_Init(NULL_PTR);
   Eep_Init(NULL_PTR);
   Dcm_Init();
   NvM_ReadAll();
   Dem_Init(NULL_PTR);
   Com_Init(NULL_PTR);
   FrSM_Init(NULL_PTR);
   ComM_Init();
   ComM_RequestComMode((uint8)USER, (uint8)COMM_FULL_COMMUNICATON);
   Nm_Init();
   /* Ending Home Work */

}

void EcuM_RequestRun(void)
{

}

void EcuM_Shutdown(void)
{
   /*  Home Work -> Communication Stack Curs 4 :
    *  Call the needed interfaces for NvM, Fee, Fee, EA, Fls, Eep, DEM, DCM, COM. Please search in the Memory,Diagnostic and COM Presentations.
    * */

   /* Starting Home Work */
	NvM_WriteAll();
	Dem_ShutDown();
	Com_RequestComMode((uint8)USER, (uint8)COMM_NO_COMMUNICATION);
   /* Ending Home Work */
}
