/*
 * Ea.h
 *
 *  Created on: 19.10.2021
 */

#ifndef MEMORY_STACK_EA_EA_H_
#define MEMORY_STACK_EA_EA_H_

   /*  Home Work -> System Diagnostic Curs 3 :
    *  Define the Specific EA interfaces
    * */

   /* Starting Home Work */
extern void Ea_Init(void);

extern Std_ReturnType Ea_Write( uint16 BlockNumber, uint8 * DataBufferPtr);

extern Std_ReturnType Ea_Read( uint16 BlockNumber,uint8 Offset, uint8 * DataBufferPtr, uint8 Length);

extern void Ea_MainFunction(void);

extern MemIf_StatusType Ea_GetStatus(void);

extern void Ea_Cancel(void);

extern void Ea_JobEndNotification( void );

extern void Ea_JobErrorNotification( void );

   /* Ending Home Work */

#endif /* MEMORY_STACK_EA_EA_H_ */
