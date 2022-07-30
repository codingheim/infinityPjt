package com.practice.infinityprac.project;

import com.practice.infinityprac.projecttags.ProjectTagsDto;
import com.practice.infinityprac.projecttags.ProjectTagsEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProjectController {

  private final ProjectService projectService;

  @PostMapping("/projects")
  public ProjectEntity createProject(@RequestBody ProjectDto projectDto) {

    return projectService.createProject(projectDto);
  }

  //전체조회
  @GetMapping("/projects")
  public List<ProjectEntity> getProject(@RequestBody ProjectTagsEntity projectTagsEntity) {
    return projectService.getProject(projectTagsEntity);
  }
  //개별조회

  @PutMapping("/projects/{projectId}")
  public Long updateProject(@PathVariable Long projectId,
                            @RequestBody ProjectDto projectDto) {
    projectService.updateProject(projectId,projectDto);

    return projectId;
  }

  @DeleteMapping("/projects/{projectId}")
  public Long deleteProject(@PathVariable Long projectId) {
    return projectService.deleteProject(projectId);
  }

}
