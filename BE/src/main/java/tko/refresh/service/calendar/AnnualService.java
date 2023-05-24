package tko.refresh.service.calendar;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tko.refresh.domain.entity.Annual;
import tko.refresh.dto.calendar.GetAnnualByDeptDto;
import tko.refresh.dto.calendar.GetAnnualByNameFilterDto;
import tko.refresh.dto.calendar.GetAnnualSearchDto;
import tko.refresh.repository.calendar.AnnualRepository;
import tko.refresh.repository.calendar.AnnualRepositoryImpl;

/**
 * Daniel Kim
 *
 * 연차 정보를 다루는 서비스 클래스
 *
 * 2023-04-28
 */
@Service
@RequiredArgsConstructor
public class AnnualService {
    @Autowired
    private final AnnualRepositoryImpl annualRepository;
    /**
     * Daniel Kim
     *
     * @param year
     * @param month
     * @return
     * 연, 월과 부서 이름을 통해 연차 집계 데이터를 가져옴
     *
     * 2023-04-27
     */




    /**
     * Daniel Kim
     *
     * @param name
     * @param page
     * @param size
     * @return
     * 사원 이름과 페이지 범위를 통해 연차 데이터를 가져옴
     *
     * 2023-04-29
     */
    public List<GetAnnualSearchDto> getAnnualByMember(String name, int page, int size) {
        // 사원 이름
        return annualRepository.findAnnualByDept(GetAnnualByNameFilterDto
                                                            .builder()
                                                            .name(name)
                                                            .page(page)
                                                            .size(size)
                                                            .build()).getContent();
    }

    /**
     * Daniel Kim
     *
     * @param name
     * @param page
     * @param size
     * @return
     * 부서 이름과 페이지 범위를 통해 연차 데이터를 가져옴
     *
     * 2023-04-29
     */
    public List<GetAnnualSearchDto> getAnnualDataByDepartment(String name, int page, int size) {
        return annualRepository.findAnnualByMember(GetAnnualByNameFilterDto
                                                              .builder()
                                                              .name(name)
                                                              .page(page)
                                                              .size(size)
                                                              .build()).getContent();
    }
}
