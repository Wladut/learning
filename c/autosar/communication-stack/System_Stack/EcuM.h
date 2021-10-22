/*
 * EcuM.h
 *
 *  Created on: 19.10.2021
 */

#ifndef SYSTEM_STACK_ECUM_H_
#define SYSTEM_STACK_ECUM_H_
#define USER 1u

typedef enum{
	COMM_NO_COMMUNICATION = 0u,
	COMM_SILENT_COMMUNICATION = 1u,
	COMM_FULL_COMMUNICATON = 2u
}CoMMode;

extern void EcuM_Shutdown(void);
extern void EcuM_RequestRun(void);
extern void EcuM_Init(void);
extern void EcuM_StartUp_Two(void);

#endif /* SYSTEM_STACK_ECUM_H_ */
