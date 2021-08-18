package com.gigglesware.entities.daycare;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "daycare_info")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DayCareInfoEntity {
    @Id
    @Column(name = "daycare_info_id")
    @EqualsAndHashCode.Include
    private int dayCareInfoId;

    @Column(name = "about_us")
    private String aboutUs;

    @Column(name = "description")
    private String description;

    @Column(name = "logo_url")
    private Timestamp logoUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daycare_id", referencedColumnName = "daycare_id")
    private DayCareEntity dayCareEntity;
}
