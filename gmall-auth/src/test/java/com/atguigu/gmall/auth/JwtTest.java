package com.atguigu.gmall.auth;

import com.atguigu.gmall.common.utils.JwtUtils;
import com.atguigu.gmall.common.utils.RsaUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {

    // 别忘了创建D:\\project\rsa目录
	private static final String pubKeyPath = "E:\\practice\\rsa\\rsa.pub";
    private static final String priKeyPath = "E:\\practice\\rsa\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

    @BeforeEach
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "11");
        map.put("username", "liuyan");
        // 生成token
        String token = JwtUtils.generateToken(map, privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6IjExIiwidXNlcm5hbWUiOiJsaXV5YW4iLCJleHAiOjE2MTY4MzMzNDl9.QB92Ps170Hosbt_h8BjPtmTc2faX5l0BBeDpyH16nowD5Jzj7LdNGLhRsuzLDuKDaOP1DKLLV_nRp4z6l2iwB6XMXK-3okPe4b-BcmioNHezMSOHR51Knm4Jvf2PYl3ymNmgN5xWeIsWWMBSQOY5fNRS2eeE2jGhTs8znI6J_hfpmNO5XCwZDv9YV6bsK-UAP11PDpaPecZsAfzrPUbkanWz3A_xWIChuhWHT_UXB1BiJrHIJNoRX_dKB3lHkTpOaDnm9g-i4U0_Imf2rPVOSC-T4GAAx1UD3wxx4Gu0Qea3Eib0UroHxPaIBAwwiJQLGeQWU4deC-3jSDXeN6qZrg";

        // 解析token
        Map<String, Object> map = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + map.get("id"));
        System.out.println("userName: " + map.get("username"));
    }
}