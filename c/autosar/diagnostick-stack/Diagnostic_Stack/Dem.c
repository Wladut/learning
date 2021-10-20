/*
 * Dem.c
 *
 *  Created on: 14.10.2021
 */

#include "Platform_Types.h"
#include "Dem.h"

         /*  Home Work -> Diagnostic Stack Curs 3 :
          *  Define all the DEM interfaces presented in the Diagnostic Stack presentation
          * */

         /* Starting Home Work */
void Dem_PreInit()
{

}

void Dem_Init(const Dem_ConfigType * ConfigPtr)
{

}

Std_ReturnType Dem_SetOperationCycleState(uint8 OperationCycleId, Dem_OperationCycleStateType CycleState)
{
	/* DEM_CYCLE_STATE_START (0x00), DEM_CYCLE_STATE_END (0x01) */
	return E_OK;
}

Std_ReturnType Dem_SetEventStatus(Dem_EventIdType EventId, Dem_EventStatusType EventStatus)
{
	if(EventId == AUTOSAR_CDD_Kilometer_Event_ID)
	{
		if(EventStatus == AUTOSAR_CDD_SET_EVENT_FAILED)
		{
			Dem_ReportErrorStatus(EventId, DEM_KILOMETER_WAS_MODIFIED);
		}
		else
		{

		}
	}
	return E_OK;
}

void Dem_ReportErrorStatus(Dem_EventIdType EventId, Dem_EventStatusType EventStatus)
{

}

void Dem_MainFunction(void)
{

}

void Dem_Shutdown(void)
{

}
         /* Ending Home Work */
