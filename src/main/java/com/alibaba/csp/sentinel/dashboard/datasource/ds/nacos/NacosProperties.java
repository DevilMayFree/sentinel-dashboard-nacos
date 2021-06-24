package com.alibaba.csp.sentinel.dashboard.datasource.ds.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Jiajiangnan
 * @E-mail jiajiangnan.office@foxmail.com
 * @Date 2020/8/30
 * @since 1.8.0
 */
@Component
public class NacosProperties {

    @Value("${ds.pr.nacos.server-addr}")
    private String serverAddr;

    @Value("${ds.pr.nacos.username:nacos}")
    private String username;

    @Value("${ds.pr.nacos.password:nacos}")
    private String password;

    @Value("${ds.pr.nacos.namespace:}")
    private String namespace;

    @Value("${ds.pr.nacos.group-id:SENTINEL_GROUP}")
    private String groupId;

    public String getServerAddr() {
        return serverAddr;
    }
    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Datasource.NacosProperties ");
        builder.append("[ ");
        builder.append(  "serverAddr").append("=").append(serverAddr).append(",");
        builder.append(  "username").append("=").append(username).append(",");
        builder.append(  "password").append("=").append("**********").append(",");
        builder.append(  "namespace").append("=").append(namespace).append(",");
        builder.append(  "groupId").append("=").append(groupId).append(",");
        builder.append("] ");

        return  builder.toString();
    }

}
