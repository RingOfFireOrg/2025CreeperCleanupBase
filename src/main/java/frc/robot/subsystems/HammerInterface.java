// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/**
 * The HammerInterface defines the contract for interacting with the hammer hardware.
 * It provides methods for controlling the hammer and updating its inputs.
 *
 * Key Responsibilities:
 * - Define methods for controlling the hammer (e.g., setVoltage, swingForward, swingBackward, stop).
 * - Provide a structure for storing hammer inputs (HammerInterfaceInputs).
 *
 * Key Components:
 * - HammerInterfaceInputs: Stores position, velocity, applied voltage, and current.
 * - Default Methods: Provide default implementations for hardware control methods.
 */

package frc.robot.subsystems;

public interface HammerInterface {
    public static class HammerInterfaceInputs {
        public double positionDeg = 0.0;
        public double velocityDegPerSec = 0.0;
        public double appliedVolts = 0.0;
        public double currentAmps = 0.0;
    }

    public default void updateInputs(HammerInterfaceInputs inputs) {}
    public default void setVoltage(double volts) {}

    public default void swingForward() {}
    public default void swingBackward() {}
    public default void stop() {}

    public default void setSpeed(double speed) {}
}