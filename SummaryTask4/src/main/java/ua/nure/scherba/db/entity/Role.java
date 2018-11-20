package ua.nure.scherba.db.entity;

/**
 * @author D.Shcherba
 */
public enum Role {
    ADMIN, CLIENT;

    public static Role getRole(User user) {
        int roleId = user.getRoleId();
        return Role.values()[--roleId];
    }

    public String getName() {
        return name().toLowerCase();
    }
}