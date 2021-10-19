/*
 * Fee.c
 *
 *  Created on: 19.10.2021
 */

#include "Fee.h"
#include "Platform_Types.h"

   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Define the Specific FEE interfaces
    * */

   /* Starting Home Work */

void Fee_Init(void)
{

}

Std_ReturnType Fee_Write( uint16 BlockNumber, uint8 * DataBufferPtr)
{
   return E_OK;
}

Std_ReturnType Fee_Read( uint16 BlockNumber,uint8 Offset, uint8 * DataBufferPtr, uint8 Length)
{
   return E_OK;
}

void Fee_MainFunction(void)
{

}

MemIf_StatusType Fee_GetStatus(void)
{
   return MEMIF_IDLE;
}

void Fee_Cancel(void)
{

}

void Fee_JobEndNotification( void )
{

}

void Fee_JobErrorNotification( void )
{

}
   /* Ending Home Work */

