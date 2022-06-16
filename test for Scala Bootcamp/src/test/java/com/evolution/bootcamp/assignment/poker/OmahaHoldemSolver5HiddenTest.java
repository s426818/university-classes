
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver5HiddenTest {


  @Test
  public void test_omaha_holdem_1250_4s5h7s8hJs_QhQsKh6s_3c2h2d6c() {
    assertEquals(
      "3c2h2d6c QhQsKh6s",
      Solver.process("omaha-holdem 4s5h7s8hJs QhQsKh6s 3c2h2d6c"));
  }

  @Test
  public void test_omaha_holdem_1251_3h4d4h7h8d_TsKs7dQc_QhQs5hJd_As7cTc8h() {
    assertEquals(
      "TsKs7dQc As7cTc8h QhQs5hJd",
      Solver.process("omaha-holdem 3h4d4h7h8d TsKs7dQc QhQs5hJd As7cTc8h"));
  }

  @Test
  public void test_omaha_holdem_1252_2d3c3d6hQh_KdJs8dAh_2cKc8hJh_TdQs7d5c_Ad9d8c9c_3s5h9sTc() {
    assertEquals(
      "KdJs8dAh 2cKc8hJh Ad9d8c9c TdQs7d5c 3s5h9sTc",
      Solver.process("omaha-holdem 2d3c3d6hQh KdJs8dAh 2cKc8hJh TdQs7d5c Ad9d8c9c 3s5h9sTc"));
  }

  @Test
  public void test_omaha_holdem_1253_2h3h4dJdJs_5h6sAd5s_5c9h9c9d_7s8s2s7h_7c3c9s3s_6c6h2d2c_4sKsQsKh_TdTsAhJc() {
    assertEquals(
      "7s8s2s7h 5c9h9c9d 4sKsQsKh TdTsAhJc 5h6sAd5s 6c6h2d2c 7c3c9s3s",
      Solver.process("omaha-holdem 2h3h4dJdJs 5h6sAd5s 5c9h9c9d 7s8s2s7h 7c3c9s3s 6c6h2d2c 4sKsQsKh TdTsAhJc"));
  }

  @Test
  public void test_omaha_holdem_1254_2cAcAhQhTd_9dQsTs3h_7sAd5h4h_JhQd6s8h_4c5s6c2d_3sTh2hJs_9hTc5d9c_9s4s5cKs_JcQc4dJd() {
    assertEquals(
      "9s4s5cKs 4c5s6c2d 9hTc5d9c 3sTh2hJs 9dQsTs3h JcQc4dJd=JhQd6s8h 7sAd5h4h",
      Solver.process("omaha-holdem 2cAcAhQhTd 9dQsTs3h 7sAd5h4h JhQd6s8h 4c5s6c2d 3sTh2hJs 9hTc5d9c 9s4s5cKs JcQc4dJd"));
  }

  @Test
  public void test_omaha_holdem_1255_2s4s6s8hAh_9sKs8d3s_JdTsKd6h_5h9d2c4c_2d6c3d7s_Ad9h7h4d_Js4h5c6d_5s8c3h3c_TdQs5d8s_9cThAs2h() {
    assertEquals(
      "JdTsKd6h 5h9d2c4c 2d6c3d7s Js4h5c6d 9cThAs2h Ad9h7h4d 5s8c3h3c TdQs5d8s 9sKs8d3s",
      Solver.process("omaha-holdem 2s4s6s8hAh 9sKs8d3s JdTsKd6h 5h9d2c4c 2d6c3d7s Ad9h7h4d Js4h5c6d 5s8c3h3c TdQs5d8s 9cThAs2h"));
  }

  @Test
  public void test_omaha_holdem_1256_7sAsKcTcTh_6sTd9s2c_7cAhKs8c_AcQh5sJc_4sJh5dKd_3h9d5h8h_8s8dJd2h() {
    assertEquals(
      "3h9d5h8h 8s8dJd2h 4sJh5dKd 7cAhKs8c 6sTd9s2c AcQh5sJc",
      Solver.process("omaha-holdem 7sAsKcTcTh 6sTd9s2c 7cAhKs8c AcQh5sJc 4sJh5dKd 3h9d5h8h 8s8dJd2h"));
  }

  @Test
  public void test_omaha_holdem_1257_4s5cJhKhQc_KdAd2c9s_Ac4c5hTd_Th7sAh3h_7cTsJcAs_8h3c4h6h() {
    assertEquals(
      "8h3c4h6h KdAd2c9s 7cTsJcAs=Ac4c5hTd=Th7sAh3h",
      Solver.process("omaha-holdem 4s5cJhKhQc KdAd2c9s Ac4c5hTd Th7sAh3h 7cTsJcAs 8h3c4h6h"));
  }

  @Test
  public void test_omaha_holdem_1258_3c4d4sAhAs_2d5d8d6h_8c9hTh7h_3sJcKsQc_QhQsAc7c_3dQd9sJs_Td5h7d9d() {
    assertEquals(
      "8c9hTh7h=Td5h7d9d 3dQd9sJs 3sJcKsQc QhQsAc7c 2d5d8d6h",
      Solver.process("omaha-holdem 3c4d4sAhAs 2d5d8d6h 8c9hTh7h 3sJcKsQc QhQsAc7c 3dQd9sJs Td5h7d9d"));
  }

  @Test
  public void test_omaha_holdem_1259_2h4sAhAsJd_8d6s3c6d_5hQh2s9s_Ac5s7c7d_Qs2cTh8s_KcTsAd3s_4c2d3hTc() {
    assertEquals(
      "5hQh2s9s=Qs2cTh8s 4c2d3hTc 8d6s3c6d Ac5s7c7d KcTsAd3s",
      Solver.process("omaha-holdem 2h4sAhAsJd 8d6s3c6d 5hQh2s9s Ac5s7c7d Qs2cTh8s KcTsAd3s 4c2d3hTc"));
  }

  @Test
  public void test_omaha_holdem_1260_2c6dKhQcQs_As3h5c4d_2s5h8c7h_9cKs5dAc_8s3sKcQh_Jh8d8hTd_9dKdJc7d_ThJd2d9s() {
    assertEquals(
      "As3h5c4d 2s5h8c7h ThJd2d9s Jh8d8hTd 9dKdJc7d 9cKs5dAc 8s3sKcQh",
      Solver.process("omaha-holdem 2c6dKhQcQs As3h5c4d 2s5h8c7h 9cKs5dAc 8s3sKcQh Jh8d8hTd 9dKdJc7d ThJd2d9s"));
  }

  @Test
  public void test_omaha_holdem_1261_2s3h4h7sKs_6c5sTh9h_4cKc7d6d_7h2d4dAs_3dAh6hQh_Kh8dQc9s_2c8hJhJs_5c8cQs8s_4s5hAdJd() {
    assertEquals(
      "3dAh6hQh 2c8hJhJs Kh8dQc9s 7h2d4dAs 4cKc7d6d 4s5hAdJd 6c5sTh9h 5c8cQs8s",
      Solver.process("omaha-holdem 2s3h4h7sKs 6c5sTh9h 4cKc7d6d 7h2d4dAs 3dAh6hQh Kh8dQc9s 2c8hJhJs 5c8cQs8s 4s5hAdJd"));
  }

  @Test
  public void test_omaha_holdem_1262_4d6d9sKdQc_3hTsQsKh_3s7s4s2h_8d3cAh2s_JcTd5d4h_Jd9d8hJh() {
    assertEquals(
      "8d3cAh2s 3s7s4s2h 3hTsQsKh JcTd5d4h Jd9d8hJh",
      Solver.process("omaha-holdem 4d6d9sKdQc 3hTsQsKh 3s7s4s2h 8d3cAh2s JcTd5d4h Jd9d8hJh"));
  }

  @Test
  public void test_omaha_holdem_1263_3d4h6dJhQd_Js6hAs6s_2c7s7cQh_TcJd6cKc_Qc5c2s2d_5d8dJcAh_4sAc8cKs() {
    assertEquals(
      "4sAc8cKs 2c7s7cQh TcJd6cKc Js6hAs6s Qc5c2s2d 5d8dJcAh",
      Solver.process("omaha-holdem 3d4h6dJhQd Js6hAs6s 2c7s7cQh TcJd6cKc Qc5c2s2d 5d8dJcAh 4sAc8cKs"));
  }

  @Test
  public void test_omaha_holdem_1264_2s7c7dKcTd_QdThAsJc_5cAc3h2d_3d2h3c5s_5hKh7s9s_9cKsQsJs_3s8h8sAd_6h6sJd4h() {
    assertEquals(
      "5cAc3h2d 3d2h3c5s 6h6sJd4h 3s8h8sAd QdThAsJc 9cKsQsJs 5hKh7s9s",
      Solver.process("omaha-holdem 2s7c7dKcTd QdThAsJc 5cAc3h2d 3d2h3c5s 5hKh7s9s 9cKsQsJs 3s8h8sAd 6h6sJd4h"));
  }

  @Test
  public void test_omaha_holdem_1265_8s9hAhAsTd_TsJc6cQh_5s2cJhQs_KdAdTc3h_3sKh8d7h_Ac5cJd6s_4c2s7c7s_3dQc9d4d_9c6h2d4s_8cKs6dTh() {
    assertEquals(
      "4c2s7c7s 3sKh8d7h 9c6h2d4s 3dQc9d4d 8cKs6dTh Ac5cJd6s 5s2cJhQs=TsJc6cQh KdAdTc3h",
      Solver.process("omaha-holdem 8s9hAhAsTd TsJc6cQh 5s2cJhQs KdAdTc3h 3sKh8d7h Ac5cJd6s 4c2s7c7s 3dQc9d4d 9c6h2d4s 8cKs6dTh"));
  }

  @Test
  public void test_omaha_holdem_1266_4s6d6s9cQh_4h4cKh9s_2cQcAd8d_As7h5dKs_8cJsTdTh() {
    assertEquals(
      "As7h5dKs 8cJsTdTh 2cQcAd8d 4h4cKh9s",
      Solver.process("omaha-holdem 4s6d6s9cQh 4h4cKh9s 2cQcAd8d As7h5dKs 8cJsTdTh"));
  }

  @Test
  public void test_omaha_holdem_1267_3h8c9sJsTc_4cKc2s7d_Qd3c8dTs_Qs5d9hAd_6dKs6hQh_KhTd8h7c_Qc4sJd3s_8s2c7s4h_2h7hAc5s() {
    assertEquals(
      "4cKc2s7d 2h7hAc5s 8s2c7s4h=KhTd8h7c Qc4sJd3s=Qd3c8dTs=Qs5d9hAd 6dKs6hQh",
      Solver.process("omaha-holdem 3h8c9sJsTc 4cKc2s7d Qd3c8dTs Qs5d9hAd 6dKs6hQh KhTd8h7c Qc4sJd3s 8s2c7s4h 2h7hAc5s"));
  }

  @Test
  public void test_omaha_holdem_1268_3c5s6s9dJd_8s7d4cQh_AhTdKc9c_5c9h2c4d_JcAc3s2s_8h6d3d5h_Ks6cQd9s_7c7hQs2h() {
    assertEquals(
      "7c7hQs2h AhTdKc9c 8h6d3d5h Ks6cQd9s JcAc3s2s 5c9h2c4d 8s7d4cQh",
      Solver.process("omaha-holdem 3c5s6s9dJd 8s7d4cQh AhTdKc9c 5c9h2c4d JcAc3s2s 8h6d3d5h Ks6cQd9s 7c7hQs2h"));
  }

  @Test
  public void test_omaha_holdem_1269_3c5cKcQhTh_4h8hKs9c_5dKd5h4d_TsAs8c6c_Jh4s7h4c() {
    assertEquals(
      "Jh4s7h4c 4h8hKs9c 5dKd5h4d TsAs8c6c",
      Solver.process("omaha-holdem 3c5cKcQhTh 4h8hKs9c 5dKd5h4d TsAs8c6c Jh4s7h4c"));
  }

  @Test
  public void test_omaha_holdem_1270_3sJcQcTcTs_AhAcAs5c_3d8cQhTd_Ad9d9s8s() {
    assertEquals(
      "Ad9d9s8s AhAcAs5c 3d8cQhTd",
      Solver.process("omaha-holdem 3sJcQcTcTs AhAcAs5c 3d8cQhTd Ad9d9s8s"));
  }

  @Test
  public void test_omaha_holdem_1271_2c3c4h5hTd_QhAd5d2d_3dAc6d4d_9sQdTsTh_5cKd3hJh_4sQc7h8c_6c6h9d3s_7s5s9cJs() {
    assertEquals(
      "4sQc7h8c 7s5s9cJs 5cKd3hJh 9sQdTsTh QhAd5d2d 3dAc6d4d=6c6h9d3s",
      Solver.process("omaha-holdem 2c3c4h5hTd QhAd5d2d 3dAc6d4d 9sQdTsTh 5cKd3hJh 4sQc7h8c 6c6h9d3s 7s5s9cJs"));
  }

  @Test
  public void test_omaha_holdem_1272_5cKcKsQdTc_QsTd7hAd_5hKdQh7s_6dAh3hTh_9c8c5s3s() {
    assertEquals(
      "6dAh3hTh QsTd7hAd 9c8c5s3s 5hKdQh7s",
      Solver.process("omaha-holdem 5cKcKsQdTc QsTd7hAd 5hKdQh7s 6dAh3hTh 9c8c5s3s"));
  }

  @Test
  public void test_omaha_holdem_1273_3h6d9sJdQd_5c2c9dTs_KdAs4cJs() {
    assertEquals(
      "5c2c9dTs KdAs4cJs",
      Solver.process("omaha-holdem 3h6d9sJdQd 5c2c9dTs KdAs4cJs"));
  }

  @Test
  public void test_omaha_holdem_1274_2s4s8s9cKc_5d4hQc6d_5h2d7c4c_2c3dJh8c_7hKhKd6h() {
    assertEquals(
      "5d4hQc6d 5h2d7c4c 2c3dJh8c 7hKhKd6h",
      Solver.process("omaha-holdem 2s4s8s9cKc 5d4hQc6d 5h2d7c4c 2c3dJh8c 7hKhKd6h"));
  }

  @Test
  public void test_omaha_holdem_1275_5dAdJhJsTd_Qh8dQc7h_Ac2s5h4c_9s3d4h4d_KhTh2cQd_8sAs6d6s_9c8hAh6h() {
    assertEquals(
      "Qh8dQc7h Ac2s5h4c 8sAs6d6s 9c8hAh6h KhTh2cQd 9s3d4h4d",
      Solver.process("omaha-holdem 5dAdJhJsTd Qh8dQc7h Ac2s5h4c 9s3d4h4d KhTh2cQd 8sAs6d6s 9c8hAh6h"));
  }

  @Test
  public void test_omaha_holdem_1276_2h3d3sAhTh_Jc3hQcKd_Ks8h5d9s() {
    assertEquals(
      "Ks8h5d9s Jc3hQcKd",
      Solver.process("omaha-holdem 2h3d3sAhTh Jc3hQcKd Ks8h5d9s"));
  }

  @Test
  public void test_omaha_holdem_1277_5d5h6hJsQs_8h8s5s3c_8cQhAsJc_7s9dAc9h_8d4h9c7h_6dJh3dQd_9s2cKh4d_TsKcJdAh_Qc7dTc7c_4s5c6sTd() {
    assertEquals(
      "8d4h9c7h 9s2cKh4d 7s9dAc9h TsKcJdAh Qc7dTc7c 6dJh3dQd=8cQhAsJc 8h8s5s3c 4s5c6sTd",
      Solver.process("omaha-holdem 5d5h6hJsQs 8h8s5s3c 8cQhAsJc 7s9dAc9h 8d4h9c7h 6dJh3dQd 9s2cKh4d TsKcJdAh Qc7dTc7c 4s5c6sTd"));
  }

  @Test
  public void test_omaha_holdem_1278_2dAcJsThTs_8dQd9cQh_KcTdKh4d_Ad7d2s6d_QcKd3s8c_2cKs5s5h_Qs7h4s5c() {
    assertEquals(
      "Qs7h4s5c 2cKs5s5h 8dQd9cQh Ad7d2s6d KcTdKh4d QcKd3s8c",
      Solver.process("omaha-holdem 2dAcJsThTs 8dQd9cQh KcTdKh4d Ad7d2s6d QcKd3s8c 2cKs5s5h Qs7h4s5c"));
  }

  @Test
  public void test_omaha_holdem_1279_6d8d8sQhQs_Jc7d2cTs_3s7c4h5h_KdTcAs2s_6hQd4sTh() {
    assertEquals(
      "3s7c4h5h Jc7d2cTs KdTcAs2s 6hQd4sTh",
      Solver.process("omaha-holdem 6d8d8sQhQs Jc7d2cTs 3s7c4h5h KdTcAs2s 6hQd4sTh"));
  }

  @Test
  public void test_omaha_holdem_1280_3c9h9sKhKs_6cTsAd8c_5h7h5d8h_Qc7sJcAh() {
    assertEquals(
      "6cTsAd8c Qc7sJcAh 5h7h5d8h",
      Solver.process("omaha-holdem 3c9h9sKhKs 6cTsAd8c 5h7h5d8h Qc7sJcAh"));
  }

  @Test
  public void test_omaha_holdem_1281_3d6c9cAcTd_5hKhTc2h_8hQsJh8d_4sJd8c6h() {
    assertEquals(
      "4sJd8c6h 8hQsJh8d 5hKhTc2h",
      Solver.process("omaha-holdem 3d6c9cAcTd 5hKhTc2h 8hQsJh8d 4sJd8c6h"));
  }

  @Test
  public void test_omaha_holdem_1282_5h7c7h8sAs_Qc9s5sKh_Th5d6dJs_Ah3dJh6h_8h2cTd2h_8c4d6cKc() {
    assertEquals(
      "Th5d6dJs Qc9s5sKh 8h2cTd2h Ah3dJh6h 8c4d6cKc",
      Solver.process("omaha-holdem 5h7c7h8sAs Qc9s5sKh Th5d6dJs Ah3dJh6h 8h2cTd2h 8c4d6cKc"));
  }

  @Test
  public void test_omaha_holdem_1283_3h6cAcQdTd_7d8h7s4d_Ks8s9cJc_Kc2cAd6h_3sAh4sKd_9s4c4hTs_5d6dTcJh_9h8cJs5c_ThJd5s3c_Qs8dQhQc() {
    assertEquals(
      "9h8cJs5c 7d8h7s4d 9s4c4hTs ThJd5s3c 5d6dTcJh 3sAh4sKd Kc2cAd6h Qs8dQhQc Ks8s9cJc",
      Solver.process("omaha-holdem 3h6cAcQdTd 7d8h7s4d Ks8s9cJc Kc2cAd6h 3sAh4sKd 9s4c4hTs 5d6dTcJh 9h8cJs5c ThJd5s3c Qs8dQhQc"));
  }

  @Test
  public void test_omaha_holdem_1284_2d9sAhAsTc_Js5s4s6h_2hJc9d8c_4d5h2sQc_Kh8h8sKc_Jd7cQsKd_9cQhTh3c_2cKs4c7s_3dTd4h7h_3hAd5c6c() {
    assertEquals(
      "Js5s4s6h Jd7cQsKd 4d5h2sQc 2cKs4c7s 2hJc9d8c 3dTd4h7h 9cQhTh3c Kh8h8sKc 3hAd5c6c",
      Solver.process("omaha-holdem 2d9sAhAsTc Js5s4s6h 2hJc9d8c 4d5h2sQc Kh8h8sKc Jd7cQsKd 9cQhTh3c 2cKs4c7s 3dTd4h7h 3hAd5c6c"));
  }

  @Test
  public void test_omaha_holdem_1285_3d6c8h9hKd_Td3s6h9c_9d3cJdAs_7h4h9s2s_Ts8d7dAd_QdTc4d5d_Th5s6dJh_6sQcKs2c() {
    assertEquals(
      "QdTc4d5d Th5s6dJh 7h4h9s2s 9d3cJdAs Td3s6h9c 6sQcKs2c Ts8d7dAd",
      Solver.process("omaha-holdem 3d6c8h9hKd Td3s6h9c 9d3cJdAs 7h4h9s2s Ts8d7dAd QdTc4d5d Th5s6dJh 6sQcKs2c"));
  }

  @Test
  public void test_omaha_holdem_1286_3d3h6hAcQd_Kh4hJd9c_Jh8d9sQs_6dTs3s5h_4c9dTh6s_2cAhKdKs_As5dAd8s_4sQh7h8h() {
    assertEquals(
      "Kh4hJd9c 4c9dTh6s 4sQh7h8h Jh8d9sQs 2cAhKdKs 6dTs3s5h As5dAd8s",
      Solver.process("omaha-holdem 3d3h6hAcQd Kh4hJd9c Jh8d9sQs 6dTs3s5h 4c9dTh6s 2cAhKdKs As5dAd8s 4sQh7h8h"));
  }

  @Test
  public void test_omaha_holdem_1287_3s5d5s8cKd_7c8d4c3h_5hTd4hJd_Js7s2c9c_5c6s9d2d_Jh8h2hAs_JcQdTcTh_9s3c7h2s_KhQsAh3d() {
    assertEquals(
      "Js7s2c9c 9s3c7h2s 7c8d4c3h Jh8h2hAs JcQdTcTh KhQsAh3d 5c6s9d2d 5hTd4hJd",
      Solver.process("omaha-holdem 3s5d5s8cKd 7c8d4c3h 5hTd4hJd Js7s2c9c 5c6s9d2d Jh8h2hAs JcQdTcTh 9s3c7h2s KhQsAh3d"));
  }

  @Test
  public void test_omaha_holdem_1288_4c4s5s6sAh_3h8hKc2h_6h9h3cKh() {
    assertEquals(
      "6h9h3cKh 3h8hKc2h",
      Solver.process("omaha-holdem 4c4s5s6sAh 3h8hKc2h 6h9h3cKh"));
  }

  @Test
  public void test_omaha_holdem_1289_4c7d9sKdKh_KsJs6sAh_9hAdJhJc_Ts8c2cQs() {
    assertEquals(
      "Ts8c2cQs 9hAdJhJc KsJs6sAh",
      Solver.process("omaha-holdem 4c7d9sKdKh KsJs6sAh 9hAdJhJc Ts8c2cQs"));
  }

  @Test
  public void test_omaha_holdem_1290_3d3s4s6h7s_3c9sKs7h_TsKhQcTd_9d2d9h5h_2c7dAhQd_Th8sQs4c_Jd4h8dQh_2h5s5d2s_6cAsAd9c() {
    assertEquals(
      "Jd4h8dQh 2c7dAhQd TsKhQcTd 6cAsAd9c 9d2d9h5h 2h5s5d2s Th8sQs4c 3c9sKs7h",
      Solver.process("omaha-holdem 3d3s4s6h7s 3c9sKs7h TsKhQcTd 9d2d9h5h 2c7dAhQd Th8sQs4c Jd4h8dQh 2h5s5d2s 6cAsAd9c"));
  }

  @Test
  public void test_omaha_holdem_1291_6c6h7s9sQh_AhJh8d8h_7dQc5h9h_7cTdAd6d_Kc6s4cQd_2c4s4d3c() {
    assertEquals(
      "2c4s4d3c AhJh8d8h 7dQc5h9h 7cTdAd6d Kc6s4cQd",
      Solver.process("omaha-holdem 6c6h7s9sQh AhJh8d8h 7dQc5h9h 7cTdAd6d Kc6s4cQd 2c4s4d3c"));
  }

  @Test
  public void test_omaha_holdem_1292_2d8h9c9hQd_4sTsKd6c_KsAc3h7s_3s5cQcQs_KhJd9dKc_Jc8sTh8d_Td6s6d7d_5h7c4d2h_Ad4c7h3c_2cQhTc4h() {
    assertEquals(
      "4sTsKd6c Ad4c7h3c KsAc3h7s 5h7c4d2h Td6s6d7d 2cQhTc4h KhJd9dKc Jc8sTh8d 3s5cQcQs",
      Solver.process("omaha-holdem 2d8h9c9hQd 4sTsKd6c KsAc3h7s 3s5cQcQs KhJd9dKc Jc8sTh8d Td6s6d7d 5h7c4d2h Ad4c7h3c 2cQhTc4h"));
  }

  @Test
  public void test_omaha_holdem_1293_5c7dAdKdTs_4d2h9c3s_2c7c7hKc_3h6cQcAc_Kh7s9dKs_Jc6s2dAs() {
    assertEquals(
      "4d2h9c3s Jc6s2dAs 3h6cQcAc 2c7c7hKc Kh7s9dKs",
      Solver.process("omaha-holdem 5c7dAdKdTs 4d2h9c3s 2c7c7hKc 3h6cQcAc Kh7s9dKs Jc6s2dAs"));
  }

  @Test
  public void test_omaha_holdem_1294_2d5cJsQsTd_2c8h9h7h_KdAc9s6d_8c2h3hKs() {
    assertEquals(
      "8c2h3hKs 2c8h9h7h KdAc9s6d",
      Solver.process("omaha-holdem 2d5cJsQsTd 2c8h9h7h KdAc9s6d 8c2h3hKs"));
  }

  @Test
  public void test_omaha_holdem_1295_7dJcJsKhKs_Ac3hTh9s_QcTd6hAs_4h8sAdTc_4s5c7c5h_Ah8c2s9c_6s3s6d9d_2h2cJdTs_5d4c9h4d() {
    assertEquals(
      "Ah8c2s9c 4h8sAdTc=Ac3hTh9s QcTd6hAs 5d4c9h4d 6s3s6d9d 4s5c7c5h 2h2cJdTs",
      Solver.process("omaha-holdem 7dJcJsKhKs Ac3hTh9s QcTd6hAs 4h8sAdTc 4s5c7c5h Ah8c2s9c 6s3s6d9d 2h2cJdTs 5d4c9h4d"));
  }

  @Test
  public void test_omaha_holdem_1296_3s6h7dQsTc_Kh4s6s7c_JdTs9hJs_QhJc6c9s_4d2d3c5d_2c8s6d2s_3dKdKs8h_2h8d8cAc() {
    assertEquals(
      "2c8s6d2s 2h8d8cAc JdTs9hJs 3dKdKs8h Kh4s6s7c QhJc6c9s 4d2d3c5d",
      Solver.process("omaha-holdem 3s6h7dQsTc Kh4s6s7c JdTs9hJs QhJc6c9s 4d2d3c5d 2c8s6d2s 3dKdKs8h 2h8d8cAc"));
  }

  @Test
  public void test_omaha_holdem_1297_4dAdKhKsTs_9dTc7d8d_2s6dKc3d_5d5hJdTh_Kd3hTd8c_6s4c4s9c_7h3sQh3c_2dJc7sJs_AhQc6c7c_2h4hQs8s() {
    assertEquals(
      "7h3sQh3c 2h4hQs8s 9dTc7d8d 5d5hJdTh 2dJc7sJs AhQc6c7c 2s6dKc3d 6s4c4s9c Kd3hTd8c",
      Solver.process("omaha-holdem 4dAdKhKsTs 9dTc7d8d 2s6dKc3d 5d5hJdTh Kd3hTd8c 6s4c4s9c 7h3sQh3c 2dJc7sJs AhQc6c7c 2h4hQs8s"));
  }

  @Test
  public void test_omaha_holdem_1298_3d4sJsKhTs_6c7hQs6s_5h9c9dQc_4hQdJdKs() {
    assertEquals(
      "4hQdJdKs 5h9c9dQc 6c7hQs6s",
      Solver.process("omaha-holdem 3d4sJsKhTs 6c7hQs6s 5h9c9dQc 4hQdJdKs"));
  }

  @Test
  public void test_omaha_holdem_1299_4s6c9cAcAh_Tc8sAs8d_4hTdQs3h_Ts2h9s5c_2s3dKsAd_KcJh6s9h_6hQh5s4d_2d2c8c4c_5h3sJs5d_KdQcJc6d() {
    assertEquals(
      "4hTdQs3h 5h3sJs5d 6hQh5s4d Ts2h9s5c KcJh6s9h Tc8sAs8d 2s3dKsAd 2d2c8c4c KdQcJc6d",
      Solver.process("omaha-holdem 4s6c9cAcAh Tc8sAs8d 4hTdQs3h Ts2h9s5c 2s3dKsAd KcJh6s9h 6hQh5s4d 2d2c8c4c 5h3sJs5d KdQcJc6d"));
  }

  @Test
  public void test_omaha_holdem_1300_6s8sJhKdTc_9s6c5cKc_Qs4sQc2h_Jd9dQd7h() {
    assertEquals(
      "Qs4sQc2h 9s6c5cKc Jd9dQd7h",
      Solver.process("omaha-holdem 6s8sJhKdTc 9s6c5cKc Qs4sQc2h Jd9dQd7h"));
  }

  @Test
  public void test_omaha_holdem_1301_3h3s9hJdKc_2c2s8s6s_4s7dAh8c_9sJc2h9c_AsQcAdTh_7c8d5h4d_QsQhTc3c_5s6d3dJs_AcKd7s4h() {
    assertEquals(
      "7c8d5h4d 4s7dAh8c 2c2s8s6s AcKd7s4h AsQcAdTh=QsQhTc3c 5s6d3dJs 9sJc2h9c",
      Solver.process("omaha-holdem 3h3s9hJdKc 2c2s8s6s 4s7dAh8c 9sJc2h9c AsQcAdTh 7c8d5h4d QsQhTc3c 5s6d3dJs AcKd7s4h"));
  }

  @Test
  public void test_omaha_holdem_1302_JcJhKcQhTh_4c5s8cJd_7cQd8h9h_4s6h5h3s_Ac6c3dAs_6sQs3h5c_2sTsKh4h_Tc7h7d6d() {
    assertEquals(
      "Tc7h7d6d 6sQs3h5c Ac6c3dAs 4c5s8cJd 4s6h5h3s 2sTsKh4h 7cQd8h9h",
      Solver.process("omaha-holdem JcJhKcQhTh 4c5s8cJd 7cQd8h9h 4s6h5h3s Ac6c3dAs 6sQs3h5c 2sTsKh4h Tc7h7d6d"));
  }

  @Test
  public void test_omaha_holdem_1303_3s6c6hAsQs_Jh9cQdTh_8cKhJs5s_Ks2hAd4c_8h4h8d7d_Tc5h7c3h_JcQc8s9h_7h2sJd9d_Td5d4sAh() {
    assertEquals(
      "7h2sJd9d Tc5h7c3h 8h4h8d7d JcQc8s9h=Jh9cQdTh Td5d4sAh Ks2hAd4c 8cKhJs5s",
      Solver.process("omaha-holdem 3s6c6hAsQs Jh9cQdTh 8cKhJs5s Ks2hAd4c 8h4h8d7d Tc5h7c3h JcQc8s9h 7h2sJd9d Td5d4sAh"));
  }

  @Test
  public void test_omaha_holdem_1304_2c3h5c8s9c_JhAc3d3s_Ks7c2dTs_QhTcJdJs_6s4h2s7s_5h8hQs4d_9h7h6dAs() {
    assertEquals(
      "Ks7c2dTs QhTcJdJs 5h8hQs4d JhAc3d3s 6s4h2s7s=9h7h6dAs",
      Solver.process("omaha-holdem 2c3h5c8s9c JhAc3d3s Ks7c2dTs QhTcJdJs 6s4h2s7s 5h8hQs4d 9h7h6dAs"));
  }

  @Test
  public void test_omaha_holdem_1305_4c6c6s7sKd_2h7cAd7h_5hThJhJc_Kc3cQc4h_3s5s6dQs_Kh4sQh2s_2c4dTs9c() {
    assertEquals(
      "2c4dTs9c 5hThJhJc Kc3cQc4h=Kh4sQh2s 3s5s6dQs 2h7cAd7h",
      Solver.process("omaha-holdem 4c6c6s7sKd 2h7cAd7h 5hThJhJc Kc3cQc4h 3s5s6dQs Kh4sQh2s 2c4dTs9c"));
  }

  @Test
  public void test_omaha_holdem_1306_3d4s7dJsTc_Ah3cKc5c_Qc9sKd8h_6dAs4cJc_Th7cQd4d_9d5s6sKs_Qs2c2hJh_6hAc3s8c() {
    assertEquals(
      "6hAc3s8c=Ah3cKc5c Qs2c2hJh Th7cQd4d 6dAs4cJc 9d5s6sKs Qc9sKd8h",
      Solver.process("omaha-holdem 3d4s7dJsTc Ah3cKc5c Qc9sKd8h 6dAs4cJc Th7cQd4d 9d5s6sKs Qs2c2hJh 6hAc3s8c"));
  }

  @Test
  public void test_omaha_holdem_1307_2d9sAhJcKd_8hTh4d5d_6d4h3d4s_9d3h5cQs_Qh8d8cAs_2s7cKh2c() {
    assertEquals(
      "8hTh4d5d 6d4h3d4s 9d3h5cQs Qh8d8cAs 2s7cKh2c",
      Solver.process("omaha-holdem 2d9sAhJcKd 8hTh4d5d 6d4h3d4s 9d3h5cQs Qh8d8cAs 2s7cKh2c"));
  }

  @Test
  public void test_omaha_holdem_1308_2d9hAdTcTh_8d7c8c5s_3s6cJh5c_8h4c7hAh_5dQc2hKd_3h4h4s5h_4d6sJd3d_Jc6hKhAs_Td7s2c8s() {
    assertEquals(
      "3s6cJh5c=4d6sJd3d 5dQc2hKd 3h4h4s5h 8d7c8c5s 8h4c7hAh Jc6hKhAs Td7s2c8s",
      Solver.process("omaha-holdem 2d9hAdTcTh 8d7c8c5s 3s6cJh5c 8h4c7hAh 5dQc2hKd 3h4h4s5h 4d6sJd3d Jc6hKhAs Td7s2c8s"));
  }

  @Test
  public void test_omaha_holdem_1309_4d7dJdKcTc_3dAcJhTs_Qd3h4cKs_8c7cKhKd_9s8h5s2d_TdJc6d6s_2cJs5hAd_7sAh2sAs_9c6h3c4s_5dQs3s4h() {
    assertEquals(
      "9c6h3c4s 5dQs3s4h 2cJs5hAd 7sAh2sAs 3dAcJhTs Qd3h4cKs 8c7cKhKd 9s8h5s2d TdJc6d6s",
      Solver.process("omaha-holdem 4d7dJdKcTc 3dAcJhTs Qd3h4cKs 8c7cKhKd 9s8h5s2d TdJc6d6s 2cJs5hAd 7sAh2sAs 9c6h3c4s 5dQs3s4h"));
  }

  @Test
  public void test_omaha_holdem_1310_3d8dAcKsTh_Kd8sQdJs_KcAs7s6s_5d8hAd7c_Qc4c6h3s_2h2s9s9d_7h5h6dTs_7dTc2cQs_Ah4hQh4s() {
    assertEquals(
      "Qc4c6h3s 2h2s9s9d 7h5h6dTs 7dTc2cQs Ah4hQh4s 5d8hAd7c KcAs7s6s Kd8sQdJs",
      Solver.process("omaha-holdem 3d8dAcKsTh Kd8sQdJs KcAs7s6s 5d8hAd7c Qc4c6h3s 2h2s9s9d 7h5h6dTs 7dTc2cQs Ah4hQh4s"));
  }

  @Test
  public void test_omaha_holdem_1311_4c5c6h6sQd_As3cQs7c_Qh9d7hJc() {
    assertEquals(
      "Qh9d7hJc As3cQs7c",
      Solver.process("omaha-holdem 4c5c6h6sQd As3cQs7c Qh9d7hJc"));
  }

  @Test
  public void test_omaha_holdem_1312_4cAsJhJsQc_7hJc7d3c_8h8s7s3s_4s6d2c8d_Qs3d6h8c_QhTh2h5h() {
    assertEquals(
      "4s6d2c8d 8h8s7s3s Qs3d6h8c QhTh2h5h 7hJc7d3c",
      Solver.process("omaha-holdem 4cAsJhJsQc 7hJc7d3c 8h8s7s3s 4s6d2c8d Qs3d6h8c QhTh2h5h"));
  }

  @Test
  public void test_omaha_holdem_1313_2h3s4c4sAc_9s5h8s7d_7s5dTc9h_JcTh5c7h_8h4hAhQs() {
    assertEquals(
      "9s5h8s7d 7s5dTc9h JcTh5c7h 8h4hAhQs",
      Solver.process("omaha-holdem 2h3s4c4sAc 9s5h8s7d 7s5dTc9h JcTh5c7h 8h4hAhQs"));
  }

  @Test
  public void test_omaha_holdem_1314_2h4c7c8hTc_7hJhTd6s_QhAh5hQs() {
    assertEquals(
      "QhAh5hQs 7hJhTd6s",
      Solver.process("omaha-holdem 2h4c7c8hTc 7hJhTd6s QhAh5hQs"));
  }

  @Test
  public void test_omaha_holdem_1315_2s5c6hAsQc_9d6sAc7h_Ts7c3d6d_7dTh3hJd_QdAhJh2c_8c4s8d8s_Ks9c4h2h() {
    assertEquals(
      "7dTh3hJd Ks9c4h2h Ts7c3d6d 8c4s8d8s 9d6sAc7h QdAhJh2c",
      Solver.process("omaha-holdem 2s5c6hAsQc 9d6sAc7h Ts7c3d6d 7dTh3hJd QdAhJh2c 8c4s8d8s Ks9c4h2h"));
  }

  @Test
  public void test_omaha_holdem_1316_3c6s7d8c9d_6c5cKdQs_8h9cTh4h_2c3sJd4s_4dJsTdQd_As7c2h8d_7hAc6dKs_Tc2d3h6h() {
    assertEquals(
      "2c3sJd4s 7hAc6dKs As7c2h8d 6c5cKdQs 8h9cTh4h=Tc2d3h6h 4dJsTdQd",
      Solver.process("omaha-holdem 3c6s7d8c9d 6c5cKdQs 8h9cTh4h 2c3sJd4s 4dJsTdQd As7c2h8d 7hAc6dKs Tc2d3h6h"));
  }

  @Test
  public void test_omaha_holdem_1317_3s5d5sAdTd_Qs3h6dJd_4dKh6h8h_7d7c5c8s_Qh2c5h9c_JhJcKc7h_8cAs3dAc_9sTsQdQc() {
    assertEquals(
      "4dKh6h8h JhJcKc7h 9sTsQdQc 7d7c5c8s Qh2c5h9c Qs3h6dJd 8cAs3dAc",
      Solver.process("omaha-holdem 3s5d5sAdTd Qs3h6dJd 4dKh6h8h 7d7c5c8s Qh2c5h9c JhJcKc7h 8cAs3dAc 9sTsQdQc"));
  }

  @Test
  public void test_omaha_holdem_1318_2h4c4s8dJc_7hAd6dQh_AhQd3c2c_Js6c7s2d() {
    assertEquals(
      "7hAd6dQh AhQd3c2c Js6c7s2d",
      Solver.process("omaha-holdem 2h4c4s8dJc 7hAd6dQh AhQd3c2c Js6c7s2d"));
  }

  @Test
  public void test_omaha_holdem_1319_3h4s5c5hJs_3s4dAd7d_As6s9h7s_8h7h2c2h_Kc3cTs7c_Ah9cQh5d_Qc2dKd9s_Jd8d8s4c() {
    assertEquals(
      "Qc2dKd9s 8h7h2c2h Kc3cTs7c 3s4dAd7d Jd8d8s4c Ah9cQh5d As6s9h7s",
      Solver.process("omaha-holdem 3h4s5c5hJs 3s4dAd7d As6s9h7s 8h7h2c2h Kc3cTs7c Ah9cQh5d Qc2dKd9s Jd8d8s4c"));
  }

  @Test
  public void test_omaha_holdem_1320_3d5hJcKdTs_2hKs2dAh_Qs4dQd3c_4c9cAd6h() {
    assertEquals(
      "4c9cAd6h Qs4dQd3c 2hKs2dAh",
      Solver.process("omaha-holdem 3d5hJcKdTs 2hKs2dAh Qs4dQd3c 4c9cAd6h"));
  }

  @Test
  public void test_omaha_holdem_1321_3d6d6h9hTd_Qc4d4sJd_KhKd4hAh_4c2dAs6s_QhJs8d9d_5c5sAc7h_5h2cQsJh_8hThTc2s_Ts3c9c7c() {
    assertEquals(
      "5h2cQsJh 5c5sAc7h Ts3c9c7c KhKd4hAh 4c2dAs6s QhJs8d9d Qc4d4sJd 8hThTc2s",
      Solver.process("omaha-holdem 3d6d6h9hTd Qc4d4sJd KhKd4hAh 4c2dAs6s QhJs8d9d 5c5sAc7h 5h2cQsJh 8hThTc2s Ts3c9c7c"));
  }

  @Test
  public void test_omaha_holdem_1322_3s4s9d9h9s_Qd7sKs6s_JdKh6dQs() {
    assertEquals(
      "JdKh6dQs Qd7sKs6s",
      Solver.process("omaha-holdem 3s4s9d9h9s Qd7sKs6s JdKh6dQs"));
  }

  @Test
  public void test_omaha_holdem_1323_3d5d8c9hTd_JhQd2dAc_5hAdJd9c_8sQsKc6s_8h4dJc7h_4sKh5c4h_Ks2h7d7s_KdAhTh6d_3sJs2s9d() {
    assertEquals(
      "4sKh5c4h Ks2h7d7s 8sQsKc6s 3sJs2s9d 8h4dJc7h JhQd2dAc KdAhTh6d 5hAdJd9c",
      Solver.process("omaha-holdem 3d5d8c9hTd JhQd2dAc 5hAdJd9c 8sQsKc6s 8h4dJc7h 4sKh5c4h Ks2h7d7s KdAhTh6d 3sJs2s9d"));
  }

  @Test
  public void test_omaha_holdem_1324_5d5h8d9d9h_2s2cAdKc_9sQd4d5s() {
    assertEquals(
      "2s2cAdKc 9sQd4d5s",
      Solver.process("omaha-holdem 5d5h8d9d9h 2s2cAdKc 9sQd4d5s"));
  }

  @Test
  public void test_omaha_holdem_1325_2s8h9sTdTs_Qc8cAdAh_4d9cTcAc_3c7hJdQh() {
    assertEquals(
      "Qc8cAdAh 3c7hJdQh 4d9cTcAc",
      Solver.process("omaha-holdem 2s8h9sTdTs Qc8cAdAh 4d9cTcAc 3c7hJdQh"));
  }

  @Test
  public void test_omaha_holdem_1326_3d8dJcQhTs_Kh5cKs5h_2d5d6d4d_2sJsTdAc_Th9dQs2h_7d8c7h7c() {
    assertEquals(
      "2d5d6d4d 7d8c7h7c Kh5cKs5h 2sJsTdAc Th9dQs2h",
      Solver.process("omaha-holdem 3d8dJcQhTs Kh5cKs5h 2d5d6d4d 2sJsTdAc Th9dQs2h 7d8c7h7c"));
  }

  @Test
  public void test_omaha_holdem_1327_5s9h9sAdTs_QhJc6s4s_Kd7d3h5h_6d3s5d8c_ThTc7sJh_QdAcAh6h_2hJs8d6c_2s9cQs3d() {
    assertEquals(
      "2hJs8d6c 6d3s5d8c Kd7d3h5h QhJc6s4s 2s9cQs3d ThTc7sJh QdAcAh6h",
      Solver.process("omaha-holdem 5s9h9sAdTs QhJc6s4s Kd7d3h5h 6d3s5d8c ThTc7sJh QdAcAh6h 2hJs8d6c 2s9cQs3d"));
  }

  @Test
  public void test_omaha_holdem_1328_4s5h6sAhAs_2hAcAdTs_7sJd3hKh_3c7cQh7h_7d8c6h3d_5dQs2cKs_Th8h5cKc() {
    assertEquals(
      "Th8h5cKc 3c7cQh7h=7sJd3hKh 7d8c6h3d 5dQs2cKs 2hAcAdTs",
      Solver.process("omaha-holdem 4s5h6sAhAs 2hAcAdTs 7sJd3hKh 3c7cQh7h 7d8c6h3d 5dQs2cKs Th8h5cKc"));
  }

  @Test
  public void test_omaha_holdem_1329_3d5d5h8sQd_4cAs7c3s_Kh3h6dQc() {
    assertEquals(
      "4cAs7c3s Kh3h6dQc",
      Solver.process("omaha-holdem 3d5d5h8sQd 4cAs7c3s Kh3h6dQc"));
  }

  @Test
  public void test_omaha_holdem_1330_2d4d4sJdTd_Ad2cTc5h_5cAsQc3s_8hKh9c8c_8dQhJc4c() {
    assertEquals(
      "5cAsQc3s 8hKh9c8c Ad2cTc5h 8dQhJc4c",
      Solver.process("omaha-holdem 2d4d4sJdTd Ad2cTc5h 5cAsQc3s 8hKh9c8c 8dQhJc4c"));
  }

  @Test
  public void test_omaha_holdem_1331_3c9hAcJdKh_4d6h9sQs_4cThAh7h_Kd6d6sJs_2s7s6c2h_TsAs8dTc_5s8h4h5h_Jh5dKc3h_AdJcKsTd() {
    assertEquals(
      "2s7s6c2h 5s8h4h5h 4d6h9sQs 4cThAh7h=TsAs8dTc Jh5dKc3h=Kd6d6sJs AdJcKsTd",
      Solver.process("omaha-holdem 3c9hAcJdKh 4d6h9sQs 4cThAh7h Kd6d6sJs 2s7s6c2h TsAs8dTc 5s8h4h5h Jh5dKc3h AdJcKsTd"));
  }

  @Test
  public void test_omaha_holdem_1332_5s6h9sQhTh_Kh3s6dKs_As5h9c4d_6c8c7hQd_Jh2dKd7d_5d7c9d4h_Qc8dTd3d_AhAd4c6s_2c5c2s9h_JcJs3hQs() {
    assertEquals(
      "JcJs3hQs Kh3s6dKs AhAd4c6s 2c5c2s9h=5d7c9d4h=As5h9c4d Qc8dTd3d 6c8c7hQd Jh2dKd7d",
      Solver.process("omaha-holdem 5s6h9sQhTh Kh3s6dKs As5h9c4d 6c8c7hQd Jh2dKd7d 5d7c9d4h Qc8dTd3d AhAd4c6s 2c5c2s9h JcJs3hQs"));
  }

  @Test
  public void test_omaha_holdem_1333_3s7h8h9dKh_4h2h4s9s_QdJc7s5h_6cQh8cTh_7dTcJd2d_TsJh9hKd_7c4dAcAd_Qs2cAsTd_3d6d2s3c_8s5c9c4c() {
    assertEquals(
      "Qs2cAsTd QdJc7s5h 7c4dAcAd 8s5c9c4c 3d6d2s3c 7dTcJd2d 4h2h4s9s TsJh9hKd 6cQh8cTh",
      Solver.process("omaha-holdem 3s7h8h9dKh 4h2h4s9s QdJc7s5h 6cQh8cTh 7dTcJd2d TsJh9hKd 7c4dAcAd Qs2cAsTd 3d6d2s3c 8s5c9c4c"));
  }

  @Test
  public void test_omaha_holdem_1334_3c3hKcKdQs_Jc3sJhJd_Ac8s7d5c_Qd6hQc5h() {
    assertEquals(
      "Ac8s7d5c Jc3sJhJd Qd6hQc5h",
      Solver.process("omaha-holdem 3c3hKcKdQs Jc3sJhJd Ac8s7d5c Qd6hQc5h"));
  }

  @Test
  public void test_omaha_holdem_1335_2c3c4c6s9c_QsTs5c8c_5hQcAc3d_TcKs9sTh_JsQh4d5d_9dAs4sKh() {
    assertEquals(
      "TcKs9sTh 9dAs4sKh JsQh4d5d QsTs5c8c 5hQcAc3d",
      Solver.process("omaha-holdem 2c3c4c6s9c QsTs5c8c 5hQcAc3d TcKs9sTh JsQh4d5d 9dAs4sKh"));
  }

  @Test
  public void test_omaha_holdem_1336_2h4d7c7s9h_7hTc3h4s_Ks8c9cQh_5sJd4h6d_8s2c3s3d_QcTdAs6s_KhKc2sAh_9s5d3cTs_4c9dQs6c_JhJcKdJs() {
    assertEquals(
      "QcTdAs6s 8s2c3s3d 5sJd4h6d 9s5d3cTs 4c9dQs6c Ks8c9cQh JhJcKdJs KhKc2sAh 7hTc3h4s",
      Solver.process("omaha-holdem 2h4d7c7s9h 7hTc3h4s Ks8c9cQh 5sJd4h6d 8s2c3s3d QcTdAs6s KhKc2sAh 9s5d3cTs 4c9dQs6c JhJcKdJs"));
  }

  @Test
  public void test_omaha_holdem_1337_6c6d9cAdTc_QdJd7c4s_Ks5s4c3d_2d4d9h7h_8cTd5c3s_8s3c7dAs_JhKc4h2s_9dKh5h7s_6s5d8dKd() {
    assertEquals(
      "QdJd7c4s Ks5s4c3d JhKc4h2s 2d4d9h7h 9dKh5h7s 6s5d8dKd 8s3c7dAs 8cTd5c3s",
      Solver.process("omaha-holdem 6c6d9cAdTc QdJd7c4s Ks5s4c3d 2d4d9h7h 8cTd5c3s 8s3c7dAs JhKc4h2s 9dKh5h7s 6s5d8dKd"));
  }

  @Test
  public void test_omaha_holdem_1338_5c6s9cAdQh_2h4dKc6c_4h8s3hTs_5dJd2sTd_Qs8c8h4s_3dQc3sJh_7hKs5s7s() {
    assertEquals(
      "4h8s3hTs 5dJd2sTd 2h4dKc6c 7hKs5s7s Qs8c8h4s 3dQc3sJh",
      Solver.process("omaha-holdem 5c6s9cAdQh 2h4dKc6c 4h8s3hTs 5dJd2sTd Qs8c8h4s 3dQc3sJh 7hKs5s7s"));
  }

  @Test
  public void test_omaha_holdem_1339_3d4d7cAsJs_8d2dKsKd_5c8c2h9h_6c4s4h9s_6dTcTs9c_5h3hJh5s_7sQh6s5d_8hKhAhQc_TdJc2sKc() {
    assertEquals(
      "6dTcTs9c TdJc2sKc 8d2dKsKd 8hKhAhQc 5h3hJh5s 6c4s4h9s 5c8c2h9h 7sQh6s5d",
      Solver.process("omaha-holdem 3d4d7cAsJs 8d2dKsKd 5c8c2h9h 6c4s4h9s 6dTcTs9c 5h3hJh5s 7sQh6s5d 8hKhAhQc TdJc2sKc"));
  }

  @Test
  public void test_omaha_holdem_1340_3dKcQcQdTd_Ks4hAd2h_4c5s8s8h_7s2s6h9h_Th7c5c6d() {
    assertEquals(
      "7s2s6h9h 4c5s8s8h Th7c5c6d Ks4hAd2h",
      Solver.process("omaha-holdem 3dKcQcQdTd Ks4hAd2h 4c5s8s8h 7s2s6h9h Th7c5c6d"));
  }

  @Test
  public void test_omaha_holdem_1341_5d5s7hAcKc_QcAh8c8h_4cKsTh9c_Ts7s6c4h_7cKh9h6d() {
    assertEquals(
      "Ts7s6c4h 4cKsTh9c 7cKh9h6d QcAh8c8h",
      Solver.process("omaha-holdem 5d5s7hAcKc QcAh8c8h 4cKsTh9c Ts7s6c4h 7cKh9h6d"));
  }

  @Test
  public void test_omaha_holdem_1342_2s5s6sJhKd_Th2hQdAd_Ts8s4d7h() {
    assertEquals(
      "Th2hQdAd Ts8s4d7h",
      Solver.process("omaha-holdem 2s5s6sJhKd Th2hQdAd Ts8s4d7h"));
  }

  @Test
  public void test_omaha_holdem_1343_2h5c9cJhJs_8h4dKs7d_9d5hAh8d_6s6h5dAs_9hQcTdKd_3hTc3s7c() {
    assertEquals(
      "8h4dKs7d 3hTc3s7c 6s6h5dAs 9hQcTdKd 9d5hAh8d",
      Solver.process("omaha-holdem 2h5c9cJhJs 8h4dKs7d 9d5hAh8d 6s6h5dAs 9hQcTdKd 3hTc3s7c"));
  }

  @Test
  public void test_omaha_holdem_1344_3c5h6cQdTs_Jd8s5d6h_Js8cTc4d() {
    assertEquals(
      "Js8cTc4d Jd8s5d6h",
      Solver.process("omaha-holdem 3c5h6cQdTs Jd8s5d6h Js8cTc4d"));
  }

  @Test
  public void test_omaha_holdem_1345_2s3s5s7h8s_3cQc4h9h_TcAdQd4c() {
    assertEquals(
      "3cQc4h9h TcAdQd4c",
      Solver.process("omaha-holdem 2s3s5s7h8s 3cQc4h9h TcAdQd4c"));
  }

  @Test
  public void test_omaha_holdem_1346_2d9cKcQhTh_4c7s5hAh_7hQdKd8d_KsAcJd5s_7d9hJh6s() {
    assertEquals(
      "4c7s5hAh 7hQdKd8d 7d9hJh6s KsAcJd5s",
      Solver.process("omaha-holdem 2d9cKcQhTh 4c7s5hAh 7hQdKd8d KsAcJd5s 7d9hJh6s"));
  }

  @Test
  public void test_omaha_holdem_1347_5c8cAhJdQd_4h9h2s7d_3s8dTh7s_Qh9cKdKc_9dJc5d9s_3dTdTc3h_QcTs4c2h_8s6hKh6s_6d2d4sQs() {
    assertEquals(
      "4h9h2s7d 3s8dTh7s 8s6hKh6s 3dTdTc3h 6d2d4sQs QcTs4c2h Qh9cKdKc 9dJc5d9s",
      Solver.process("omaha-holdem 5c8cAhJdQd 4h9h2s7d 3s8dTh7s Qh9cKdKc 9dJc5d9s 3dTdTc3h QcTs4c2h 8s6hKh6s 6d2d4sQs"));
  }

  @Test
  public void test_omaha_holdem_1348_3d4s9dQcTc_6s7c8hAd_KcAs6d5c_KsJs9c4h_5s6h4c3h_4d9s5hKh_Kd5dQs2s_Qd3sTd7h_AhThJdJh() {
    assertEquals(
      "6s7c8hAd KcAs6d5c AhThJdJh Kd5dQs2s 5s6h4c3h 4d9s5hKh Qd3sTd7h KsJs9c4h",
      Solver.process("omaha-holdem 3d4s9dQcTc 6s7c8hAd KcAs6d5c KsJs9c4h 5s6h4c3h 4d9s5hKh Kd5dQs2s Qd3sTd7h AhThJdJh"));
  }

  @Test
  public void test_omaha_holdem_1349_2s5d6c9dAc_5s9h4h2h_4d7h4c8h_9sJs2cKd_9cAs6dKc_6h4sQh7s_7c3h3d7d_Td2dJd3s() {
    assertEquals(
      "Td2dJd3s 6h4sQh7s 7c3h3d7d 9sJs2cKd 5s9h4h2h 9cAs6dKc 4d7h4c8h",
      Solver.process("omaha-holdem 2s5d6c9dAc 5s9h4h2h 4d7h4c8h 9sJs2cKd 9cAs6dKc 6h4sQh7s 7c3h3d7d Td2dJd3s"));
  }

  @Test
  public void test_omaha_holdem_1350_2c3d9sAcAh_5c3h7h9h_Td4s3s5d_Jd6dJhAd() {
    assertEquals(
      "5c3h7h9h Jd6dJhAd Td4s3s5d",
      Solver.process("omaha-holdem 2c3d9sAcAh 5c3h7h9h Td4s3s5d Jd6dJhAd"));
  }

  @Test
  public void test_omaha_holdem_1351_2s5s6d8dJs_Jh8c9sKs_3h4sAs7d_Kd2d7cAc_Qh5dJdKc_JcKh5c4c_6s6c9d5h_TsAdTc7s() {
    assertEquals(
      "Kd2d7cAc JcKh5c4c=Qh5dJdKc 6s6c9d5h TsAdTc7s Jh8c9sKs 3h4sAs7d",
      Solver.process("omaha-holdem 2s5s6d8dJs Jh8c9sKs 3h4sAs7d Kd2d7cAc Qh5dJdKc JcKh5c4c 6s6c9d5h TsAdTc7s"));
  }

  @Test
  public void test_omaha_holdem_1352_2d6c6d6s9s_2hQdKd5s_3h8hAcAd_AsKhJc8d_2sJs8sTc_9c2cQsQc_7cKsTs7s_7dKcTh3s_4d5h4c3c_3dAh5d8c() {
    assertEquals(
      "2sJs8sTc 7dKcTh3s 2hQdKd5s 3dAh5d8c AsKhJc8d 4d5h4c3c 7cKsTs7s 9c2cQsQc 3h8hAcAd",
      Solver.process("omaha-holdem 2d6c6d6s9s 2hQdKd5s 3h8hAcAd AsKhJc8d 2sJs8sTc 9c2cQsQc 7cKsTs7s 7dKcTh3s 4d5h4c3c 3dAh5d8c"));
  }

  @Test
  public void test_omaha_holdem_1353_3s5d7hKhQd_6hAc2d9h_8cThQs5h_Kd2c8dTd_9c4hAd6d_Qc3cTcJs_7s7c4d6s() {
    assertEquals(
      "6hAc2d9h Kd2c8dTd Qc3cTcJs 8cThQs5h 7s7c4d6s=9c4hAd6d",
      Solver.process("omaha-holdem 3s5d7hKhQd 6hAc2d9h 8cThQs5h Kd2c8dTd 9c4hAd6d Qc3cTcJs 7s7c4d6s"));
  }

  @Test
  public void test_omaha_holdem_1354_3s7cAsTdTs_Qh2cJc3h_4s3d9d5h_Ad7h9sAh_8s3cAc2d_5d6h5s4h_6cKs9c2h() {
    assertEquals(
      "6cKs9c2h 4s3d9d5h Qh2cJc3h 5d6h5s4h 8s3cAc2d Ad7h9sAh",
      Solver.process("omaha-holdem 3s7cAsTdTs Qh2cJc3h 4s3d9d5h Ad7h9sAh 8s3cAc2d 5d6h5s4h 6cKs9c2h"));
  }

  @Test
  public void test_omaha_holdem_1355_9cAdJcKhTh_JhAs6s3h_JdTcTdKc_7d2hTs7h_3d8sQc7s_5c3s8d2d_6c7c4d6h_Qs8c8h2c_5d9sAc4s_Kd9d3cKs() {
    assertEquals(
      "5c3s8d2d 6c7c4d6h 7d2hTs7h 5d9sAc4s JhAs6s3h JdTcTdKc Kd9d3cKs 3d8sQc7s=Qs8c8h2c",
      Solver.process("omaha-holdem 9cAdJcKhTh JhAs6s3h JdTcTdKc 7d2hTs7h 3d8sQc7s 5c3s8d2d 6c7c4d6h Qs8c8h2c 5d9sAc4s Kd9d3cKs"));
  }

  @Test
  public void test_omaha_holdem_1356_3c6h8cJhTs_3s6d2hAd_Td8d5sTc() {
    assertEquals(
      "3s6d2hAd Td8d5sTc",
      Solver.process("omaha-holdem 3c6h8cJhTs 3s6d2hAd Td8d5sTc"));
  }

  @Test
  public void test_omaha_holdem_1357_3s4h6hAhKs_3h2s8dKh_9dAs8hAd_6sAc6c4s() {
    assertEquals(
      "6sAc6c4s 9dAs8hAd 3h2s8dKh",
      Solver.process("omaha-holdem 3s4h6hAhKs 3h2s8dKh 9dAs8hAd 6sAc6c4s"));
  }

  @Test
  public void test_omaha_holdem_1358_6d7hQdTcTh_4cAdJc5h_Js4dKd2h() {
    assertEquals(
      "Js4dKd2h 4cAdJc5h",
      Solver.process("omaha-holdem 6d7hQdTcTh 4cAdJc5h Js4dKd2h"));
  }

  @Test
  public void test_omaha_holdem_1359_3c4h5d6hAh_9cJhJcTd_7s5hTs6d_3dQc7hQd_Ad7d4c8s() {
    assertEquals(
      "9cJhJcTd 3dQc7hQd=7s5hTs6d Ad7d4c8s",
      Solver.process("omaha-holdem 3c4h5d6hAh 9cJhJcTd 7s5hTs6d 3dQc7hQd Ad7d4c8s"));
  }

  @Test
  public void test_omaha_holdem_1360_4h5s6hKhQs_QcQhJh6s_Ah3s7c9h_ThTc4s3c_2d3d5hKs_KcAd8d9d_4c2hAc8c_6d2cTsTd_9s2sJc9c_5cQd6c3h() {
    assertEquals(
      "4c2hAc8c 9s2sJc9c 6d2cTsTd=ThTc4s3c KcAd8d9d 5cQd6c3h 2d3d5hKs QcQhJh6s Ah3s7c9h",
      Solver.process("omaha-holdem 4h5s6hKhQs QcQhJh6s Ah3s7c9h ThTc4s3c 2d3d5hKs KcAd8d9d 4c2hAc8c 6d2cTsTd 9s2sJc9c 5cQd6c3h"));
  }

  @Test
  public void test_omaha_holdem_1361_2d5s9dJdTh_8c7h9c3h_QdAdKh2s_2h5dTd9s_8h4hKs3c_6d8sTsQs_5cKcQh5h_9h4sAc8d() {
    assertEquals(
      "8h4hKs3c 9h4sAc8d 8c7h9c3h 6d8sTsQs 5cKcQh5h 2h5dTd9s QdAdKh2s",
      Solver.process("omaha-holdem 2d5s9dJdTh 8c7h9c3h QdAdKh2s 2h5dTd9s 8h4hKs3c 6d8sTsQs 5cKcQh5h 9h4sAc8d"));
  }

  @Test
  public void test_omaha_holdem_1362_3c7d9cJsKc_7c9s3dQc_Th7hKs6d() {
    assertEquals(
      "Th7hKs6d 7c9s3dQc",
      Solver.process("omaha-holdem 3c7d9cJsKc 7c9s3dQc Th7hKs6d"));
  }

  @Test
  public void test_omaha_holdem_1363_3c6d9cAhJd_2s7s6cQh_8s5sKc5c() {
    assertEquals(
      "8s5sKc5c 2s7s6cQh",
      Solver.process("omaha-holdem 3c6d9cAhJd 2s7s6cQh 8s5sKc5c"));
  }

  @Test
  public void test_omaha_holdem_1364_4c7d7s8cAs_9hKhQc5h_6d4hAdAh_8dKcJsQd_2dKd5sKs() {
    assertEquals(
      "9hKhQc5h 8dKcJsQd 2dKd5sKs 6d4hAdAh",
      Solver.process("omaha-holdem 4c7d7s8cAs 9hKhQc5h 6d4hAdAh 8dKcJsQd 2dKd5sKs"));
  }

  @Test
  public void test_omaha_holdem_1365_4d4h7hJsQs_2cKcAh8d_2h5d7c6s_TdQc6c4c_2d6hKs8c_9s5s9cAc() {
    assertEquals(
      "2d6hKs8c 2cKcAh8d 2h5d7c6s 9s5s9cAc TdQc6c4c",
      Solver.process("omaha-holdem 4d4h7hJsQs 2cKcAh8d 2h5d7c6s TdQc6c4c 2d6hKs8c 9s5s9cAc"));
  }

  @Test
  public void test_omaha_holdem_1366_7h7sKdQcQs_QdAd4h9h_Ks6h8hJh() {
    assertEquals(
      "Ks6h8hJh QdAd4h9h",
      Solver.process("omaha-holdem 7h7sKdQcQs QdAd4h9h Ks6h8hJh"));
  }

  @Test
  public void test_omaha_holdem_1367_2c3c6h9cTc_Kh4s4d5c_Qs6d9d5d_8h6sAdQd_TsAhKc4c_QhQc8dTd_Jh6cJcAs() {
    assertEquals(
      "8h6sAdQd QhQc8dTd Qs6d9d5d Kh4s4d5c Jh6cJcAs TsAhKc4c",
      Solver.process("omaha-holdem 2c3c6h9cTc Kh4s4d5c Qs6d9d5d 8h6sAdQd TsAhKc4c QhQc8dTd Jh6cJcAs"));
  }

  @Test
  public void test_omaha_holdem_1368_7c9cJdKsTh_KcJs7s5c_4h3h8s5s_5d4cTd2c_5hQsAc9s_AhJh3dJc() {
    assertEquals(
      "4h3h8s5s 5d4cTd2c KcJs7s5c AhJh3dJc 5hQsAc9s",
      Solver.process("omaha-holdem 7c9cJdKsTh KcJs7s5c 4h3h8s5s 5d4cTd2c 5hQsAc9s AhJh3dJc"));
  }

  @Test
  public void test_omaha_holdem_1369_4c9c9hJcKh_5s4dQcKc_2dTs3h5d_8h8d2s7h_AdTc3cQs_9dJhAs4h_7dThJd2c_8cKdQh6c_AhJsQdTd() {
    assertEquals(
      "2dTs3h5d 8h8d2s7h 7dThJd2c AhJsQdTd 8cKdQh6c AdTc3cQs 5s4dQcKc 9dJhAs4h",
      Solver.process("omaha-holdem 4c9c9hJcKh 5s4dQcKc 2dTs3h5d 8h8d2s7h AdTc3cQs 9dJhAs4h 7dThJd2c 8cKdQh6c AhJsQdTd"));
  }

  @Test
  public void test_omaha_holdem_1370_2d4h7hQdTh_7s3dQc6s_5sTs5c3c_8c8d9h7d() {
    assertEquals(
      "8c8d9h7d 5sTs5c3c 7s3dQc6s",
      Solver.process("omaha-holdem 2d4h7hQdTh 7s3dQc6s 5sTs5c3c 8c8d9h7d"));
  }

  @Test
  public void test_omaha_holdem_1371_2h5s9dKhTs_4dAdJc8h_AhKc8s2d() {
    assertEquals(
      "4dAdJc8h AhKc8s2d",
      Solver.process("omaha-holdem 2h5s9dKhTs 4dAdJc8h AhKc8s2d"));
  }

  @Test
  public void test_omaha_holdem_1372_4h5s9sJhKc_7h5h6hTh_TcJs6d8d_Qd8s4d4c_Kd8c9hKs_3cAsQsJd_6c5d2dAc_Td3h3d3s_7c4s6s2s_Ts2h9dQc() {
    assertEquals(
      "Td3h3d3s 7c4s6s2s 7h5h6hTh 6c5d2dAc TcJs6d8d 3cAsQsJd Qd8s4d4c Kd8c9hKs Ts2h9dQc",
      Solver.process("omaha-holdem 4h5s9sJhKc 7h5h6hTh TcJs6d8d Qd8s4d4c Kd8c9hKs 3cAsQsJd 6c5d2dAc Td3h3d3s 7c4s6s2s Ts2h9dQc"));
  }

  @Test
  public void test_omaha_holdem_1373_5c7d7s8c8h_2d4d9sTc_TdThQc9h_Kh5s3c4h() {
    assertEquals(
      "2d4d9sTc Kh5s3c4h TdThQc9h",
      Solver.process("omaha-holdem 5c7d7s8c8h 2d4d9sTc TdThQc9h Kh5s3c4h"));
  }

  @Test
  public void test_omaha_holdem_1374_3h5d7dAsQc_4h3sKcQs_4s8d6hKs_2hJs4d9s_6d8s8hTs_Td2c6cTh() {
    assertEquals(
      "6d8s8hTs Td2c6cTh 4h3sKcQs 2hJs4d9s 4s8d6hKs",
      Solver.process("omaha-holdem 3h5d7dAsQc 4h3sKcQs 4s8d6hKs 2hJs4d9s 6d8s8hTs Td2c6cTh"));
  }

  @Test
  public void test_omaha_holdem_1375_3s5h8dAsKd_4sJd2c5s_9h2dKc5d_7s9c7c4d_KhTsTd8s_QsAhQd5c_9d6cAdJh_7hQh6s4h() {
    assertEquals(
      "7hQh6s4h 7s9c7c4d 9d6cAdJh 9h2dKc5d KhTsTd8s QsAhQd5c 4sJd2c5s",
      Solver.process("omaha-holdem 3s5h8dAsKd 4sJd2c5s 9h2dKc5d 7s9c7c4d KhTsTd8s QsAhQd5c 9d6cAdJh 7hQh6s4h"));
  }

  @Test
  public void test_omaha_holdem_1376_4d4h8s9sKc_5c6c2h4c_Kh5d9h2c_2dQhTh4s_7c5s8h3s_JsQcKdAs() {
    assertEquals(
      "7c5s8h3s JsQcKdAs Kh5d9h2c 5c6c2h4c 2dQhTh4s",
      Solver.process("omaha-holdem 4d4h8s9sKc 5c6c2h4c Kh5d9h2c 2dQhTh4s 7c5s8h3s JsQcKdAs"));
  }

  @Test
  public void test_omaha_holdem_1377_3s4s6d7hJh_8d5h7dAs_Qc7s2dKs_9cQd2s9h_JdAh5c8c_8sQhTd6s() {
    assertEquals(
      "8sQhTd6s Qc7s2dKs 9cQd2s9h 8d5h7dAs=JdAh5c8c",
      Solver.process("omaha-holdem 3s4s6d7hJh 8d5h7dAs Qc7s2dKs 9cQd2s9h JdAh5c8c 8sQhTd6s"));
  }

  @Test
  public void test_omaha_holdem_1378_5c9cKcQdTc_AcAsJs7s_8h9sKd2s_Ks4s3h4h_9hJc6d6h_Kh5sAdQh_4c4dJd5h_2d5d3d7h_7cTd6cTs() {
    assertEquals(
      "2d5d3d7h 4c4dJd5h Ks4s3h4h 8h9sKd2s Kh5sAdQh 9hJc6d6h AcAsJs7s 7cTd6cTs",
      Solver.process("omaha-holdem 5c9cKcQdTc AcAsJs7s 8h9sKd2s Ks4s3h4h 9hJc6d6h Kh5sAdQh 4c4dJd5h 2d5d3d7h 7cTd6cTs"));
  }

  @Test
  public void test_omaha_holdem_1379_4d6d7cKdKs_3c3hQsAh_5c2cKc4s_6hJs6c4h_Qd8c3s4c() {
    assertEquals(
      "3c3hQsAh Qd8c3s4c 6hJs6c4h 5c2cKc4s",
      Solver.process("omaha-holdem 4d6d7cKdKs 3c3hQsAh 5c2cKc4s 6hJs6c4h Qd8c3s4c"));
  }

  @Test
  public void test_omaha_holdem_1380_5s6d9hKdKs_QcQs9d9c_Qh7c2h7s_2c3s8cTh_8d2dTcJd_4h5h4d5c_Qd6hJcTd_3cJs8h7h() {
    assertEquals(
      "2c3s8cTh 8d2dTcJd Qd6hJcTd Qh7c2h7s 3cJs8h7h 4h5h4d5c QcQs9d9c",
      Solver.process("omaha-holdem 5s6d9hKdKs QcQs9d9c Qh7c2h7s 2c3s8cTh 8d2dTcJd 4h5h4d5c Qd6hJcTd 3cJs8h7h"));
  }

  @Test
  public void test_omaha_holdem_1381_3d6c8dJhQd_5cKh7h3s_8sAs3h8c_ThKc2s2h_9d4dTd9h_Ks2c6h2d_9sAd5s4h_5hAcJd4s_Tc3c7cJc_5dAhKdJs() {
    assertEquals(
      "9sAd5s4h ThKc2s2h 5cKh7h3s Ks2c6h2d 5hAcJd4s Tc3c7cJc 8sAs3h8c 9d4dTd9h 5dAhKdJs",
      Solver.process("omaha-holdem 3d6c8dJhQd 5cKh7h3s 8sAs3h8c ThKc2s2h 9d4dTd9h Ks2c6h2d 9sAd5s4h 5hAcJd4s Tc3c7cJc 5dAhKdJs"));
  }

  @Test
  public void test_omaha_holdem_1382_4d5s6s8h9c_5h8cQh3c_8dKsJhQs_As4hKd8s() {
    assertEquals(
      "8dKsJhQs As4hKd8s 5h8cQh3c",
      Solver.process("omaha-holdem 4d5s6s8h9c 5h8cQh3c 8dKsJhQs As4hKd8s"));
  }

  @Test
  public void test_omaha_holdem_1383_5h8sAsKhTd_JdAcKc2d_JsThQd7h() {
    assertEquals(
      "JdAcKc2d JsThQd7h",
      Solver.process("omaha-holdem 5h8sAsKhTd JdAcKc2d JsThQd7h"));
  }

  @Test
  public void test_omaha_holdem_1384_3s4d5c5h8s_8cKhQs9d_As8dJd7d_Ac3cJsQc_8h9s2hAh_9c6cTsQd_Ad2s4c5s_Td2d7c9h_TcQh6h6d() {
    assertEquals(
      "Td2d7c9h 9c6cTsQd Ac3cJsQc TcQh6h6d 8cKhQs9d As8dJd7d 8h9s2hAh Ad2s4c5s",
      Solver.process("omaha-holdem 3s4d5c5h8s 8cKhQs9d As8dJd7d Ac3cJsQc 8h9s2hAh 9c6cTsQd Ad2s4c5s Td2d7c9h TcQh6h6d"));
  }

  @Test
  public void test_omaha_holdem_1385_3c6s7c7hQs_ThKhAs4c_Ad7s5c8c_Qd5h3sQc() {
    assertEquals(
      "ThKhAs4c Ad7s5c8c Qd5h3sQc",
      Solver.process("omaha-holdem 3c6s7c7hQs ThKhAs4c Ad7s5c8c Qd5h3sQc"));
  }

  @Test
  public void test_omaha_holdem_1386_4s8h9cJsTd_5dQc8sTc_7sAh6hKh_JdTs3c3d_7dKd6d6s_2sJcQdKs_Ac3h9dTh() {
    assertEquals(
      "Ac3h9dTh JdTs3c3d 7dKd6d6s=7sAh6hKh 5dQc8sTc 2sJcQdKs",
      Solver.process("omaha-holdem 4s8h9cJsTd 5dQc8sTc 7sAh6hKh JdTs3c3d 7dKd6d6s 2sJcQdKs Ac3h9dTh"));
  }

  @Test
  public void test_omaha_holdem_1387_2c4s5dJsKc_3cQsAd7s_8d3s8cTc_8s2hTdQc_4d4hQdKd_9d9cJcAc_8h7h6sTs_6cAh5s3h_3d2d7cTh() {
    assertEquals(
      "8h7h6sTs 3d2d7cTh 8s2hTdQc 8d3s8cTc 9d9cJcAc 4d4hQdKd 3cQsAd7s 6cAh5s3h",
      Solver.process("omaha-holdem 2c4s5dJsKc 3cQsAd7s 8d3s8cTc 8s2hTdQc 4d4hQdKd 9d9cJcAc 8h7h6sTs 6cAh5s3h 3d2d7cTh"));
  }

  @Test
  public void test_omaha_holdem_1388_2s6d9sKcTd_4dJdQh8d_7h8c6cKs_9dKhJc7s_5s3hTsAd_Qs3d4cAh_Th6h5h2d_9h4sQcKd_7c2h5c6s_4hTc3s7d() {
    assertEquals(
      "Qs3d4cAh 4hTc3s7d 5s3hTsAd 7c2h5c6s Th6h5h2d 9dKhJc7s=9h4sQcKd 7h8c6cKs 4dJdQh8d",
      Solver.process("omaha-holdem 2s6d9sKcTd 4dJdQh8d 7h8c6cKs 9dKhJc7s 5s3hTsAd Qs3d4cAh Th6h5h2d 9h4sQcKd 7c2h5c6s 4hTc3s7d"));
  }

  @Test
  public void test_omaha_holdem_1389_5c6c7h7s8d_Td4s5d3h_6sQsKd2d_5sTcThTs_3d6d2cJd() {
    assertEquals(
      "3d6d2cJd 6sQsKd2d 5sTcThTs Td4s5d3h",
      Solver.process("omaha-holdem 5c6c7h7s8d Td4s5d3h 6sQsKd2d 5sTcThTs 3d6d2cJd"));
  }

  @Test
  public void test_omaha_holdem_1390_6c6sJcKdTd_Tc7s5dTs_2d5sKc2h_7h3c8c3h_As4d7cAh_2c8sQhQs() {
    assertEquals(
      "7h3c8c3h 2c8sQhQs 2d5sKc2h As4d7cAh Tc7s5dTs",
      Solver.process("omaha-holdem 6c6sJcKdTd Tc7s5dTs 2d5sKc2h 7h3c8c3h As4d7cAh 2c8sQhQs"));
  }

  @Test
  public void test_omaha_holdem_1391_4d8cAsKhQd_9s3d2sJd_6hKs3sKd_5d5hJs8d() {
    assertEquals(
      "9s3d2sJd 5d5hJs8d 6hKs3sKd",
      Solver.process("omaha-holdem 4d8cAsKhQd 9s3d2sJd 6hKs3sKd 5d5hJs8d"));
  }

  @Test
  public void test_omaha_holdem_1392_4d5s7cKcTc_4s9d9s3s_4cTsJc5h_8hQs2dKh_6cAdKdAc() {
    assertEquals(
      "4s9d9s3s 8hQs2dKh 4cTsJc5h 6cAdKdAc",
      Solver.process("omaha-holdem 4d5s7cKcTc 4s9d9s3s 4cTsJc5h 8hQs2dKh 6cAdKdAc"));
  }

  @Test
  public void test_omaha_holdem_1393_2h3c8s9dAc_2d6dKs3h_Ah9hQsTc() {
    assertEquals(
      "2d6dKs3h Ah9hQsTc",
      Solver.process("omaha-holdem 2h3c8s9dAc 2d6dKs3h Ah9hQsTc"));
  }

  @Test
  public void test_omaha_holdem_1394_2d4h8h9h9s_9c6c6h4c_6s3dJcJh_4d5hAc3c_KcKsQh9d_7cJs7h8c() {
    assertEquals(
      "4d5hAc3c 7cJs7h8c 6s3dJcJh KcKsQh9d 9c6c6h4c",
      Solver.process("omaha-holdem 2d4h8h9h9s 9c6c6h4c 6s3dJcJh 4d5hAc3c KcKsQh9d 7cJs7h8c"));
  }

  @Test
  public void test_omaha_holdem_1395_3cAhJdJsTc_2d7hAc7d_9c2cQs6c() {
    assertEquals(
      "9c2cQs6c 2d7hAc7d",
      Solver.process("omaha-holdem 3cAhJdJsTc 2d7hAc7d 9c2cQs6c"));
  }

  @Test
  public void test_omaha_holdem_1396_9sAcAhKcQh_Kd6d5dQc_6s4dJsKs() {
    assertEquals(
      "6s4dJsKs Kd6d5dQc",
      Solver.process("omaha-holdem 9sAcAhKcQh Kd6d5dQc 6s4dJsKs"));
  }

  @Test
  public void test_omaha_holdem_1397_2h2s4h6hAs_Td7c4s3d_8h5cJdKc_7dQhThAd() {
    assertEquals(
      "8h5cJdKc Td7c4s3d 7dQhThAd",
      Solver.process("omaha-holdem 2h2s4h6hAs Td7c4s3d 8h5cJdKc 7dQhThAd"));
  }

  @Test
  public void test_omaha_holdem_1398_3s4d6s9sKh_3h9dQh2d_Ah6hQs8s_QcKd5sAd_JcKc6cAs_4cTs4h2c_5h5cAc7s() {
    assertEquals(
      "QcKd5sAd 3h9dQh2d JcKc6cAs 4cTs4h2c 5h5cAc7s Ah6hQs8s",
      Solver.process("omaha-holdem 3s4d6s9sKh 3h9dQh2d Ah6hQs8s QcKd5sAd JcKc6cAs 4cTs4h2c 5h5cAc7s"));
  }

  @Test
  public void test_omaha_holdem_1399_6c6hAdAhAs_TsKc4s8c_Kh3c5s4d_7c8hQcKs_6s5h4h9h_Kd2hTc9s_Js5d9cQd() {
    assertEquals(
      "6s5h4h9h Js5d9cQd Kh3c5s4d Kd2hTc9s=TsKc4s8c 7c8hQcKs",
      Solver.process("omaha-holdem 6c6hAdAhAs TsKc4s8c Kh3c5s4d 7c8hQcKs 6s5h4h9h Kd2hTc9s Js5d9cQd"));
  }

  @Test
  public void test_omaha_holdem_1400_2c3s4s7c9s_7sKs5h5s_TsQs4c8c_8d7d2d6s() {
    assertEquals(
      "8d7d2d6s TsQs4c8c 7sKs5h5s",
      Solver.process("omaha-holdem 2c3s4s7c9s 7sKs5h5s TsQs4c8c 8d7d2d6s"));
  }

  @Test
  public void test_omaha_holdem_1401_2c2d7s9hJh_JdQc8s2h_7d6s8d5h_4c3sAdKh_TsTh6d6c() {
    assertEquals(
      "4c3sAdKh 7d6s8d5h TsTh6d6c JdQc8s2h",
      Solver.process("omaha-holdem 2c2d7s9hJh JdQc8s2h 7d6s8d5h 4c3sAdKh TsTh6d6c"));
  }

  @Test
  public void test_omaha_holdem_1402_4d5h9c9sQs_3s2c3d9d_8dTd7d7h_4cJdQcAc_KdAs5s2s_2h5c3hQd() {
    assertEquals(
      "KdAs5s2s 8dTd7d7h 2h5c3hQd 4cJdQcAc 3s2c3d9d",
      Solver.process("omaha-holdem 4d5h9c9sQs 3s2c3d9d 8dTd7d7h 4cJdQcAc KdAs5s2s 2h5c3hQd"));
  }

  @Test
  public void test_omaha_holdem_1403_3d5d7hQcTh_6dJd4h7s_2s5hTdKh_Ad9s8s7c_3c3h8dKd_6h6s9c2c_Jc2h4d2d_AsKs9d3s() {
    assertEquals(
      "Jc2h4d2d AsKs9d3s 6h6s9c2c Ad9s8s7c 2s5hTdKh 3c3h8dKd 6dJd4h7s",
      Solver.process("omaha-holdem 3d5d7hQcTh 6dJd4h7s 2s5hTdKh Ad9s8s7c 3c3h8dKd 6h6s9c2c Jc2h4d2d AsKs9d3s"));
  }

  @Test
  public void test_omaha_holdem_1404_2d3h4sAhQs_3c2hAc7h_7sJdQhQc_Td2sJhKs_4dTc5h3s_8s6hJcAs_KdQd6s5d() {
    assertEquals(
      "Td2sJhKs 8s6hJcAs 3c2hAc7h 7sJdQhQc 4dTc5h3s KdQd6s5d",
      Solver.process("omaha-holdem 2d3h4sAhQs 3c2hAc7h 7sJdQhQc Td2sJhKs 4dTc5h3s 8s6hJcAs KdQd6s5d"));
  }

  @Test
  public void test_omaha_holdem_1405_6h9dAcAsQs_2h9s8cAd_Tc7s8s4h_5c2d4s9c_7hQc8d8h_3c4c6dQd_ThAh5d5s() {
    assertEquals(
      "Tc7s8s4h 5c2d4s9c 3c4c6dQd 7hQc8d8h ThAh5d5s 2h9s8cAd",
      Solver.process("omaha-holdem 6h9dAcAsQs 2h9s8cAd Tc7s8s4h 5c2d4s9c 7hQc8d8h 3c4c6dQd ThAh5d5s"));
  }

  @Test
  public void test_omaha_holdem_1406_4s6d7c8dQs_7dKs3sAd_TdKh8hQc_Th5d2c5c() {
    assertEquals(
      "Th5d2c5c 7dKs3sAd TdKh8hQc",
      Solver.process("omaha-holdem 4s6d7c8dQs 7dKs3sAd TdKh8hQc Th5d2c5c"));
  }

  @Test
  public void test_omaha_holdem_1407_6h6s9cAsJh_2c3d4sTh_8cAcQhTc_5s9dQd2s_4d3c8dQc_5hKdQs3h_7d4hAh7h() {
    assertEquals(
      "2c3d4sTh 4d3c8dQc 5hKdQs3h 5s9dQd2s 7d4hAh7h 8cAcQhTc",
      Solver.process("omaha-holdem 6h6s9cAsJh 2c3d4sTh 8cAcQhTc 5s9dQd2s 4d3c8dQc 5hKdQs3h 7d4hAh7h"));
  }

  @Test
  public void test_omaha_holdem_1408_6c6sAdJcQd_Qh3cTh5d_KhQsAh3s_5h8s2sTd_Ac6d2cKc() {
    assertEquals(
      "5h8s2sTd Qh3cTh5d KhQsAh3s Ac6d2cKc",
      Solver.process("omaha-holdem 6c6sAdJcQd Qh3cTh5d KhQsAh3s 5h8s2sTd Ac6d2cKc"));
  }

  @Test
  public void test_omaha_holdem_1409_2c3c4h8dJc_8c3dQsKs_Jd4c6h9s_9d8sAc7s_8hKh3hAs_2s9c4d5c() {
    assertEquals(
      "9d8sAc7s 8c3dQsKs=8hKh3hAs Jd4c6h9s 2s9c4d5c",
      Solver.process("omaha-holdem 2c3c4h8dJc 8c3dQsKs Jd4c6h9s 9d8sAc7s 8hKh3hAs 2s9c4d5c"));
  }

  @Test
  public void test_omaha_holdem_1410_2c3h5dKhQc_AcAh2s2d_As4d4s4c_5s4h9h5c_6c8d6h7d_9sAd8h9d_Qd3c7hTh_7sJhQs5h_7c3s2h9c() {
    assertEquals(
      "6c8d6h7d 9sAd8h9d 7c3s2h9c Qd3c7hTh 7sJhQs5h AcAh2s2d 5s4h9h5c As4d4s4c",
      Solver.process("omaha-holdem 2c3h5dKhQc AcAh2s2d As4d4s4c 5s4h9h5c 6c8d6h7d 9sAd8h9d Qd3c7hTh 7sJhQs5h 7c3s2h9c"));
  }

  @Test
  public void test_omaha_holdem_1411_4c4h5s9cJh_Ac5dTdQc_6h6sKhTs_4d9d3cJd_3sJcKs9s_2s7s7d4s_2c3d6cAh() {
    assertEquals(
      "2c3d6cAh Ac5dTdQc 6h6sKhTs 3sJcKs9s 2s7s7d4s 4d9d3cJd",
      Solver.process("omaha-holdem 4c4h5s9cJh Ac5dTdQc 6h6sKhTs 4d9d3cJd 3sJcKs9s 2s7s7d4s 2c3d6cAh"));
  }

  @Test
  public void test_omaha_holdem_1412_2c7s8sAcQh_Ts9c3h8h_Td9sQc2s_8cQs7hKd_Ad4h9h7c_Kh3dJd3s_Jh2d7d4c_5d6dAsKc() {
    assertEquals(
      "Kh3dJd3s Ts9c3h8h 5d6dAsKc Jh2d7d4c Td9sQc2s 8cQs7hKd Ad4h9h7c",
      Solver.process("omaha-holdem 2c7s8sAcQh Ts9c3h8h Td9sQc2s 8cQs7hKd Ad4h9h7c Kh3dJd3s Jh2d7d4c 5d6dAsKc"));
  }

  @Test
  public void test_omaha_holdem_1413_2h2s8c9sTs_Th3dQc5s_8s7h9hJd_3s3cTd2c_7sAdJs7c_5h8d2dKh_Tc7d9c5c_6s6d9dKd_8h4dAh4h() {
    assertEquals(
      "8h4dAh4h 6s6d9dKd Th3dQc5s Tc7d9c5c 8s7h9hJd 7sAdJs7c 5h8d2dKh 3s3cTd2c",
      Solver.process("omaha-holdem 2h2s8c9sTs Th3dQc5s 8s7h9hJd 3s3cTd2c 7sAdJs7c 5h8d2dKh Tc7d9c5c 6s6d9dKd 8h4dAh4h"));
  }

  @Test
  public void test_omaha_holdem_1414_4d6h7dKhKs_Tc9s2dAh_8h6c7s8c_3c9hKc4h_Ac4sQhQd() {
    assertEquals(
      "Tc9s2dAh 8h6c7s8c Ac4sQhQd 3c9hKc4h",
      Solver.process("omaha-holdem 4d6h7dKhKs Tc9s2dAh 8h6c7s8c 3c9hKc4h Ac4sQhQd"));
  }

  @Test
  public void test_omaha_holdem_1415_2c6d6hQcTd_4c2d7dAc_9d2hJc9c_3cJsAsAh_Qs4d2sTc() {
    assertEquals(
      "4c2d7dAc 9d2hJc9c Qs4d2sTc 3cJsAsAh",
      Solver.process("omaha-holdem 2c6d6hQcTd 4c2d7dAc 9d2hJc9c 3cJsAsAh Qs4d2sTc"));
  }

  @Test
  public void test_omaha_holdem_1416_2c3h3s8c9h_6sTc6d7d_AhAd2s3c_Qh2h8h5s_8s4sQd9s_Jc9d7h5c_Ks2d7s4d_KdTsJdAs() {
    assertEquals(
      "KdTsJdAs Ks2d7s4d 6sTc6d7d Qh2h8h5s Jc9d7h5c 8s4sQd9s AhAd2s3c",
      Solver.process("omaha-holdem 2c3h3s8c9h 6sTc6d7d AhAd2s3c Qh2h8h5s 8s4sQd9s Jc9d7h5c Ks2d7s4d KdTsJdAs"));
  }

  @Test
  public void test_omaha_holdem_1417_5d5s9hJdQs_7s3h7c4h_Td8cKc9s_QdJh4dTh_6s6c6d8d() {
    assertEquals(
      "6s6c6d8d 7s3h7c4h QdJh4dTh Td8cKc9s",
      Solver.process("omaha-holdem 5d5s9hJdQs 7s3h7c4h Td8cKc9s QdJh4dTh 6s6c6d8d"));
  }

  @Test
  public void test_omaha_holdem_1418_5d8c9c9hKs_Kh2h5hAs_Qs8sKcAd_Tc2c9s3d_6hQhAhJc_QcTsTd3h_6sJh6d4s_9dTh4cQd() {
    assertEquals(
      "6hQhAhJc 6sJh6d4s QcTsTd3h Kh2h5hAs=Qs8sKcAd Tc2c9s3d 9dTh4cQd",
      Solver.process("omaha-holdem 5d8c9c9hKs Kh2h5hAs Qs8sKcAd Tc2c9s3d 6hQhAhJc QcTsTd3h 6sJh6d4s 9dTh4cQd"));
  }

  @Test
  public void test_omaha_holdem_1419_6c6dJhKdQs_Jd6h3hQc_5dJc4d2d_Ad7c2s9c_9s7sTh8d_Ts9dJs5s_5hQhAh4s_Tc8hAs3c_2hTd6s8c() {
    assertEquals(
      "Ad7c2s9c 5dJc4d2d 5hQhAh4s 2hTd6s8c 9s7sTh8d=Ts9dJs5s Tc8hAs3c Jd6h3hQc",
      Solver.process("omaha-holdem 6c6dJhKdQs Jd6h3hQc 5dJc4d2d Ad7c2s9c 9s7sTh8d Ts9dJs5s 5hQhAh4s Tc8hAs3c 2hTd6s8c"));
  }

  @Test
  public void test_omaha_holdem_1420_2h2s4c5hTh_3c9sQc8s_4dJdQhKc() {
    assertEquals(
      "3c9sQc8s 4dJdQhKc",
      Solver.process("omaha-holdem 2h2s4c5hTh 3c9sQc8s 4dJdQhKc"));
  }

  @Test
  public void test_omaha_holdem_1421_5c9cJcTdTh_4d3s7d2h_Kh3dJhKd_QsQdAhKc_4c5sTc7s_4s3h6s6h_5hAd8dQc() {
    assertEquals(
      "4d3s7d2h 4s3h6s6h Kh3dJhKd 5hAd8dQc QsQdAhKc 4c5sTc7s",
      Solver.process("omaha-holdem 5c9cJcTdTh 4d3s7d2h Kh3dJhKd QsQdAhKc 4c5sTc7s 4s3h6s6h 5hAd8dQc"));
  }

  @Test
  public void test_omaha_holdem_1422_2cJcJhQdQs_4cJs5sJd_6d3d3h5h_6cAs2hTs_2s6sKs5d_5c8d2dQc_8cKhKcTd_3c3s7cAd_Qh7s8h4h() {
    assertEquals(
      "2s6sKs5d 6cAs2hTs 3c3s7cAd=6d3d3h5h 8cKhKcTd Qh7s8h4h 5c8d2dQc 4cJs5sJd",
      Solver.process("omaha-holdem 2cJcJhQdQs 4cJs5sJd 6d3d3h5h 6cAs2hTs 2s6sKs5d 5c8d2dQc 8cKhKcTd 3c3s7cAd Qh7s8h4h"));
  }

  @Test
  public void test_omaha_holdem_1423_3h4d7c8sTh_2d7dQdTd_4c5cQs5s_AdTsAh4s_Ac9c3c6s_6h8dJhKh_5d8h7s9h() {
    assertEquals(
      "4c5cQs5s 6h8dJhKh 5d8h7s9h AdTsAh4s 2d7dQdTd Ac9c3c6s",
      Solver.process("omaha-holdem 3h4d7c8sTh 2d7dQdTd 4c5cQs5s AdTsAh4s Ac9c3c6s 6h8dJhKh 5d8h7s9h"));
  }

  @Test
  public void test_omaha_holdem_1424_4c5d9cThTs_JsAd5cQd_8h2dAcTd_4d5h6h9s_JcKh6dKd_Qs3sTc2c_7s9dKc4s_8s8d8c6s() {
    assertEquals(
      "JsAd5cQd 8s8d8c6s 4d5h6h9s 7s9dKc4s JcKh6dKd Qs3sTc2c 8h2dAcTd",
      Solver.process("omaha-holdem 4c5d9cThTs JsAd5cQd 8h2dAcTd 4d5h6h9s JcKh6dKd Qs3sTc2c 7s9dKc4s 8s8d8c6s"));
  }

  @Test
  public void test_omaha_holdem_1425_2d5c7h8d8h_Jh3dQs5s_Jd7cKd9s_QdTs4hAc_Ks9dAh9h() {
    assertEquals(
      "QdTs4hAc Jh3dQs5s Jd7cKd9s Ks9dAh9h",
      Solver.process("omaha-holdem 2d5c7h8d8h Jh3dQs5s Jd7cKd9s QdTs4hAc Ks9dAh9h"));
  }

  @Test
  public void test_omaha_holdem_1426_2c6c8hAcKh_QsJsKsKc_5s2sQc4c_Ts5h9h5c_Tc6dTd7d_5dJd7h9d_7s3c6h4s_Ah8dKd9c() {
    assertEquals(
      "5dJd7h9d Ts5h9h5c 7s3c6h4s Tc6dTd7d Ah8dKd9c QsJsKsKc 5s2sQc4c",
      Solver.process("omaha-holdem 2c6c8hAcKh QsJsKsKc 5s2sQc4c Ts5h9h5c Tc6dTd7d 5dJd7h9d 7s3c6h4s Ah8dKd9c"));
  }

  @Test
  public void test_omaha_holdem_1427_2s3h7h8sTs_8d7c4dTd_AhQhTc9s_7s8h9d3c_4cJd4sKc() {
    assertEquals(
      "4cJd4sKc AhQhTc9s 7s8h9d3c 8d7c4dTd",
      Solver.process("omaha-holdem 2s3h7h8sTs 8d7c4dTd AhQhTc9s 7s8h9d3c 4cJd4sKc"));
  }

  @Test
  public void test_omaha_holdem_1428_2d3d3h5c6d_Tc9dKs5s_QhAdAsQs_Js4d2s7s_7d2h4hTh_8h4cJd7h_9s9c8sAc_Jc5h8dQc() {
    assertEquals(
      "Jc5h8dQc Tc9dKs5s 9s9c8sAc QhAdAsQs 7d2h4hTh=8h4cJd7h=Js4d2s7s",
      Solver.process("omaha-holdem 2d3d3h5c6d Tc9dKs5s QhAdAsQs Js4d2s7s 7d2h4hTh 8h4cJd7h 9s9c8sAc Jc5h8dQc"));
  }

  @Test
  public void test_omaha_holdem_1429_2s5h8s9dKs_TdQc2h8d_As4d4h7h_3dQsKd2c_3cTc2d3h() {
    assertEquals(
      "3cTc2d3h As4d4h7h TdQc2h8d 3dQsKd2c",
      Solver.process("omaha-holdem 2s5h8s9dKs TdQc2h8d As4d4h7h 3dQsKd2c 3cTc2d3h"));
  }

  @Test
  public void test_omaha_holdem_1430_3c5h8cKdTd_2sAs9c9s_Kc5d2h4c_QhJhTsJs_6h6d8s7s_ThQsQc5s_7cJc9hAh() {
    assertEquals(
      "7cJc9hAh 6h6d8s7s 2sAs9c9s QhJhTsJs ThQsQc5s Kc5d2h4c",
      Solver.process("omaha-holdem 3c5h8cKdTd 2sAs9c9s Kc5d2h4c QhJhTsJs 6h6d8s7s ThQsQc5s 7cJc9hAh"));
  }

  @Test
  public void test_omaha_holdem_1431_5d7cAhKsQd_3c9dKcTh_8s4sJd4d_Jh8d7hAc_Qc6d7dTc_Ts2s2h6c_JcKhKd8h_2d9cTd5c() {
    assertEquals(
      "Ts2s2h6c 8s4sJd4d 2d9cTd5c 3c9dKcTh Qc6d7dTc Jh8d7hAc JcKhKd8h",
      Solver.process("omaha-holdem 5d7cAhKsQd 3c9dKcTh 8s4sJd4d Jh8d7hAc Qc6d7dTc Ts2s2h6c JcKhKd8h 2d9cTd5c"));
  }

  @Test
  public void test_omaha_holdem_1432_3d8cJcJhTh_Ah2dKc3c_TcJd5sTd_KdKs2cTs_9h2h9c2s_QdAs6s4d_5d8h7sQs() {
    assertEquals(
      "QdAs6s4d Ah2dKc3c 5d8h7sQs 9h2h9c2s KdKs2cTs TcJd5sTd",
      Solver.process("omaha-holdem 3d8cJcJhTh Ah2dKc3c TcJd5sTd KdKs2cTs 9h2h9c2s QdAs6s4d 5d8h7sQs"));
  }

  @Test
  public void test_omaha_holdem_1433_2s4d6s8sJd_Kh8d4c6h_5hKs4h9s_Jh6c6dJc_5cQd4s3s_Td5s2d7d_9hAc9dKd_2c9c7cAd_JsAs3c5d_7h7s3h2h() {
    assertEquals(
      "2c9c7cAd 7h7s3h2h 9hAc9dKd Kh8d4c6h Jh6c6dJc Td5s2d7d 5cQd4s3s 5hKs4h9s JsAs3c5d",
      Solver.process("omaha-holdem 2s4d6s8sJd Kh8d4c6h 5hKs4h9s Jh6c6dJc 5cQd4s3s Td5s2d7d 9hAc9dKd 2c9c7cAd JsAs3c5d 7h7s3h2h"));
  }

  @Test
  public void test_omaha_holdem_1434_2h5h7hKdTc_3hQh5d2d_4dThJh8c_6sJd9s2c() {
    assertEquals(
      "6sJd9s2c 4dThJh8c 3hQh5d2d",
      Solver.process("omaha-holdem 2h5h7hKdTc 3hQh5d2d 4dThJh8c 6sJd9s2c"));
  }

  @Test
  public void test_omaha_holdem_1435_4h6c8sJcKd_Td3cQs5d_QhKc3h7c_Jh9sQcTs_2c9h4sKh_Ac7h7sTh_2h2dJs2s_4c4dAs8h() {
    assertEquals(
      "Td3cQs5d Ac7h7sTh 2h2dJs2s Jh9sQcTs QhKc3h7c 2c9h4sKh 4c4dAs8h",
      Solver.process("omaha-holdem 4h6c8sJcKd Td3cQs5d QhKc3h7c Jh9sQcTs 2c9h4sKh Ac7h7sTh 2h2dJs2s 4c4dAs8h"));
  }

  @Test
  public void test_omaha_holdem_1436_5c8s9hKsQs_Ad6c2sJh_Ah6s9c5d_Td2d5h7c_As2hJdKd() {
    assertEquals(
      "Ad6c2sJh Td2d5h7c As2hJdKd Ah6s9c5d",
      Solver.process("omaha-holdem 5c8s9hKsQs Ad6c2sJh Ah6s9c5d Td2d5h7c As2hJdKd"));
  }

  @Test
  public void test_omaha_holdem_1437_3cAcJhQcTc_Ad8dTh8c_JdTd7h2c_8h6c7c6s_JcQs3h8s_As5h7sJs() {
    assertEquals(
      "JdTd7h2c JcQs3h8s Ad8dTh8c As5h7sJs 8h6c7c6s",
      Solver.process("omaha-holdem 3cAcJhQcTc Ad8dTh8c JdTd7h2c 8h6c7c6s JcQs3h8s As5h7sJs"));
  }

  @Test
  public void test_omaha_holdem_1438_2d3c5h8dTc_9s6dKcTd_QcTs8h9d_4cQs6s7d_Jd4h7c3s_Ah6cQh7h_2sKh4dJs_5dKd2c3d() {
    assertEquals(
      "Ah6cQh7h 2sKh4dJs Jd4h7c3s 9s6dKcTd 5dKd2c3d QcTs8h9d 4cQs6s7d",
      Solver.process("omaha-holdem 2d3c5h8dTc 9s6dKcTd QcTs8h9d 4cQs6s7d Jd4h7c3s Ah6cQh7h 2sKh4dJs 5dKd2c3d"));
  }

  @Test
  public void test_omaha_holdem_1439_2c2h8hAdQh_AhKdJs7s_As2dTsQd_9s6c9dQc_7dTd5s7c_Jc4cJh2s_6dTc9c6s() {
    assertEquals(
      "6dTc9c6s 7dTd5s7c 9s6c9dQc AhKdJs7s Jc4cJh2s As2dTsQd",
      Solver.process("omaha-holdem 2c2h8hAdQh AhKdJs7s As2dTsQd 9s6c9dQc 7dTd5s7c Jc4cJh2s 6dTc9c6s"));
  }

  @Test
  public void test_omaha_holdem_1440_6c6s7h8cJh_8d7c3s9c_8sTcQs5c_Qd4h7s6h() {
    assertEquals(
      "8sTcQs5c 8d7c3s9c Qd4h7s6h",
      Solver.process("omaha-holdem 6c6s7h8cJh 8d7c3s9c 8sTcQs5c Qd4h7s6h"));
  }

  @Test
  public void test_omaha_holdem_1441_3c7d8c9hAs_Ac2cQh8h_5c4h7h6h_4dKc3h6d_4cJd6s9c_2hQs5dTd_KsAd6cAh() {
    assertEquals(
      "2hQs5dTd 4dKc3h6d 4cJd6s9c Ac2cQh8h KsAd6cAh 5c4h7h6h",
      Solver.process("omaha-holdem 3c7d8c9hAs Ac2cQh8h 5c4h7h6h 4dKc3h6d 4cJd6s9c 2hQs5dTd KsAd6cAh"));
  }

  @Test
  public void test_omaha_holdem_1442_7s8d8hQcTh_7h5h2cKc_2h6h4sTs_3hAh7d9d() {
    assertEquals(
      "7h5h2cKc 3hAh7d9d 2h6h4sTs",
      Solver.process("omaha-holdem 7s8d8hQcTh 7h5h2cKc 2h6h4sTs 3hAh7d9d"));
  }

  @Test
  public void test_omaha_holdem_1443_3d6d9hJhKd_7sJc8cQd_5d6hAs4c_QhTsAh4d_TcAcQc9d() {
    assertEquals(
      "5d6hAs4c 7sJc8cQd QhTsAh4d=TcAcQc9d",
      Solver.process("omaha-holdem 3d6d9hJhKd 7sJc8cQd 5d6hAs4c QhTsAh4d TcAcQc9d"));
  }

  @Test
  public void test_omaha_holdem_1444_2c7cKdTdTh_Ks9c6h5d_4cAh3dAd_6s2d5s5h_9dJsAs7h_4sQdTc9s() {
    assertEquals(
      "6s2d5s5h 9dJsAs7h Ks9c6h5d 4cAh3dAd 4sQdTc9s",
      Solver.process("omaha-holdem 2c7cKdTdTh Ks9c6h5d 4cAh3dAd 6s2d5s5h 9dJsAs7h 4sQdTc9s"));
  }

  @Test
  public void test_omaha_holdem_1445_5h7h8c9hKd_6cAh5c8s_4cJdJhQs() {
    assertEquals(
      "4cJdJhQs 6cAh5c8s",
      Solver.process("omaha-holdem 5h7h8c9hKd 6cAh5c8s 4cJdJhQs"));
  }

  @Test
  public void test_omaha_holdem_1446_3c3s7c7h8h_2sTsTd8d_Qc4cQdJd_8c3h7dAh_5hQsKs5d_Tc5sJh4h() {
    assertEquals(
      "Tc5sJh4h 5hQsKs5d 2sTsTd8d Qc4cQdJd 8c3h7dAh",
      Solver.process("omaha-holdem 3c3s7c7h8h 2sTsTd8d Qc4cQdJd 8c3h7dAh 5hQsKs5d Tc5sJh4h"));
  }

  @Test
  public void test_omaha_holdem_1447_6c6h9cQhQs_3c3sTd9d_KhTs7h2c_JdTc4cAs_5c4d5h8d() {
    assertEquals(
      "KhTs7h2c JdTc4cAs 5c4d5h8d 3c3sTd9d",
      Solver.process("omaha-holdem 6c6h9cQhQs 3c3sTd9d KhTs7h2c JdTc4cAs 5c4d5h8d"));
  }

  @Test
  public void test_omaha_holdem_1448_2c5h6dAdQd_4sKsKd9h_As7d3c9s_5d7sKh9d_JsQh6hTh_4cJd7cQc_Tc2s2dAh_AcKc6s8d_8s4d5c2h_9c5sJh8c() {
    assertEquals(
      "9c5sJh8c 4cJd7cQc 4sKsKd9h As7d3c9s 8s4d5c2h JsQh6hTh AcKc6s8d Tc2s2dAh 5d7sKh9d",
      Solver.process("omaha-holdem 2c5h6dAdQd 4sKsKd9h As7d3c9s 5d7sKh9d JsQh6hTh 4cJd7cQc Tc2s2dAh AcKc6s8d 8s4d5c2h 9c5sJh8c"));
  }

  @Test
  public void test_omaha_holdem_1449_2h4cQhThTs_3c9h8c6h_Ah9cKsTd_AsTc4d3s_JsJc7sQs_9sKc5s7c() {
    assertEquals(
      "9sKc5s7c JsJc7sQs Ah9cKsTd 3c9h8c6h AsTc4d3s",
      Solver.process("omaha-holdem 2h4cQhThTs 3c9h8c6h Ah9cKsTd AsTc4d3s JsJc7sQs 9sKc5s7c"));
  }

  @Test
  public void test_omaha_holdem_1450_2d2h3s4c7d_6h9d6sTd_ThQc2s5h_4hJdJh2c_7c9hJc8s_Ac4s9cTs() {
    assertEquals(
      "Ac4s9cTs 6h9d6sTd 7c9hJc8s ThQc2s5h 4hJdJh2c",
      Solver.process("omaha-holdem 2d2h3s4c7d 6h9d6sTd ThQc2s5h 4hJdJh2c 7c9hJc8s Ac4s9cTs"));
  }

  @Test
  public void test_omaha_holdem_1451_4h8s9dAdQs_Jd7s8dJs_5s2s3cKh() {
    assertEquals(
      "5s2s3cKh Jd7s8dJs",
      Solver.process("omaha-holdem 4h8s9dAdQs Jd7s8dJs 5s2s3cKh"));
  }

  @Test
  public void test_omaha_holdem_1452_4c5dKsQhTs_ThQs2dKd_3hAc9hAs_6hAd6cAh_3c5s4dJs_Jc3d2c4h_7s5c2sQc_8hKc2hKh_Qd3sJd9d() {
    assertEquals(
      "Jc3d2c4h 3hAc9hAs=6hAd6cAh 3c5s4dJs 7s5c2sQc ThQs2dKd 8hKc2hKh Qd3sJd9d",
      Solver.process("omaha-holdem 4c5dKsQhTs ThQs2dKd 3hAc9hAs 6hAd6cAh 3c5s4dJs Jc3d2c4h 7s5c2sQc 8hKc2hKh Qd3sJd9d"));
  }

  @Test
  public void test_omaha_holdem_1453_4d5c9sAcAs_2d6cQcAh_7dJc4h6h() {
    assertEquals(
      "7dJc4h6h 2d6cQcAh",
      Solver.process("omaha-holdem 4d5c9sAcAs 2d6cQcAh 7dJc4h6h"));
  }

  @Test
  public void test_omaha_holdem_1454_2d6s8cQhTd_7c7sKcJc_5s6cAc4d_3d4s2c2s_QcJs9h8d_9d3s8sKd() {
    assertEquals(
      "5s6cAc4d 7c7sKcJc 9d3s8sKd 3d4s2c2s QcJs9h8d",
      Solver.process("omaha-holdem 2d6s8cQhTd 7c7sKcJc 5s6cAc4d 3d4s2c2s QcJs9h8d 9d3s8sKd"));
  }

  @Test
  public void test_omaha_holdem_1455_5c8h9cAdQc_3d9h8dQh_7s3hKc6h_Ah3cAc9d_Kd3s5h7d_Tc7c9s5s_Jc6dKhTd_2h4sQd2c() {
    assertEquals(
      "Kd3s5h7d 2h4sQd2c 3d9h8dQh 7s3hKc6h Jc6dKhTd Tc7c9s5s Ah3cAc9d",
      Solver.process("omaha-holdem 5c8h9cAdQc 3d9h8dQh 7s3hKc6h Ah3cAc9d Kd3s5h7d Tc7c9s5s Jc6dKhTd 2h4sQd2c"));
  }

  @Test
  public void test_omaha_holdem_1456_AsJcJhKcTd_AhTs3s5d_2sJsTc4d_4s8hJd2h_Qc4cKs6h_4h7d9h9d_8dQhAd6s_2c7c6dKh() {
    assertEquals(
      "4h7d9h9d 2c7c6dKh AhTs3s5d 4s8hJd2h 8dQhAd6s=Qc4cKs6h 2sJsTc4d",
      Solver.process("omaha-holdem AsJcJhKcTd AhTs3s5d 2sJsTc4d 4s8hJd2h Qc4cKs6h 4h7d9h9d 8dQhAd6s 2c7c6dKh"));
  }

  @Test
  public void test_omaha_holdem_1457_8h9cQdQsTc_Td6c9d2h_Qh4s4hJd() {
    assertEquals(
      "Td6c9d2h Qh4s4hJd",
      Solver.process("omaha-holdem 8h9cQdQsTc Td6c9d2h Qh4s4hJd"));
  }

  @Test
  public void test_omaha_holdem_1458_2h6c7c7sQc_6s8hJdJh_2dAhKcKh_Qh8s4d8d() {
    assertEquals(
      "6s8hJdJh Qh8s4d8d 2dAhKcKh",
      Solver.process("omaha-holdem 2h6c7c7sQc 6s8hJdJh 2dAhKcKh Qh8s4d8d"));
  }

  @Test
  public void test_omaha_holdem_1459_2s3h9hKhTd_9sQc6hTc_2d4d8h3s_Jh3dKcAs_JsAd8c3c_5cJc6s7d_Ac9d7hQs_7sQh4cTh_4hQd2c9c_Ah5h5sJd() {
    assertEquals(
      "5cJc6s7d JsAd8c3c Ac9d7hQs 2d4d8h3s 4hQd2c9c 9sQc6hTc Jh3dKcAs 7sQh4cTh Ah5h5sJd",
      Solver.process("omaha-holdem 2s3h9hKhTd 9sQc6hTc 2d4d8h3s Jh3dKcAs JsAd8c3c 5cJc6s7d Ac9d7hQs 7sQh4cTh 4hQd2c9c Ah5h5sJd"));
  }

  @Test
  public void test_omaha_holdem_1460_6s9h9sJdQc_5sKc3d3c_2c9c3hJc_2dThAd4d_4cJs2h3s_Kd4h7cAc() {
    assertEquals(
      "2dThAd4d Kd4h7cAc 5sKc3d3c 4cJs2h3s 2c9c3hJc",
      Solver.process("omaha-holdem 6s9h9sJdQc 5sKc3d3c 2c9c3hJc 2dThAd4d 4cJs2h3s Kd4h7cAc"));
  }

  @Test
  public void test_omaha_holdem_1461_2c6c7hJdKd_2s4d9s8d_2h6sKhTs_4sTc7cJh_3c9c8sJs_Ac6hAd8c_5s9dKcQs_4h7sJc3d_4cQcQd9h() {
    assertEquals(
      "2s4d9s8d 3c9c8sJs 4cQcQd9h 5s9dKcQs Ac6hAd8c 4h7sJc3d=4sTc7cJh 2h6sKhTs",
      Solver.process("omaha-holdem 2c6c7hJdKd 2s4d9s8d 2h6sKhTs 4sTc7cJh 3c9c8sJs Ac6hAd8c 5s9dKcQs 4h7sJc3d 4cQcQd9h"));
  }

  @Test
  public void test_omaha_holdem_1462_2s7sAdAhKs_KhQcJd8s_9cQd4c6s() {
    assertEquals(
      "9cQd4c6s KhQcJd8s",
      Solver.process("omaha-holdem 2s7sAdAhKs KhQcJd8s 9cQd4c6s"));
  }

  @Test
  public void test_omaha_holdem_1463_2d3h7h9dKs_QcAs7cKc_6c9sTh2h_Ah6hJh5h_9c4s7d3d_Td4c5sQh_Ts8s8hQd_6s8d8cQs_2c4d3c3s() {
    assertEquals(
      "Td4c5sQh Ah6hJh5h 6s8d8cQs=Ts8s8hQd 6c9sTh2h 9c4s7d3d QcAs7cKc 2c4d3c3s",
      Solver.process("omaha-holdem 2d3h7h9dKs QcAs7cKc 6c9sTh2h Ah6hJh5h 9c4s7d3d Td4c5sQh Ts8s8hQd 6s8d8cQs 2c4d3c3s"));
  }

  @Test
  public void test_omaha_holdem_1464_4c8c8dQcQd_7cJs9s7d_7hKc5d5s_3cQs4s3d_3h9dTh5c_Ah5h8sAc_6sKs8h9c() {
    assertEquals(
      "3h9dTh5c 7hKc5d5s 7cJs9s7d 6sKs8h9c Ah5h8sAc 3cQs4s3d",
      Solver.process("omaha-holdem 4c8c8dQcQd 7cJs9s7d 7hKc5d5s 3cQs4s3d 3h9dTh5c Ah5h8sAc 6sKs8h9c"));
  }

  @Test
  public void test_omaha_holdem_1465_2h2s5h7cKs_7s5sTh3c_6h8s8hKc_2d8c9dJd_6sTc8d3d_JcQh6dAh_2c9h5cAs_KhAdAc6c() {
    assertEquals(
      "6sTc8d3d JcQh6dAh 7s5sTh3c 6h8s8hKc KhAdAc6c 2d8c9dJd 2c9h5cAs",
      Solver.process("omaha-holdem 2h2s5h7cKs 7s5sTh3c 6h8s8hKc 2d8c9dJd 6sTc8d3d JcQh6dAh 2c9h5cAs KhAdAc6c"));
  }

  @Test
  public void test_omaha_holdem_1466_4d8cJcKdKh_As2sKcTs_9h4s9c5s_QhAhAd5c_2h8s9s6c() {
    assertEquals(
      "2h8s9s6c 9h4s9c5s QhAhAd5c As2sKcTs",
      Solver.process("omaha-holdem 4d8cJcKdKh As2sKcTs 9h4s9c5s QhAhAd5c 2h8s9s6c"));
  }

  @Test
  public void test_omaha_holdem_1467_2c3hJhJsTd_9h6hQs3c_7d5h7cQh_Qd3d9s4d_5dAdThKd_AcJc8c4h_Jd9c6sKc_Tc8s4s2d_Ah8h6c8d_9d7h2sQc() {
    assertEquals(
      "9d7h2sQc 9h6hQs3c=Qd3d9s4d 7d5h7cQh Ah8h6c8d Tc8s4s2d 5dAdThKd Jd9c6sKc AcJc8c4h",
      Solver.process("omaha-holdem 2c3hJhJsTd 9h6hQs3c 7d5h7cQh Qd3d9s4d 5dAdThKd AcJc8c4h Jd9c6sKc Tc8s4s2d Ah8h6c8d 9d7h2sQc"));
  }

  @Test
  public void test_omaha_holdem_1468_3c8sJhQhTs_Jd7s2d8h_Qd4cJsQs_Td5c3d3h_9dAc4dKs_2sJcKc9c_As5h9s6c_8cQcTc2c_7hAhKhAd() {
    assertEquals(
      "As5h9s6c Jd7s2d8h 8cQcTc2c Td5c3d3h Qd4cJsQs 2sJcKc9c 7hAhKhAd=9dAc4dKs",
      Solver.process("omaha-holdem 3c8sJhQhTs Jd7s2d8h Qd4cJsQs Td5c3d3h 9dAc4dKs 2sJcKc9c As5h9s6c 8cQcTc2c 7hAhKhAd"));
  }

  @Test
  public void test_omaha_holdem_1469_6d7d8c8d8h_2h2cJsQh_Kd6h4cAh() {
    assertEquals(
      "Kd6h4cAh 2h2cJsQh",
      Solver.process("omaha-holdem 6d7d8c8d8h 2h2cJsQh Kd6h4cAh"));
  }

  @Test
  public void test_omaha_holdem_1470_3d6s8h9cAc_2sKhThAh_7hTdTs4s_5c6hQs5d_4dAdJc2d_Qc5h3hTc() {
    assertEquals(
      "Qc5h3hTc 5c6hQs5d 4dAdJc2d 2sKhThAh 7hTdTs4s",
      Solver.process("omaha-holdem 3d6s8h9cAc 2sKhThAh 7hTdTs4s 5c6hQs5d 4dAdJc2d Qc5h3hTc"));
  }

  @Test
  public void test_omaha_holdem_1471_6d7s9cQsTs_5hTd4d2c_JhTh4sAh_4cKcJcAd_8s9s3d2s_3sAc6hJd_6c5c5s9d_2d2h4h7d_8hQcKs5d_9h7c7hTc() {
    assertEquals(
      "3sAc6hJd 2d2h4h7d 5hTd4d2c JhTh4sAh 6c5c5s9d 9h7c7hTc 8hQcKs5d 4cKcJcAd 8s9s3d2s",
      Solver.process("omaha-holdem 6d7s9cQsTs 5hTd4d2c JhTh4sAh 4cKcJcAd 8s9s3d2s 3sAc6hJd 6c5c5s9d 2d2h4h7d 8hQcKs5d 9h7c7hTc"));
  }

  @Test
  public void test_omaha_holdem_1472_6s7c7d8dTh_Td5h4cJs_9cAdQcQs_6dKhTs2s() {
    assertEquals(
      "6dKhTs2s 9cAdQcQs Td5h4cJs",
      Solver.process("omaha-holdem 6s7c7d8dTh Td5h4cJs 9cAdQcQs 6dKhTs2s"));
  }

  @Test
  public void test_omaha_holdem_1473_3d5dAhAsJd_4s2s8sJc_TdThTs3c_2c8h9hKh_3s2h5cQd_9dAd6sQs_8d7dTc8c_7h7c6c2d() {
    assertEquals(
      "2c8h9hKh 3s2h5cQd 7h7c6c2d TdThTs3c 4s2s8sJc 8d7dTc8c 9dAd6sQs",
      Solver.process("omaha-holdem 3d5dAhAsJd 4s2s8sJc TdThTs3c 2c8h9hKh 3s2h5cQd 9dAd6sQs 8d7dTc8c 7h7c6c2d"));
  }

  @Test
  public void test_omaha_holdem_1474_2s4cAhJhTd_3sQcQs2c_Ks7c9sJc() {
    assertEquals(
      "Ks7c9sJc 3sQcQs2c",
      Solver.process("omaha-holdem 2s4cAhJhTd 3sQcQs2c Ks7c9sJc"));
  }

  @Test
  public void test_omaha_holdem_1475_2h3s4d5sAs_7cTdKd8c_3c6s6d3h_9c5d3d4c_8d2cKc2s_6cTc4hJd_ThAc7s7d() {
    assertEquals(
      "7cTdKd8c ThAc7s7d 8d2cKc2s 9c5d3d4c 3c6s6d3h=6cTc4hJd",
      Solver.process("omaha-holdem 2h3s4d5sAs 7cTdKd8c 3c6s6d3h 9c5d3d4c 8d2cKc2s 6cTc4hJd ThAc7s7d"));
  }

  @Test
  public void test_omaha_holdem_1476_5sAsKcQdTd_3cKd3d6d_3s7hJd4d_AhQc7c8c_3h6h4s2c_Kh2hQh8s_2s9h9d2d_7sAd8h6s_5dJsAc7d_4cQs5cJh() {
    assertEquals(
      "3h6h4s2c 3s7hJd4d 2s9h9d2d 3cKd3d6d 7sAd8h6s Kh2hQh8s AhQc7c8c 4cQs5cJh=5dJsAc7d",
      Solver.process("omaha-holdem 5sAsKcQdTd 3cKd3d6d 3s7hJd4d AhQc7c8c 3h6h4s2c Kh2hQh8s 2s9h9d2d 7sAd8h6s 5dJsAc7d 4cQs5cJh"));
  }

  @Test
  public void test_omaha_holdem_1477_5c7s9hAcTh_9s7h9dTd_Jc4hQdJs_6dTc2d5h_AhKh8s3h_Ad4d6c5s_Jd3d8dQs_5dTs8cKs() {
    assertEquals(
      "Jc4hQdJs AhKh8s3h 5dTs8cKs=6dTc2d5h Ad4d6c5s 9s7h9dTd Jd3d8dQs",
      Solver.process("omaha-holdem 5c7s9hAcTh 9s7h9dTd Jc4hQdJs 6dTc2d5h AhKh8s3h Ad4d6c5s Jd3d8dQs 5dTs8cKs"));
  }

  @Test
  public void test_omaha_holdem_1478_3h3s5cQhTc_Qs8h7h5s_Js5h7d6s_6dKc2c9h_KdTs2sQc() {
    assertEquals(
      "6dKc2c9h Js5h7d6s Qs8h7h5s KdTs2sQc",
      Solver.process("omaha-holdem 3h3s5cQhTc Qs8h7h5s Js5h7d6s 6dKc2c9h KdTs2sQc"));
  }

  @Test
  public void test_omaha_holdem_1479_5d6c6s7dJh_Ts3h4hJd_8c2hAh9d_Ks2d3dAd_3s6d5cTd_Qh2c2sJs_5s9c8sTh_Jc7c9h9s_QcAsKh4s() {
    assertEquals(
      "Ks2d3dAd=QcAsKh4s Qh2c2sJs Jc7c9h9s Ts3h4hJd 5s9c8sTh=8c2hAh9d 3s6d5cTd",
      Solver.process("omaha-holdem 5d6c6s7dJh Ts3h4hJd 8c2hAh9d Ks2d3dAd 3s6d5cTd Qh2c2sJs 5s9c8sTh Jc7c9h9s QcAsKh4s"));
  }

  @Test
  public void test_omaha_holdem_1480_6h7dKcKdTh_Qs3dAd9s_9d7cQd8h_6dJsJh7s_2h5d3cTc_3h2dJd7h_5c4hKhAh_5hAs8s2c_Ks4d3s5s_4c6sTsQc() {
    assertEquals(
      "5hAs8s2c Qs3dAd9s 3h2dJd7h 2h5d3cTc 4c6sTsQc 6dJsJh7s Ks4d3s5s 5c4hKhAh 9d7cQd8h",
      Solver.process("omaha-holdem 6h7dKcKdTh Qs3dAd9s 9d7cQd8h 6dJsJh7s 2h5d3cTc 3h2dJd7h 5c4hKhAh 5hAs8s2c Ks4d3s5s 4c6sTsQc"));
  }

  @Test
  public void test_omaha_holdem_1481_4d4s9hTdTh_As6h5d2s_Ad3cJs8s_Jd2hJc7h_5s8dQc3s_6cKd6d5h_Ah3dTc2c_7c2dQhKh_Kc4h8cKs() {
    assertEquals(
      "5s8dQc3s 7c2dQhKh As6h5d2s Ad3cJs8s 6cKd6d5h Jd2hJc7h Kc4h8cKs Ah3dTc2c",
      Solver.process("omaha-holdem 4d4s9hTdTh As6h5d2s Ad3cJs8s Jd2hJc7h 5s8dQc3s 6cKd6d5h Ah3dTc2c 7c2dQhKh Kc4h8cKs"));
  }

  @Test
  public void test_omaha_holdem_1482_3s4h5s6sJh_Td4dQh2d_Ks8c3h4s_JcKc3dTh() {
    assertEquals(
      "JcKc3dTh Td4dQh2d Ks8c3h4s",
      Solver.process("omaha-holdem 3s4h5s6sJh Td4dQh2d Ks8c3h4s JcKc3dTh"));
  }

  @Test
  public void test_omaha_holdem_1483_2h5c9dJcKc_AcAdKs3d_6dKh7c5d() {
    assertEquals(
      "AcAdKs3d 6dKh7c5d",
      Solver.process("omaha-holdem 2h5c9dJcKc AcAdKs3d 6dKh7c5d"));
  }

  @Test
  public void test_omaha_holdem_1484_3s4h7cJsKc_As6dQhJd_Ad9cTs9s_6s3cKhTc() {
    assertEquals(
      "Ad9cTs9s As6dQhJd 6s3cKhTc",
      Solver.process("omaha-holdem 3s4h7cJsKc As6dQhJd Ad9cTs9s 6s3cKhTc"));
  }

  @Test
  public void test_omaha_holdem_1485_2c4h6c9dKh_AhQc3c8c_Ad5c5dTh_6h9c4cQs_AsTdJdAc_7d3h2sQd_JsJhTs9h_8s5h7s6d() {
    assertEquals(
      "AhQc3c8c 7d3h2sQd Ad5c5dTh 8s5h7s6d JsJhTs9h AsTdJdAc 6h9c4cQs",
      Solver.process("omaha-holdem 2c4h6c9dKh AhQc3c8c Ad5c5dTh 6h9c4cQs AsTdJdAc 7d3h2sQd JsJhTs9h 8s5h7s6d"));
  }

  @Test
  public void test_omaha_holdem_1486_4h9cAhKdKh_3s9h5d6d_7h8h3h7s() {
    assertEquals(
      "3s9h5d6d 7h8h3h7s",
      Solver.process("omaha-holdem 4h9cAhKdKh 3s9h5d6d 7h8h3h7s"));
  }

  @Test
  public void test_omaha_holdem_1487_3c6s7s8hTs_2cJsKd5h_4s3s8cAs_AcAh7h6c() {
    assertEquals(
      "2cJsKd5h AcAh7h6c 4s3s8cAs",
      Solver.process("omaha-holdem 3c6s7s8hTs 2cJsKd5h 4s3s8cAs AcAh7h6c"));
  }

  @Test
  public void test_omaha_holdem_1488_6h7cJdJsTh_4d5c4cTs_KhQcTc9h_6sQh2sKs_7dJh3s3c_9d5dAs8h() {
    assertEquals(
      "6sQh2sKs 4d5c4cTs KhQcTc9h 9d5dAs8h 7dJh3s3c",
      Solver.process("omaha-holdem 6h7cJdJsTh 4d5c4cTs KhQcTc9h 6sQh2sKs 7dJh3s3c 9d5dAs8h"));
  }

  @Test
  public void test_omaha_holdem_1489_2s4h8hAdKd_Qd8d5hTs_AsAh9d5d_3s5sJd9h() {
    assertEquals(
      "Qd8d5hTs AsAh9d5d 3s5sJd9h",
      Solver.process("omaha-holdem 2s4h8hAdKd Qd8d5hTs AsAh9d5d 3s5sJd9h"));
  }

  @Test
  public void test_omaha_holdem_1490_4d5d7cKsTc_7s4hAh2c_KhJd4s3d() {
    assertEquals(
      "7s4hAh2c KhJd4s3d",
      Solver.process("omaha-holdem 4d5d7cKsTc 7s4hAh2c KhJd4s3d"));
  }

  @Test
  public void test_omaha_holdem_1491_3c5d6s7sQs_As3s6cKs_4d8h2d9d_5h7h4s4c_6dAcQh3d_2cKd2sKh_9sJcJhAh() {
    assertEquals(
      "9sJcJhAh 2cKd2sKh 6dAcQh3d 5h7h4s4c 4d8h2d9d As3s6cKs",
      Solver.process("omaha-holdem 3c5d6s7sQs As3s6cKs 4d8h2d9d 5h7h4s4c 6dAcQh3d 2cKd2sKh 9sJcJhAh"));
  }

  @Test
  public void test_omaha_holdem_1492_4h7c9hJcTh_TsTc3d8s_2d5dQcQh_Jd5h2s4d_2c4c6cTd_2h7dKc7h_8h4s5cKd_8cQs6h6s() {
    assertEquals(
      "8h4s5cKd 2d5dQcQh 2c4c6cTd Jd5h2s4d TsTc3d8s 8cQs6h6s 2h7dKc7h",
      Solver.process("omaha-holdem 4h7c9hJcTh TsTc3d8s 2d5dQcQh Jd5h2s4d 2c4c6cTd 2h7dKc7h 8h4s5cKd 8cQs6h6s"));
  }

  @Test
  public void test_omaha_holdem_1493_2c7hJhQdTs_3hTdQs4h_2d8sAc8c_5s3cQh3s_6d7s8d5h_6h2sAd9c() {
    assertEquals(
      "6h2sAd9c 6d7s8d5h 2d8sAc8c 5s3cQh3s 3hTdQs4h",
      Solver.process("omaha-holdem 2c7hJhQdTs 3hTdQs4h 2d8sAc8c 5s3cQh3s 6d7s8d5h 6h2sAd9c"));
  }

  @Test
  public void test_omaha_holdem_1494_2s4c6hQcQd_Jh2cTdQs_5hAsQhJd_5sKc3hJc() {
    assertEquals(
      "5hAsQhJd 5sKc3hJc Jh2cTdQs",
      Solver.process("omaha-holdem 2s4c6hQcQd Jh2cTdQs 5hAsQhJd 5sKc3hJc"));
  }

  @Test
  public void test_omaha_holdem_1495_6d9cAdAsQs_9h6s6c7c_7sTc3d7d_3h8c2h5c_JcAc3c4h_QdKc5hKh_5s8sQh5d_Ah9s4c7h_Td2s8h9d_2cTh2dJs() {
    assertEquals(
      "3h8c2h5c 2cTh2dJs 7sTc3d7d Td2s8h9d 5s8sQh5d QdKc5hKh JcAc3c4h 9h6s6c7c Ah9s4c7h",
      Solver.process("omaha-holdem 6d9cAdAsQs 9h6s6c7c 7sTc3d7d 3h8c2h5c JcAc3c4h QdKc5hKh 5s8sQh5d Ah9s4c7h Td2s8h9d 2cTh2dJs"));
  }

  @Test
  public void test_omaha_holdem_1496_5h6d8dTcTh_Td3c4hJd_6cTs5s9s_2c3h7h5d_Qc8hKdKc_QsKsKh2h_4d2dQhAc_8c5cAs3d_7c9d4c8s() {
    assertEquals(
      "4d2dQhAc 2c3h7h5d 8c5cAs3d Qc8hKdKc=QsKsKh2h Td3c4hJd 7c9d4c8s 6cTs5s9s",
      Solver.process("omaha-holdem 5h6d8dTcTh Td3c4hJd 6cTs5s9s 2c3h7h5d Qc8hKdKc QsKsKh2h 4d2dQhAc 8c5cAs3d 7c9d4c8s"));
  }

  @Test
  public void test_omaha_holdem_1497_2h7cKdKsQh_4hTs6s2s_9cAsQsTd() {
    assertEquals(
      "4hTs6s2s 9cAsQsTd",
      Solver.process("omaha-holdem 2h7cKdKsQh 4hTs6s2s 9cAsQsTd"));
  }

  @Test
  public void test_omaha_holdem_1498_4c6c9dAhJs_Ad3s6h9s_Td9cKh8s_As2cJh6s() {
    assertEquals(
      "Td9cKh8s Ad3s6h9s As2cJh6s",
      Solver.process("omaha-holdem 4c6c9dAhJs Ad3s6h9s Td9cKh8s As2cJh6s"));
  }

  @Test
  public void test_omaha_holdem_1499_6d6h7h9c9h_TcTh8cQd_7sAs3cJh_Js7c7d5d_Kd5h2h6c_8s9sAh5s_8dQc2c6s() {
    assertEquals(
      "7sAs3cJh 8dQc2c6s 8s9sAh5s TcTh8cQd Kd5h2h6c Js7c7d5d",
      Solver.process("omaha-holdem 6d6h7h9c9h TcTh8cQd 7sAs3cJh Js7c7d5d Kd5h2h6c 8s9sAh5s 8dQc2c6s"));
  }

}
