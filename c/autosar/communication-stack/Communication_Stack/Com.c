/*
 * Com.c
 *
 *  Created on: 19.10.2021
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
void Com_Init(const Com_ConfigType* config)
{

}

uint8 Com_ReceiveSignal(Com_SignalIdType SignalId, void* SignalDataPtr)
{
	return E_OK;
}

uint8 Com_SendSignal(Com_SignalIdType SignalId, const void* SignalDataPtr)
{
	return E_OK;
}

uint8 Com_SendSignalGroup(Com_SignalGroupIdType SignalGroupId)
{
	return E_OK;
}

uint8 Com_ReceiveSignalGroup(Com_SignalGroupIdType SignalGroupId)
{
	return E_OK;
}
/* Ending Home Work */
