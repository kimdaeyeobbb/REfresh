package tko.refresh.domain;

import static lombok.AccessLevel.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Department extends BaseEntity {
    @Id @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)", name = "department_uid")
    private UUID id;

    @Column(name = "department_name")
    @NotNull
    private String name;

    @Column(name = "department_manager")
    private String manager;

    @OneToMany(mappedBy = "department")
    private List<Member> member = new ArrayList<>();

    @OneToMany(mappedBy = "department")
    private List<AnnualCount> annualCount = new ArrayList<>();


    @Builder
    public Department(String name, String manager, String createdBy, String modifiedBy, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        super(createdBy, modifiedBy, createdDate, modifiedDate);
        this.name = name;
        this.manager = manager;
    }

}
