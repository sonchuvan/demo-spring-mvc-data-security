package entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    Long userId;
    @Column(name = "user_name",nullable = false, unique = true)
    String userName;
    @Column(name = "encrypted_password")
    String encryptedPassword;
    @Column(name = "enabled")
    int enabled;
}
