/*
 * ComM.h
 *
 *  Created on: 19.10.2021
 */

#ifndef COMMUNICATION_STACK_COMM_H_
#define COMMUNICATION_STACK_COMM_H_

typedef uint8  ComM_ModeType;
typedef uint8  ComM_UserHandleType;

extern ComM_Init(void);

extern void ComM_MainFunction(void);

extern Std_ReturnType ComM_RequestComMode(ComM_UserHandleType User, ComM_ModeType ComMode);


#endif /* COMMUNICATION_STACK_COMM_H_ */
