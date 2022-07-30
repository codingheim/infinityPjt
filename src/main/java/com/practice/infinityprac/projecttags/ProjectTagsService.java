package com.practice.infinityprac.projecttags;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectTagsService {

  private final ProjectTagsRepository projectTagsRepository;


  //GetMapping
  public List<ProjectTagsEntity> getProjectTags() {
    return projectTagsRepository.findAll();
  }


}
