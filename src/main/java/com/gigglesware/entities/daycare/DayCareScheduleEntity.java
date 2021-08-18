package com.gigglesware.entities.daycare;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "daycare_schedule")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DayCareScheduleEntity {
    @Id
    @Column(name = "daycare_schedule_id")
    @EqualsAndHashCode.Include
    private int dayCareScheduleId;

    @Column(name = "week_day")
    private int weekDay;

    @Column(name = "schedule")
    private String schedule;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daycare_id", referencedColumnName = "daycare_id")
    private DayCareEntity dayCareEntity;
}
