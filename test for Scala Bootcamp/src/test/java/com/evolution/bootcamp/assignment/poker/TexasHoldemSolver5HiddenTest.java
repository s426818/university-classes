
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver5HiddenTest {


  @Test
  public void test_texas_holdem_1250_6d7dAhKdTc_3cTs_2h3h_Jc4h_8s7c_2c9s_7h8d() {
    assertEquals(
      "2h3h 2c9s Jc4h 7h8d=8s7c 3cTs",
      Solver.process("texas-holdem 6d7dAhKdTc 3cTs 2h3h Jc4h 8s7c 2c9s 7h8d"));
  }

  @Test
  public void test_texas_holdem_1251_5d5h8c8d8s_Qc8h_6dKh_ThQh_Jc9d_Ad3h_2dAs_7dTc_4h7h_Ts2h() {
    assertEquals(
      "2dAs=4h7h=6dKh=7dTc=Ad3h=Jc9d=ThQh=Ts2h Qc8h",
      Solver.process("texas-holdem 5d5h8c8d8s Qc8h 6dKh ThQh Jc9d Ad3h 2dAs 7dTc 4h7h Ts2h"));
  }

  @Test
  public void test_texas_holdem_1252_3d4d4s5cAs_8dTd_7c9h_Qc5s_3h6c_5h5d_8cQd_7d6s() {
    assertEquals(
      "7c9h 8dTd 8cQd 3h6c Qc5s 7d6s 5h5d",
      Solver.process("texas-holdem 3d4d4s5cAs 8dTd 7c9h Qc5s 3h6c 5h5d 8cQd 7d6s"));
  }

  @Test
  public void test_texas_holdem_1253_4c7c7dKcKd_5dJs_Ac3s_Ts6s_4s5h() {
    assertEquals(
      "4s5h Ts6s 5dJs Ac3s",
      Solver.process("texas-holdem 4c7c7dKcKd 5dJs Ac3s Ts6s 4s5h"));
  }

  @Test
  public void test_texas_holdem_1254_2h7s8hAsQh_Th6s_Td6d_Ad5d_6c3c_9sJd_7dAc_Kd6h() {
    assertEquals(
      "6c3c Td6d=Th6s 9sJd Kd6h Ad5d 7dAc",
      Solver.process("texas-holdem 2h7s8hAsQh Th6s Td6d Ad5d 6c3c 9sJd 7dAc Kd6h"));
  }

  @Test
  public void test_texas_holdem_1255_2c7cJdJsTs_8cTd_3sKh_3h8d() {
    assertEquals(
      "3h8d 3sKh 8cTd",
      Solver.process("texas-holdem 2c7cJdJsTs 8cTd 3sKh 3h8d"));
  }

  @Test
  public void test_texas_holdem_1256_4c7d9hJdKd_8s7c_TsKc_Kh4d_2dJh_6h9s_QcAd_5h2c_6s5s_ThAs() {
    assertEquals(
      "5h2c 6s5s ThAs QcAd 8s7c 6h9s 2dJh TsKc Kh4d",
      Solver.process("texas-holdem 4c7d9hJdKd 8s7c TsKc Kh4d 2dJh 6h9s QcAd 5h2c 6s5s ThAs"));
  }

  @Test
  public void test_texas_holdem_1257_5d7cAcKsQc_Kc9h_6c3h() {
    assertEquals(
      "6c3h Kc9h",
      Solver.process("texas-holdem 5d7cAcKsQc Kc9h 6c3h"));
  }

  @Test
  public void test_texas_holdem_1258_2s3h7s8d9h_9dKd_Js5c_5hKh_6d9c() {
    assertEquals(
      "Js5c 5hKh 6d9c 9dKd",
      Solver.process("texas-holdem 2s3h7s8d9h 9dKd Js5c 5hKh 6d9c"));
  }

  @Test
  public void test_texas_holdem_1259_3h3s8sJdKd_Js7d_3cQc_Kc9d_4h6d_5s8h_3dAh_TsAd() {
    assertEquals(
      "4h6d TsAd 5s8h Js7d Kc9d 3cQc 3dAh",
      Solver.process("texas-holdem 3h3s8sJdKd Js7d 3cQc Kc9d 4h6d 5s8h 3dAh TsAd"));
  }

  @Test
  public void test_texas_holdem_1260_3s5h7d7hTc_3c6s_2sQc_2cKc_6hKs_5s3h_Jh8h_QhJs_5dTd_8sKh() {
    assertEquals(
      "Jh8h 2sQc QhJs 2cKc 6hKs 8sKh 3c6s 5s3h 5dTd",
      Solver.process("texas-holdem 3s5h7d7hTc 3c6s 2sQc 2cKc 6hKs 5s3h Jh8h QhJs 5dTd 8sKh"));
  }

  @Test
  public void test_texas_holdem_1261_4c5dKhQdQh_7cQs_4s3c_6c7d_8s7s() {
    assertEquals(
      "6c7d 8s7s 4s3c 7cQs",
      Solver.process("texas-holdem 4c5dKhQdQh 7cQs 4s3c 6c7d 8s7s"));
  }

  @Test
  public void test_texas_holdem_1262_5d6d7s9sTh_Qs4h_QcAs_Jc6s_5h9h_Ks5s_Kc4c_7h4s_2d3h() {
    assertEquals(
      "2d3h Qs4h Kc4c QcAs Ks5s Jc6s 7h4s 5h9h",
      Solver.process("texas-holdem 5d6d7s9sTh Qs4h QcAs Jc6s 5h9h Ks5s Kc4c 7h4s 2d3h"));
  }

  @Test
  public void test_texas_holdem_1263_3s7hAcKhKs_9sTc_8h6s_Td5c_2d3d_QcJc_6c7c_Kc4s_As4h_8c6h() {
    assertEquals(
      "8c6h=8h6s Td5c 9sTc QcJc 2d3d 6c7c As4h Kc4s",
      Solver.process("texas-holdem 3s7hAcKhKs 9sTc 8h6s Td5c 2d3d QcJc 6c7c Kc4s As4h 8c6h"));
  }

  @Test
  public void test_texas_holdem_1264_2c3d3s8sKd_7cJs_8cJd_4c7d_4d5c_9s8d() {
    assertEquals(
      "4d5c 4c7d 7cJs 8cJd=9s8d",
      Solver.process("texas-holdem 2c3d3s8sKd 7cJs 8cJd 4c7d 4d5c 9s8d"));
  }

  @Test
  public void test_texas_holdem_1265_2d7c9hAcQc_7s6c_7d3c_Td2c_4d8d() {
    assertEquals(
      "4d8d Td2c 7d3c=7s6c",
      Solver.process("texas-holdem 2d7c9hAcQc 7s6c 7d3c Td2c 4d8d"));
  }

  @Test
  public void test_texas_holdem_1266_3h6d8hJcJs_9sKh_5sTd_7c3d_Qc5c() {
    assertEquals(
      "5sTd Qc5c 9sKh 7c3d",
      Solver.process("texas-holdem 3h6d8hJcJs 9sKh 5sTd 7c3d Qc5c"));
  }

  @Test
  public void test_texas_holdem_1267_2d9sKdKhTd_JcJs_Kc4c_4h3c_As3d_2s2h_4s3h_Qd4d_8c8s_2c8h() {
    assertEquals(
      "4h3c=4s3h As3d 2c8h 8c8s JcJs Kc4c Qd4d 2s2h",
      Solver.process("texas-holdem 2d9sKdKhTd JcJs Kc4c 4h3c As3d 2s2h 4s3h Qd4d 8c8s 2c8h"));
  }

  @Test
  public void test_texas_holdem_1268_5c5s7s8c8d_ThQd_9d7c_TdQc_QhQs_7hKh_AsAh_Kd9c_Kc5h() {
    assertEquals(
      "TdQc=ThQd Kd9c 9d7c 7hKh QhQs AsAh Kc5h",
      Solver.process("texas-holdem 5c5s7s8c8d ThQd 9d7c TdQc QhQs 7hKh AsAh Kd9c Kc5h"));
  }

  @Test
  public void test_texas_holdem_1269_2h3d5d6dJs_Jh4s_2d6c_Tc5c_Qh3h() {
    assertEquals(
      "Qh3h Tc5c 2d6c Jh4s",
      Solver.process("texas-holdem 2h3d5d6dJs Jh4s 2d6c Tc5c Qh3h"));
  }

  @Test
  public void test_texas_holdem_1270_2c5s7d8dJh_6s2s_4s8h_4c9s_TdJc_6h3c_9cQc_Qs2h_5c5d_6d9d() {
    assertEquals(
      "6h3c 4c9s 9cQc 6s2s Qs2h 4s8h TdJc 5c5d 6d9d",
      Solver.process("texas-holdem 2c5s7d8dJh 6s2s 4s8h 4c9s TdJc 6h3c 9cQc Qs2h 5c5d 6d9d"));
  }

  @Test
  public void test_texas_holdem_1271_8sJsQdQhTs_6h3c_6d5h_5s2h_9c3s_4c7d_Tc7c_8hKh_Jd4s() {
    assertEquals(
      "4c7d=5s2h=6d5h=6h3c 8hKh Tc7c Jd4s 9c3s",
      Solver.process("texas-holdem 8sJsQdQhTs 6h3c 6d5h 5s2h 9c3s 4c7d Tc7c 8hKh Jd4s"));
  }

  @Test
  public void test_texas_holdem_1272_4h5hAcAsJc_TdKd_4d7c_8h5d_TsKc() {
    assertEquals(
      "TdKd=TsKc 4d7c 8h5d",
      Solver.process("texas-holdem 4h5hAcAsJc TdKd 4d7c 8h5d TsKc"));
  }

  @Test
  public void test_texas_holdem_1273_6c8s9dJhTc_Js3d_3s9s_AdAc() {
    assertEquals(
      "3s9s Js3d AdAc",
      Solver.process("texas-holdem 6c8s9dJhTc Js3d 3s9s AdAc"));
  }

  @Test
  public void test_texas_holdem_1274_7h9d9sQdTc_6sAs_9c3h_Qs7c_6h5d_3d5c_8cJs() {
    assertEquals(
      "3d5c=6h5d 6sAs Qs7c 9c3h 8cJs",
      Solver.process("texas-holdem 7h9d9sQdTc 6sAs 9c3h Qs7c 6h5d 3d5c 8cJs"));
  }

  @Test
  public void test_texas_holdem_1275_6d6s7hKdQd_Kh3d_7sJd_4cJs() {
    assertEquals(
      "4cJs 7sJd Kh3d",
      Solver.process("texas-holdem 6d6s7hKdQd Kh3d 7sJd 4cJs"));
  }

  @Test
  public void test_texas_holdem_1276_2s5hJhKcTd_Th6d_5sTs_Ac8c_9cAd_4c3d_8h4h_7dQc_8d7c() {
    assertEquals(
      "4c3d 8h4h 8d7c 7dQc Ac8c 9cAd Th6d 5sTs",
      Solver.process("texas-holdem 2s5hJhKcTd Th6d 5sTs Ac8c 9cAd 4c3d 8h4h 7dQc 8d7c"));
  }

  @Test
  public void test_texas_holdem_1277_2h6h8c8s9s_5sTc_8hKs_4h4d_7d6s_5c2c() {
    assertEquals(
      "5sTc 5c2c 4h4d 7d6s 8hKs",
      Solver.process("texas-holdem 2h6h8c8s9s 5sTc 8hKs 4h4d 7d6s 5c2c"));
  }

  @Test
  public void test_texas_holdem_1278_6h7h7s8hKc_3cAs_4s4d_Jh5c_Qh3s_TdKd_2c6c_Qc2s() {
    assertEquals(
      "Jh5c Qc2s=Qh3s 3cAs 4s4d 2c6c TdKd",
      Solver.process("texas-holdem 6h7h7s8hKc 3cAs 4s4d Jh5c Qh3s TdKd 2c6c Qc2s"));
  }

  @Test
  public void test_texas_holdem_1279_3h7cJhQcQh_9s2d_Ac9c() {
    assertEquals(
      "9s2d Ac9c",
      Solver.process("texas-holdem 3h7cJhQcQh 9s2d Ac9c"));
  }

  @Test
  public void test_texas_holdem_1280_3c4c5h9dAd_Ac3d_7hTd_2c3s() {
    assertEquals(
      "7hTd Ac3d 2c3s",
      Solver.process("texas-holdem 3c4c5h9dAd Ac3d 7hTd 2c3s"));
  }

  @Test
  public void test_texas_holdem_1281_2h3s6d7hTs_3hKs_Qh8d() {
    assertEquals(
      "Qh8d 3hKs",
      Solver.process("texas-holdem 2h3s6d7hTs 3hKs Qh8d"));
  }

  @Test
  public void test_texas_holdem_1282_4c4h6h9cQc_9h8d_As8s_3dTs() {
    assertEquals(
      "3dTs As8s 9h8d",
      Solver.process("texas-holdem 4c4h6h9cQc 9h8d As8s 3dTs"));
  }

  @Test
  public void test_texas_holdem_1283_2h7c9sJcJd_8sKd_3sAh_5s8c_3dQs_7sJs_2dTd_2sKc_4c8h_Jh7h() {
    assertEquals(
      "4c8h=5s8c 3dQs 8sKd 3sAh 2dTd 2sKc 7sJs=Jh7h",
      Solver.process("texas-holdem 2h7c9sJcJd 8sKd 3sAh 5s8c 3dQs 7sJs 2dTd 2sKc 4c8h Jh7h"));
  }

  @Test
  public void test_texas_holdem_1284_2h8cAcAsJd_8sTs_Qc6s_8hQs_9d9h_3dJc() {
    assertEquals(
      "Qc6s 8sTs 8hQs 9d9h 3dJc",
      Solver.process("texas-holdem 2h8cAcAsJd 8sTs Qc6s 8hQs 9d9h 3dJc"));
  }

  @Test
  public void test_texas_holdem_1285_7c9cAcKhTd_9d5d_7d4s_Ad3h_Qc3c_QdQh() {
    assertEquals(
      "7d4s 9d5d QdQh Ad3h Qc3c",
      Solver.process("texas-holdem 7c9cAcKhTd 9d5d 7d4s Ad3h Qc3c QdQh"));
  }

  @Test
  public void test_texas_holdem_1286_2h5c7d8cAc_4s9c_4c7h_Kd7s_6sTc_8sAh_9hTd_TsQh() {
    assertEquals(
      "4s9c 6sTc 9hTd TsQh 4c7h Kd7s 8sAh",
      Solver.process("texas-holdem 2h5c7d8cAc 4s9c 4c7h Kd7s 6sTc 8sAh 9hTd TsQh"));
  }

  @Test
  public void test_texas_holdem_1287_2c2d5h5s9d_3sQd_2h2s_9hAc_QhAs_4hKc_3hJs_6d4c_3d7h_TcAd() {
    assertEquals(
      "3d7h=6d4c 3hJs 3sQd 4hKc QhAs=TcAd 9hAc 2h2s",
      Solver.process("texas-holdem 2c2d5h5s9d 3sQd 2h2s 9hAc QhAs 4hKc 3hJs 6d4c 3d7h TcAd"));
  }

  @Test
  public void test_texas_holdem_1288_3s5c9d9hTs_4d4h_Ks3h_8hAd_Qh7s_3cKd_Td3d_Kh9s_5h6d_TcJd() {
    assertEquals(
      "Qh7s 8hAd 3cKd=Ks3h 4d4h 5h6d Td3d TcJd Kh9s",
      Solver.process("texas-holdem 3s5c9d9hTs 4d4h Ks3h 8hAd Qh7s 3cKd Td3d Kh9s 5h6d TcJd"));
  }

  @Test
  public void test_texas_holdem_1289_2c4h6s9sTh_9dTd_3s6h() {
    assertEquals(
      "3s6h 9dTd",
      Solver.process("texas-holdem 2c4h6s9sTh 9dTd 3s6h"));
  }

  @Test
  public void test_texas_holdem_1290_3c5h9sKdQs_Kh4s_KcKs_Jh4c_Qc2h_3s9h_4h3d_7sTh_Ad9c_Td8c() {
    assertEquals(
      "7sTh Td8c Jh4c 4h3d Ad9c Qc2h Kh4s 3s9h KcKs",
      Solver.process("texas-holdem 3c5h9sKdQs Kh4s KcKs Jh4c Qc2h 3s9h 4h3d 7sTh Ad9c Td8c"));
  }

  @Test
  public void test_texas_holdem_1291_6c6sJhQdTh_Ks5s_TsAc_KhJc() {
    assertEquals(
      "Ks5s TsAc KhJc",
      Solver.process("texas-holdem 6c6sJhQdTh Ks5s TsAc KhJc"));
  }

  @Test
  public void test_texas_holdem_1292_2h5s7d7hJc_6cQc_2d8d() {
    assertEquals(
      "6cQc 2d8d",
      Solver.process("texas-holdem 2h5s7d7hJc 6cQc 2d8d"));
  }

  @Test
  public void test_texas_holdem_1293_7d8dAdJcQd_2hQh_6d2d_9h8c_Js9d_Jd5h_3s2c_7sTs_9s4c() {
    assertEquals(
      "3s2c 9s4c 7sTs 9h8c 2hQh 6d2d Js9d Jd5h",
      Solver.process("texas-holdem 7d8dAdJcQd 2hQh 6d2d 9h8c Js9d Jd5h 3s2c 7sTs 9s4c"));
  }

  @Test
  public void test_texas_holdem_1294_2d5d6s8dAs_9c7d_Ac9h_2hQs_4d4c() {
    assertEquals(
      "2hQs 4d4c Ac9h 9c7d",
      Solver.process("texas-holdem 2d5d6s8dAs 9c7d Ac9h 2hQs 4d4c"));
  }

  @Test
  public void test_texas_holdem_1295_6h9cQcQsTc_AhKs_5d2d_9s4d_8d3s() {
    assertEquals(
      "5d2d 8d3s AhKs 9s4d",
      Solver.process("texas-holdem 6h9cQcQsTc AhKs 5d2d 9s4d 8d3s"));
  }

  @Test
  public void test_texas_holdem_1296_4c6s7c7sJs_5c5h_3h2c_As8d_Jd2d_5d8h() {
    assertEquals(
      "3h2c As8d 5c5h Jd2d 5d8h",
      Solver.process("texas-holdem 4c6s7c7sJs 5c5h 3h2c As8d Jd2d 5d8h"));
  }

  @Test
  public void test_texas_holdem_1297_2s3c3h9sAd_9d6h_JcKs_9h4h_JhKc_QcQd_As2d_Ah3s_6c4d_6d4s() {
    assertEquals(
      "6c4d=6d4s JcKs=JhKc 9d6h=9h4h QcQd As2d Ah3s",
      Solver.process("texas-holdem 2s3c3h9sAd 9d6h JcKs 9h4h JhKc QcQd As2d Ah3s 6c4d 6d4s"));
  }

  @Test
  public void test_texas_holdem_1298_2h8d9cJsQh_9d5d_6s3h() {
    assertEquals(
      "6s3h 9d5d",
      Solver.process("texas-holdem 2h8d9cJsQh 9d5d 6s3h"));
  }

  @Test
  public void test_texas_holdem_1299_5sAcJcKcTd_8c6s_8dTs_4c6h_4dKh_7d5c_4sJd_Th5h_3s2h_Ad3c() {
    assertEquals(
      "3s2h 4c6h 8c6s 7d5c 8dTs 4sJd 4dKh Ad3c Th5h",
      Solver.process("texas-holdem 5sAcJcKcTd 8c6s 8dTs 4c6h 4dKh 7d5c 4sJd Th5h 3s2h Ad3c"));
  }

  @Test
  public void test_texas_holdem_1300_7d7s9cAcKh_8d4h_JcKc_9dAh_Jd6s() {
    assertEquals(
      "8d4h Jd6s JcKc 9dAh",
      Solver.process("texas-holdem 7d7s9cAcKh 8d4h JcKc 9dAh Jd6s"));
  }

  @Test
  public void test_texas_holdem_1301_5h6s9h9sKh_Js5d_AsJd_9dJh_9c4h_3sTh_8h3h_Ad2s_4c6h_Qc4d() {
    assertEquals(
      "3sTh Qc4d Ad2s AsJd Js5d 4c6h 9c4h 9dJh 8h3h",
      Solver.process("texas-holdem 5h6s9h9sKh Js5d AsJd 9dJh 9c4h 3sTh 8h3h Ad2s 4c6h Qc4d"));
  }

  @Test
  public void test_texas_holdem_1302_2d9sKdQhTh_2h8h_Ad4d_4s3c_Ah5c_8d7s() {
    assertEquals(
      "4s3c 8d7s Ad4d=Ah5c 2h8h",
      Solver.process("texas-holdem 2d9sKdQhTh 2h8h Ad4d 4s3c Ah5c 8d7s"));
  }

  @Test
  public void test_texas_holdem_1303_2s5d5h6cTd_Js3h_5s9s_QsAs_QcQd() {
    assertEquals(
      "Js3h QsAs QcQd 5s9s",
      Solver.process("texas-holdem 2s5d5h6cTd Js3h 5s9s QsAs QcQd"));
  }

  @Test
  public void test_texas_holdem_1304_2d5cJdTcTd_Qs7h_7c9s_7sKs_5sTh_4sQd_Kd3c_AdKh_3d9h_3s8h() {
    assertEquals(
      "3s8h 3d9h 7c9s 4sQd Qs7h Kd3c 7sKs AdKh 5sTh",
      Solver.process("texas-holdem 2d5cJdTcTd Qs7h 7c9s 7sKs 5sTh 4sQd Kd3c AdKh 3d9h 3s8h"));
  }

  @Test
  public void test_texas_holdem_1305_4d5d5sKsQh_4sKd_4c5c_2c7c() {
    assertEquals(
      "2c7c 4sKd 4c5c",
      Solver.process("texas-holdem 4d5d5sKsQh 4sKd 4c5c 2c7c"));
  }

  @Test
  public void test_texas_holdem_1306_2c3h9c9hTc_7c6h_8s4s_Qd6s_9s8d_KhKd_Ts4h_AsAc_5d5s() {
    assertEquals(
      "7c6h 8s4s Qd6s 5d5s Ts4h KhKd AsAc 9s8d",
      Solver.process("texas-holdem 2c3h9c9hTc 7c6h 8s4s Qd6s 9s8d KhKd Ts4h AsAc 5d5s"));
  }

  @Test
  public void test_texas_holdem_1307_8hAhJcJhTd_4s7s_6hQh_Kh9h_AdQs() {
    assertEquals(
      "4s7s AdQs 6hQh Kh9h",
      Solver.process("texas-holdem 8hAhJcJhTd 4s7s 6hQh Kh9h AdQs"));
  }

  @Test
  public void test_texas_holdem_1308_8c8d8hAcJh_QdQs_Jc7c_Kd7s_4hAd_4sQh_Ah2d() {
    assertEquals(
      "4sQh Kd7s Jc7c QdQs 4hAd=Ah2d",
      Solver.process("texas-holdem 8c8d8hAcJh QdQs Jc7c Kd7s 4hAd 4sQh Ah2d"));
  }

  @Test
  public void test_texas_holdem_1309_2s8d8hJcQs_9c4s_3d3h() {
    assertEquals(
      "9c4s 3d3h",
      Solver.process("texas-holdem 2s8d8hJcQs 9c4s 3d3h"));
  }

  @Test
  public void test_texas_holdem_1310_9c9hKcKdQs_8d8c_Kh6h_Td5h_2c5c_6cJd_7d2s() {
    assertEquals(
      "2c5c=6cJd=7d2s=8d8c=Td5h Kh6h",
      Solver.process("texas-holdem 9c9hKcKdQs 8d8c Kh6h Td5h 2c5c 6cJd 7d2s"));
  }

  @Test
  public void test_texas_holdem_1311_4d4h5c7d7h_Jc6s_5d2d_JdTd_6dJh_ThQd_Kd6c_8cKs() {
    assertEquals(
      "6dJh=Jc6s=JdTd ThQd 8cKs=Kd6c 5d2d",
      Solver.process("texas-holdem 4d4h5c7d7h Jc6s 5d2d JdTd 6dJh ThQd Kd6c 8cKs"));
  }

  @Test
  public void test_texas_holdem_1312_5h6c6d6sAs_TsQh_3cTh_Qs7c_6h8d_Qd5d_TdAh() {
    assertEquals(
      "3cTh Qs7c=TsQh Qd5d TdAh 6h8d",
      Solver.process("texas-holdem 5h6c6d6sAs TsQh 3cTh Qs7c 6h8d Qd5d TdAh"));
  }

  @Test
  public void test_texas_holdem_1313_5sJdKhQhTd_5c4s_2h8d_6cAh() {
    assertEquals(
      "2h8d 5c4s 6cAh",
      Solver.process("texas-holdem 5sJdKhQhTd 5c4s 2h8d 6cAh"));
  }

  @Test
  public void test_texas_holdem_1314_3s5d7s8cQc_Th6c_7h9d_4s9h_3cJc_9cAd_4c2s_Kd8s_7c8h_Ks6h() {
    assertEquals(
      "4c2s 4s9h Th6c Ks6h 9cAd 3cJc 7h9d Kd8s 7c8h",
      Solver.process("texas-holdem 3s5d7s8cQc Th6c 7h9d 4s9h 3cJc 9cAd 4c2s Kd8s 7c8h Ks6h"));
  }

  @Test
  public void test_texas_holdem_1315_4d8c9dAsJc_KhQs_Qh9s_3c8h_9c9h_5h3s_TsQd_Ac6c_5s4c() {
    assertEquals(
      "5h3s KhQs 5s4c 3c8h Qh9s Ac6c 9c9h TsQd",
      Solver.process("texas-holdem 4d8c9dAsJc KhQs Qh9s 3c8h 9c9h 5h3s TsQd Ac6c 5s4c"));
  }

  @Test
  public void test_texas_holdem_1316_2d4d7s8sJd_Td6c_9hKc_5c5s() {
    assertEquals(
      "Td6c 9hKc 5c5s",
      Solver.process("texas-holdem 2d4d7s8sJd Td6c 9hKc 5c5s"));
  }

  @Test
  public void test_texas_holdem_1317_2s4c6h8dQc_Ts4s_Ac5c_Jc4h_TcKd_8c3s_5d9c_7s5s_JsKs_JdKc() {
    assertEquals(
      "5d9c TcKd JdKc=JsKs Ac5c Ts4s Jc4h 8c3s 7s5s",
      Solver.process("texas-holdem 2s4c6h8dQc Ts4s Ac5c Jc4h TcKd 8c3s 5d9c 7s5s JsKs JdKc"));
  }

  @Test
  public void test_texas_holdem_1318_3s5h6h7hTh_JdKc_TsJc_6s2c_7d8s_9c4h_9s4s_Ah9d() {
    assertEquals(
      "JdKc 6s2c 7d8s TsJc 9s4s 9c4h Ah9d",
      Solver.process("texas-holdem 3s5h6h7hTh JdKc TsJc 6s2c 7d8s 9c4h 9s4s Ah9d"));
  }

  @Test
  public void test_texas_holdem_1319_3c4c5sTcTh_5hTd_3d9s() {
    assertEquals(
      "3d9s 5hTd",
      Solver.process("texas-holdem 3c4c5sTcTh 5hTd 3d9s"));
  }

  @Test
  public void test_texas_holdem_1320_2h5c8sAcTh_6hJs_9c4d_7cAs_8h8d_6dQc_7h7d_6s8c_5s6c_3s4c() {
    assertEquals(
      "9c4d 6hJs 6dQc 5s6c 7h7d 6s8c 7cAs 8h8d 3s4c",
      Solver.process("texas-holdem 2h5c8sAcTh 6hJs 9c4d 7cAs 8h8d 6dQc 7h7d 6s8c 5s6c 3s4c"));
  }

  @Test
  public void test_texas_holdem_1321_2d3c8c9sKs_QdAc_5d8d() {
    assertEquals(
      "QdAc 5d8d",
      Solver.process("texas-holdem 2d3c8c9sKs QdAc 5d8d"));
  }

  @Test
  public void test_texas_holdem_1322_2d4hJhKsTs_6d6h_Tc4d_4cAc_8s2s_Td9s_Jd2h_QdKh_Qh2c() {
    assertEquals(
      "8s2s Qh2c 4cAc 6d6h Td9s QdKh Tc4d Jd2h",
      Solver.process("texas-holdem 2d4hJhKsTs 6d6h Tc4d 4cAc 8s2s Td9s Jd2h QdKh Qh2c"));
  }

  @Test
  public void test_texas_holdem_1323_3d5cJcKcKh_2h9h_KsAs_TcQs_Js8c_Td4c_4dAh() {
    assertEquals(
      "2h9h Td4c TcQs 4dAh Js8c KsAs",
      Solver.process("texas-holdem 3d5cJcKcKh 2h9h KsAs TcQs Js8c Td4c 4dAh"));
  }

  @Test
  public void test_texas_holdem_1324_2c2h5hAcTs_5d7s_Jh9d() {
    assertEquals(
      "Jh9d 5d7s",
      Solver.process("texas-holdem 2c2h5hAcTs 5d7s Jh9d"));
  }

  @Test
  public void test_texas_holdem_1325_4d4hJdKdQd_6hAs_3c5c_TcJs_2h3h_QhKs() {
    assertEquals(
      "2h3h=3c5c 6hAs TcJs QhKs",
      Solver.process("texas-holdem 4d4hJdKdQd 6hAs 3c5c TcJs 2h3h QhKs"));
  }

  @Test
  public void test_texas_holdem_1326_5d5sAdAhTh_Qs2c_7sTc_Kc4d_6d9s() {
    assertEquals(
      "6d9s Qs2c Kc4d 7sTc",
      Solver.process("texas-holdem 5d5sAdAhTh Qs2c 7sTc Kc4d 6d9s"));
  }

  @Test
  public void test_texas_holdem_1327_4h5h5s6s8s_4sJc_9dJd() {
    assertEquals(
      "9dJd 4sJc",
      Solver.process("texas-holdem 4h5h5s6s8s 4sJc 9dJd"));
  }

  @Test
  public void test_texas_holdem_1328_2h5s7cKdKs_2c4d_3c7h_9sQc() {
    assertEquals(
      "9sQc 2c4d 3c7h",
      Solver.process("texas-holdem 2h5s7cKdKs 2c4d 3c7h 9sQc"));
  }

  @Test
  public void test_texas_holdem_1329_7cAcKhQsTc_4s9s_4h2h_8cKc() {
    assertEquals(
      "4h2h 4s9s 8cKc",
      Solver.process("texas-holdem 7cAcKhQsTc 4s9s 4h2h 8cKc"));
  }

  @Test
  public void test_texas_holdem_1330_3d5h5sJhQc_8hQd_5cJc_6d2c_6h8d_Qs7c_Kd9h_Td8s() {
    assertEquals(
      "6d2c 6h8d Td8s Kd9h 8hQd=Qs7c 5cJc",
      Solver.process("texas-holdem 3d5h5sJhQc 8hQd 5cJc 6d2c 6h8d Qs7c Kd9h Td8s"));
  }

  @Test
  public void test_texas_holdem_1331_2s6c9dJdKs_QhJc_9h7s_5c8d_8sJs_4h7h_Tc7c() {
    assertEquals(
      "4h7h 5c8d Tc7c 9h7s 8sJs QhJc",
      Solver.process("texas-holdem 2s6c9dJdKs QhJc 9h7s 5c8d 8sJs 4h7h Tc7c"));
  }

  @Test
  public void test_texas_holdem_1332_3h4h5c9hTd_9c7h_Jh3d_Jd6s_4dQh_2h6h() {
    assertEquals(
      "Jd6s Jh3d 4dQh 9c7h 2h6h",
      Solver.process("texas-holdem 3h4h5c9hTd 9c7h Jh3d Jd6s 4dQh 2h6h"));
  }

  @Test
  public void test_texas_holdem_1333_2s3d8hAsKd_Kh4h_3h5h_Tc4c_9c9h_3s5d_5s2c_6s2h_6dJc_4d8d() {
    assertEquals(
      "Tc4c 6dJc 5s2c=6s2h 3h5h=3s5d 4d8d 9c9h Kh4h",
      Solver.process("texas-holdem 2s3d8hAsKd Kh4h 3h5h Tc4c 9c9h 3s5d 5s2c 6s2h 6dJc 4d8d"));
  }

  @Test
  public void test_texas_holdem_1334_8sAcAsJcQd_Ad9c_6d3h() {
    assertEquals(
      "6d3h Ad9c",
      Solver.process("texas-holdem 8sAcAsJcQd Ad9c 6d3h"));
  }

  @Test
  public void test_texas_holdem_1335_3c6c7h8cJd_9hTs_7d3s_Js8d_8s3h_Qd2s() {
    assertEquals(
      "Qd2s 7d3s 8s3h Js8d 9hTs",
      Solver.process("texas-holdem 3c6c7h8cJd 9hTs 7d3s Js8d 8s3h Qd2s"));
  }

  @Test
  public void test_texas_holdem_1336_7c8cAcQhTd_7sKd_5cAh_QsKs_Js4h_4sKc_3s4c_Qd2h_9d3h_9sTc() {
    assertEquals(
      "3s4c 9d3h Js4h 4sKc 7sKd 9sTc Qd2h QsKs 5cAh",
      Solver.process("texas-holdem 7c8cAcQhTd 7sKd 5cAh QsKs Js4h 4sKc 3s4c Qd2h 9d3h 9sTc"));
  }

  @Test
  public void test_texas_holdem_1337_2s5c7d8sJd_Qc7h_4dAh() {
    assertEquals(
      "4dAh Qc7h",
      Solver.process("texas-holdem 2s5c7d8sJd Qc7h 4dAh"));
  }

  @Test
  public void test_texas_holdem_1338_3s5d9sQhTc_6d4c_Js2c_6c5h_TdQc_Qd6s_3d9c() {
    assertEquals(
      "6d4c Js2c 6c5h Qd6s 3d9c TdQc",
      Solver.process("texas-holdem 3s5d9sQhTc 6d4c Js2c 6c5h TdQc Qd6s 3d9c"));
  }

  @Test
  public void test_texas_holdem_1339_6hAhKcKhTd_5cTc_3hAc_AdAs_4c4d_7cTh_2d2c_Ts9s_Qc8h() {
    assertEquals(
      "Qc8h 2d2c 4c4d 5cTc=7cTh=Ts9s 3hAc AdAs",
      Solver.process("texas-holdem 6hAhKcKhTd 5cTc 3hAc AdAs 4c4d 7cTh 2d2c Ts9s Qc8h"));
  }

  @Test
  public void test_texas_holdem_1340_3c4s5sAsKd_JcKs_7h3s_AdAh_Ts6s_Kh5h_Kc2s_2dJh_6cTd_9s4h() {
    assertEquals(
      "6cTd 7h3s 9s4h JcKs Kh5h AdAh 2dJh=Kc2s Ts6s",
      Solver.process("texas-holdem 3c4s5sAsKd JcKs 7h3s AdAh Ts6s Kh5h Kc2s 2dJh 6cTd 9s4h"));
  }

  @Test
  public void test_texas_holdem_1341_9cAcAhKsQc_9d8d_5cQh_TcJd_2hJc_2sQd() {
    assertEquals(
      "2hJc 9d8d 2sQd=5cQh TcJd",
      Solver.process("texas-holdem 9cAcAhKsQc 9d8d 5cQh TcJd 2hJc 2sQd"));
  }

  @Test
  public void test_texas_holdem_1342_6d6s7hQcTd_7c2d_TsAd_9s2s_7s3c_KhQd_5c6h_4h4c_Tc2h_4sAs() {
    assertEquals(
      "9s2s 4sAs 4h4c 7c2d=7s3c Tc2h TsAd KhQd 5c6h",
      Solver.process("texas-holdem 6d6s7hQcTd 7c2d TsAd 9s2s 7s3c KhQd 5c6h 4h4c Tc2h 4sAs"));
  }

  @Test
  public void test_texas_holdem_1343_6h7s8dAcTs_7d4s_Kh5d_Jc8s() {
    assertEquals(
      "Kh5d 7d4s Jc8s",
      Solver.process("texas-holdem 6h7s8dAcTs 7d4s Kh5d Jc8s"));
  }

  @Test
  public void test_texas_holdem_1344_6c7dAdKcTc_QhQd_8s5s_Kh2c_Jh3d_KdTs_4s4d_8c3c_3h7s_JdQc() {
    assertEquals(
      "8s5s Jh3d 4s4d 3h7s QhQd Kh2c KdTs JdQc 8c3c",
      Solver.process("texas-holdem 6c7dAdKcTc QhQd 8s5s Kh2c Jh3d KdTs 4s4d 8c3c 3h7s JdQc"));
  }

  @Test
  public void test_texas_holdem_1345_4d4h9dJhQh_As7d_TsTh_5s6c() {
    assertEquals(
      "5s6c As7d TsTh",
      Solver.process("texas-holdem 4d4h9dJhQh As7d TsTh 5s6c"));
  }

  @Test
  public void test_texas_holdem_1346_3s5s7cAhKh_QsKd_9sJd_Tc2h_9h7s() {
    assertEquals(
      "Tc2h 9sJd 9h7s QsKd",
      Solver.process("texas-holdem 3s5s7cAhKh QsKd 9sJd Tc2h 9h7s"));
  }

  @Test
  public void test_texas_holdem_1347_4s8cKcTdTh_8sAh_Kd9d_Jd5c_KsQd_7d6d_4h5s_3s3c_Jc6s() {
    assertEquals(
      "7d6d Jc6s=Jd5c 3s3c 4h5s 8sAh Kd9d KsQd",
      Solver.process("texas-holdem 4s8cKcTdTh 8sAh Kd9d Jd5c KsQd 7d6d 4h5s 3s3c Jc6s"));
  }

  @Test
  public void test_texas_holdem_1348_5h6d7hAhKh_Th9s_9h2s_4s2d_7dKs_7cQc_4c2c_Td5c_AdJs() {
    assertEquals(
      "4c2c=4s2d Td5c 7cQc AdJs 7dKs 9h2s Th9s",
      Solver.process("texas-holdem 5h6d7hAhKh Th9s 9h2s 4s2d 7dKs 7cQc 4c2c Td5c AdJs"));
  }

  @Test
  public void test_texas_holdem_1349_2c4c7cAhJc_Ac5h_9c3c_4sQc_8hQs_4d9h() {
    assertEquals(
      "8hQs 4d9h 9c3c 4sQc Ac5h",
      Solver.process("texas-holdem 2c4c7cAhJc Ac5h 9c3c 4sQc 8hQs 4d9h"));
  }

  @Test
  public void test_texas_holdem_1350_2c3h5d6h8c_6d4c_JhKc_3d3c_JdJc_Qs2d() {
    assertEquals(
      "JhKc Qs2d JdJc 3d3c 6d4c",
      Solver.process("texas-holdem 2c3h5d6h8c 6d4c JhKc 3d3c JdJc Qs2d"));
  }

  @Test
  public void test_texas_holdem_1351_5h6c8cJcKd_9cKs_Jd6d_9sQs_Th5d() {
    assertEquals(
      "9sQs Th5d 9cKs Jd6d",
      Solver.process("texas-holdem 5h6c8cJcKd 9cKs Jd6d 9sQs Th5d"));
  }

  @Test
  public void test_texas_holdem_1352_8d9sAsJsKs_QcKc_7dKd() {
    assertEquals(
      "7dKd QcKc",
      Solver.process("texas-holdem 8d9sAsJsKs QcKc 7dKd"));
  }

  @Test
  public void test_texas_holdem_1353_6c7dJcJhQh_9h7c_4c2c_2hJs_8s8h_6s7h() {
    assertEquals(
      "4c2c 6s7h=9h7c 8s8h 2hJs",
      Solver.process("texas-holdem 6c7dJcJhQh 9h7c 4c2c 2hJs 8s8h 6s7h"));
  }

  @Test
  public void test_texas_holdem_1354_8h9h9sKsTh_7s4c_Ah2d_3h6h_6cAd_3s5h_5d6d_JsQc_KhQh() {
    assertEquals(
      "3s5h=5d6d=7s4c 6cAd=Ah2d JsQc 3h6h KhQh",
      Solver.process("texas-holdem 8h9h9sKsTh 7s4c Ah2d 3h6h 6cAd 3s5h 5d6d JsQc KhQh"));
  }

  @Test
  public void test_texas_holdem_1355_3c4d6c8dQd_KcQs_9d4c_5dKd_Ah8h_3d9c() {
    assertEquals(
      "3d9c 9d4c Ah8h KcQs 5dKd",
      Solver.process("texas-holdem 3c4d6c8dQd KcQs 9d4c 5dKd Ah8h 3d9c"));
  }

  @Test
  public void test_texas_holdem_1356_2c6h8c9cKs_9h3d_ThAs_Kh3s_7s6s_Qs7d() {
    assertEquals(
      "Qs7d ThAs 7s6s 9h3d Kh3s",
      Solver.process("texas-holdem 2c6h8c9cKs 9h3d ThAs Kh3s 7s6s Qs7d"));
  }

  @Test
  public void test_texas_holdem_1357_7c9hJcKcKh_6hAc_Td5h_5s4c_Js7h_Qh8s() {
    assertEquals(
      "5s4c Td5h Qh8s 6hAc Js7h",
      Solver.process("texas-holdem 7c9hJcKcKh 6hAc Td5h 5s4c Js7h Qh8s"));
  }

  @Test
  public void test_texas_holdem_1358_2d4d5hJdQc_Js3h_9c4c_8dTh_5cTs() {
    assertEquals(
      "8dTh 9c4c 5cTs Js3h",
      Solver.process("texas-holdem 2d4d5hJdQc Js3h 9c4c 8dTh 5cTs"));
  }

  @Test
  public void test_texas_holdem_1359_2dJhKsQdQh_9cAh_6c3d() {
    assertEquals(
      "6c3d 9cAh",
      Solver.process("texas-holdem 2dJhKsQdQh 9cAh 6c3d"));
  }

  @Test
  public void test_texas_holdem_1360_3h4d6hJdKs_3cJs_7hKc_2sTh_6sAh_Tc4c_9h7d_2c2h_8c5c_9d9s() {
    assertEquals(
      "8c5c 9h7d 2sTh 2c2h Tc4c 6sAh 9d9s 7hKc 3cJs",
      Solver.process("texas-holdem 3h4d6hJdKs 3cJs 7hKc 2sTh 6sAh Tc4c 9h7d 2c2h 8c5c 9d9s"));
  }

  @Test
  public void test_texas_holdem_1361_2h7s9hQcTh_4h4s_2cJs() {
    assertEquals(
      "2cJs 4h4s",
      Solver.process("texas-holdem 2h7s9hQcTh 4h4s 2cJs"));
  }

  @Test
  public void test_texas_holdem_1362_4h5sAcKhQh_5c8d_Ah8s_9s7s() {
    assertEquals(
      "9s7s 5c8d Ah8s",
      Solver.process("texas-holdem 4h5sAcKhQh 5c8d Ah8s 9s7s"));
  }

  @Test
  public void test_texas_holdem_1363_7c8d9dAcTc_3dTd_AsQh_4cKd_Jc8h_4hAh_Js2s_2h6d_Kc8s_Ks7d() {
    assertEquals(
      "4cKd Ks7d Kc8s 3dTd 4hAh AsQh 2h6d Jc8h=Js2s",
      Solver.process("texas-holdem 7c8d9dAcTc 3dTd AsQh 4cKd Jc8h 4hAh Js2s 2h6d Kc8s Ks7d"));
  }

  @Test
  public void test_texas_holdem_1364_3h4h5h8c8h_Jd7s_5d6d_KcAd_2c3s_8s2h_6c6h_JcAc() {
    assertEquals(
      "Jd7s JcAc KcAd 2c3s 5d6d 8s2h 6c6h",
      Solver.process("texas-holdem 3h4h5h8c8h Jd7s 5d6d KcAd 2c3s 8s2h 6c6h JcAc"));
  }

  @Test
  public void test_texas_holdem_1365_2c7dKdQhTs_3cTc_2s4s() {
    assertEquals(
      "2s4s 3cTc",
      Solver.process("texas-holdem 2c7dKdQhTs 3cTc 2s4s"));
  }

  @Test
  public void test_texas_holdem_1366_2h3d8sAdTh_2s5h_QsQc_Jd6d_8d4c_AcQh_8h6c_Js5s_Kc3h_Qd3s() {
    assertEquals(
      "Js5s Jd6d 2s5h Qd3s Kc3h 8d4c 8h6c QsQc AcQh",
      Solver.process("texas-holdem 2h3d8sAdTh 2s5h QsQc Jd6d 8d4c AcQh 8h6c Js5s Kc3h Qd3s"));
  }

  @Test
  public void test_texas_holdem_1367_4h6c6h9sQs_8c9h_ThJd_2h6d_3s5d() {
    assertEquals(
      "3s5d ThJd 8c9h 2h6d",
      Solver.process("texas-holdem 4h6c6h9sQs 8c9h ThJd 2h6d 3s5d"));
  }

  @Test
  public void test_texas_holdem_1368_7h9sQdQsTc_2dKc_Th5s_8sKd_6h6c_2hJd_6sAh_3hQc() {
    assertEquals(
      "2hJd 2dKc=8sKd 6sAh 6h6c Th5s 3hQc",
      Solver.process("texas-holdem 7h9sQdQsTc 2dKc Th5s 8sKd 6h6c 2hJd 6sAh 3hQc"));
  }

  @Test
  public void test_texas_holdem_1369_4h5s9cAcTd_JdQs_ThQc_Ad9s_3c5h_Jh2d_5dTs() {
    assertEquals(
      "Jh2d JdQs 3c5h ThQc 5dTs Ad9s",
      Solver.process("texas-holdem 4h5s9cAcTd JdQs ThQc Ad9s 3c5h Jh2d 5dTs"));
  }

  @Test
  public void test_texas_holdem_1370_4d5c5s6sKh_8d9d_3c4c_4sTs_QdTd() {
    assertEquals(
      "8d9d QdTd 3c4c=4sTs",
      Solver.process("texas-holdem 4d5c5s6sKh 8d9d 3c4c 4sTs QdTd"));
  }

  @Test
  public void test_texas_holdem_1371_3s5c6s8sTs_5hJs_Jd5d_9s3h_4s6c_3d8d() {
    assertEquals(
      "Jd5d 3d8d 4s6c 9s3h 5hJs",
      Solver.process("texas-holdem 3s5c6s8sTs 5hJs Jd5d 9s3h 4s6c 3d8d"));
  }

  @Test
  public void test_texas_holdem_1372_3s7c9sJcKc_AsTh_Ks2s_4hAd_AhTd() {
    assertEquals(
      "4hAd AhTd=AsTh Ks2s",
      Solver.process("texas-holdem 3s7c9sJcKc AsTh Ks2s 4hAd AhTd"));
  }

  @Test
  public void test_texas_holdem_1373_8d8sQcQhTd_2d5c_7cJc_6cJs_4dQd_TsAc_6h2s() {
    assertEquals(
      "2d5c=6h2s 6cJs=7cJc TsAc 4dQd",
      Solver.process("texas-holdem 8d8sQcQhTd 2d5c 7cJc 6cJs 4dQd TsAc 6h2s"));
  }

  @Test
  public void test_texas_holdem_1374_3d6s9d9hAs_Td8c_Qc4d_ThKh_2sKd_Js9s_4h8h_2h7h() {
    assertEquals(
      "2h7h 4h8h Td8c Qc4d 2sKd ThKh Js9s",
      Solver.process("texas-holdem 3d6s9d9hAs Td8c Qc4d ThKh 2sKd Js9s 4h8h 2h7h"));
  }

  @Test
  public void test_texas_holdem_1375_2c8c9hQsTh_5hKs_Js3c_Jd9c_Qc2s() {
    assertEquals(
      "5hKs Qc2s Jd9c=Js3c",
      Solver.process("texas-holdem 2c8c9hQsTh 5hKs Js3c Jd9c Qc2s"));
  }

  @Test
  public void test_texas_holdem_1376_7d7s9hKhTh_2sAc_3sAd_Ah5s_3dKd_AsQh_6d4c_5hTc() {
    assertEquals(
      "6d4c 2sAc=3sAd=Ah5s AsQh 5hTc 3dKd",
      Solver.process("texas-holdem 7d7s9hKhTh 2sAc 3sAd Ah5s 3dKd AsQh 6d4c 5hTc"));
  }

  @Test
  public void test_texas_holdem_1377_3d4s5c8cQc_Td3s_As4c_KsJh_6s7d_QhKd_4dTh_8hJs_2h6d_5h7c() {
    assertEquals(
      "KsJh Td3s 4dTh As4c 5h7c 8hJs QhKd 2h6d 6s7d",
      Solver.process("texas-holdem 3d4s5c8cQc Td3s As4c KsJh 6s7d QhKd 4dTh 8hJs 2h6d 5h7c"));
  }

  @Test
  public void test_texas_holdem_1378_4h7c8cJdKh_4sAd_9s8h_6h4d() {
    assertEquals(
      "6h4d 4sAd 9s8h",
      Solver.process("texas-holdem 4h7c8cJdKh 4sAd 9s8h 6h4d"));
  }

  @Test
  public void test_texas_holdem_1379_2d3s6c8dKd_8s4h_7c4d_ThQd() {
    assertEquals(
      "7c4d ThQd 8s4h",
      Solver.process("texas-holdem 2d3s6c8dKd 8s4h 7c4d ThQd"));
  }

  @Test
  public void test_texas_holdem_1380_5h6s8cAcKd_3s6h_4hJd_5dKh_Qh3d_9s7d_2c8h_Ts8s_6d7h() {
    assertEquals(
      "4hJd Qh3d 3s6h=6d7h 2c8h Ts8s 5dKh 9s7d",
      Solver.process("texas-holdem 5h6s8cAcKd 3s6h 4hJd 5dKh Qh3d 9s7d 2c8h Ts8s 6d7h"));
  }

  @Test
  public void test_texas_holdem_1381_3d3h4h6dTs_6s3c_5s5d_QsAd_7c2c_6cAh_8c2s_7s4s_5c8d() {
    assertEquals(
      "7c2c 5c8d=8c2s QsAd 7s4s 5s5d 6cAh 6s3c",
      Solver.process("texas-holdem 3d3h4h6dTs 6s3c 5s5d QsAd 7c2c 6cAh 8c2s 7s4s 5c8d"));
  }

  @Test
  public void test_texas_holdem_1382_7h8hJdKdTh_Kc7d_Td4d_Jc7s_5h3c_3h8s_QdTs_8c2s_AsJh() {
    assertEquals(
      "5h3c 3h8s=8c2s Td4d QdTs AsJh Jc7s Kc7d",
      Solver.process("texas-holdem 7h8hJdKdTh Kc7d Td4d Jc7s 5h3c 3h8s QdTs 8c2s AsJh"));
  }

  @Test
  public void test_texas_holdem_1383_2s7c8s9dTc_ThQs_Ad7d_5c3d_QcAs_6hAh_2cQh_Kc9c_8c2d() {
    assertEquals(
      "5c3d QcAs 2cQh Ad7d Kc9c ThQs 8c2d 6hAh",
      Solver.process("texas-holdem 2s7c8s9dTc ThQs Ad7d 5c3d QcAs 6hAh 2cQh Kc9c 8c2d"));
  }

  @Test
  public void test_texas_holdem_1384_3c4h5s9dQd_4s3s_6c4d_7c7s_8hTc_Kh5h() {
    assertEquals(
      "8hTc 6c4d Kh5h 7c7s 4s3s",
      Solver.process("texas-holdem 3c4h5s9dQd 4s3s 6c4d 7c7s 8hTc Kh5h"));
  }

  @Test
  public void test_texas_holdem_1385_4d6c9c9h9s_7hJs_2d8s_Qc2s_5h5c_8d3d_2c8h() {
    assertEquals(
      "2c8h=2d8s=8d3d 7hJs Qc2s 5h5c",
      Solver.process("texas-holdem 4d6c9c9h9s 7hJs 2d8s Qc2s 5h5c 8d3d 2c8h"));
  }

  @Test
  public void test_texas_holdem_1386_2d6h8hKdQd_TsTh_5sQh_Ac3h_8sQc() {
    assertEquals(
      "Ac3h TsTh 5sQh 8sQc",
      Solver.process("texas-holdem 2d6h8hKdQd TsTh 5sQh Ac3h 8sQc"));
  }

  @Test
  public void test_texas_holdem_1387_3d4d5sJdQc_2s5h_TdJc_Kh2d_4c6h_4h8d_6sKc_9s6d() {
    assertEquals(
      "9s6d Kh2d 6sKc 4c6h 4h8d 2s5h TdJc",
      Solver.process("texas-holdem 3d4d5sJdQc 2s5h TdJc Kh2d 4c6h 4h8d 6sKc 9s6d"));
  }

  @Test
  public void test_texas_holdem_1388_3d6c6s7d8c_5cAh_JcKd_Ac8s_Js5s_2cQc_As5h_Th2h_Qs4d_TdTs() {
    assertEquals(
      "Th2h Js5s 2cQc=Qs4d JcKd 5cAh=As5h Ac8s TdTs",
      Solver.process("texas-holdem 3d6c6s7d8c 5cAh JcKd Ac8s Js5s 2cQc As5h Th2h Qs4d TdTs"));
  }

  @Test
  public void test_texas_holdem_1389_5h7s8c8dKh_3s8h_As7c_9sJs_5cQd_QhKd_Jd8s_7hTc_2d6s_Qc2c() {
    assertEquals(
      "2d6s 9sJs Qc2c 5cQd 7hTc As7c QhKd 3s8h Jd8s",
      Solver.process("texas-holdem 5h7s8c8dKh 3s8h As7c 9sJs 5cQd QhKd Jd8s 7hTc 2d6s Qc2c"));
  }

  @Test
  public void test_texas_holdem_1390_9dJsQcQsTs_5s7h_9cJh_5dAs_6s8s_9s2c_6c2s_8dTh() {
    assertEquals(
      "5s7h=6c2s 5dAs 9s2c 9cJh 8dTh 6s8s",
      Solver.process("texas-holdem 9dJsQcQsTs 5s7h 9cJh 5dAs 6s8s 9s2c 6c2s 8dTh"));
  }

  @Test
  public void test_texas_holdem_1391_3s4s5hQsTc_KcJc_8c5s_7sAd_Qd8s_6h3h_Ts9h() {
    assertEquals(
      "KcJc 7sAd 6h3h 8c5s Ts9h Qd8s",
      Solver.process("texas-holdem 3s4s5hQsTc KcJc 8c5s 7sAd Qd8s 6h3h Ts9h"));
  }

  @Test
  public void test_texas_holdem_1392_2d3c6h9c9h_9sQs_2c2h_6s2s_9dQh_3dJc() {
    assertEquals(
      "3dJc 6s2s 9dQh=9sQs 2c2h",
      Solver.process("texas-holdem 2d3c6h9c9h 9sQs 2c2h 6s2s 9dQh 3dJc"));
  }

  @Test
  public void test_texas_holdem_1393_4d7hJdKcQd_5cKh_Jc3c_6cQs_AcAd_6hTc_4s7c_Td9h() {
    assertEquals(
      "6hTc Jc3c 6cQs 5cKh AcAd 4s7c Td9h",
      Solver.process("texas-holdem 4d7hJdKcQd 5cKh Jc3c 6cQs AcAd 6hTc 4s7c Td9h"));
  }

  @Test
  public void test_texas_holdem_1394_2c7d8s9hKc_6h6d_7c8d_Qs8h_Js7h_9cKh_As4h_5c7s_QhJc_3d9d() {
    assertEquals(
      "QhJc As4h 6h6d 5c7s Js7h Qs8h 3d9d 7c8d 9cKh",
      Solver.process("texas-holdem 2c7d8s9hKc 6h6d 7c8d Qs8h Js7h 9cKh As4h 5c7s QhJc 3d9d"));
  }

  @Test
  public void test_texas_holdem_1395_5sJhQcQsTc_Jc8s_2s2d_3s4s_4h5d_Kd5h_Kc9d_7h8h_9c9s_Ac8c() {
    assertEquals(
      "3s4s 7h8h Ac8c 2s2d 4h5d Kd5h 9c9s Jc8s Kc9d",
      Solver.process("texas-holdem 5sJhQcQsTc Jc8s 2s2d 3s4s 4h5d Kd5h Kc9d 7h8h 9c9s Ac8c"));
  }

  @Test
  public void test_texas_holdem_1396_3c5c8c9c9h_As3s_7d4d_5hQh_2dKc_6dAd() {
    assertEquals(
      "7d4d 6dAd As3s 5hQh 2dKc",
      Solver.process("texas-holdem 3c5c8c9c9h As3s 7d4d 5hQh 2dKc 6dAd"));
  }

  @Test
  public void test_texas_holdem_1397_5h9dJcKcKs_JdQh_Kh2s() {
    assertEquals(
      "JdQh Kh2s",
      Solver.process("texas-holdem 5h9dJcKcKs JdQh Kh2s"));
  }

  @Test
  public void test_texas_holdem_1398_5d6s7d9cAh_4cJd_6dTs_5h9s_6hQc_TcQh_7hAc_2d3d_KcQd_5c8d() {
    assertEquals(
      "2d3d 4cJd TcQh KcQd 6dTs 6hQc 5h9s 7hAc 5c8d",
      Solver.process("texas-holdem 5d6s7d9cAh 4cJd 6dTs 5h9s 6hQc TcQh 7hAc 2d3d KcQd 5c8d"));
  }

  @Test
  public void test_texas_holdem_1399_2d3h3s4cQh_5cTd_Tc9c_Ac7s() {
    assertEquals(
      "5cTd Tc9c Ac7s",
      Solver.process("texas-holdem 2d3h3s4cQh 5cTd Tc9c Ac7s"));
  }

  @Test
  public void test_texas_holdem_1400_2c2hAcKdKh_TcTd_6dQh_JsJc() {
    assertEquals(
      "6dQh TcTd JsJc",
      Solver.process("texas-holdem 2c2hAcKdKh TcTd 6dQh JsJc"));
  }

  @Test
  public void test_texas_holdem_1401_8cJsKcQcTs_6dJc_Kh6h_Jh5h_3c9s() {
    assertEquals(
      "6dJc=Jh5h Kh6h 3c9s",
      Solver.process("texas-holdem 8cJsKcQcTs 6dJc Kh6h Jh5h 3c9s"));
  }

  @Test
  public void test_texas_holdem_1402_4c8h9dJsTc_QsAc_5h4h_6d9s_3c2d() {
    assertEquals(
      "3c2d 5h4h 6d9s QsAc",
      Solver.process("texas-holdem 4c8h9dJsTc QsAc 5h4h 6d9s 3c2d"));
  }

  @Test
  public void test_texas_holdem_1403_2c7c7s8hKc_QhQd_AhTs_2h6d_5h5d_Td4h_4dKh_Js8d_Qc8c_4c3s() {
    assertEquals(
      "4c3s Td4h AhTs 2h6d 5h5d Js8d QhQd 4dKh Qc8c",
      Solver.process("texas-holdem 2c7c7s8hKc QhQd AhTs 2h6d 5h5d Td4h 4dKh Js8d Qc8c 4c3s"));
  }

  @Test
  public void test_texas_holdem_1404_5d7s8hKdTd_8s8c_9sAs_2s4c() {
    assertEquals(
      "2s4c 9sAs 8s8c",
      Solver.process("texas-holdem 5d7s8hKdTd 8s8c 9sAs 2s4c"));
  }

  @Test
  public void test_texas_holdem_1405_5c6c7c8d9h_6s9s_Js3s_9cQs() {
    assertEquals(
      "6s9s=9cQs=Js3s",
      Solver.process("texas-holdem 5c6c7c8d9h 6s9s Js3s 9cQs"));
  }

  @Test
  public void test_texas_holdem_1406_2d6sAcAdJs_2h3d_6dKc_KhQd_7cAh_Th6c_9cKs_7sJh_QcQs_Tc8s() {
    assertEquals(
      "Tc8s 9cKs KhQd 2h3d Th6c 6dKc 7sJh QcQs 7cAh",
      Solver.process("texas-holdem 2d6sAcAdJs 2h3d 6dKc KhQd 7cAh Th6c 9cKs 7sJh QcQs Tc8s"));
  }

  @Test
  public void test_texas_holdem_1407_5d7d9c9sTs_Td3s_4s5s_4cJh_Qs6s_6h7h_Qh9d_8cJs_Qd5h_Tc3c() {
    assertEquals(
      "4cJh Qs6s 4s5s Qd5h 6h7h Tc3c=Td3s Qh9d 8cJs",
      Solver.process("texas-holdem 5d7d9c9sTs Td3s 4s5s 4cJh Qs6s 6h7h Qh9d 8cJs Qd5h Tc3c"));
  }

  @Test
  public void test_texas_holdem_1408_3s5d7cAcAd_8hTc_Qs7s_4d8s_9h7h_6d9s_Ts6c_As4c() {
    assertEquals(
      "4d8s 6d9s Ts6c 8hTc 9h7h Qs7s As4c",
      Solver.process("texas-holdem 3s5d7cAcAd 8hTc Qs7s 4d8s 9h7h 6d9s Ts6c As4c"));
  }

  @Test
  public void test_texas_holdem_1409_2c5d6s7dJh_4h3c_3hKc_Qd5s_2hAd_6c4d() {
    assertEquals(
      "3hKc 2hAd Qd5s 6c4d 4h3c",
      Solver.process("texas-holdem 2c5d6s7dJh 4h3c 3hKc Qd5s 2hAd 6c4d"));
  }

  @Test
  public void test_texas_holdem_1410_2c2hKdKhQc_7cTc_4c9h_8c6c_Js7s_5h4h_Kc3h_3sAc() {
    assertEquals(
      "4c9h=5h4h=7cTc=8c6c=Js7s 3sAc Kc3h",
      Solver.process("texas-holdem 2c2hKdKhQc 7cTc 4c9h 8c6c Js7s 5h4h Kc3h 3sAc"));
  }

  @Test
  public void test_texas_holdem_1411_4c9sKsQcQh_5cJs_4hTc() {
    assertEquals(
      "5cJs 4hTc",
      Solver.process("texas-holdem 4c9sKsQcQh 5cJs 4hTc"));
  }

  @Test
  public void test_texas_holdem_1412_7d8d8sAsTd_6s4c_Ac2d_AhQs_6d6c_5dKh_Th5c() {
    assertEquals(
      "6s4c 5dKh 6d6c Th5c Ac2d AhQs",
      Solver.process("texas-holdem 7d8d8sAsTd 6s4c Ac2d AhQs 6d6c 5dKh Th5c"));
  }

  @Test
  public void test_texas_holdem_1413_6s7d8c8dTh_4dKd_3d6h_KhTd_Ks4h_7h5s_5c4s() {
    assertEquals(
      "4dKd=Ks4h 3d6h 7h5s KhTd 5c4s",
      Solver.process("texas-holdem 6s7d8c8dTh 4dKd 3d6h KhTd Ks4h 7h5s 5c4s"));
  }

  @Test
  public void test_texas_holdem_1414_3dAcKhKsQd_7c4h_3hJc_6h8c_2c8d() {
    assertEquals(
      "7c4h 2c8d=6h8c 3hJc",
      Solver.process("texas-holdem 3dAcKhKsQd 7c4h 3hJc 6h8c 2c8d"));
  }

  @Test
  public void test_texas_holdem_1415_3c5h6d8h9d_2s6h_Ks3d_2cQs() {
    assertEquals(
      "2cQs Ks3d 2s6h",
      Solver.process("texas-holdem 3c5h6d8h9d 2s6h Ks3d 2cQs"));
  }

  @Test
  public void test_texas_holdem_1416_3c7dAdKcQh_4s5d_6c9s() {
    assertEquals(
      "4s5d 6c9s",
      Solver.process("texas-holdem 3c7dAdKcQh 4s5d 6c9s"));
  }

  @Test
  public void test_texas_holdem_1417_5d8c9sAsQd_Qs7h_5c4c_6dJc_ThJd_2sTd_6s2d_8d5s_KsQh() {
    assertEquals(
      "6s2d 2sTd 6dJc 5c4c Qs7h KsQh 8d5s ThJd",
      Solver.process("texas-holdem 5d8c9sAsQd Qs7h 5c4c 6dJc ThJd 2sTd 6s2d 8d5s KsQh"));
  }

  @Test
  public void test_texas_holdem_1418_2d6s7c8sJh_2h8h_4cQd() {
    assertEquals(
      "4cQd 2h8h",
      Solver.process("texas-holdem 2d6s7c8sJh 2h8h 4cQd"));
  }

  @Test
  public void test_texas_holdem_1419_2s4c6h8cTd_QcKh_5cKd_3s7d() {
    assertEquals(
      "3s7d 5cKd QcKh",
      Solver.process("texas-holdem 2s4c6h8cTd QcKh 5cKd 3s7d"));
  }

  @Test
  public void test_texas_holdem_1420_2s5h7c9hQh_ThKh_6c3c() {
    assertEquals(
      "6c3c ThKh",
      Solver.process("texas-holdem 2s5h7c9hQh ThKh 6c3c"));
  }

  @Test
  public void test_texas_holdem_1421_2c5s6hJhTh_Jc2d_5c8c_7c3d_Tc4d_3h2s_9sAd_6c8d() {
    assertEquals(
      "7c3d 9sAd 3h2s 5c8c 6c8d Tc4d Jc2d",
      Solver.process("texas-holdem 2c5s6hJhTh Jc2d 5c8c 7c3d Tc4d 3h2s 9sAd 6c8d"));
  }

  @Test
  public void test_texas_holdem_1422_3c6d6hAsQh_9dQc_Jc7c_3s9c_9h6c() {
    assertEquals(
      "Jc7c 3s9c 9dQc 9h6c",
      Solver.process("texas-holdem 3c6d6hAsQh 9dQc Jc7c 3s9c 9h6c"));
  }

  @Test
  public void test_texas_holdem_1423_2c2d5h7dKc_QsAd_Ts5d_8s6s() {
    assertEquals(
      "8s6s QsAd Ts5d",
      Solver.process("texas-holdem 2c2d5h7dKc QsAd Ts5d 8s6s"));
  }

  @Test
  public void test_texas_holdem_1424_2h5s6dKsTs_Jd6h_Qc5c_4h4s_4dJs() {
    assertEquals(
      "4dJs 4h4s Qc5c Jd6h",
      Solver.process("texas-holdem 2h5s6dKsTs Jd6h Qc5c 4h4s 4dJs"));
  }

  @Test
  public void test_texas_holdem_1425_2c5c7cKhQc_Qh3d_2s9d_8h7d_6d3c_9s5d_5h4d() {
    assertEquals(
      "2s9d 5h4d 9s5d 8h7d Qh3d 6d3c",
      Solver.process("texas-holdem 2c5c7cKhQc Qh3d 2s9d 8h7d 6d3c 9s5d 5h4d"));
  }

  @Test
  public void test_texas_holdem_1426_3d4d6d6sKd_9h5d_Ah8s_2h8h_2d9d_7cAd_Tc3h_AcJh_KcTd() {
    assertEquals(
      "2h8h Ah8s AcJh Tc3h 9h5d 2d9d KcTd 7cAd",
      Solver.process("texas-holdem 3d4d6d6sKd 9h5d Ah8s 2h8h 2d9d 7cAd Tc3h AcJh KcTd"));
  }

  @Test
  public void test_texas_holdem_1427_2h3s8d9dKh_Qs9c_6h3c() {
    assertEquals(
      "6h3c Qs9c",
      Solver.process("texas-holdem 2h3s8d9dKh Qs9c 6h3c"));
  }

  @Test
  public void test_texas_holdem_1428_4c4s7dAcJd_7cKc_8h8c_5cKh() {
    assertEquals(
      "5cKh 7cKc 8h8c",
      Solver.process("texas-holdem 4c4s7dAcJd 7cKc 8h8c 5cKh"));
  }

  @Test
  public void test_texas_holdem_1429_2hQdQsTcTh_TsAd_Td9s_JsQc_9cAc_5cKs_6c3h_8s7d_5hJc_8cKh() {
    assertEquals(
      "6c3h 8s7d 5hJc 5cKs=8cKh 9cAc Td9s=TsAd JsQc",
      Solver.process("texas-holdem 2hQdQsTcTh TsAd Td9s JsQc 9cAc 5cKs 6c3h 8s7d 5hJc 8cKh"));
  }

  @Test
  public void test_texas_holdem_1430_2c2h4s8dTc_AdQd_QsJs_6cJc_Th9d_7s4h_Jh5c_7d5s_2s8c() {
    assertEquals(
      "7d5s 6cJc=Jh5c QsJs AdQd 7s4h Th9d 2s8c",
      Solver.process("texas-holdem 2c2h4s8dTc AdQd QsJs 6cJc Th9d 7s4h Jh5c 7d5s 2s8c"));
  }

  @Test
  public void test_texas_holdem_1431_3d6h8sAsJh_Kc7d_4d7s_3hQs_3c9h_5d8c_4s6d() {
    assertEquals(
      "4d7s Kc7d 3c9h 3hQs 4s6d 5d8c",
      Solver.process("texas-holdem 3d6h8sAsJh Kc7d 4d7s 3hQs 3c9h 5d8c 4s6d"));
  }

  @Test
  public void test_texas_holdem_1432_4c5s8c8hQs_4d9h_6c6h_7hTc_3hKc_4h9s_8dQh() {
    assertEquals(
      "7hTc 3hKc 4d9h=4h9s 6c6h 8dQh",
      Solver.process("texas-holdem 4c5s8c8hQs 4d9h 6c6h 7hTc 3hKc 4h9s 8dQh"));
  }

  @Test
  public void test_texas_holdem_1433_3s4sKsQdTc_Qs2c_3h6d() {
    assertEquals(
      "3h6d Qs2c",
      Solver.process("texas-holdem 3s4sKsQdTc Qs2c 3h6d"));
  }

  @Test
  public void test_texas_holdem_1434_4d8c8h9hKd_7h9c_4hKc_7c2d_6d9d() {
    assertEquals(
      "7c2d 6d9d=7h9c 4hKc",
      Solver.process("texas-holdem 4d8c8h9hKd 7h9c 4hKc 7c2d 6d9d"));
  }

  @Test
  public void test_texas_holdem_1435_3h9sAdJdJh_6c7h_AhTd_9hJs() {
    assertEquals(
      "6c7h AhTd 9hJs",
      Solver.process("texas-holdem 3h9sAdJdJh 6c7h AhTd 9hJs"));
  }

  @Test
  public void test_texas_holdem_1436_3c6cAcKcQd_2s4c_2c5c_Ks9c_2h8h() {
    assertEquals(
      "2h8h 2s4c 2c5c Ks9c",
      Solver.process("texas-holdem 3c6cAcKcQd 2s4c 2c5c Ks9c 2h8h"));
  }

  @Test
  public void test_texas_holdem_1437_2h9hAdQhTs_TcTh_9dJh_8dJs_9sAh() {
    assertEquals(
      "9dJh 9sAh TcTh 8dJs",
      Solver.process("texas-holdem 2h9hAdQhTs TcTh 9dJh 8dJs 9sAh"));
  }

  @Test
  public void test_texas_holdem_1438_9sKcKsQcQh_5s4s_6c2s_TsAh() {
    assertEquals(
      "5s4s=6c2s TsAh",
      Solver.process("texas-holdem 9sKcKsQcQh 5s4s 6c2s TsAh"));
  }

  @Test
  public void test_texas_holdem_1439_2s3c8c9hKd_Jc4d_As6h_5d5s_AhTd_QhJh_2dTc_3hQs_Th6s() {
    assertEquals(
      "Th6s Jc4d QhJh As6h AhTd 2dTc 3hQs 5d5s",
      Solver.process("texas-holdem 2s3c8c9hKd Jc4d As6h 5d5s AhTd QhJh 2dTc 3hQs Th6s"));
  }

  @Test
  public void test_texas_holdem_1440_4sKhQcTdTh_5sAs_QdQh_7c6s() {
    assertEquals(
      "7c6s 5sAs QdQh",
      Solver.process("texas-holdem 4sKhQcTdTh 5sAs QdQh 7c6s"));
  }

  @Test
  public void test_texas_holdem_1441_3s5c7cJdKs_Ad5s_Kd2s_4sAh() {
    assertEquals(
      "4sAh Ad5s Kd2s",
      Solver.process("texas-holdem 3s5c7cJdKs Ad5s Kd2s 4sAh"));
  }

  @Test
  public void test_texas_holdem_1442_2c3d6c7c9d_Js8c_3hQh_AcKd_8hQc_Kh3c_2hJd_2d6h_7h9s_As2s() {
    assertEquals(
      "Js8c 8hQc AcKd 2hJd As2s 3hQh Kh3c 2d6h 7h9s",
      Solver.process("texas-holdem 2c3d6c7c9d Js8c 3hQh AcKd 8hQc Kh3c 2hJd 2d6h 7h9s As2s"));
  }

  @Test
  public void test_texas_holdem_1443_5s7d9hAcKc_5c4s_6c8s_9cQc_6s5h_JdAh_Jh4h_Kh2c() {
    assertEquals(
      "Jh4h 5c4s=6s5h 9cQc Kh2c JdAh 6c8s",
      Solver.process("texas-holdem 5s7d9hAcKc 5c4s 6c8s 9cQc 6s5h JdAh Jh4h Kh2c"));
  }

  @Test
  public void test_texas_holdem_1444_4c5d7sJhQs_Ts6s_6c6h_2hAc_Kc7c_Ad3s_3c9d_JdTd_7dJs_Jc5h() {
    assertEquals(
      "3c9d Ts6s 2hAc=Ad3s 6c6h Kc7c JdTd Jc5h 7dJs",
      Solver.process("texas-holdem 4c5d7sJhQs Ts6s 6c6h 2hAc Kc7c Ad3s 3c9d JdTd 7dJs Jc5h"));
  }

  @Test
  public void test_texas_holdem_1445_3h8c8sKsTh_7s7d_2dKc_Qd9d_Kd7c_Ts2h() {
    assertEquals(
      "Qd9d 7s7d Ts2h 2dKc=Kd7c",
      Solver.process("texas-holdem 3h8c8sKsTh 7s7d 2dKc Qd9d Kd7c Ts2h"));
  }

  @Test
  public void test_texas_holdem_1446_4d9dAcKhKs_3cAs_Jd8d_5s6h_Td8c_Ah7d_Th6c() {
    assertEquals(
      "5s6h Td8c=Th6c Jd8d 3cAs=Ah7d",
      Solver.process("texas-holdem 4d9dAcKhKs 3cAs Jd8d 5s6h Td8c Ah7d Th6c"));
  }

  @Test
  public void test_texas_holdem_1447_6c9cKhTcTd_3cTs_Ad2h_9dJc_4cAs_6d2s_ThJs_7h4d_8dJh() {
    assertEquals(
      "7h4d 8dJh 4cAs=Ad2h 6d2s 9dJc 3cTs ThJs",
      Solver.process("texas-holdem 6c9cKhTcTd 3cTs Ad2h 9dJc 4cAs 6d2s ThJs 7h4d 8dJh"));
  }

  @Test
  public void test_texas_holdem_1448_2d6c7dJcQd_2s9d_6s2c_Js5s_QcKs_4d9h_5c8s() {
    assertEquals(
      "5c8s 4d9h 2s9d Js5s QcKs 6s2c",
      Solver.process("texas-holdem 2d6c7dJcQd 2s9d 6s2c Js5s QcKs 4d9h 5c8s"));
  }

  @Test
  public void test_texas_holdem_1449_2s4s9cJsKd_6d2c_TcQc_3dTd_6c9h_9s3s() {
    assertEquals(
      "3dTd 6d2c 6c9h TcQc 9s3s",
      Solver.process("texas-holdem 2s4s9cJsKd 6d2c TcQc 3dTd 6c9h 9s3s"));
  }

  @Test
  public void test_texas_holdem_1450_2s4c8cAcTd_3s4s_8h4h_6dTh() {
    assertEquals(
      "3s4s 6dTh 8h4h",
      Solver.process("texas-holdem 2s4c8cAcTd 3s4s 8h4h 6dTh"));
  }

  @Test
  public void test_texas_holdem_1451_9d9sKcKhQc_2s7h_8dTs_5dTh_5h5s_4hAd_6sAc() {
    assertEquals(
      "2s7h=5dTh=5h5s=8dTs 4hAd=6sAc",
      Solver.process("texas-holdem 9d9sKcKhQc 2s7h 8dTs 5dTh 5h5s 4hAd 6sAc"));
  }

  @Test
  public void test_texas_holdem_1452_2d5s6cAcQh_Th3s_KdTd() {
    assertEquals(
      "Th3s KdTd",
      Solver.process("texas-holdem 2d5s6cAcQh Th3s KdTd"));
  }

  @Test
  public void test_texas_holdem_1453_3s4h8c9hAd_5dAs_QdTc_6h5c_Jc9s_KsQh_Kd9c_2c3d_5h2s() {
    assertEquals(
      "6h5c QdTc KsQh 2c3d Jc9s Kd9c 5dAs 5h2s",
      Solver.process("texas-holdem 3s4h8c9hAd 5dAs QdTc 6h5c Jc9s KsQh Kd9c 2c3d 5h2s"));
  }

  @Test
  public void test_texas_holdem_1454_2c6c6hQsTc_3c2s_5c8h_7sQd_7d6s() {
    assertEquals(
      "5c8h 3c2s 7sQd 7d6s",
      Solver.process("texas-holdem 2c6c6hQsTc 3c2s 5c8h 7sQd 7d6s"));
  }

  @Test
  public void test_texas_holdem_1455_2h3h4c4sJs_8hJc_6c5c_2c7d_3sKh_Ac5h_7c9s_Ts6h_TcAd() {
    assertEquals(
      "7c9s Ts6h TcAd 2c7d 3sKh 8hJc Ac5h 6c5c",
      Solver.process("texas-holdem 2h3h4c4sJs 8hJc 6c5c 2c7d 3sKh Ac5h 7c9s Ts6h TcAd"));
  }

  @Test
  public void test_texas_holdem_1456_4h7d9hAsJc_3c9c_2hAd_ThAh_7h3h() {
    assertEquals(
      "7h3h 3c9c 2hAd ThAh",
      Solver.process("texas-holdem 4h7d9hAsJc 3c9c 2hAd ThAh 7h3h"));
  }

  @Test
  public void test_texas_holdem_1457_5h5s9cJhTc_TsQd_KhJd_8h6d() {
    assertEquals(
      "8h6d TsQd KhJd",
      Solver.process("texas-holdem 5h5s9cJhTc TsQd KhJd 8h6d"));
  }

  @Test
  public void test_texas_holdem_1458_3d8h8sKdTh_7h3h_8dJd_AhTd_4s8c() {
    assertEquals(
      "7h3h AhTd 4s8c 8dJd",
      Solver.process("texas-holdem 3d8h8sKdTh 7h3h 8dJd AhTd 4s8c"));
  }

  @Test
  public void test_texas_holdem_1459_5c6h9hAcQd_2d3d_9dJc_6c2c_6dQs_TsAd_3h7c_ThQc_Kh8h() {
    assertEquals(
      "2d3d 3h7c Kh8h 6c2c 9dJc ThQc TsAd 6dQs",
      Solver.process("texas-holdem 5c6h9hAcQd 2d3d 9dJc 6c2c 6dQs TsAd 3h7c ThQc Kh8h"));
  }

  @Test
  public void test_texas_holdem_1460_4c5s9sAcTh_6sKd_3dKh_As7d() {
    assertEquals(
      "3dKh 6sKd As7d",
      Solver.process("texas-holdem 4c5s9sAcTh 6sKd 3dKh As7d"));
  }

  @Test
  public void test_texas_holdem_1461_3c3s5c6cKc_Ks6h_Qc3h_QhQs_4d7s_Td9h() {
    assertEquals(
      "Td9h QhQs Ks6h 4d7s Qc3h",
      Solver.process("texas-holdem 3c3s5c6cKc Ks6h Qc3h QhQs 4d7s Td9h"));
  }

  @Test
  public void test_texas_holdem_1462_5s8hAhAsTc_2hTd_Ad5c_Ts8c_6dKc_4d6s_2d4s_Js2s() {
    assertEquals(
      "2d4s 4d6s Js2s 6dKc 2hTd=Ts8c Ad5c",
      Solver.process("texas-holdem 5s8hAhAsTc 2hTd Ad5c Ts8c 6dKc 4d6s 2d4s Js2s"));
  }

  @Test
  public void test_texas_holdem_1463_2d3c8cQcTc_4d7d_9cJd_3h2h_Ad7h_AsKh_5sTd_4s9d_9h6c() {
    assertEquals(
      "4d7d 4s9d Ad7h AsKh 5sTd 3h2h 9h6c 9cJd",
      Solver.process("texas-holdem 2d3c8cQcTc 4d7d 9cJd 3h2h Ad7h AsKh 5sTd 4s9d 9h6c"));
  }

  @Test
  public void test_texas_holdem_1464_5h6c8dKdQc_9s6h_Qd8h_2s4d_3sTc_5cKc_3cKs_Jc8s_Th9h() {
    assertEquals(
      "2s4d 3sTc Th9h 9s6h Jc8s 3cKs Qd8h 5cKc",
      Solver.process("texas-holdem 5h6c8dKdQc 9s6h Qd8h 2s4d 3sTc 5cKc 3cKs Jc8s Th9h"));
  }

  @Test
  public void test_texas_holdem_1465_4c6h9sKdQd_4sQh_6s5h_6d9h_TcJd_Jh7c_Js8c_Ks2c_QsKh() {
    assertEquals(
      "Jh7c Js8c 6s5h Ks2c 6d9h 4sQh QsKh TcJd",
      Solver.process("texas-holdem 4c6h9sKdQd 4sQh 6s5h 6d9h TcJd Jh7c Js8c Ks2c QsKh"));
  }

  @Test
  public void test_texas_holdem_1466_6h7dQcTcTd_3c4s_Ac2h_ThTs() {
    assertEquals(
      "3c4s Ac2h ThTs",
      Solver.process("texas-holdem 6h7dQcTcTd 3c4s Ac2h ThTs"));
  }

  @Test
  public void test_texas_holdem_1467_5d8dJsKhTc_2h3h_7h9s() {
    assertEquals(
      "2h3h 7h9s",
      Solver.process("texas-holdem 5d8dJsKhTc 2h3h 7h9s"));
  }

  @Test
  public void test_texas_holdem_1468_7d8h9h9sKd_ThQh_4hJh_3c3d_Jd6c_4dQc() {
    assertEquals(
      "4hJh=Jd6c 4dQc ThQh 3c3d",
      Solver.process("texas-holdem 7d8h9h9sKd ThQh 4hJh 3c3d Jd6c 4dQc"));
  }

  @Test
  public void test_texas_holdem_1469_5s6d8c8dJh_3d4s_QdTc_2hKs_6s6h_4c9h_9dAd() {
    assertEquals(
      "3d4s 4c9h QdTc 2hKs 9dAd 6s6h",
      Solver.process("texas-holdem 5s6d8c8dJh 3d4s QdTc 2hKs 6s6h 4c9h 9dAd"));
  }

  @Test
  public void test_texas_holdem_1470_4h6h7s9hQs_7h3d_JsQc_4c6s() {
    assertEquals(
      "7h3d JsQc 4c6s",
      Solver.process("texas-holdem 4h6h7s9hQs 7h3d JsQc 4c6s"));
  }

  @Test
  public void test_texas_holdem_1471_4s8s9dAsQs_7cQd_4d6s() {
    assertEquals(
      "7cQd 4d6s",
      Solver.process("texas-holdem 4s8s9dAsQs 7cQd 4d6s"));
  }

  @Test
  public void test_texas_holdem_1472_4d6h9hJdJh_3c3s_3h6s_7dQs_KhQh_KcTc_As4h() {
    assertEquals(
      "7dQs KcTc 3c3s As4h 3h6s KhQh",
      Solver.process("texas-holdem 4d6h9hJdJh 3c3s 3h6s 7dQs KhQh KcTc As4h"));
  }

  @Test
  public void test_texas_holdem_1473_2d3c7s9dJs_6sKc_JcQs_9h9c_Qh7h_7dKd_Qd5s_9sTh() {
    assertEquals(
      "Qd5s 6sKc Qh7h 7dKd 9sTh JcQs 9h9c",
      Solver.process("texas-holdem 2d3c7s9dJs 6sKc JcQs 9h9c Qh7h 7dKd Qd5s 9sTh"));
  }

  @Test
  public void test_texas_holdem_1474_2h3c3h5sKh_Ac9h_5c7d_Td2c() {
    assertEquals(
      "Ac9h Td2c 5c7d",
      Solver.process("texas-holdem 2h3c3h5sKh Ac9h 5c7d Td2c"));
  }

  @Test
  public void test_texas_holdem_1475_2h8sAdKdQd_4d9d_7cTh() {
    assertEquals(
      "7cTh 4d9d",
      Solver.process("texas-holdem 2h8sAdKdQd 4d9d 7cTh"));
  }

  @Test
  public void test_texas_holdem_1476_2d4d5c6cQh_Qs4h_6hKs_4s7c_KcJs_7h3d_7d7s() {
    assertEquals(
      "KcJs 4s7c 6hKs 7d7s Qs4h 7h3d",
      Solver.process("texas-holdem 2d4d5c6cQh Qs4h 6hKs 4s7c KcJs 7h3d 7d7s"));
  }

  @Test
  public void test_texas_holdem_1477_2c5s7cAsTc_Qc4h_2hKs() {
    assertEquals(
      "Qc4h 2hKs",
      Solver.process("texas-holdem 2c5s7cAsTc Qc4h 2hKs"));
  }

  @Test
  public void test_texas_holdem_1478_3c7cJdQsTd_2h2s_2cQh_8dTs_Js8s_Kc6s() {
    assertEquals(
      "Kc6s 2h2s 8dTs Js8s 2cQh",
      Solver.process("texas-holdem 3c7cJdQsTd 2h2s 2cQh 8dTs Js8s Kc6s"));
  }

  @Test
  public void test_texas_holdem_1479_6s8d9cAdAh_Ks8h_2dQs_Th7s_Qd4s_2c8s_3s9s() {
    assertEquals(
      "2dQs=Qd4s 2c8s Ks8h 3s9s Th7s",
      Solver.process("texas-holdem 6s8d9cAdAh Ks8h 2dQs Th7s Qd4s 2c8s 3s9s"));
  }

  @Test
  public void test_texas_holdem_1480_9d9sKsQcTc_6d6s_Kh3s_Th7c_Qh5s_Qs4d_JdTd_3hQd_Jh5d() {
    assertEquals(
      "6d6s Th7c 3hQd=Qh5s=Qs4d Kh3s JdTd=Jh5d",
      Solver.process("texas-holdem 9d9sKsQcTc 6d6s Kh3s Th7c Qh5s Qs4d JdTd 3hQd Jh5d"));
  }

  @Test
  public void test_texas_holdem_1481_3c3s4c6dAd_9dTh_8s5c_Ac6c_AhJh_JdKs_KcTs() {
    assertEquals(
      "8s5c 9dTh KcTs JdKs AhJh Ac6c",
      Solver.process("texas-holdem 3c3s4c6dAd 9dTh 8s5c Ac6c AhJh JdKs KcTs"));
  }

  @Test
  public void test_texas_holdem_1482_5s6dJcJsQd_8dTd_Ac9c_2dKs_8s5h_QhQs_2c4c_9s4h_Kd2s_3d7d() {
    assertEquals(
      "2c4c 3d7d 9s4h 8dTd 2dKs=Kd2s Ac9c 8s5h QhQs",
      Solver.process("texas-holdem 5s6dJcJsQd 8dTd Ac9c 2dKs 8s5h QhQs 2c4c 9s4h Kd2s 3d7d"));
  }

  @Test
  public void test_texas_holdem_1483_2c5s7dKcQs_4sAh_TcJc_3d5h_7h4h_8hAd() {
    assertEquals(
      "TcJc 4sAh 8hAd 3d5h 7h4h",
      Solver.process("texas-holdem 2c5s7dKcQs 4sAh TcJc 3d5h 7h4h 8hAd"));
  }

  @Test
  public void test_texas_holdem_1484_3h8h9hKdQd_6h9d_TcJh_9c2h_2dKc() {
    assertEquals(
      "6h9d=9c2h 2dKc TcJh",
      Solver.process("texas-holdem 3h8h9hKdQd 6h9d TcJh 9c2h 2dKc"));
  }

  @Test
  public void test_texas_holdem_1485_5c6d7c9hAs_6hQc_Js4c_9s5d() {
    assertEquals(
      "Js4c 6hQc 9s5d",
      Solver.process("texas-holdem 5c6d7c9hAs 6hQc Js4c 9s5d"));
  }

  @Test
  public void test_texas_holdem_1486_5c6c6d7dQh_5h3d_7c9s_Kh4s_Kc9c_9dAs_Qd5d_3c8c_Tc4d_4c5s() {
    assertEquals(
      "3c8c Tc4d Kh4s Kc9c 9dAs 4c5s=5h3d 7c9s Qd5d",
      Solver.process("texas-holdem 5c6c6d7dQh 5h3d 7c9s Kh4s Kc9c 9dAs Qd5d 3c8c Tc4d 4c5s"));
  }

  @Test
  public void test_texas_holdem_1487_3d4c4s8d8s_9dTs_Qh2c_7hJc_KsJh_Jd7d() {
    assertEquals(
      "9dTs 7hJc=Jd7d Qh2c KsJh",
      Solver.process("texas-holdem 3d4c4s8d8s 9dTs Qh2c 7hJc KsJh Jd7d"));
  }

  @Test
  public void test_texas_holdem_1488_6c7hKhQdTc_4c2d_KcQc_9s9c_JdTd_9d7d_5sAd_Kd7s_Ac7c() {
    assertEquals(
      "4c2d 5sAd 9d7d Ac7c 9s9c JdTd Kd7s KcQc",
      Solver.process("texas-holdem 6c7hKhQdTc 4c2d KcQc 9s9c JdTd 9d7d 5sAd Kd7s Ac7c"));
  }

  @Test
  public void test_texas_holdem_1489_6dKdKsQcQs_5sAc_2c9h_Td8d_8c4h_5dJh_4c4s_3h3c_ThJs() {
    assertEquals(
      "3h3c=4c4s 8c4h 2c9h Td8d 5dJh=ThJs 5sAc",
      Solver.process("texas-holdem 6dKdKsQcQs 5sAc 2c9h Td8d 8c4h 5dJh 4c4s 3h3c ThJs"));
  }

  @Test
  public void test_texas_holdem_1490_3c9hJhKdKs_3d3h_8d5s_9dKh_Kc6c_AdAs_6sJs_Th2s() {
    assertEquals(
      "8d5s Th2s 6sJs AdAs Kc6c 3d3h 9dKh",
      Solver.process("texas-holdem 3c9hJhKdKs 3d3h 8d5s 9dKh Kc6c AdAs 6sJs Th2s"));
  }

  @Test
  public void test_texas_holdem_1491_4d8dKcQhQs_Ah5h_TsQd_Kh7c() {
    assertEquals(
      "Ah5h Kh7c TsQd",
      Solver.process("texas-holdem 4d8dKcQhQs Ah5h TsQd Kh7c"));
  }

  @Test
  public void test_texas_holdem_1492_2c5s8hKhQc_8cKs_6sTd_Ts2h_6h5d_9c3s_4s7s_8sAc_Kc9s() {
    assertEquals(
      "4s7s 9c3s 6sTd Ts2h 6h5d 8sAc Kc9s 8cKs",
      Solver.process("texas-holdem 2c5s8hKhQc 8cKs 6sTd Ts2h 6h5d 9c3s 4s7s 8sAc Kc9s"));
  }

  @Test
  public void test_texas_holdem_1493_7dAdJcQcTh_3hAs_3sAc_4d4s_Kc8d_8h6h_5d8c_9cQd_6s2h_2sKd() {
    assertEquals(
      "6s2h 5d8c=8h6h 4d4s 9cQd 3hAs=3sAc 2sKd=Kc8d",
      Solver.process("texas-holdem 7dAdJcQcTh 3hAs 3sAc 4d4s Kc8d 8h6h 5d8c 9cQd 6s2h 2sKd"));
  }

  @Test
  public void test_texas_holdem_1494_6h8cAcAhTh_7s5d_TdAd_9h5c_4c9c_5hQd_Jd4d_2sTc_4hKh_8dTs() {
    assertEquals(
      "7s5d 4c9c=9h5c Jd4d 5hQd 2sTc=8dTs 4hKh TdAd",
      Solver.process("texas-holdem 6h8cAcAhTh 7s5d TdAd 9h5c 4c9c 5hQd Jd4d 2sTc 4hKh 8dTs"));
  }

  @Test
  public void test_texas_holdem_1495_3c5d6sKcTc_2c8c_KdTh_2sAh_Ad9s_9hQd_QhJd() {
    assertEquals(
      "9hQd QhJd 2sAh Ad9s KdTh 2c8c",
      Solver.process("texas-holdem 3c5d6sKcTc 2c8c KdTh 2sAh Ad9s 9hQd QhJd"));
  }

  @Test
  public void test_texas_holdem_1496_5cJcKcQsTc_3h4c_4s3d_Ts7c_8dJs_3sQc_Ac9s_Kh5s_7s7h() {
    assertEquals(
      "4s3d 7s7h 8dJs Kh5s 3h4c Ts7c 3sQc Ac9s",
      Solver.process("texas-holdem 5cJcKcQsTc 3h4c 4s3d Ts7c 8dJs 3sQc Ac9s Kh5s 7s7h"));
  }

  @Test
  public void test_texas_holdem_1497_2s4s5s6dKc_9h7h_7cAs_2h8s() {
    assertEquals(
      "9h7h 7cAs 2h8s",
      Solver.process("texas-holdem 2s4s5s6dKc 9h7h 7cAs 2h8s"));
  }

  @Test
  public void test_texas_holdem_1498_5c9c9hQcTd_Ac4d_8s5d() {
    assertEquals(
      "Ac4d 8s5d",
      Solver.process("texas-holdem 5c9c9hQcTd Ac4d 8s5d"));
  }

  @Test
  public void test_texas_holdem_1499_2c3h8cAsQd_6hQs_7cKh_5dQc_Td9d_4c8h() {
    assertEquals(
      "Td9d 7cKh 4c8h 5dQc 6hQs",
      Solver.process("texas-holdem 2c3h8cAsQd 6hQs 7cKh 5dQc Td9d 4c8h"));
  }

}
