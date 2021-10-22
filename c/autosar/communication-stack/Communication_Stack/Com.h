/*
 * Com.h
 *
 *  Created on: 19.10.2021
 */

#ifndef COMMUNICATION_STACK_COM_H_
#define COMMUNICATION_STACK_COM_H_

typedef struct sCom_PCConfigType
{
  uint8 neverUsed;  /**< dummy entry  */
} Com_PCConfigType;

typedef Com_PCConfigType Com_ConfigType;
typedef uint16 Com_SignalIdType;
typedef uint16 Com_SignalGroupIdType;

extern void Com_MainFunctionRx(void);
extern void void Com_MainFunctionTx(void);
extern void Com_Init(const Com_ConfigType* config);
extern uint8 Com_ReceiveSignal(Com_SignalIdType SignalId, void* SignalDataPtr);
extern uint8 Com_SendSignal(Com_SignalIdType SignalId, const void* SignalDataPtr);
extern uint8 Com_SendSignalGroup(Com_SignalGroupIdType SignalGroupId);
extern uint8 Com_ReceiveSignalGroup(Com_SignalGroupIdType SignalGroupId);
#endif /* COMMUNICATION_STACK_COM_H_ */
