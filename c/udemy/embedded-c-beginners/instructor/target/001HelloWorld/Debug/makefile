################################################################################
# Automatically-generated file. Do not edit!
################################################################################

-include ../makefile.init

RM := rm -rf

# All of the sources participating in the build are defined here
-include sources.mk
-include Startup/subdir.mk
-include Src/subdir.mk
-include subdir.mk
-include objects.mk

ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
endif

-include ../makefile.defs

# Add inputs and outputs from these tool invocations to the build variables 
EXECUTABLES += \
001HelloWorld.elf \

SIZE_OUTPUT += \
default.size.stdout \

OBJDUMP_LIST += \
001HelloWorld.list \


# All Target
all: 001HelloWorld.elf secondary-outputs

# Tool invocations
001HelloWorld.elf: $(OBJS) $(USER_OBJS) D:\Git\ Projects\learning\c\udemy\embedded-c-beginners\instructor\target\001HelloWorld\STM32F407VGTX_FLASH.ld
	arm-none-eabi-gcc -o "001HelloWorld.elf" @"objects.list" $(USER_OBJS) $(LIBS) -mcpu=cortex-m4 -T"D:\Git Projects\learning\c\udemy\embedded-c-beginners\instructor\target\001HelloWorld\STM32F407VGTX_FLASH.ld" --specs=nosys.specs -Wl,-Map="001HelloWorld.map" -Wl,--gc-sections -static --specs=nano.specs -mfpu=fpv4-sp-d16 -mfloat-abi=hard -mthumb -Wl,--start-group -lc -lm -Wl,--end-group
	@echo 'Finished building target: $@'
	@echo ' '

default.size.stdout: $(EXECUTABLES)
	arm-none-eabi-size  $(EXECUTABLES)
	@echo 'Finished building: $@'
	@echo ' '

001HelloWorld.list: $(EXECUTABLES)
	arm-none-eabi-objdump -h -S $(EXECUTABLES) > "001HelloWorld.list"
	@echo 'Finished building: $@'
	@echo ' '

# Other Targets
clean:
	-$(RM) *
	-@echo ' '

secondary-outputs: $(SIZE_OUTPUT) $(OBJDUMP_LIST)

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets
