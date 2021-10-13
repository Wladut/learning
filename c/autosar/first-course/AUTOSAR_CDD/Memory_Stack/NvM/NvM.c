/*
 * NvM.c
 *
 *  Created on: 22 feb. 2019
 *      Author: Suciu Mihai
 */

#include "NvM_Types.h"

Std_ReturnType NvM_WriteBlock(NvM_BlockIdType Block_Id,const void * Data )
{
   return E_OK;
}
Std_ReturnType NvM_ReadBlock(NvM_BlockIdType Block_Id, void * Data )
{
   return E_OK;
}

/*  Home Work:
 *  Define the interfaces: NvM_GetErrorStatus(), NvM_Init(), NvM_ReadAll(), NvM_WriteAll(),NvM_SetRamBlockStatus()
 *
 *
 * */

/* Starting Home Work */
Std_ReturnType NvM_GetErrorStatus(NvM_BlockIdType Block_Id, NvM_RequestResultType * Block_Status)
{
	return E_OK;
}

void NvM_Init(void)
{

}

void NvM_ReadAll(void)
{

}

void NvM_WriteAll(void)
{

}

Std_ReturnType NvM_SetRamBlockStatus(NvM_BlockIdType Block_Id, boolean BlockChanged)
{
	return E_OK;
}
/* Ending Home Work */

