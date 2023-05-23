package tko.refresh.domain;

import static lombok.AccessLevel.*;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Getter
@NoArgsConstructor(access = PROTECTED)
public abstract class BaseEntity {
    @Column(name = "created_id")
    @NotNull
    private String createdBy;
    @Column(name = "modified_id")
    @NotNull
    private String modifiedBy;

    @NotNull
    private LocalDateTime createdDate;
    @NotNull
    private LocalDateTime modifiedDate;

    protected BaseEntity(String createdBy, String modifiedBy, LocalDateTime modifiedDate,
                         LocalDateTime createdDate) {
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.createdDate = createdDate;
    }
}
