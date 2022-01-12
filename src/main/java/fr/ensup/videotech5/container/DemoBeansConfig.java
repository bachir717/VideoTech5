package fr.ensup.videotech5.container;

import fr.ensup.videotech5.dao.VideoDao;
import fr.ensup.videotech5.dao.VideoDaoJpa;
import fr.ensup.videotech5.service.VideoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class DemoBeansConfig {

        @Bean(initMethod = "initialisation", destroyMethod = "destruction")
        public VideoService videoService() {
            return new VideoService(videoDao());
        }

        @Bean(initMethod = "initialisation", destroyMethod = "destruction")
        public VideoDao videoDao() {
            return new VideoDao();
        }

        @Bean(initMethod = "initialisation", destroyMethod = "destruction")
        public VideoDaoJpa videoDaoJpa() {
            return new VideoDaoJpa();
        }
}
