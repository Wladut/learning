/*
 * Rte.c
 *
 *  Created on: 14.10.2021
 */

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
   Fls_MainFunction();

   BswM_MainFunction();

   /*  Home Work -> System Stack Curs 2 :
    *  Call the specific AUTOSAR_CDD_Interface
    * */

   /* Starting Home Work */
   Autosar_CDD_MainFunction();
   /* Ending Home Work */

}

