/*
 * NvM.h
 *
 *  Created on: 14.10.2021
 */

#ifndef MEMORY_STACK_NVM_NVM_H_
#define MEMORY_STACK_NVM_NVM_H_

extern Std_ReturnType NvM_WriteBlock(uint16 Block_Id,const void * Data );
extern Std_ReturnType NvM_ReadBlock(uint16 Block_Id, void * Data );
extern Std_ReturnType NvM_GetErrorStatus(NvM_BlockIdType Block_Id, NvM_RequestResultType* RequestResultPtr );
extern void NvM_Init();
extern void NvM_ReadAll(void );
extern void NvM_WriteAll(void );
extern void NvM_SetRamBlockStatus(NvM_BlockIdType Block_Id, boolean BlockChanged  );


#endif /* MEMORY_STACK_NVM_NVM_H_ */
