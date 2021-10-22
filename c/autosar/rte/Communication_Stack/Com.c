/*
 * Com.c
 *
 *  Created on: 22.10.2021
 */
#include "../Communication_Stack/Com.h"

#include "Platform_Types.h"

void Com_Init( const Com_ConfigType *  config)
{

}

void Com_MainFunctionRx(void)
{

}

void Com_MainFunctionTx(void)
{

}

/*  Home Work -> Communication Stack Curs 4 :
 *  Define the rest of the COM interfaces. Please search in the COM Presentation.
 * */

/* Starting Home Work */

uint8 Com_SendSignal(uint16 SignalId, uint8 *SignalDataPtr)
{
   return E_OK;
}

uint8 Com_ReceiveSignal(uint16 SignalId,uint8 *SignalDataPtr)
{
   return E_OK;
}
uint8 Com_SendSignalGroup(uint16 SignalGroupId)
{
   return E_OK;
}

uint8 Com_ReceiveSignalGroup(uint16 SignalGroupId)
{
   return E_OK;
}

/* Ending Home Work */
