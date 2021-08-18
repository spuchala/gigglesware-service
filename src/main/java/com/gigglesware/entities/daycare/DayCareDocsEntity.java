package com.gigglesware.entities.daycare;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "daycare_docs")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DayCareDocsEntity {
    @Id
    @Column(name = "daycare_doc_id")
    @EqualsAndHashCode.Include
    private int dayCareDocId;

    @Column(name = "title")
    private int title;

    @Column(name = "description")
    private String description;

    @Column(name = "doc_url")
    private String docUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "daycare_id", referencedColumnName = "daycare_id")
    private DayCareEntity dayCareEntity;
}
