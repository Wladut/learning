/*
 * Dem.h
 *
 *  Created on: 14.10.2021
 */

#ifndef DIAGNOSTIC_STACK_DEM_H_
#define DIAGNOSTIC_STACK_DEM_H_
#define AUTOSAR_CDD_Kilometer_Event_ID 455
#define AUTOSAR_CDD_SET_EVENT_FAILED   0x01
#define AUTOSAR_CDD_SET_EVENT_PASSED   0x00
#define DEM_KILOMETER_WAS_MODIFIED     0xD12244

typedef struct
{

   uint8 Parameter;

}Dem_ConfigType;
typedef uint8 Dem_OperationCycleStateType;
typedef uint16 Dem_EventIdType;
typedef uint16 Dem_EventStatusType;

extern void Dem_PreInit(Dem_ConfigType *ConfigPtr);
extern void Dem_Init(void);
extern Std_ReturnType Dem_SetOperationCycleState(uint8 OperationCycleId, Dem_OperationCycleStateType CycleState);
extern Std_ReturnType Dem_SetEventStatus(Dem_EventIdType EventId, Dem_EventStatusType EventStatus);
void Dem_ReportErrorStatus(Dem_EventIdType EventId, Dem_EventStatusType EventStatus);
extern void Dem_MainFunction(void);
extern void Dem_Shutdown(void);

#endif /* DIAGNOSTIC_STACK_DEM_H_ */
