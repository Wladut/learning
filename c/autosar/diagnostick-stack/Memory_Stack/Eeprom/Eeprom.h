/*
 * Eeprom.h
 *
 *  Created on: 14.10.2021
 */

#ifndef MEMORY_STACK_EEPROM_EEPROM_H_
#define MEMORY_STACK_EEPROM_EEPROM_H_

   /*  Home Work -> System Diagnostic Curs 3 :
    *  Define the Specific Eeprom interfaces
    * */

typedef struct
{

    uint8 Dummy;

} Eep_ConfigType;

typedef uint32 Eep_AddressType;

typedef uint32 Eep_LengthType;


   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Define the Specific Eep interfaces
    * */

   /* Starting Home Work */
extern void Eep_Init( const Eep_ConfigType * ConfigPtr );

extern void Eep_MainFunction( void );

extern Std_ReturnType Eep_Write( Eep_AddressType TargetAddress, const uint8 * SourceAddressPtr, Eep_LengthType Length);

extern Std_ReturnType Eep_Read( Eep_AddressType TargetAddress, uint8 * SourceAddressPtr, Eep_LengthType Length);

extern Std_ReturnType Eep_Erase(  Eep_AddressType TargetAddress, Eep_LengthType Length);


#endif /* MEMORY_STACK_EEPROM_EEPROM_H_ */
