/*
 * Fls.c
 *
 *  Created on: 19.10.2021
 */

#include "Fls.h"
#include "Platform_Types.h"

   /*  Home Work -> Diagnostic Stack Curs 3 :
    *  Define the Specific Fls interfaces
    * */

   /* Starting Home Work */

void Fls_Init( const Fls_ConfigType * ConfigPtr )
{

}

void Fls_MainFunction( void )
{

}

Std_ReturnType Fls_Write( Fls_AddressType TargetAddress, const uint8 * SourceAddressPtr, Fls_LengthType Length)
{
   return E_OK;
}

Std_ReturnType Fls_Read( Fls_AddressType TargetAddress, uint8 * SourceAddressPtr, Fls_LengthType Length)
{
   return E_OK;
}

Std_ReturnType Fls_Erase(  Fls_AddressType TargetAddress, Fls_LengthType Length)
{
   return E_OK;
}

   /* Ending Home Work */
