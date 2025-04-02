const base = {
    get() {
        return {
            url : "http://localhost:8080/MicrocourseLearningWebsite/",
            name: "MicrocourseLearningWebsite",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/MicrocourseLearningWebsite/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于web的微课程学习平台"
        } 
    }
}
export default base
