package com.practice.infinityprac.projecttags;

import com.practice.infinityprac.project.ProjectRepository;
import com.practice.infinityprac.project.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProjectTagsController {

  private final ProjectTagsService projectTagsService;
  private final ProjectTagsRepository projectTagsRepository;

  @PostMapping("/projectTags")
  public ProjectTagsEntity createProjectTags(@RequestBody ProjectTagsDto projectTagsDto,
                                             @RequestParam ProjectTagsDto projectTagsDto) {
    ProjectTagsEntity projectTags = new ProjectTagsEntity(projectTagsDto);
    return projectTagsRepository.save(projectTags);
  }

  @GetMapping("/projectTags")
  public List<ProjectTagsEntity> getProjectTags() {
    return projectTagsService.getProjectTags();
  }
}
