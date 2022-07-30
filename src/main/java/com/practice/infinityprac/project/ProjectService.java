package com.practice.infinityprac.project;

import com.practice.infinityprac.projecttags.ProjectTagsEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectService {

  private final ProjectRepository projectRepository;

  //PostMapping
  public ProjectEntity createProject(ProjectDto projectDto) {

    ProjectEntity project = new ProjectEntity(projectDto);

    projectRepository.save(project);

    return project;
  }

  //GetMapping 모든 조회
  public List<ProjectEntity> getProject(ProjectTagsEntity projectTagsEntity) {
    return projectRepository.findAll();
  }

  //PutMapping
  @Transactional
  public Long updateProject(Long projectId,ProjectDto projectDto) {
    ProjectEntity project = projectRepository.findById(projectId).orElseThrow(
            ()-> new NullPointerException("존재하지 않는 프로젝트입니다.")
    );
    project.updateProject(projectDto);
    return project.getProjectId();

  }

  //DeleteMapping
  public Long deleteProject(Long projectId) {
    projectRepository.deleteById(projectId);
    return projectId;
  }
}
