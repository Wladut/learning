################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../ComplexDeviceDriver/Autosar_CDD/Autosar_CDD.c 

OBJS += \
./ComplexDeviceDriver/Autosar_CDD/Autosar_CDD.o 

C_DEPS += \
./ComplexDeviceDriver/Autosar_CDD/Autosar_CDD.d 


# Each subdirectory must supply rules for building sources it contributes
ComplexDeviceDriver/Autosar_CDD/%.o: ../ComplexDeviceDriver/Autosar_CDD/%.c ComplexDeviceDriver/Autosar_CDD/subdir.mk
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


