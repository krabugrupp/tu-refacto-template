package ee.tu.app.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// Isikute pildid
@Entity
@Setter
@Getter
@Table(name = "IR_PILT")
public class Image {
    
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_PILT")
    private Long id;
    
    // Kasutaja arvuti poolt failile kaasa pandud mime tüüp
    @Column(name = "MIME_TYPE", length = 128)
    private String mimeType;
    
    // Faili suurus baitides
    @Column(name = "DOC_SIZE")
    private long docSize;
    
    // Faili üleslaadimise aeg
    @Column(name = "LAST_UPDATED")
    private Date lastUpdated;
    
    // Pilt BLOBina todo some BLOB
    @Column(name = "BLOB_CONTENT")
    private String blobContent;
    
    // Pildi liik: 1 - isiku enda poolt muudetav, 2 - ametlik (fotograafi poolt)
    @Column(name = "KL_LIIK")
    private int imageType;
    
    // Viide isikule, kelle pildiga on tegemist
    @JoinColumn(name = "ID_ISIK")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Person person;
}
