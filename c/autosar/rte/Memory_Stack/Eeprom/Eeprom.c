/*
 * Eeprom.c
 *
 *  Created on: 22.10.2021
 */

#include "Eeprom.h"
#include "Platform_Types.h"

   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Define the Specific Eeprom interfaces
    * */

   /* Starting Home Work */
void Eep_Init( const Eep_ConfigType * ConfigPtr )
{

}

void Eep_MainFunction( void )
{

}

Std_ReturnType Eep_Write( Eep_AddressType TargetAddress, const uint8 * SourceAddressPtr, Eep_LengthType Length)
{
   return E_OK;
}

Std_ReturnType Eep_Read( Eep_AddressType TargetAddress, uint8 * SourceAddressPtr, Eep_LengthType Length)
{
   return E_OK;
}

Std_ReturnType Eep_Erase(  Eep_AddressType TargetAddress, Eep_LengthType Length)
{
   return E_OK;
}

   /* Ending Home Work */


