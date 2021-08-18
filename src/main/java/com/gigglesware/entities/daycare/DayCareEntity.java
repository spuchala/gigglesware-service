package com.gigglesware.entities.daycare;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "daycare")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DayCareEntity {
    @Id
    @Column(name = "daycare_id")
    @EqualsAndHashCode.Include
    private UUID dayCareId;

    @Column(name = "daycare_name")
    private String daycareName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "email")
    private String email;

    @Column(name = "created_from")
    private String createdFrom;

    @Column(name = "daycare_unique_name")
    private String daycareUniqueName;

    @Column(name = "created_Date")
    private Timestamp createdDate;

    @Column(name = "updatedDate")
    private Timestamp updatedDate;
}
