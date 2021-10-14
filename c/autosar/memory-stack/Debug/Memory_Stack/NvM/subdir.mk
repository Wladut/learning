################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../Memory_Stack/NvM/NvM.c 

OBJS += \
./Memory_Stack/NvM/NvM.o 

C_DEPS += \
./Memory_Stack/NvM/NvM.d 


# Each subdirectory must supply rules for building sources it contributes
Memory_Stack/NvM/%.o: ../Memory_Stack/NvM/%.c Memory_Stack/NvM/subdir.mk
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


