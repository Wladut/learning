/*
 * NvM_Types.h
 *
 *  Created on: 14.10.2021
 */

#ifndef MEMORY_STACK_NVM_NVM_TYPES_H_
#define MEMORY_STACK_NVM_NVM_TYPES_H_

#include "Platform_Types.h"


typedef uint8 Std_ReturnType;

typedef uint16  NvM_BlockIdType;

typedef uint8 NvM_RequestResultType;

typedef struct Init
{
   uint8 BlockId;
   uint8 Queue;
}NvM_ConfigType;

#endif /* MEMORY_STACK_NVM_NVM_TYPES_H_ */
