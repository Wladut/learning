/*
 * Ea.c
 *
 *  Created on: 22.10.2021
 */

#include "Ea.h"
#include "Platform_Types.h"
   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Define the Specific EA interfaces
    * */

   /* Starting Home Work */
void Ea_Init(void)
{

}

Std_ReturnType Ea_Write( uint16 BlockNumber, uint8 * DataBufferPtr)
{
   return E_OK;
}

Std_ReturnType Ea_Read( uint16 BlockNumber,uint8 Offset, uint8 * DataBufferPtr, uint8 Length)
{
   return E_OK;
}

void Ea_MainFunction(void)
{

}

MemIf_StatusType Ea_GetStatus(void)
{
   return MEMIF_IDLE;
}

void Ea_Cancel(void)
{

}

void Ea_JobEndNotification( void )
{

}

void Ea_JobErrorNotification( void )
{

}

   /* Ending Home Work */
