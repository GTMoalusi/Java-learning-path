package login_System;

public class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String username;
    private String password;

    private int failedAttempts;
    private boolean locked;
    private boolean unlockRequested;

    private String otp; // simulated OTP (temporary)

    public User(String name, String surname, String email,
                String username, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;

        this.failedAttempts = 0;
        this.locked = false;
        this.unlockRequested = false;
        this.otp = null;
    }

    // ===== Getters =====
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isUnlockRequested() {
        return unlockRequested;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    // ===== Account state management =====
    public void incrementFailedAttempts() {
        failedAttempts++;
        if (failedAttempts >= 3) {
            locked = true;
        }
    }

    public void resetFailedAttempts() {
        failedAttempts = 0;
    }

    public void requestUnlock() {
        unlockRequested = true;
    }

    public void unlock() {
        locked = false;
        failedAttempts = 0;
        unlockRequested = false;
        otp = null;
    }

    // ===== OTP handling (simulated) =====
    public void setOtp(String otp) {
        this.otp = otp;
    }

    public boolean verifyOtp(String inputOtp) {
        return otp != null && otp.equals(inputOtp);
    }

    // ===== Password management =====
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
