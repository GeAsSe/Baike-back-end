package com.example.baike.mapper;

import com.example.baike.model.BKInteractiveVideo;
import com.example.baike.model.BKVideo;
import com.example.baike.model.BKVideoUploadViewModel;
import com.example.baike.state.VideoState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InteractiveVideoMapper {
    Long insertInteractiveVideo(BKVideoUploadViewModel uploadViewModel);
    Long insertVideo(List<BKVideo> videos);
    Long deleteInteractiveVideoByID(@Param("vID") Integer vID);
    List<BKInteractiveVideo> selectInterVideosByUserIf(@Param("uID") Integer uID, @Param("state")VideoState state);
    List<BKVideo> selectVideoByInterVID(@Param("ivID") Integer ivID);
}
