package ee.tu.app.domain;
import jakarta.persistence.*;

import java.util.Date;

// Isikute pildid
@Entity
@Table(name = "IR_PILT")
public class Image {
    
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_PILT")
    public int id;
    
    // Kasutaja arvuti poolt failile kaasa pandud mime tüüp
    @Column(name = "MIME_TYPE", length = 128)
    public String mimeType;
    
    // Faili suurus baitides
    @Column(name = "DOC_SIZE")
    public long docSize;
    
    // Faili üleslaadimise aeg
    @Column(name = "LAST_UPDATED")
    public Date lastUpdated;
    
    // Pilt BLOBina todo some BLOB
    @Column(name = "BLOB_CONTENT")
    public String blobContent;
    
    // Pildi liik: 1 - isiku enda poolt muudetav, 2 - ametlik (fotograafi poolt)
    @Column(name = "KL_LIIK")
    public int imageType;
    
    // Viide isikule, kelle pildiga on tegemist
    @Column(name = "ID_ISIK")
    public int personId;
}
