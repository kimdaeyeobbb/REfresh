package tko.refresh.domain;

import static lombok.AccessLevel.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Holiday {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "date_name")
    private String name;

    private String locdate;


}
