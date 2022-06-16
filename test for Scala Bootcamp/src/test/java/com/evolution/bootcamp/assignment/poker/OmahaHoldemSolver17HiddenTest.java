
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver17HiddenTest {


  @Test
  public void test_omaha_holdem_4250_3d5d7hAhQd_Kc2d4cAc_6hAd8d9d_Qh8sJs4h_Kh4d6c2h_6s9cAsJh_KdKs8h5s_Qs4sJc3c() {
    assertEquals(
      "Qh8sJs4h KdKs8h5s 6s9cAsJh Qs4sJc3c Kc2d4cAc Kh4d6c2h 6hAd8d9d",
      Solver.process("omaha-holdem 3d5d7hAhQd Kc2d4cAc 6hAd8d9d Qh8sJs4h Kh4d6c2h 6s9cAsJh KdKs8h5s Qs4sJc3c"));
  }

  @Test
  public void test_omaha_holdem_4251_2s5s7c9cAc_Jc7sTdKh_4s5c2d7h_QdAdQcTc_8s3d7dJs() {
    assertEquals(
      "8s3d7dJs Jc7sTdKh 4s5c2d7h QdAdQcTc",
      Solver.process("omaha-holdem 2s5s7c9cAc Jc7sTdKh 4s5c2d7h QdAdQcTc 8s3d7dJs"));
  }

  @Test
  public void test_omaha_holdem_4252_4h8cAcQcQs_8h2cQhTc_2s2hTdKs_3h5cAh4c_Jd6h5h7h_6dQd8s7d_7sKc4d3s() {
    assertEquals(
      "Jd6h5h7h 2s2hTdKs 7sKc4d3s 3h5cAh4c 6dQd8s7d=8h2cQhTc",
      Solver.process("omaha-holdem 4h8cAcQcQs 8h2cQhTc 2s2hTdKs 3h5cAh4c Jd6h5h7h 6dQd8s7d 7sKc4d3s"));
  }

  @Test
  public void test_omaha_holdem_4253_3s6h8dQhTs_3dJd6c4h_Jh2sTcQs_6d8c2d4d_7s5c7c5d_KsKdKc9d() {
    assertEquals(
      "7s5c7c5d KsKdKc9d 3dJd6c4h 6d8c2d4d Jh2sTcQs",
      Solver.process("omaha-holdem 3s6h8dQhTs 3dJd6c4h Jh2sTcQs 6d8c2d4d 7s5c7c5d KsKdKc9d"));
  }

  @Test
  public void test_omaha_holdem_4254_5s6d7cJsTc_5h8cTs9d_7s9sQd5d() {
    assertEquals(
      "7s9sQd5d 5h8cTs9d",
      Solver.process("omaha-holdem 5s6d7cJsTc 5h8cTs9d 7s9sQd5d"));
  }

  @Test
  public void test_omaha_holdem_4255_2d5s7cJhKs_4cKcJsAc_6dAh6cTh_6s7h3d3s_7d9hTcAs_Ad9d2sKd_Td7s5h3h_8d8c9cQs() {
    assertEquals(
      "6dAh6cTh 6s7h3d3s 7d9hTcAs 8d8c9cQs Td7s5h3h Ad9d2sKd 4cKcJsAc",
      Solver.process("omaha-holdem 2d5s7cJhKs 4cKcJsAc 6dAh6cTh 6s7h3d3s 7d9hTcAs Ad9d2sKd Td7s5h3h 8d8c9cQs"));
  }

  @Test
  public void test_omaha_holdem_4256_4d6d7s9cJd_8s6s7c2c_3dKsQh5h_AdTh9h6c_Jh8hTsQd() {
    assertEquals(
      "8s6s7c2c AdTh9h6c 3dKsQh5h Jh8hTsQd",
      Solver.process("omaha-holdem 4d6d7s9cJd 8s6s7c2c 3dKsQh5h AdTh9h6c Jh8hTsQd"));
  }

  @Test
  public void test_omaha_holdem_4257_3c4c5c8hJh_Qs6c8s5s_2sAhTdKs_4s7s8cQc() {
    assertEquals(
      "Qs6c8s5s 2sAhTdKs 4s7s8cQc",
      Solver.process("omaha-holdem 3c4c5c8hJh Qs6c8s5s 2sAhTdKs 4s7s8cQc"));
  }

  @Test
  public void test_omaha_holdem_4258_4d6h7c7sJc_2s3h4c6d_Qd5cKc5s_4s8cAdQc_4hKh8hKs_Ac6s6cAs_2hJd9h9c_5d3dTcTs_2cJs9s3c_8s3sQsAh() {
    assertEquals(
      "8s3sQsAh 4s8cAdQc Qd5cKc5s 2s3h4c6d 2cJs9s3c=2hJd9h9c 4hKh8hKs 5d3dTcTs Ac6s6cAs",
      Solver.process("omaha-holdem 4d6h7c7sJc 2s3h4c6d Qd5cKc5s 4s8cAdQc 4hKh8hKs Ac6s6cAs 2hJd9h9c 5d3dTcTs 2cJs9s3c 8s3sQsAh"));
  }

  @Test
  public void test_omaha_holdem_4259_2h2s5sKhQh_4cJcAc4s_As7sKd6h_7h4dJs8s_4hQs7cQc() {
    assertEquals(
      "7h4dJs8s 4cJcAc4s As7sKd6h 4hQs7cQc",
      Solver.process("omaha-holdem 2h2s5sKhQh 4cJcAc4s As7sKd6h 7h4dJs8s 4hQs7cQc"));
  }

  @Test
  public void test_omaha_holdem_4260_2s8c9dQdQs_Jc2dAcQh_AsTs5s3s_KcKd8sJd_3hTc5h9h_3c4cTh3d_7d4s7h4h_5dAh6hAd_2h6s7c6c_7sKsTd8h() {
    assertEquals(
      "AsTs5s3s 3c4cTh3d 2h6s7c6c 7d4s7h4h 7sKsTd8h 3hTc5h9h KcKd8sJd 5dAh6hAd Jc2dAcQh",
      Solver.process("omaha-holdem 2s8c9dQdQs Jc2dAcQh AsTs5s3s KcKd8sJd 3hTc5h9h 3c4cTh3d 7d4s7h4h 5dAh6hAd 2h6s7c6c 7sKsTd8h"));
  }

  @Test
  public void test_omaha_holdem_4261_3s6s9c9dAs_7c8s5d4h_3c8hJs2h_7d2d3h7h_QdAhAdJh() {
    assertEquals(
      "7c8s5d4h 3c8hJs2h 7d2d3h7h QdAhAdJh",
      Solver.process("omaha-holdem 3s6s9c9dAs 7c8s5d4h 3c8hJs2h 7d2d3h7h QdAhAdJh"));
  }

  @Test
  public void test_omaha_holdem_4262_3c6sAhJcJh_2c7d8c4s_8s6d8d7c_Ad5s5d4c_6h9s9dTh() {
    assertEquals(
      "2c7d8c4s 8s6d8d7c 6h9s9dTh Ad5s5d4c",
      Solver.process("omaha-holdem 3c6sAhJcJh 2c7d8c4s 8s6d8d7c Ad5s5d4c 6h9s9dTh"));
  }

  @Test
  public void test_omaha_holdem_4263_3d8h9cKcTc_8c5sJsTd_6h6s2c3s() {
    assertEquals(
      "6h6s2c3s 8c5sJsTd",
      Solver.process("omaha-holdem 3d8h9cKcTc 8c5sJsTd 6h6s2c3s"));
  }

  @Test
  public void test_omaha_holdem_4264_3d5c8h9c9s_5hJdQd8c_TdTh2h8s_7dAd6cQc() {
    assertEquals(
      "5hJdQd8c TdTh2h8s 7dAd6cQc",
      Solver.process("omaha-holdem 3d5c8h9c9s 5hJdQd8c TdTh2h8s 7dAd6cQc"));
  }

  @Test
  public void test_omaha_holdem_4265_2c6d8d9dQd_5cAs3sTh_6s2dTd4s_7h4cKdAd() {
    assertEquals(
      "5cAs3sTh 6s2dTd4s 7h4cKdAd",
      Solver.process("omaha-holdem 2c6d8d9dQd 5cAs3sTh 6s2dTd4s 7h4cKdAd"));
  }

  @Test
  public void test_omaha_holdem_4266_4c5h9cAhKc_6s2c8h3c_7cQc8dJd_9hTc9d2d_4d9sJsTh_AcQd6dAd_4s3s6hTd_Qh2sJhJc() {
    assertEquals(
      "4s3s6hTd Qh2sJhJc 4d9sJsTh 9hTc9d2d AcQd6dAd 6s2c8h3c 7cQc8dJd",
      Solver.process("omaha-holdem 4c5h9cAhKc 6s2c8h3c 7cQc8dJd 9hTc9d2d 4d9sJsTh AcQd6dAd 4s3s6hTd Qh2sJhJc"));
  }

  @Test
  public void test_omaha_holdem_4267_6c7d7hAhKc_QdJhAc8d_Td2d9c2c_2h2s8c3h_9s5h3s7c() {
    assertEquals(
      "2h2s8c3h=Td2d9c2c QdJhAc8d 9s5h3s7c",
      Solver.process("omaha-holdem 6c7d7hAhKc QdJhAc8d Td2d9c2c 2h2s8c3h 9s5h3s7c"));
  }

  @Test
  public void test_omaha_holdem_4268_5c8cJcKsTs_3d9d2hTh_7sJd4d4c_KdAd8h2d_6dAcAs7h_6h2cQcTd_4s3cKhQh() {
    assertEquals(
      "3d9d2hTh 7sJd4d4c 4s3cKhQh 6dAcAs7h KdAd8h2d 6h2cQcTd",
      Solver.process("omaha-holdem 5c8cJcKsTs 3d9d2hTh 7sJd4d4c KdAd8h2d 6dAcAs7h 6h2cQcTd 4s3cKhQh"));
  }

  @Test
  public void test_omaha_holdem_4269_5c5hAcAhKs_JcJhQc7c_5s3d4s5d_3c2dJdKh() {
    assertEquals(
      "JcJhQc7c 3c2dJdKh 5s3d4s5d",
      Solver.process("omaha-holdem 5c5hAcAhKs JcJhQc7c 5s3d4s5d 3c2dJdKh"));
  }

  @Test
  public void test_omaha_holdem_4270_6s9sJhKcQc_4s2s9d3d_ThKsTdKd_7c2h5d8c_5cKh2c8d_Tc9hAd8s_QhTs9cQd_7sAcJc6c() {
    assertEquals(
      "7c2h5d8c 4s2s9d3d 5cKh2c8d 7sAcJc6c QhTs9cQd=ThKsTdKd Tc9hAd8s",
      Solver.process("omaha-holdem 6s9sJhKcQc 4s2s9d3d ThKsTdKd 7c2h5d8c 5cKh2c8d Tc9hAd8s QhTs9cQd 7sAcJc6c"));
  }

  @Test
  public void test_omaha_holdem_4271_4h5c7hAhKs_Qs5s3s6h_Ac6c3h2h_JcKc5hTd_9cKh3dQh() {
    assertEquals(
      "JcKc5hTd Qs5s3s6h Ac6c3h2h 9cKh3dQh",
      Solver.process("omaha-holdem 4h5c7hAhKs Qs5s3s6h Ac6c3h2h JcKc5hTd 9cKh3dQh"));
  }

  @Test
  public void test_omaha_holdem_4272_3s7c7dKhQh_Kd4dAd4h_Qs4c9dQc_5cJd8d6c_5d3hAcTc_7s6h4s9c_3d8c9s6d_JhAh5hTd() {
    assertEquals(
      "5cJd8d6c JhAh5hTd 3d8c9s6d 5d3hAcTc Kd4dAd4h 7s6h4s9c Qs4c9dQc",
      Solver.process("omaha-holdem 3s7c7dKhQh Kd4dAd4h Qs4c9dQc 5cJd8d6c 5d3hAcTc 7s6h4s9c 3d8c9s6d JhAh5hTd"));
  }

  @Test
  public void test_omaha_holdem_4273_3s8hJcJdTh_6s8s7s2d_3dAcAh4h_Td2s9h5s() {
    assertEquals(
      "6s8s7s2d Td2s9h5s 3dAcAh4h",
      Solver.process("omaha-holdem 3s8hJcJdTh 6s8s7s2d 3dAcAh4h Td2s9h5s"));
  }

  @Test
  public void test_omaha_holdem_4274_3s5d6dJdTd_9h6c7h8s_3cAcAhQc_2s7c3h6h_Ts4cKsQh_JsKd2c8d_7s2h2d7d_5cKh9d4d_AdQdJc8h() {
    assertEquals(
      "9h6c7h8s Ts4cKsQh 3cAcAhQc 2s7c3h6h 7s2h2d7d 5cKh9d4d JsKd2c8d AdQdJc8h",
      Solver.process("omaha-holdem 3s5d6dJdTd 9h6c7h8s 3cAcAhQc 2s7c3h6h Ts4cKsQh JsKd2c8d 7s2h2d7d 5cKh9d4d AdQdJc8h"));
  }

  @Test
  public void test_omaha_holdem_4275_3d4s8c8sJh_4h3h6h2h_JdAd7s7h() {
    assertEquals(
      "4h3h6h2h JdAd7s7h",
      Solver.process("omaha-holdem 3d4s8c8sJh 4h3h6h2h JdAd7s7h"));
  }

  @Test
  public void test_omaha_holdem_4276_4c6s9dQcTd_TsKh6hKs_Kd9c7d4s_5h2h5s8d_JdAhTh7s_Qd8cQsKc_6d3s5c8h_AsAc3c5d() {
    assertEquals(
      "5h2h5s8d 6d3s5c8h JdAhTh7s AsAc3c5d Kd9c7d4s TsKh6hKs Qd8cQsKc",
      Solver.process("omaha-holdem 4c6s9dQcTd TsKh6hKs Kd9c7d4s 5h2h5s8d JdAhTh7s Qd8cQsKc 6d3s5c8h AsAc3c5d"));
  }

  @Test
  public void test_omaha_holdem_4277_2h5d8hJdKs_2c9c6cTc_Kc3sAs3c_9hKhQdJc_Ts9d8s2d() {
    assertEquals(
      "2c9c6cTc Kc3sAs3c Ts9d8s2d 9hKhQdJc",
      Solver.process("omaha-holdem 2h5d8hJdKs 2c9c6cTc Kc3sAs3c 9hKhQdJc Ts9d8s2d"));
  }

  @Test
  public void test_omaha_holdem_4278_5h8h8sQdTs_7c7h3d8c_6dTh3s8d_AsJs6s2d_Ad7s3c5s() {
    assertEquals(
      "AsJs6s2d Ad7s3c5s 7c7h3d8c 6dTh3s8d",
      Solver.process("omaha-holdem 5h8h8sQdTs 7c7h3d8c 6dTh3s8d AsJs6s2d Ad7s3c5s"));
  }

  @Test
  public void test_omaha_holdem_4279_4s7c7s8d9c_7h5h8h3h_Jd6c7dKh() {
    assertEquals(
      "Jd6c7dKh 7h5h8h3h",
      Solver.process("omaha-holdem 4s7c7s8d9c 7h5h8h3h Jd6c7dKh"));
  }

  @Test
  public void test_omaha_holdem_4280_5cAdKcKsTh_4hJs5s8h_8d6hKhQc_Td7c9d2s_QdJh2h2c() {
    assertEquals(
      "4hJs5s8h Td7c9d2s 8d6hKhQc QdJh2h2c",
      Solver.process("omaha-holdem 5cAdKcKsTh 4hJs5s8h 8d6hKhQc Td7c9d2s QdJh2h2c"));
  }

  @Test
  public void test_omaha_holdem_4281_2h5h8c8sTc_5c9sAd3d_3c7h7s7d_KcJhKhJs_4hQcTd8h_Qs8dQh4s() {
    assertEquals(
      "5c9sAd3d 3c7h7s7d KcJhKhJs Qs8dQh4s 4hQcTd8h",
      Solver.process("omaha-holdem 2h5h8c8sTc 5c9sAd3d 3c7h7s7d KcJhKhJs 4hQcTd8h Qs8dQh4s"));
  }

  @Test
  public void test_omaha_holdem_4282_3d9sAcJsQd_7h3cQs4s_8h6sJh9d_QcTdJd4c_5cAh3hTc_5dQhJc2c_Ts8c7c6h_As8s6c9h_7s5sKhAd_2dKc6dTh() {
    assertEquals(
      "7s5sKhAd 8h6sJh9d 7h3cQs4s 5dQhJc2c=QcTdJd4c 5cAh3hTc As8s6c9h Ts8c7c6h 2dKc6dTh",
      Solver.process("omaha-holdem 3d9sAcJsQd 7h3cQs4s 8h6sJh9d QcTdJd4c 5cAh3hTc 5dQhJc2c Ts8c7c6h As8s6c9h 7s5sKhAd 2dKc6dTh"));
  }

  @Test
  public void test_omaha_holdem_4283_2c2h3c5cTh_6h2s8s9h_9sTdKs9c_7c2dQc4s_6cQsKd5s_QhJs5dKh_4cAhAcJd_Ad7sKcTc() {
    assertEquals(
      "6cQsKd5s=QhJs5dKh 9sTdKs9c 6h2s8s9h 7c2dQc4s Ad7sKcTc 4cAhAcJd",
      Solver.process("omaha-holdem 2c2h3c5cTh 6h2s8s9h 9sTdKs9c 7c2dQc4s 6cQsKd5s QhJs5dKh 4cAhAcJd Ad7sKcTc"));
  }

  @Test
  public void test_omaha_holdem_4284_3h4d8sAcKs_As5h5d6h_Th8d7h2s_9hTd3c6c_Qd3d5s5c_Qc8c2d8h_AhKcAdKh() {
    assertEquals(
      "9hTd3c6c Qd3d5s5c Th8d7h2s As5h5d6h Qc8c2d8h AhKcAdKh",
      Solver.process("omaha-holdem 3h4d8sAcKs As5h5d6h Th8d7h2s 9hTd3c6c Qd3d5s5c Qc8c2d8h AhKcAdKh"));
  }

  @Test
  public void test_omaha_holdem_4285_3c5d7dAsJs_Kh6d5h8s_7c6s4h2c_Jc3dKd6h() {
    assertEquals(
      "Kh6d5h8s Jc3dKd6h 7c6s4h2c",
      Solver.process("omaha-holdem 3c5d7dAsJs Kh6d5h8s 7c6s4h2c Jc3dKd6h"));
  }

  @Test
  public void test_omaha_holdem_4286_4s7s8c8sQh_6c2s3c7c_2dJhQs9d() {
    assertEquals(
      "6c2s3c7c 2dJhQs9d",
      Solver.process("omaha-holdem 4s7s8c8sQh 6c2s3c7c 2dJhQs9d"));
  }

  @Test
  public void test_omaha_holdem_4287_3c3s6sKsQs_Kc3h4c7c_Td2c2s7d_Ts4h9h8s() {
    assertEquals(
      "Td2c2s7d Ts4h9h8s Kc3h4c7c",
      Solver.process("omaha-holdem 3c3s6sKsQs Kc3h4c7c Td2c2s7d Ts4h9h8s"));
  }

  @Test
  public void test_omaha_holdem_4288_2c3h6sJsKd_Kh4s8hAc_4cAhKs2h_Jd6d7hAs_AdQc4dJc_9h3d7c3c_6c2s3sTh_5dTcQdJh_QhTsTd5c() {
    assertEquals(
      "QhTsTd5c 5dTcQdJh AdQc4dJc Kh4s8hAc 6c2s3sTh Jd6d7hAs 4cAhKs2h 9h3d7c3c",
      Solver.process("omaha-holdem 2c3h6sJsKd Kh4s8hAc 4cAhKs2h Jd6d7hAs AdQc4dJc 9h3d7c3c 6c2s3sTh 5dTcQdJh QhTsTd5c"));
  }

  @Test
  public void test_omaha_holdem_4289_2d7s8s9dQd_8h6s5h5s_8c9sTdJd_6hTsQhJh_5d4c7c2h_4dKcTc9c_Kd5cQcTh_3sAcQs4s_Js3hAsKs() {
    assertEquals(
      "Js3hAsKs 4dKcTc9c Kd5cQcTh 3sAcQs4s 5d4c7c2h 8h6s5h5s 6hTsQhJh 8c9sTdJd",
      Solver.process("omaha-holdem 2d7s8s9dQd 8h6s5h5s 8c9sTdJd 6hTsQhJh 5d4c7c2h 4dKcTc9c Kd5cQcTh 3sAcQs4s Js3hAsKs"));
  }

  @Test
  public void test_omaha_holdem_4290_3d4h5s8d9h_8h7s3sQc_Kd9d4cJs_KsTcKcTh_2h2cQdAc_9s6hJc2d_5d7hTdTs_7d2s8c5h() {
    assertEquals(
      "5d7hTdTs KsTcKcTh 8h7s3sQc 7d2s8c5h Kd9d4cJs 2h2cQdAc 9s6hJc2d",
      Solver.process("omaha-holdem 3d4h5s8d9h 8h7s3sQc Kd9d4cJs KsTcKcTh 2h2cQdAc 9s6hJc2d 5d7hTdTs 7d2s8c5h"));
  }

  @Test
  public void test_omaha_holdem_4291_2d3s5s7dAs_6c7s7cQs_9sKsJhAc_Ah2s3cJd_ThKh4d9h_Qd6sAd6h_QhJs5cKd_3h9d4s8d_TcTd8hTs() {
    assertEquals(
      "ThKh4d9h QhJs5cKd TcTd8hTs Qd6sAd6h Ah2s3cJd 3h9d4s8d 6c7s7cQs 9sKsJhAc",
      Solver.process("omaha-holdem 2d3s5s7dAs 6c7s7cQs 9sKsJhAc Ah2s3cJd ThKh4d9h Qd6sAd6h QhJs5cKd 3h9d4s8d TcTd8hTs"));
  }

  @Test
  public void test_omaha_holdem_4292_4c5h6s7c8s_5d4d8d6h_AhAsQc3c_Qs5sTsKd_3d2c4s8h_Jc7d2sKh_Jh3hQdAd() {
    assertEquals(
      "Jh3hQdAd Qs5sTsKd Jc7d2sKh AhAsQc3c 3d2c4s8h=5d4d8d6h",
      Solver.process("omaha-holdem 4c5h6s7c8s 5d4d8d6h AhAsQc3c Qs5sTsKd 3d2c4s8h Jc7d2sKh Jh3hQdAd"));
  }

  @Test
  public void test_omaha_holdem_4293_5d5hJdQhTd_7sKh8hQc_Ad7c7d6h() {
    assertEquals(
      "7sKh8hQc Ad7c7d6h",
      Solver.process("omaha-holdem 5d5hJdQhTd 7sKh8hQc Ad7c7d6h"));
  }

  @Test
  public void test_omaha_holdem_4294_5d5h5s7hQd_2c6d4d7c_ThQcJh5c_6c8cAsTc_7sQs6sTs_4sJd3dQh() {
    assertEquals(
      "2c6d4d7c 7sQs6sTs 4sJd3dQh 6c8cAsTc ThQcJh5c",
      Solver.process("omaha-holdem 5d5h5s7hQd 2c6d4d7c ThQcJh5c 6c8cAsTc 7sQs6sTs 4sJd3dQh"));
  }

  @Test
  public void test_omaha_holdem_4295_2c3c7hJcTc_Qc2d5s7c_3s9h2s4s_6dJd6sKs_Js9dQh3h_Qd8s8hTs_2hKcAcAh_8cTd9cKh_JhAs9s5c_Qs3dKd7d() {
    assertEquals(
      "Qd8s8hTs 6dJd6sKs JhAs9s5c 3s9h2s4s Qs3dKd7d Js9dQh3h 8cTd9cKh Qc2d5s7c 2hKcAcAh",
      Solver.process("omaha-holdem 2c3c7hJcTc Qc2d5s7c 3s9h2s4s 6dJd6sKs Js9dQh3h Qd8s8hTs 2hKcAcAh 8cTd9cKh JhAs9s5c Qs3dKd7d"));
  }

  @Test
  public void test_omaha_holdem_4296_4d5h6hTdTs_Jd6d2hKh_5s7c9h7s_Jc9cJsAh_KdAs9dTc_KsAc2d4c_Jh8c3dTh_Ad4hKc5d_9s8d7hQh() {
    assertEquals(
      "KsAc2d4c Ad4hKc5d Jd6d2hKh 5s7c9h7s Jc9cJsAh Jh8c3dTh KdAs9dTc 9s8d7hQh",
      Solver.process("omaha-holdem 4d5h6hTdTs Jd6d2hKh 5s7c9h7s Jc9cJsAh KdAs9dTc KsAc2d4c Jh8c3dTh Ad4hKc5d 9s8d7hQh"));
  }

  @Test
  public void test_omaha_holdem_4297_5d6dKsQcTd_9cAd7d2c_8d5s6s6h_8s7c8cJc_3d8h3c6c_9h4s5cAh() {
    assertEquals(
      "9h4s5cAh 3d8h3c6c 8s7c8cJc 8d5s6s6h 9cAd7d2c",
      Solver.process("omaha-holdem 5d6dKsQcTd 9cAd7d2c 8d5s6s6h 8s7c8cJc 3d8h3c6c 9h4s5cAh"));
  }

  @Test
  public void test_omaha_holdem_4298_3d4s7dJdJs_Qs7h3h7s_Qh9d3cTh_5s2c2d6s_5d2h3sTc() {
    assertEquals(
      "5d2h3sTc Qh9d3cTh 5s2c2d6s Qs7h3h7s",
      Solver.process("omaha-holdem 3d4s7dJdJs Qs7h3h7s Qh9d3cTh 5s2c2d6s 5d2h3sTc"));
  }

  @Test
  public void test_omaha_holdem_4299_3s7c8c9cKd_Jc5hTd6c_3h7sKh5s_TsTc9dAd_6hJd4h8s_Ah7hJh6d_3d2c5c7d_3c2h9h9s() {
    assertEquals(
      "Ah7hJh6d 6hJd4h8s TsTc9dAd 3h7sKh5s 3c2h9h9s 3d2c5c7d Jc5hTd6c",
      Solver.process("omaha-holdem 3s7c8c9cKd Jc5hTd6c 3h7sKh5s TsTc9dAd 6hJd4h8s Ah7hJh6d 3d2c5c7d 3c2h9h9s"));
  }

  @Test
  public void test_omaha_holdem_4300_4s6c6dAhJs_7h8h7cKh_4c9dAs6s_2h8d3h2s_3s4hAdKc_5s5d5cTs_Jc4dQsAc_8sJh7sKs() {
    assertEquals(
      "2h8d3h2s 5s5d5cTs 7h8h7cKh 8sJh7sKs 3s4hAdKc Jc4dQsAc 4c9dAs6s",
      Solver.process("omaha-holdem 4s6c6dAhJs 7h8h7cKh 4c9dAs6s 2h8d3h2s 3s4hAdKc 5s5d5cTs Jc4dQsAc 8sJh7sKs"));
  }

  @Test
  public void test_omaha_holdem_4301_2s6c9cJdQh_5dQc8c3s_4d8sJc9s_3cQdTd8d_4hAs3d6s_4c6dKdKs_6h7c3h2d_AhJh7hKh_9d5sKcQs() {
    assertEquals(
      "4hAs3d6s AhJh7hKh 5dQc8c3s 4c6dKdKs 6h7c3h2d 4d8sJc9s 9d5sKcQs 3cQdTd8d",
      Solver.process("omaha-holdem 2s6c9cJdQh 5dQc8c3s 4d8sJc9s 3cQdTd8d 4hAs3d6s 4c6dKdKs 6h7c3h2d AhJh7hKh 9d5sKcQs"));
  }

  @Test
  public void test_omaha_holdem_4302_2d3c3s5dJs_8d2h9c2s_4c3hTd4h() {
    assertEquals(
      "4c3hTd4h 8d2h9c2s",
      Solver.process("omaha-holdem 2d3c3s5dJs 8d2h9c2s 4c3hTd4h"));
  }

  @Test
  public void test_omaha_holdem_4303_3c3d5h8cKc_JhJd6sJc_QsQc2hJs_Ac8d9h6d_3h7c4c9c() {
    assertEquals(
      "Ac8d9h6d JhJd6sJc QsQc2hJs 3h7c4c9c",
      Solver.process("omaha-holdem 3c3d5h8cKc JhJd6sJc QsQc2hJs Ac8d9h6d 3h7c4c9c"));
  }

  @Test
  public void test_omaha_holdem_4304_2c9sQhQsTh_Kc2h9h7h_3hAhKd7d_6d9d5cJd_2s2d4s4c_AcQc8sKs_9c4h8cAs_8dJsJc7s() {
    assertEquals(
      "3hAhKd7d 6d9d5cJd Kc2h9h7h 9c4h8cAs AcQc8sKs 8dJsJc7s 2s2d4s4c",
      Solver.process("omaha-holdem 2c9sQhQsTh Kc2h9h7h 3hAhKd7d 6d9d5cJd 2s2d4s4c AcQc8sKs 9c4h8cAs 8dJsJc7s"));
  }

  @Test
  public void test_omaha_holdem_4305_3d8d9hKcKh_8hJdJhQh_QcQd6h9c_QsAh9sKd() {
    assertEquals(
      "8hJdJhQh QcQd6h9c QsAh9sKd",
      Solver.process("omaha-holdem 3d8d9hKcKh 8hJdJhQh QcQd6h9c QsAh9sKd"));
  }

  @Test
  public void test_omaha_holdem_4306_5c8d9sAcKc_7c4h8cJd_2d2c6s9c_Kd8s8hQd_Td2sJh2h_Th3s7s4c_7d7hAhJs() {
    assertEquals(
      "Th3s7s4c Td2sJh2h 7d7hAhJs Kd8s8hQd 7c4h8cJd 2d2c6s9c",
      Solver.process("omaha-holdem 5c8d9sAcKc 7c4h8cJd 2d2c6s9c Kd8s8hQd Td2sJh2h Th3s7s4c 7d7hAhJs"));
  }

  @Test
  public void test_omaha_holdem_4307_5s9hAcKsTd_TcThKd2h_7d8d3cJs_8sAdKc6h_KhQh5cJd() {
    assertEquals(
      "7d8d3cJs 8sAdKc6h TcThKd2h KhQh5cJd",
      Solver.process("omaha-holdem 5s9hAcKsTd TcThKd2h 7d8d3cJs 8sAdKc6h KhQh5cJd"));
  }

  @Test
  public void test_omaha_holdem_4308_2h7d8sAdAs_Jc8hQsTd_9hQc7h6d_6s3h5h4c_2s9cJdTh_6c6h4dTc_4h8dKsTs_3d3c5sKh_Kc2d3sJs_5cQd7s7c() {
    assertEquals(
      "6s3h5h4c 2s9cJdTh Kc2d3sJs 3d3c5sKh 6c6h4dTc 9hQc7h6d Jc8hQsTd 4h8dKsTs 5cQd7s7c",
      Solver.process("omaha-holdem 2h7d8sAdAs Jc8hQsTd 9hQc7h6d 6s3h5h4c 2s9cJdTh 6c6h4dTc 4h8dKsTs 3d3c5sKh Kc2d3sJs 5cQd7s7c"));
  }

  @Test
  public void test_omaha_holdem_4309_3h8sKcQcQs_Kh4h7h2d_Td9c2s4d_6d5h9d7s_8d8cQdAd_JdAsThAh_4cJhTs4s() {
    assertEquals(
      "6d5h9d7s Td9c2s4d 4cJhTs4s Kh4h7h2d JdAsThAh 8d8cQdAd",
      Solver.process("omaha-holdem 3h8sKcQcQs Kh4h7h2d Td9c2s4d 6d5h9d7s 8d8cQdAd JdAsThAh 4cJhTs4s"));
  }

  @Test
  public void test_omaha_holdem_4310_3d3s6c7c8c_6dTd4d4h_Ts8sQdTh_Qs5cKc4s_Js6s5d9s_Jd2h5s7s() {
    assertEquals(
      "6dTd4d4h Jd2h5s7s Ts8sQdTh Js6s5d9s Qs5cKc4s",
      Solver.process("omaha-holdem 3d3s6c7c8c 6dTd4d4h Ts8sQdTh Qs5cKc4s Js6s5d9s Jd2h5s7s"));
  }

  @Test
  public void test_omaha_holdem_4311_6h7d9cAsQh_6cAd2hAh_Js7s2c9d_5hTdTh5c_Jd4s7c3h_Kd4h9h3d_5s2d7hKc_TcQs8sJh_JcTs8cQc() {
    assertEquals(
      "Jd4s7c3h 5s2d7hKc Kd4h9h3d 5hTdTh5c Js7s2c9d 6cAd2hAh JcTs8cQc=TcQs8sJh",
      Solver.process("omaha-holdem 6h7d9cAsQh 6cAd2hAh Js7s2c9d 5hTdTh5c Jd4s7c3h Kd4h9h3d 5s2d7hKc TcQs8sJh JcTs8cQc"));
  }

  @Test
  public void test_omaha_holdem_4312_2d7d7hAhJs_9hQd3sKs_AdJc5hJh_Ac7s5c6s_6hKd4c7c_Ts4s3dQh() {
    assertEquals(
      "Ts4s3dQh 9hQd3sKs 6hKd4c7c Ac7s5c6s AdJc5hJh",
      Solver.process("omaha-holdem 2d7d7hAhJs 9hQd3sKs AdJc5hJh Ac7s5c6s 6hKd4c7c Ts4s3dQh"));
  }

  @Test
  public void test_omaha_holdem_4313_2h8dAcAdJs_6cTd7c5c_9d6d3dJc_8cAs4dQc_7s2s3c6h_4sQs9sAh_7h5dKd8s_4hKs3s8h() {
    assertEquals(
      "6cTd7c5c 7s2s3c6h 4hKs3s8h=7h5dKd8s 9d6d3dJc 4sQs9sAh 8cAs4dQc",
      Solver.process("omaha-holdem 2h8dAcAdJs 6cTd7c5c 9d6d3dJc 8cAs4dQc 7s2s3c6h 4sQs9sAh 7h5dKd8s 4hKs3s8h"));
  }

  @Test
  public void test_omaha_holdem_4314_3s8d8sKcTh_Tc5h9s8c_3d2d3h7s_5d4cKh7d_6sTs9c4s_3cJcKsJh_TdAh7h6c_Ad2cAs2s_4d6dAc5s_8hQcQdKd() {
    assertEquals(
      "4d6dAc5s 6sTs9c4s TdAh7h6c 5d4cKh7d 3cJcKsJh Ad2cAs2s 3d2d3h7s Tc5h9s8c 8hQcQdKd",
      Solver.process("omaha-holdem 3s8d8sKcTh Tc5h9s8c 3d2d3h7s 5d4cKh7d 6sTs9c4s 3cJcKsJh TdAh7h6c Ad2cAs2s 4d6dAc5s 8hQcQdKd"));
  }

  @Test
  public void test_omaha_holdem_4315_3s6s9cJsQc_QhTc8cJd_2d7hTd7d_9s9dKh9h_4dKs2h5s_Kc6hAcTh_4s6dAhJh() {
    assertEquals(
      "2d7hTd7d 4s6dAhJh 9s9dKh9h QhTc8cJd Kc6hAcTh 4dKs2h5s",
      Solver.process("omaha-holdem 3s6s9cJsQc QhTc8cJd 2d7hTd7d 9s9dKh9h 4dKs2h5s Kc6hAcTh 4s6dAhJh"));
  }

  @Test
  public void test_omaha_holdem_4316_5d7c9dKsTh_Qc8s5h2d_6hAh3cJd_Kd5c9c8h_4dQs8dKc_9hQdKhAd_3d4sJc7d_6c3h7h3s_4hAcQh6s_Ts6dTcAs() {
    assertEquals(
      "6hAh3cJd 4hAcQh6s Qc8s5h2d 6c3h7h3s 3d4sJc7d 4dQs8dKc 9hQdKhAd=Kd5c9c8h Ts6dTcAs",
      Solver.process("omaha-holdem 5d7c9dKsTh Qc8s5h2d 6hAh3cJd Kd5c9c8h 4dQs8dKc 9hQdKhAd 3d4sJc7d 6c3h7h3s 4hAcQh6s Ts6dTcAs"));
  }

  @Test
  public void test_omaha_holdem_4317_2s4h6c6hJs_QsQhKs7h_JcAh4d9c_4c8c9h7c_9dJdAcQc() {
    assertEquals(
      "4c8c9h7c 9dJdAcQc=JcAh4d9c QsQhKs7h",
      Solver.process("omaha-holdem 2s4h6c6hJs QsQhKs7h JcAh4d9c 4c8c9h7c 9dJdAcQc"));
  }

  @Test
  public void test_omaha_holdem_4318_5c8h9sJcKc_2c4d3dAh_5h7sQc9d() {
    assertEquals(
      "2c4d3dAh 5h7sQc9d",
      Solver.process("omaha-holdem 5c8h9sJcKc 2c4d3dAh 5h7sQc9d"));
  }

  @Test
  public void test_omaha_holdem_4319_6c7dAsJcQc_9h3c4dAh_Ad2cTh2h_Ac5c3h8d_7c2s6s7s_QhKh9dJd_Qs4h4c2d_9c6d4s6h() {
    assertEquals(
      "Qs4h4c2d 9h3c4dAh Ad2cTh2h QhKh9dJd 9c6d4s6h 7c2s6s7s Ac5c3h8d",
      Solver.process("omaha-holdem 6c7dAsJcQc 9h3c4dAh Ad2cTh2h Ac5c3h8d 7c2s6s7s QhKh9dJd Qs4h4c2d 9c6d4s6h"));
  }

  @Test
  public void test_omaha_holdem_4320_3h6dJdKsQd_AhJh5s4c_Ts3sTcQh_6hAc5d9h_6s7c2d4d_8s4sQs3c_8h8cAd7d() {
    assertEquals(
      "6hAc5d9h AhJh5s4c 8s4sQs3c=Ts3sTcQh 6s7c2d4d 8h8cAd7d",
      Solver.process("omaha-holdem 3h6dJdKsQd AhJh5s4c Ts3sTcQh 6hAc5d9h 6s7c2d4d 8s4sQs3c 8h8cAd7d"));
  }

  @Test
  public void test_omaha_holdem_4321_2d4h7d8cJs_8hKdAhJc_Ks6d5c2c_5d8s6s4s() {
    assertEquals(
      "8hKdAhJc 5d8s6s4s=Ks6d5c2c",
      Solver.process("omaha-holdem 2d4h7d8cJs 8hKdAhJc Ks6d5c2c 5d8s6s4s"));
  }

  @Test
  public void test_omaha_holdem_4322_5d6h7d8cKh_Jc6s4cTs_4d3h2sKs_4h7cAh2h_JsJd8s2d_Qd8h9s8d_Tc5cTh3d() {
    assertEquals(
      "Tc5cTh3d JsJd8s2d 4d3h2sKs 4h7cAh2h=Jc6s4cTs Qd8h9s8d",
      Solver.process("omaha-holdem 5d6h7d8cKh Jc6s4cTs 4d3h2sKs 4h7cAh2h JsJd8s2d Qd8h9s8d Tc5cTh3d"));
  }

  @Test
  public void test_omaha_holdem_4323_2s4c5hAdJh_6sKd6c7s_KsKh8c2h_Qs7d5s8d_6h2cAh9d_5d4hAs9h_Td8h3h9s_Th7c4s9c_3dJs2dQh_Ts7hKcTc() {
    assertEquals(
      "Td8h3h9s Th7c4s9c Qs7d5s8d 6sKd6c7s Ts7hKcTc KsKh8c2h 6h2cAh9d 5d4hAs9h 3dJs2dQh",
      Solver.process("omaha-holdem 2s4c5hAdJh 6sKd6c7s KsKh8c2h Qs7d5s8d 6h2cAh9d 5d4hAs9h Td8h3h9s Th7c4s9c 3dJs2dQh Ts7hKcTc"));
  }

  @Test
  public void test_omaha_holdem_4324_7d7h9hAcJc_8c4d3d7c_6c3sJh6h_Qs9s8h8s_4sKs3h2h() {
    assertEquals(
      "4sKs3h2h Qs9s8h8s 6c3sJh6h 8c4d3d7c",
      Solver.process("omaha-holdem 7d7h9hAcJc 8c4d3d7c 6c3sJh6h Qs9s8h8s 4sKs3h2h"));
  }

  @Test
  public void test_omaha_holdem_4325_3d6h7cQcQh_4c5d6dJh_2h6cAdJs_2d3s5h9h_4h8h5sQd_JdKd9d8c() {
    assertEquals(
      "JdKd9d8c 2d3s5h9h 2h6cAdJs 4c5d6dJh=4h8h5sQd",
      Solver.process("omaha-holdem 3d6h7cQcQh 4c5d6dJh 2h6cAdJs 2d3s5h9h 4h8h5sQd JdKd9d8c"));
  }

  @Test
  public void test_omaha_holdem_4326_2h6c7c9hTh_5dJs3c5c_JdAs4cJh_3dJc9dTd_8s4s6sKs_Qs7hKd8c_8h9sQc3s_2d4dKhQh_8dKc7dTs() {
    assertEquals(
      "5dJs3c5c JdAs4cJh 3dJc9dTd 8dKc7dTs=8h9sQc3s=8s4s6sKs=Qs7hKd8c 2d4dKhQh",
      Solver.process("omaha-holdem 2h6c7c9hTh 5dJs3c5c JdAs4cJh 3dJc9dTd 8s4s6sKs Qs7hKd8c 8h9sQc3s 2d4dKhQh 8dKc7dTs"));
  }

  @Test
  public void test_omaha_holdem_4327_3c3s4s5cAs_9h5dTs4d_4hKc7d8s_Jd3dQsTd_5s2cKhKs() {
    assertEquals(
      "4hKc7d8s 9h5dTs4d Jd3dQsTd 5s2cKhKs",
      Solver.process("omaha-holdem 3c3s4s5cAs 9h5dTs4d 4hKc7d8s Jd3dQsTd 5s2cKhKs"));
  }

  @Test
  public void test_omaha_holdem_4328_9hJcJhJsTc_Ad2c4c5d_3c7sKdAh_Ts2h6sKs_9s8h3d3h_5s7d8dQd_7h2d5c6c() {
    assertEquals(
      "7h2d5c6c Ts2h6sKs Ad2c4c5d 3c7sKdAh 5s7d8dQd 9s8h3d3h",
      Solver.process("omaha-holdem 9hJcJhJsTc Ad2c4c5d 3c7sKdAh Ts2h6sKs 9s8h3d3h 5s7d8dQd 7h2d5c6c"));
  }

  @Test
  public void test_omaha_holdem_4329_9cJcQsTdTh_7c6dQh8s_4d2h5d4s_Tc5h7d3s_2c8c3d6s_5c7hKsQc() {
    assertEquals(
      "2c8c3d6s 4d2h5d4s Tc5h7d3s 7c6dQh8s 5c7hKsQc",
      Solver.process("omaha-holdem 9cJcQsTdTh 7c6dQh8s 4d2h5d4s Tc5h7d3s 2c8c3d6s 5c7hKsQc"));
  }

  @Test
  public void test_omaha_holdem_4330_2d4d4h7cJh_KsThQd8d_Kh9s3c8c() {
    assertEquals(
      "Kh9s3c8c KsThQd8d",
      Solver.process("omaha-holdem 2d4d4h7cJh KsThQd8d Kh9s3c8c"));
  }

  @Test
  public void test_omaha_holdem_4331_3c3d4d8cJc_5h8h7c3s_6dAd6hKh_4s8d6s9d_5d2d7h2h_JsKsQdKc_As7s9h3h_8s4c4hTh_5cAh2s6c_JdJhKd9c() {
    assertEquals(
      "5d2d7h2h 6dAd6hKh 4s8d6s9d JsKsQdKc As7s9h3h 5cAh2s6c 5h8h7c3s 8s4c4hTh JdJhKd9c",
      Solver.process("omaha-holdem 3c3d4d8cJc 5h8h7c3s 6dAd6hKh 4s8d6s9d 5d2d7h2h JsKsQdKc As7s9h3h 8s4c4hTh 5cAh2s6c JdJhKd9c"));
  }

  @Test
  public void test_omaha_holdem_4332_6c9sAsTdTs_5c8d6h3s_Jd7s9h2d_2cTc4d2h_7cJh6sQc_9cKcAhQs_5h8s9dQd_Qh8cAc3h() {
    assertEquals(
      "5c8d6h3s 7cJh6sQc Jd7s9h2d 5h8s9dQd Qh8cAc3h 9cKcAhQs 2cTc4d2h",
      Solver.process("omaha-holdem 6c9sAsTdTs 5c8d6h3s Jd7s9h2d 2cTc4d2h 7cJh6sQc 9cKcAhQs 5h8s9dQd Qh8cAc3h"));
  }

  @Test
  public void test_omaha_holdem_4333_3h8h9dAsQs_JhTcQc7c_Ac3c2h8d_3d7h5c6d() {
    assertEquals(
      "3d7h5c6d Ac3c2h8d JhTcQc7c",
      Solver.process("omaha-holdem 3h8h9dAsQs JhTcQc7c Ac3c2h8d 3d7h5c6d"));
  }

  @Test
  public void test_omaha_holdem_4334_6hAdKdKhKs_8d8s4d3s_8c5sAhTd() {
    assertEquals(
      "8c5sAhTd 8d8s4d3s",
      Solver.process("omaha-holdem 6hAdKdKhKs 8d8s4d3s 8c5sAhTd"));
  }

  @Test
  public void test_omaha_holdem_4335_5d7sAcAdTd_2cQdAh6s_AsJd8d5h() {
    assertEquals(
      "2cQdAh6s AsJd8d5h",
      Solver.process("omaha-holdem 5d7sAcAdTd 2cQdAh6s AsJd8d5h"));
  }

  @Test
  public void test_omaha_holdem_4336_2s7s9cKcKd_3sJh6h3c_8s5h8h8d_KhTs9sAc() {
    assertEquals(
      "3sJh6h3c 8s5h8h8d KhTs9sAc",
      Solver.process("omaha-holdem 2s7s9cKcKd 3sJh6h3c 8s5h8h8d KhTs9sAc"));
  }

  @Test
  public void test_omaha_holdem_4337_3s5h6dAhKd_JcAs6c7h_Tc5c4c8h_2c2sQs4s_3cQc8dTd_9sJd7c5d_9d9c6h4d_6sKs2h5s() {
    assertEquals(
      "3cQc8dTd Tc5c4c8h 9sJd7c5d 9d9c6h4d 6sKs2h5s JcAs6c7h 2c2sQs4s",
      Solver.process("omaha-holdem 3s5h6dAhKd JcAs6c7h Tc5c4c8h 2c2sQs4s 3cQc8dTd 9sJd7c5d 9d9c6h4d 6sKs2h5s"));
  }

  @Test
  public void test_omaha_holdem_4338_6h7cAdJdTc_5d4s4d3d_2s6s7hQs_9c3h7dKc() {
    assertEquals(
      "5d4s4d3d 9c3h7dKc 2s6s7hQs",
      Solver.process("omaha-holdem 6h7cAdJdTc 5d4s4d3d 2s6s7hQs 9c3h7dKc"));
  }

  @Test
  public void test_omaha_holdem_4339_2c3h8sAsKd_Js6d2s2d_Jh3c9s9h_7c4s6hQs_KsTd3s2h_Jd5c7h8d_Th4hQh5d() {
    assertEquals(
      "7c4s6hQs Jd5c7h8d Jh3c9s9h KsTd3s2h Js6d2s2d Th4hQh5d",
      Solver.process("omaha-holdem 2c3h8sAsKd Js6d2s2d Jh3c9s9h 7c4s6hQs KsTd3s2h Jd5c7h8d Th4hQh5d"));
  }

  @Test
  public void test_omaha_holdem_4340_3h6cAhKdKh_9cAdQcJs_5s8h6s4d_9d7h3c4s() {
    assertEquals(
      "9d7h3c4s 5s8h6s4d 9cAdQcJs",
      Solver.process("omaha-holdem 3h6cAhKdKh 9cAdQcJs 5s8h6s4d 9d7h3c4s"));
  }

  @Test
  public void test_omaha_holdem_4341_2h4d7hJsTc_3hKs8dJh_3s5dAdQs_AhQd4c9h_Ac2s6h8c_6d5h9dKd_3d7sKhQc() {
    assertEquals(
      "6d5h9dKd 3s5dAdQs Ac2s6h8c AhQd4c9h 3d7sKhQc 3hKs8dJh",
      Solver.process("omaha-holdem 2h4d7hJsTc 3hKs8dJh 3s5dAdQs AhQd4c9h Ac2s6h8c 6d5h9dKd 3d7sKhQc"));
  }

  @Test
  public void test_omaha_holdem_4342_5c8c8s9cJd_6sAsKd2h_5hTh7c3h_Td2sJc9s_2d3cAc7h_6cKcQh2c_9d3sQc4c_Qd4dJs7s_6h6dKh7d() {
    assertEquals(
      "6sAsKd2h Qd4dJs7s Td2sJc9s 6h6dKh7d 5hTh7c3h 9d3sQc4c 6cKcQh2c 2d3cAc7h",
      Solver.process("omaha-holdem 5c8c8s9cJd 6sAsKd2h 5hTh7c3h Td2sJc9s 2d3cAc7h 6cKcQh2c 9d3sQc4c Qd4dJs7s 6h6dKh7d"));
  }

  @Test
  public void test_omaha_holdem_4343_2s4c8hAhJd_6cTh9s7c_3d2hQc7h_7s5s5hTs_6d3sJcQh_KhQsAc6s_8c5dKs4s() {
    assertEquals(
      "6cTh9s7c 3d2hQc7h 7s5s5hTs 6d3sJcQh KhQsAc6s 8c5dKs4s",
      Solver.process("omaha-holdem 2s4c8hAhJd 6cTh9s7c 3d2hQc7h 7s5s5hTs 6d3sJcQh KhQsAc6s 8c5dKs4s"));
  }

  @Test
  public void test_omaha_holdem_4344_2h4c4d4s7d_Js8h3sQh_Jc5hAdTc_Qs8s3d6c_6h2sQc5d_7sKcKd9s_3cTdQd2d_6s9dKs3h_9c7c8dJd_KhTsAhJh() {
    assertEquals(
      "9c7c8dJd 6h2sQc5d Qs8s3d6c 3cTdQd2d Js8h3sQh 6s9dKs3h Jc5hAdTc KhTsAhJh 7sKcKd9s",
      Solver.process("omaha-holdem 2h4c4d4s7d Js8h3sQh Jc5hAdTc Qs8s3d6c 6h2sQc5d 7sKcKd9s 3cTdQd2d 6s9dKs3h 9c7c8dJd KhTsAhJh"));
  }

  @Test
  public void test_omaha_holdem_4345_3c3d4c6c9h_5d6s7h3s_7sJdAd5s() {
    assertEquals(
      "7sJdAd5s 5d6s7h3s",
      Solver.process("omaha-holdem 3c3d4c6c9h 5d6s7h3s 7sJdAd5s"));
  }

  @Test
  public void test_omaha_holdem_4346_2h8hQcQdTc_5cJhJs3d_5h8s9d7h_7s2d5sJd_3cQsAc4c_Jc8c6c4s_4d9h6sTs_9sQhKs4h() {
    assertEquals(
      "7s2d5sJd 5h8s9d7h Jc8c6c4s 4d9h6sTs 5cJhJs3d 9sQhKs4h 3cQsAc4c",
      Solver.process("omaha-holdem 2h8hQcQdTc 5cJhJs3d 5h8s9d7h 7s2d5sJd 3cQsAc4c Jc8c6c4s 4d9h6sTs 9sQhKs4h"));
  }

  @Test
  public void test_omaha_holdem_4347_6h7c8hKdKs_Ac6cJcKc_6s3cAdTh_2d3d9c8d_Qc5s7dAs_TcTs5cJh() {
    assertEquals(
      "6s3cAdTh Qc5s7dAs 2d3d9c8d TcTs5cJh Ac6cJcKc",
      Solver.process("omaha-holdem 6h7c8hKdKs Ac6cJcKc 6s3cAdTh 2d3d9c8d Qc5s7dAs TcTs5cJh"));
  }

  @Test
  public void test_omaha_holdem_4348_2s3s5h7d9h_8h7c8sJh_JcAc7hQs_3c8cTs9d_QcKh2d4h_4d3dTd6s_6h4sTc2h_Kd4c9sQd_Jd3h6c5s_9c5cAsAh() {
    assertEquals(
      "QcKh2d4h JcAc7hQs 8h7c8sJh Kd4c9sQd Jd3h6c5s 3c8cTs9d 9c5cAsAh 4d3dTd6s=6h4sTc2h",
      Solver.process("omaha-holdem 2s3s5h7d9h 8h7c8sJh JcAc7hQs 3c8cTs9d QcKh2d4h 4d3dTd6s 6h4sTc2h Kd4c9sQd Jd3h6c5s 9c5cAsAh"));
  }

  @Test
  public void test_omaha_holdem_4349_5s8s9dKdTc_6d4s2c9h_Ac7sAh8c_3dJcJhJd_TdQd4cTs_5c9sJsAd_8h3h7c2s() {
    assertEquals(
      "8h3h7c2s 6d4s2c9h 3dJcJhJd Ac7sAh8c 5c9sJsAd TdQd4cTs",
      Solver.process("omaha-holdem 5s8s9dKdTc 6d4s2c9h Ac7sAh8c 3dJcJhJd TdQd4cTs 5c9sJsAd 8h3h7c2s"));
  }

  @Test
  public void test_omaha_holdem_4350_5h8c9dAsQs_5c3c4cAc_Kc8dJd9s_Qh7d6s5d_3s7cKs8h_Jh5s4s8s_Qd3h2dKd() {
    assertEquals(
      "3s7cKs8h Qd3h2dKd Jh5s4s8s Kc8dJd9s 5c3c4cAc Qh7d6s5d",
      Solver.process("omaha-holdem 5h8c9dAsQs 5c3c4cAc Kc8dJd9s Qh7d6s5d 3s7cKs8h Jh5s4s8s Qd3h2dKd"));
  }

  @Test
  public void test_omaha_holdem_4351_2c4d4sAdKs_As6hTd8s_ThAc4h3d() {
    assertEquals(
      "As6hTd8s ThAc4h3d",
      Solver.process("omaha-holdem 2c4d4sAdKs As6hTd8s ThAc4h3d"));
  }

  @Test
  public void test_omaha_holdem_4352_4h8sJcQdTs_6cQc6hKh_Js9h9c8h_7h2d4dQs_KcQh6dTd_9dAhJdAs_3c5sAc2c() {
    assertEquals(
      "3c5sAc2c 6cQc6hKh 7h2d4dQs KcQh6dTd 9dAhJdAs=Js9h9c8h",
      Solver.process("omaha-holdem 4h8sJcQdTs 6cQc6hKh Js9h9c8h 7h2d4dQs KcQh6dTd 9dAhJdAs 3c5sAc2c"));
  }

  @Test
  public void test_omaha_holdem_4353_7s8c8sJdJs_2h2c7h6d_3cAs6c2d_KcQdQc8d() {
    assertEquals(
      "3cAs6c2d 2h2c7h6d KcQdQc8d",
      Solver.process("omaha-holdem 7s8c8sJdJs 2h2c7h6d 3cAs6c2d KcQdQc8d"));
  }

  @Test
  public void test_omaha_holdem_4354_4c7d9c9dAd_5c2h9s5s_7h6d3c3s() {
    assertEquals(
      "7h6d3c3s 5c2h9s5s",
      Solver.process("omaha-holdem 4c7d9c9dAd 5c2h9s5s 7h6d3c3s"));
  }

  @Test
  public void test_omaha_holdem_4355_4d4s5s7sJc_Ah9c5c4c_8d3dQdKh_2d6hJhAd_6d9s5h7c() {
    assertEquals(
      "8d3dQdKh 6d9s5h7c 2d6hJhAd Ah9c5c4c",
      Solver.process("omaha-holdem 4d4s5s7sJc Ah9c5c4c 8d3dQdKh 2d6hJhAd 6d9s5h7c"));
  }

  @Test
  public void test_omaha_holdem_4356_2h3dJcQhQs_6sAh2c5d_5sKd5c2d_8h7hKh9c_3c3h9sTs_7cJh6dJd() {
    assertEquals(
      "8h7hKh9c 6sAh2c5d 5sKd5c2d 3c3h9sTs 7cJh6dJd",
      Solver.process("omaha-holdem 2h3dJcQhQs 6sAh2c5d 5sKd5c2d 8h7hKh9c 3c3h9sTs 7cJh6dJd"));
  }

  @Test
  public void test_omaha_holdem_4357_2c4s6hAdQh_2hTh8c2s_9sKc9c7s_5d2dKdTd_Qc8d8s7d_5hKh8h7c_6c4d3hTs() {
    assertEquals(
      "5hKh8h7c 5d2dKdTd 9sKc9c7s Qc8d8s7d 6c4d3hTs 2hTh8c2s",
      Solver.process("omaha-holdem 2c4s6hAdQh 2hTh8c2s 9sKc9c7s 5d2dKdTd Qc8d8s7d 5hKh8h7c 6c4d3hTs"));
  }

  @Test
  public void test_omaha_holdem_4358_3d8cKdQdTd_2dJs6c2s_5dQs7d8h() {
    assertEquals(
      "2dJs6c2s 5dQs7d8h",
      Solver.process("omaha-holdem 3d8cKdQdTd 2dJs6c2s 5dQs7d8h"));
  }

  @Test
  public void test_omaha_holdem_4359_2h7hJhKhQh_7s3c9d7c_JsKdKs4h_Qd8sTcTh_QsQc5c2s() {
    assertEquals(
      "Qd8sTcTh 7s3c9d7c QsQc5c2s JsKdKs4h",
      Solver.process("omaha-holdem 2h7hJhKhQh 7s3c9d7c JsKdKs4h Qd8sTcTh QsQc5c2s"));
  }

  @Test
  public void test_omaha_holdem_4360_3d5s7h8cKd_7c8s3s9s_Jd4s7s9d_QsAdAs4h_5c9h2cTs_JcKcQh6d_6h9c2d8h_2h5h3c2s_4dAc6c8d_KsQdTd7d() {
    assertEquals(
      "5c9h2cTs Jd4s7s9d JcKcQh6d QsAdAs4h 2h5h3c2s 7c8s3s9s KsQdTd7d 4dAc6c8d 6h9c2d8h",
      Solver.process("omaha-holdem 3d5s7h8cKd 7c8s3s9s Jd4s7s9d QsAdAs4h 5c9h2cTs JcKcQh6d 6h9c2d8h 2h5h3c2s 4dAc6c8d KsQdTd7d"));
  }

  @Test
  public void test_omaha_holdem_4361_2c2s5c9hAs_8hKh7sKs_9c3hQc7h_5s2h9dQd_4sTh9s8c_8s2dJsAc_6dAdTcQh_Qs3cJd3s_Jc6hTd4d() {
    assertEquals(
      "Jc6hTd4d Qs3cJd3s 4sTh9s8c 9c3hQc7h 8hKh7sKs 6dAdTcQh 5s2h9dQd 8s2dJsAc",
      Solver.process("omaha-holdem 2c2s5c9hAs 8hKh7sKs 9c3hQc7h 5s2h9dQd 4sTh9s8c 8s2dJsAc 6dAdTcQh Qs3cJd3s Jc6hTd4d"));
  }

  @Test
  public void test_omaha_holdem_4362_2c6h7cQcQs_8d2d6c9s_Th2hKcJs() {
    assertEquals(
      "Th2hKcJs 8d2d6c9s",
      Solver.process("omaha-holdem 2c6h7cQcQs 8d2d6c9s Th2hKcJs"));
  }

  @Test
  public void test_omaha_holdem_4363_2s3d9dKhTc_Qd3c7h3h_9sQc3s6c_2d6d5s2h_4dQhJsTh_7dAh7s4s_As4h5d9h_Ks8c5c9c() {
    assertEquals(
      "7dAh7s4s As4h5d9h 9sQc3s6c Ks8c5c9c 2d6d5s2h Qd3c7h3h 4dQhJsTh",
      Solver.process("omaha-holdem 2s3d9dKhTc Qd3c7h3h 9sQc3s6c 2d6d5s2h 4dQhJsTh 7dAh7s4s As4h5d9h Ks8c5c9c"));
  }

  @Test
  public void test_omaha_holdem_4364_5s6c9hKhQs_7cJcKd6s_4h7dAdTc_TdJh7sJs_2dKc3d7h_4d2h2cAs_8hTsAh3s_QhQd2s4s_5h8s3cAc_9d8dJd6h() {
    assertEquals(
      "4h7dAdTc=8hTsAh3s 4d2h2cAs 5h8s3cAc 2dKc3d7h 9d8dJd6h 7cJcKd6s QhQd2s4s TdJh7sJs",
      Solver.process("omaha-holdem 5s6c9hKhQs 7cJcKd6s 4h7dAdTc TdJh7sJs 2dKc3d7h 4d2h2cAs 8hTsAh3s QhQd2s4s 5h8s3cAc 9d8dJd6h"));
  }

  @Test
  public void test_omaha_holdem_4365_3c4c9cKcQh_QdQc3hTc_7d8s9hAs_9dAc4dTs_4s7sKhTd_5d8cAd6h_5s6d3d2d_AhKsQsTh_6s4hJh7c_2cJc5cJd() {
    assertEquals(
      "5d8cAd6h 5s6d3d2d 6s4hJh7c 7d8s9hAs 9dAc4dTs 4s7sKhTd AhKsQsTh 2cJc5cJd QdQc3hTc",
      Solver.process("omaha-holdem 3c4c9cKcQh QdQc3hTc 7d8s9hAs 9dAc4dTs 4s7sKhTd 5d8cAd6h 5s6d3d2d AhKsQsTh 6s4hJh7c 2cJc5cJd"));
  }

  @Test
  public void test_omaha_holdem_4366_3c6c7cAsQh_7s9h4sTh_Js9cTs8s() {
    assertEquals(
      "Js9cTs8s 7s9h4sTh",
      Solver.process("omaha-holdem 3c6c7cAsQh 7s9h4sTh Js9cTs8s"));
  }

  @Test
  public void test_omaha_holdem_4367_7c7dAcAdJh_8c4sAh6s_3cQd7h9d_Tc9sAsTs_2sJsKcJc_6cKhQs4d() {
    assertEquals(
      "6cKhQs4d 3cQd7h9d 8c4sAh6s Tc9sAsTs 2sJsKcJc",
      Solver.process("omaha-holdem 7c7dAcAdJh 8c4sAh6s 3cQd7h9d Tc9sAsTs 2sJsKcJc 6cKhQs4d"));
  }

  @Test
  public void test_omaha_holdem_4368_2h8c9dJhTs_3dQh9cAs_8d6hKcKd_5dKh3hAc_5s9h7s6c_Qc3s4dJc() {
    assertEquals(
      "5dKh3hAc 8d6hKcKd 5s9h7s6c 3dQh9cAs=Qc3s4dJc",
      Solver.process("omaha-holdem 2h8c9dJhTs 3dQh9cAs 8d6hKcKd 5dKh3hAc 5s9h7s6c Qc3s4dJc"));
  }

  @Test
  public void test_omaha_holdem_4369_8dAsQhTcTd_9d2d7dAh_6cJs7hJd_QsQcJh8s_9h6d7c4h() {
    assertEquals(
      "9h6d7c4h 6cJs7hJd 9d2d7dAh QsQcJh8s",
      Solver.process("omaha-holdem 8dAsQhTcTd 9d2d7dAh 6cJs7hJd QsQcJh8s 9h6d7c4h"));
  }

  @Test
  public void test_omaha_holdem_4370_3c3s5s7s8s_8dQs7c9s_5d4sAs2s_Tc2d4hQc_7d6d9cAd_6sKhTd4c_6h2hQh8h() {
    assertEquals(
      "Tc2d4hQc 6h2hQh8h 6sKhTd4c 7d6d9cAd 8dQs7c9s 5d4sAs2s",
      Solver.process("omaha-holdem 3c3s5s7s8s 8dQs7c9s 5d4sAs2s Tc2d4hQc 7d6d9cAd 6sKhTd4c 6h2hQh8h"));
  }

  @Test
  public void test_omaha_holdem_4371_2h5c9sAdKc_Td7hAc5s_Ts7sJs4s_TcQh3c6d_3s4d4h5d_2d4c9c3d_As2sKh8d() {
    assertEquals(
      "Ts7sJs4s TcQh3c6d Td7hAc5s As2sKh8d 2d4c9c3d=3s4d4h5d",
      Solver.process("omaha-holdem 2h5c9sAdKc Td7hAc5s Ts7sJs4s TcQh3c6d 3s4d4h5d 2d4c9c3d As2sKh8d"));
  }

  @Test
  public void test_omaha_holdem_4372_5c8cJdJhQd_Qh4s7s6h_9dJsAd6c_2d2hAs2c_6sQcKdKc_TcKhAc8s_3c7d4h5d_7c3s9sKs_5sJcTs4c() {
    assertEquals(
      "7c3s9sKs 2d2hAs2c 3c7d4h5d TcKhAc8s Qh4s7s6h 6sQcKdKc 9dJsAd6c 5sJcTs4c",
      Solver.process("omaha-holdem 5c8cJdJhQd Qh4s7s6h 9dJsAd6c 2d2hAs2c 6sQcKdKc TcKhAc8s 3c7d4h5d 7c3s9sKs 5sJcTs4c"));
  }

  @Test
  public void test_omaha_holdem_4373_2h6s9sAdKs_9cTh2s9h_Qs4c6h3d_8s7sAs7c_9dKcTc3c_Jc6d3s4h_JsJh8h5c_5dKdJd6c_5hKh7h8c() {
    assertEquals(
      "Jc6d3s4h Qs4c6h3d JsJh8h5c 5hKh7h8c 5dKdJd6c 9dKcTc3c 9cTh2s9h 8s7sAs7c",
      Solver.process("omaha-holdem 2h6s9sAdKs 9cTh2s9h Qs4c6h3d 8s7sAs7c 9dKcTc3c Jc6d3s4h JsJh8h5c 5dKdJd6c 5hKh7h8c"));
  }

  @Test
  public void test_omaha_holdem_4374_4d4s5dJdJh_8s5cAs9c_5h7dKhKd_9s4cTc3h_KcQdJs6h_QsAhTs6c() {
    assertEquals(
      "QsAhTs6c 8s5cAs9c 9s4cTc3h KcQdJs6h 5h7dKhKd",
      Solver.process("omaha-holdem 4d4s5dJdJh 8s5cAs9c 5h7dKhKd 9s4cTc3h KcQdJs6h QsAhTs6c"));
  }

  @Test
  public void test_omaha_holdem_4375_2h3c3h4sQs_9c7h6dKd_JdAcKc2d_5cJhAh2c_7d6s7s8s() {
    assertEquals(
      "9c7h6dKd JdAcKc2d 7d6s7s8s 5cJhAh2c",
      Solver.process("omaha-holdem 2h3c3h4sQs 9c7h6dKd JdAcKc2d 5cJhAh2c 7d6s7s8s"));
  }

  @Test
  public void test_omaha_holdem_4376_2s5h6sAcJc_2dKc7dAh_Qs9s7sJd_Kh8s6h8h_Jh6dTc8d() {
    assertEquals(
      "Kh8s6h8h Qs9s7sJd Jh6dTc8d 2dKc7dAh",
      Solver.process("omaha-holdem 2s5h6sAcJc 2dKc7dAh Qs9s7sJd Kh8s6h8h Jh6dTc8d"));
  }

  @Test
  public void test_omaha_holdem_4377_5h7dJdTcTs_Kh4h7s2s_8c7c9c7h_6dThKs2h_JcKd4sAh_5d3d6hJh() {
    assertEquals(
      "Kh4h7s2s 5d3d6hJh JcKd4sAh 6dThKs2h 8c7c9c7h",
      Solver.process("omaha-holdem 5h7dJdTcTs Kh4h7s2s 8c7c9c7h 6dThKs2h JcKd4sAh 5d3d6hJh"));
  }

  @Test
  public void test_omaha_holdem_4378_2s8cAdKcQd_Td4cJs6h_KdQsAh8s_7cTc5d4h_5h6sJh8h_As3s9h9c_9d3c4dKs_2c5c7s7h_3dQh7dTs_2d6cTh9s() {
    assertEquals(
      "7cTc5d4h 2d6cTh9s 2c5c7s7h 5h6sJh8h 3dQh7dTs 9d3c4dKs As3s9h9c KdQsAh8s Td4cJs6h",
      Solver.process("omaha-holdem 2s8cAdKcQd Td4cJs6h KdQsAh8s 7cTc5d4h 5h6sJh8h As3s9h9c 9d3c4dKs 2c5c7s7h 3dQh7dTs 2d6cTh9s"));
  }

  @Test
  public void test_omaha_holdem_4379_4h7d7h8d9c_6s2cThAs_6cQsJh8c() {
    assertEquals(
      "6cQsJh8c 6s2cThAs",
      Solver.process("omaha-holdem 4h7d7h8d9c 6s2cThAs 6cQsJh8c"));
  }

  @Test
  public void test_omaha_holdem_4380_2d4d5s6hAs_KsTd7d8c_JsQsTc3d_JcJd3c5c() {
    assertEquals(
      "JsQsTc3d JcJd3c5c KsTd7d8c",
      Solver.process("omaha-holdem 2d4d5s6hAs KsTd7d8c JsQsTc3d JcJd3c5c"));
  }

  @Test
  public void test_omaha_holdem_4381_2d4d6s9hAs_TcTh6h2c_4hAc8sJs_8cTd7d8d() {
    assertEquals(
      "8cTd7d8d TcTh6h2c 4hAc8sJs",
      Solver.process("omaha-holdem 2d4d6s9hAs TcTh6h2c 4hAc8sJs 8cTd7d8d"));
  }

  @Test
  public void test_omaha_holdem_4382_2h5c7cJcTc_KhJhKs3h_5s8h9h3c_Jd6s5hJs_6c3d5d2d_9sQc7dQs_8dQd4h7s() {
    assertEquals(
      "8dQd4h7s 9sQc7dQs KhJhKs3h 6c3d5d2d Jd6s5hJs 5s8h9h3c",
      Solver.process("omaha-holdem 2h5c7cJcTc KhJhKs3h 5s8h9h3c Jd6s5hJs 6c3d5d2d 9sQc7dQs 8dQd4h7s"));
  }

  @Test
  public void test_omaha_holdem_4383_5d5s7s8d9h_8sAhQhTc_3c5hJdTd() {
    assertEquals(
      "8sAhQhTc 3c5hJdTd",
      Solver.process("omaha-holdem 5d5s7s8d9h 8sAhQhTc 3c5hJdTd"));
  }

  @Test
  public void test_omaha_holdem_4384_2s5d9sQsTh_7h8cTdTc_Kc5c7cAc_Kd2d7s7d() {
    assertEquals(
      "Kc5c7cAc Kd2d7s7d 7h8cTdTc",
      Solver.process("omaha-holdem 2s5d9sQsTh 7h8cTdTc Kc5c7cAc Kd2d7s7d"));
  }

  @Test
  public void test_omaha_holdem_4385_JhJsKsQsTs_Qh8d4hJc_9c7s5c2d_7h3sKh9s_4c3d9h8s_2h4dKdAc_7d8cJdTd_AhKc6s6h_3h5s8h2c_4s2s6d7c() {
    assertEquals(
      "3h5s8h2c 9c7s5c2d 4c3d9h8s 2h4dKdAc=AhKc6s6h 4s2s6d7c 7h3sKh9s 7d8cJdTd Qh8d4hJc",
      Solver.process("omaha-holdem JhJsKsQsTs Qh8d4hJc 9c7s5c2d 7h3sKh9s 4c3d9h8s 2h4dKdAc 7d8cJdTd AhKc6s6h 3h5s8h2c 4s2s6d7c"));
  }

  @Test
  public void test_omaha_holdem_4386_2h5h5s6hTd_3hKdKh7c_9cQc6sTs_2d7h7s9s_9dJs8d8s_4dTcKc8c_3d3cJdAc() {
    assertEquals(
      "3d3cJdAc 2d7h7s9s 9dJs8d8s 4dTcKc8c 9cQc6sTs 3hKdKh7c",
      Solver.process("omaha-holdem 2h5h5s6hTd 3hKdKh7c 9cQc6sTs 2d7h7s9s 9dJs8d8s 4dTcKc8c 3d3cJdAc"));
  }

  @Test
  public void test_omaha_holdem_4387_3h6c7d7s9c_5h2s3sJd_TdKd5sAs_8dTcQh9h() {
    assertEquals(
      "TdKd5sAs 5h2s3sJd 8dTcQh9h",
      Solver.process("omaha-holdem 3h6c7d7s9c 5h2s3sJd TdKd5sAs 8dTcQh9h"));
  }

  @Test
  public void test_omaha_holdem_4388_6sJhKdKsQs_3dAh4s2s_JsTc8cAd() {
    assertEquals(
      "JsTc8cAd 3dAh4s2s",
      Solver.process("omaha-holdem 6sJhKdKsQs 3dAh4s2s JsTc8cAd"));
  }

  @Test
  public void test_omaha_holdem_4389_2c4s6c6d7c_Th5hKhKd_Qs9dJh7s() {
    assertEquals(
      "Qs9dJh7s Th5hKhKd",
      Solver.process("omaha-holdem 2c4s6c6d7c Th5hKhKd Qs9dJh7s"));
  }

  @Test
  public void test_omaha_holdem_4390_2c2d9sAsQs_4c5hTs6h_2s2h4d9c_Jd9h3hAd_4sJcJsTd_7c7hAcJh_7sAhKs6d_8hTc5sKh() {
    assertEquals(
      "4c5hTs6h 8hTc5sKh 7c7hAcJh Jd9h3hAd 4sJcJsTd 7sAhKs6d 2s2h4d9c",
      Solver.process("omaha-holdem 2c2d9sAsQs 4c5hTs6h 2s2h4d9c Jd9h3hAd 4sJcJsTd 7c7hAcJh 7sAhKs6d 8hTc5sKh"));
  }

  @Test
  public void test_omaha_holdem_4391_7d9d9hAdTc_2hKhKd2c_Td6sThJd_8dAc5dTs_Qs2s2d4s_Qd3hQh6h_5h7cJhAh() {
    assertEquals(
      "Qs2s2d4s Qd3hQh6h 2hKhKd2c 5h7cJhAh 8dAc5dTs Td6sThJd",
      Solver.process("omaha-holdem 7d9d9hAdTc 2hKhKd2c Td6sThJd 8dAc5dTs Qs2s2d4s Qd3hQh6h 5h7cJhAh"));
  }

  @Test
  public void test_omaha_holdem_4392_5s6cJdTdTh_8hQd4c2c_6d5d7h4s_6h3cKs2s_9sQh8cTc_Ah5h3dKc_9cJs7s7d_AsAdKh2d_Qc4hJh3h() {
    assertEquals(
      "8hQd4c2c Ah5h3dKc 6d5d7h4s 6h3cKs2s 9cJs7s7d Qc4hJh3h AsAdKh2d 9sQh8cTc",
      Solver.process("omaha-holdem 5s6cJdTdTh 8hQd4c2c 6d5d7h4s 6h3cKs2s 9sQh8cTc Ah5h3dKc 9cJs7s7d AsAdKh2d Qc4hJh3h"));
  }

  @Test
  public void test_omaha_holdem_4393_7hJcJsKhKs_3cAh2c8c_8sQcKd2h_TdTs4h3h_Qd9s6h3d_AcQsJh5c_7d4c2d5d_Qh6d8hAd() {
    assertEquals(
      "Qd9s6h3d 3cAh2c8c Qh6d8hAd 7d4c2d5d TdTs4h3h AcQsJh5c 8sQcKd2h",
      Solver.process("omaha-holdem 7hJcJsKhKs 3cAh2c8c 8sQcKd2h TdTs4h3h Qd9s6h3d AcQsJh5c 7d4c2d5d Qh6d8hAd"));
  }

  @Test
  public void test_omaha_holdem_4394_5hKcKhQdQh_7h4h3s2h_KdAcTs7c_6c9c8s9d_4s3hKs6s_5s6h3c9s_8d2c9hTh() {
    assertEquals(
      "5s6h3c9s 6c9c8s9d 4s3hKs6s KdAcTs7c 7h4h3s2h 8d2c9hTh",
      Solver.process("omaha-holdem 5hKcKhQdQh 7h4h3s2h KdAcTs7c 6c9c8s9d 4s3hKs6s 5s6h3c9s 8d2c9hTh"));
  }

  @Test
  public void test_omaha_holdem_4395_4sAdAsKdTd_8hQsTs5c_KsTh9cKc_2dJh8d7h_Qh3h7dJd_8cJs4dJc_9h2s5h5s_3d2c4h9d_AcTc9s6d_6c6h3s2h() {
    assertEquals(
      "9h2s5h5s 6c6h3s2h 8hQsTs5c 8cJs4dJc 2dJh8d7h 3d2c4h9d Qh3h7dJd KsTh9cKc AcTc9s6d",
      Solver.process("omaha-holdem 4sAdAsKdTd 8hQsTs5c KsTh9cKc 2dJh8d7h Qh3h7dJd 8cJs4dJc 9h2s5h5s 3d2c4h9d AcTc9s6d 6c6h3s2h"));
  }

  @Test
  public void test_omaha_holdem_4396_4c7s8sTcTd_4s9sQc3h_7hAc5c8d_Th9hQh9d() {
    assertEquals(
      "4s9sQc3h 7hAc5c8d Th9hQh9d",
      Solver.process("omaha-holdem 4c7s8sTcTd 4s9sQc3h 7hAc5c8d Th9hQh9d"));
  }

  @Test
  public void test_omaha_holdem_4397_3d4d6c8cAs_9s2dQhTs_AhJc2h2s_7dTd6s6d_3hJd3c7s_JsKhKd4s_2c6hAdTc_8h8sKs5h_Th9cAcQs() {
    assertEquals(
      "9s2dQhTs JsKhKd4s AhJc2h2s Th9cAcQs 2c6hAdTc 3hJd3c7s 7dTd6s6d 8h8sKs5h",
      Solver.process("omaha-holdem 3d4d6c8cAs 9s2dQhTs AhJc2h2s 7dTd6s6d 3hJd3c7s JsKhKd4s 2c6hAdTc 8h8sKs5h Th9cAcQs"));
  }

  @Test
  public void test_omaha_holdem_4398_3d3h4h5d9s_7dTdJdKs_Kc5c9h9d_JcJh8s6h_QsJs9c4s_5h8h4c2h_3sTsAs4d_QhTc5s2c_7sQc6cKd_8d6d2sKh() {
    assertEquals(
      "7dTdJdKs QhTc5s2c 5h8h4c2h QsJs9c4s JcJh8s6h 8d6d2sKh 7sQc6cKd 3sTsAs4d Kc5c9h9d",
      Solver.process("omaha-holdem 3d3h4h5d9s 7dTdJdKs Kc5c9h9d JcJh8s6h QsJs9c4s 5h8h4c2h 3sTsAs4d QhTc5s2c 7sQc6cKd 8d6d2sKh"));
  }

  @Test
  public void test_omaha_holdem_4399_4h6sJhTcTd_6dQc5dAc_7s8d7c8c() {
    assertEquals(
      "6dQc5dAc 7s8d7c8c",
      Solver.process("omaha-holdem 4h6sJhTcTd 6dQc5dAc 7s8d7c8c"));
  }

  @Test
  public void test_omaha_holdem_4400_4c4d5sJcKs_5h9hTdAs_6c9s6d7d() {
    assertEquals(
      "5h9hTdAs 6c9s6d7d",
      Solver.process("omaha-holdem 4c4d5sJcKs 5h9hTdAs 6c9s6d7d"));
  }

  @Test
  public void test_omaha_holdem_4401_2c2d2s9cTc_Ac7c3dAs_6hAd7dTh() {
    assertEquals(
      "6hAd7dTh Ac7c3dAs",
      Solver.process("omaha-holdem 2c2d2s9cTc Ac7c3dAs 6hAd7dTh"));
  }

  @Test
  public void test_omaha_holdem_4402_2c6d8c9dKd_3dKh6h2d_3sQh9sJh_4c6s7s3c_5c2sAh4d_6c7d8sKs_JdJs7c7h_Qd9h3hTh_TdJcQsAc() {
    assertEquals(
      "TdJcQsAc 5c2sAh4d 4c6s7s3c 3sQh9sJh=Qd9h3hTh JdJs7c7h 6c7d8sKs 3dKh6h2d",
      Solver.process("omaha-holdem 2c6d8c9dKd 3dKh6h2d 3sQh9sJh 4c6s7s3c 5c2sAh4d 6c7d8sKs JdJs7c7h Qd9h3hTh TdJcQsAc"));
  }

  @Test
  public void test_omaha_holdem_4403_4d7cAhQcTc_Ac6s3d9s_KcKd2h7h_7sKs9hKh_8d5d5c4c_Qd8hQh9d_6hQs2sAd_Jh3h6cJd_5s5hTh6d() {
    assertEquals(
      "5s5hTh6d Jh3h6cJd 7sKs9hKh=KcKd2h7h Ac6s3d9s 6hQs2sAd Qd8hQh9d 8d5d5c4c",
      Solver.process("omaha-holdem 4d7cAhQcTc Ac6s3d9s KcKd2h7h 7sKs9hKh 8d5d5c4c Qd8hQh9d 6hQs2sAd Jh3h6cJd 5s5hTh6d"));
  }

  @Test
  public void test_omaha_holdem_4404_2c4h5sKdQs_Jh9s5d8h_7dQdTh6d_Ks8c2h3h_Qc2d7s5c_3sQhAdAh_8dJdAs4s_8s9dTc9c_KhAcTd9h() {
    assertEquals(
      "8dJdAs4s Jh9s5d8h 8s9dTc9c 7dQdTh6d KhAcTd9h Qc2d7s5c Ks8c2h3h 3sQhAdAh",
      Solver.process("omaha-holdem 2c4h5sKdQs Jh9s5d8h 7dQdTh6d Ks8c2h3h Qc2d7s5c 3sQhAdAh 8dJdAs4s 8s9dTc9c KhAcTd9h"));
  }

  @Test
  public void test_omaha_holdem_4405_2d6h7hAcQc_Kc5c8cAd_9d3hQs7d_KsJd5h4s_Qd8s5d8d_3dKd6sAh_7c4cTsTc() {
    assertEquals(
      "KsJd5h4s 7c4cTsTc Qd8s5d8d Kc5c8cAd 9d3hQs7d 3dKd6sAh",
      Solver.process("omaha-holdem 2d6h7hAcQc Kc5c8cAd 9d3hQs7d KsJd5h4s Qd8s5d8d 3dKd6sAh 7c4cTsTc"));
  }

  @Test
  public void test_omaha_holdem_4406_3d4c5dQcTs_4h5h2hQs_5s9hQh3s_AdJd9cAh_Ks7cAsJh_8sAc6s4d_2dKd6h2c_9s8dTd7h_Js4s9d8c_8hTc2sQd() {
    assertEquals(
      "Ks7cAsJh Js4s9d8c 8sAc6s4d 9s8dTd7h AdJd9cAh 4h5h2hQs=5s9hQh3s 8hTc2sQd 2dKd6h2c",
      Solver.process("omaha-holdem 3d4c5dQcTs 4h5h2hQs 5s9hQh3s AdJd9cAh Ks7cAsJh 8sAc6s4d 2dKd6h2c 9s8dTd7h Js4s9d8c 8hTc2sQd"));
  }

  @Test
  public void test_omaha_holdem_4407_2d3d3s5sJd_As5h6h6d_7d3c4c8d_AdQdJsKs_8sTs5d4s_2hAcQcQs_6cAh5c9d_4dTc8cTh_KcJc2s8h() {
    assertEquals(
      "8sTs5d4s 6cAh5c9d As5h6h6d 4dTc8cTh KcJc2s8h 2hAcQcQs 7d3c4c8d AdQdJsKs",
      Solver.process("omaha-holdem 2d3d3s5sJd As5h6h6d 7d3c4c8d AdQdJsKs 8sTs5d4s 2hAcQcQs 6cAh5c9d 4dTc8cTh KcJc2s8h"));
  }

  @Test
  public void test_omaha_holdem_4408_3c9dJsKhQd_AsTs3d6c_8s3s9hJc_2h5c8d6s_QcJh4c8h_2sQsAhAc() {
    assertEquals(
      "2h5c8d6s 2sQsAhAc 8s3s9hJc QcJh4c8h AsTs3d6c",
      Solver.process("omaha-holdem 3c9dJsKhQd AsTs3d6c 8s3s9hJc 2h5c8d6s QcJh4c8h 2sQsAhAc"));
  }

  @Test
  public void test_omaha_holdem_4409_5c8c9sKdQs_TcQcJs2c_8s2hTs8d_KsKc3d3c_JcAs6s9h_5d6hAd7d_4c5h3s3h_7s6dJdQh_Kh9c6cQd() {
    assertEquals(
      "4c5h3s3h JcAs6s9h Kh9c6cQd 8s2hTs8d KsKc3d3c 5d6hAd7d=7s6dJdQh TcQcJs2c",
      Solver.process("omaha-holdem 5c8c9sKdQs TcQcJs2c 8s2hTs8d KsKc3d3c JcAs6s9h 5d6hAd7d 4c5h3s3h 7s6dJdQh Kh9c6cQd"));
  }

  @Test
  public void test_omaha_holdem_4410_5c8c9cJcKc_3s6sTd9d_2dJh4d2h_2s4c3hQd_7s4h5d8d_Th7h7d2c_QcKh8s9h_Ad5hQs3d() {
    assertEquals(
      "2s4c3hQd Ad5hQs3d 3s6sTd9d 2dJh4d2h 7s4h5d8d QcKh8s9h Th7h7d2c",
      Solver.process("omaha-holdem 5c8c9cJcKc 3s6sTd9d 2dJh4d2h 2s4c3hQd 7s4h5d8d Th7h7d2c QcKh8s9h Ad5hQs3d"));
  }

  @Test
  public void test_omaha_holdem_4411_7h8d9sJdJh_KsKh3dQd_2s9hJc8s_5c5h8h2h_Ac6h5d2d() {
    assertEquals(
      "5c5h8h2h KsKh3dQd Ac6h5d2d 2s9hJc8s",
      Solver.process("omaha-holdem 7h8d9sJdJh KsKh3dQd 2s9hJc8s 5c5h8h2h Ac6h5d2d"));
  }

  @Test
  public void test_omaha_holdem_4412_3d5s7dJsTc_7sQdAsQs_8s4s3s6c_Ts2cJd2h_Jc4cQhTh_4dTd5h9h_7hKs3c6h() {
    assertEquals(
      "7sQdAsQs 7hKs3c6h 4dTd5h9h Jc4cQhTh=Ts2cJd2h 8s4s3s6c",
      Solver.process("omaha-holdem 3d5s7dJsTc 7sQdAsQs 8s4s3s6c Ts2cJd2h Jc4cQhTh 4dTd5h9h 7hKs3c6h"));
  }

  @Test
  public void test_omaha_holdem_4413_3d4d7dJdQs_QcAsQh4c_6sQdJs2c_Kc4s8s8d_5h3h6c3c_7c5cAhAd_9s9h2s7h_5sAc8hJh_3sTdTh4h() {
    assertEquals(
      "Kc4s8s8d 9s9h2s7h 5sAc8hJh 7c5cAhAd 3sTdTh4h 6sQdJs2c QcAsQh4c 5h3h6c3c",
      Solver.process("omaha-holdem 3d4d7dJdQs QcAsQh4c 6sQdJs2c Kc4s8s8d 5h3h6c3c 7c5cAhAd 9s9h2s7h 5sAc8hJh 3sTdTh4h"));
  }

  @Test
  public void test_omaha_holdem_4414_6d8s9sJcQd_3d9h3hAh_6s9d7s7d_QsAd5d3s_9cTc2c4h_7cKs6c2s_4d8d8hQc_4sAc4c5h_Kd2h3c8c() {
    assertEquals(
      "4sAc4c5h 7cKs6c2s Kd2h3c8c 3d9h3hAh QsAd5d3s 6s9d7s7d 4d8d8hQc 9cTc2c4h",
      Solver.process("omaha-holdem 6d8s9sJcQd 3d9h3hAh 6s9d7s7d QsAd5d3s 9cTc2c4h 7cKs6c2s 4d8d8hQc 4sAc4c5h Kd2h3c8c"));
  }

  @Test
  public void test_omaha_holdem_4415_3d7dAcKcQc_5c6sJcKh_Js2dTs4c_Th9d6h6d_8d3s2s9s_3cQd5sQh() {
    assertEquals(
      "8d3s2s9s Th9d6h6d 3cQd5sQh Js2dTs4c 5c6sJcKh",
      Solver.process("omaha-holdem 3d7dAcKcQc 5c6sJcKh Js2dTs4c Th9d6h6d 8d3s2s9s 3cQd5sQh"));
  }

  @Test
  public void test_omaha_holdem_4416_2c2d2h7hQc_7d7c5cTs_AhJs2s3d_6c8dQd4h_Td5s9s5h_Ks8sTcQh() {
    assertEquals(
      "6c8dQd4h Ks8sTcQh Td5s9s5h 7d7c5cTs AhJs2s3d",
      Solver.process("omaha-holdem 2c2d2h7hQc 7d7c5cTs AhJs2s3d 6c8dQd4h Td5s9s5h Ks8sTcQh"));
  }

  @Test
  public void test_omaha_holdem_4417_2d4h9cAcJs_8s3c5sKh_3sKc3d4s_9hQcQh7c_Ts7s5d3h_Ad6h6dTd() {
    assertEquals(
      "3sKc3d4s 9hQcQh7c Ad6h6dTd 8s3c5sKh=Ts7s5d3h",
      Solver.process("omaha-holdem 2d4h9cAcJs 8s3c5sKh 3sKc3d4s 9hQcQh7c Ts7s5d3h Ad6h6dTd"));
  }

  @Test
  public void test_omaha_holdem_4418_2s5h6s7sAc_Ad2hThJd_3d8cAh8h_9h3sKc9s() {
    assertEquals(
      "3d8cAh8h Ad2hThJd 9h3sKc9s",
      Solver.process("omaha-holdem 2s5h6s7sAc Ad2hThJd 3d8cAh8h 9h3sKc9s"));
  }

  @Test
  public void test_omaha_holdem_4419_2d6c8s9dJs_4hAhQc5s_Qs3c4c8d_9cAdAc6h_Jc7c8c7d_7hJd4s3d_Jh6dKdTs_5d3sKsKh_6s4dKcTh_9h5h2sTc() {
    assertEquals(
      "4hAhQc5s 6s4dKcTh Qs3c4c8d 7hJd4s3d 5d3sKsKh 9h5h2sTc 9cAdAc6h Jh6dKdTs Jc7c8c7d",
      Solver.process("omaha-holdem 2d6c8s9dJs 4hAhQc5s Qs3c4c8d 9cAdAc6h Jc7c8c7d 7hJd4s3d Jh6dKdTs 5d3sKsKh 6s4dKcTh 9h5h2sTc"));
  }

  @Test
  public void test_omaha_holdem_4420_5c8c9sKsQd_7d9d4d3s_Qh9hAc6h_7hTs8dKd_5d7c6s4c_KcTd4s5s_Qs2s7sQc_8hAd9c2c_2d6c4hJc() {
    assertEquals(
      "2d6c4hJc 7d9d4d3s 8hAd9c2c Qh9hAc6h KcTd4s5s 7hTs8dKd Qs2s7sQc 5d7c6s4c",
      Solver.process("omaha-holdem 5c8c9sKsQd 7d9d4d3s Qh9hAc6h 7hTs8dKd 5d7c6s4c KcTd4s5s Qs2s7sQc 8hAd9c2c 2d6c4hJc"));
  }

  @Test
  public void test_omaha_holdem_4421_2h2s3d6s7s_KhKs5cTd_8s6dTcJd() {
    assertEquals(
      "8s6dTcJd KhKs5cTd",
      Solver.process("omaha-holdem 2h2s3d6s7s KhKs5cTd 8s6dTcJd"));
  }

  @Test
  public void test_omaha_holdem_4422_3s4hAcKhQd_8h2hQh7h_Kc6hJsTs_5sJh5d9h_Tc8c4dQc_7d2d3c9s_4cTh2c5h_QsKd6s6d_6c7s2s3h_JcTdAsKs() {
    assertEquals(
      "6c7s2s3h 7d2d3c9s 5sJh5d9h 8h2hQh7h Tc8c4dQc QsKd6s6d 4cTh2c5h JcTdAsKs=Kc6hJsTs",
      Solver.process("omaha-holdem 3s4hAcKhQd 8h2hQh7h Kc6hJsTs 5sJh5d9h Tc8c4dQc 7d2d3c9s 4cTh2c5h QsKd6s6d 6c7s2s3h JcTdAsKs"));
  }

  @Test
  public void test_omaha_holdem_4423_2d4c6sKhQd_4dKcTc3s_9hJcQh2h_8cAd9sQc_Js9c2s6c_TsTd3c3h_8h3d7h6d_As7d5dJh_Ac6hKs5s_8dThAh2c() {
    assertEquals(
      "As7d5dJh 8dThAh2c 8h3d7h6d TsTd3c3h 8cAd9sQc Js9c2s6c 9hJcQh2h 4dKcTc3s Ac6hKs5s",
      Solver.process("omaha-holdem 2d4c6sKhQd 4dKcTc3s 9hJcQh2h 8cAd9sQc Js9c2s6c TsTd3c3h 8h3d7h6d As7d5dJh Ac6hKs5s 8dThAh2c"));
  }

  @Test
  public void test_omaha_holdem_4424_5h6d6h7sKc_2cAhAc5c_Ts4h8cQh_6c3h9dJs() {
    assertEquals(
      "2cAhAc5c 6c3h9dJs Ts4h8cQh",
      Solver.process("omaha-holdem 5h6d6h7sKc 2cAhAc5c Ts4h8cQh 6c3h9dJs"));
  }

  @Test
  public void test_omaha_holdem_4425_4c7hJcKdKh_QdQc9cAd_5s6c5cAc() {
    assertEquals(
      "5s6c5cAc QdQc9cAd",
      Solver.process("omaha-holdem 4c7hJcKdKh QdQc9cAd 5s6c5cAc"));
  }

  @Test
  public void test_omaha_holdem_4426_2s3s9hAcTd_3d4dJs9d_2dTsJdJc() {
    assertEquals(
      "3d4dJs9d 2dTsJdJc",
      Solver.process("omaha-holdem 2s3s9hAcTd 3d4dJs9d 2dTsJdJc"));
  }

  @Test
  public void test_omaha_holdem_4427_2d3hAcJcJs_5d4s5s9s_2s8hAhQs_9c6s4dTh_9hJd8sQc() {
    assertEquals(
      "9c6s4dTh 2s8hAhQs 9hJd8sQc 5d4s5s9s",
      Solver.process("omaha-holdem 2d3hAcJcJs 5d4s5s9s 2s8hAhQs 9c6s4dTh 9hJd8sQc"));
  }

  @Test
  public void test_omaha_holdem_4428_3c3d6hJhQc_8c6sAd9s_4s5c5sQh_TcTh6d2s() {
    assertEquals(
      "8c6sAd9s TcTh6d2s 4s5c5sQh",
      Solver.process("omaha-holdem 3c3d6hJhQc 8c6sAd9s 4s5c5sQh TcTh6d2s"));
  }

  @Test
  public void test_omaha_holdem_4429_4d7hAcJdQd_4cTd6h2h_8d9h3h9s_4hAd7dQh_6d8c7sJh() {
    assertEquals(
      "4cTd6h2h 8d9h3h9s 6d8c7sJh 4hAd7dQh",
      Solver.process("omaha-holdem 4d7hAcJdQd 4cTd6h2h 8d9h3h9s 4hAd7dQh 6d8c7sJh"));
  }

  @Test
  public void test_omaha_holdem_4430_6d7s8hTdTh_KhQc5s6h_8d6s9dJs_3hTcAhJc_2s7h9h3d_5d6c4c9s_9c2h3cTs_AsQhKdAc() {
    assertEquals(
      "KhQc5s6h AsQhKdAc 3hTcAhJc 2s7h9h3d=5d6c4c9s=9c2h3cTs 8d6s9dJs",
      Solver.process("omaha-holdem 6d7s8hTdTh KhQc5s6h 8d6s9dJs 3hTcAhJc 2s7h9h3d 5d6c4c9s 9c2h3cTs AsQhKdAc"));
  }

  @Test
  public void test_omaha_holdem_4431_5d8s9cKdTc_2hJd5hAh_5c6c3h4h_7h5s2c6h_7c9d7dJs_4cTh6d4d_As3cQs8d_KcTs4s2s() {
    assertEquals(
      "5c6c3h4h 2hJd5hAh As3cQs8d 4cTh6d4d KcTs4s2s 7h5s2c6h 7c9d7dJs",
      Solver.process("omaha-holdem 5d8s9cKdTc 2hJd5hAh 5c6c3h4h 7h5s2c6h 7c9d7dJs 4cTh6d4d As3cQs8d KcTs4s2s"));
  }

  @Test
  public void test_omaha_holdem_4432_2d4d8dJhKh_Ac6s7s6c_Qd4hQc3d_5s9dTdQh_9h5dQs8h() {
    assertEquals(
      "Ac6s7s6c 9h5dQs8h 5s9dTdQh Qd4hQc3d",
      Solver.process("omaha-holdem 2d4d8dJhKh Ac6s7s6c Qd4hQc3d 5s9dTdQh 9h5dQs8h"));
  }

  @Test
  public void test_omaha_holdem_4433_2c3c3d4d9c_7s6c6sAh_5c7c2h8s_Jc3s6dQs_TdJsTc5h_Th8d4cKh_Ad2d5dKd() {
    assertEquals(
      "Th8d4cKh 7s6c6sAh TdJsTc5h Jc3s6dQs Ad2d5dKd 5c7c2h8s",
      Solver.process("omaha-holdem 2c3c3d4d9c 7s6c6sAh 5c7c2h8s Jc3s6dQs TdJsTc5h Th8d4cKh Ad2d5dKd"));
  }

  @Test
  public void test_omaha_holdem_4434_2d3d6d9cQs_Ac8s4dQc_2c3h7sKh_Jd4h5c7c_Td7hTh4s_2h4c8h6h_5h5sTcJc_TsAhKd5d() {
    assertEquals(
      "5h5sTcJc Td7hTh4s Ac8s4dQc 2c3h7sKh 2h4c8h6h Jd4h5c7c TsAhKd5d",
      Solver.process("omaha-holdem 2d3d6d9cQs Ac8s4dQc 2c3h7sKh Jd4h5c7c Td7hTh4s 2h4c8h6h 5h5sTcJc TsAhKd5d"));
  }

  @Test
  public void test_omaha_holdem_4435_2c3c4h9hKs_3dJsAd6s_3hKdAh5h() {
    assertEquals(
      "3dJsAd6s 3hKdAh5h",
      Solver.process("omaha-holdem 2c3c4h9hKs 3dJsAd6s 3hKdAh5h"));
  }

  @Test
  public void test_omaha_holdem_4436_6c7sAcAsKc_6h3dAh7c_8h6dJh8d_Ad2dQd3h_3sJd8c5d() {
    assertEquals(
      "3sJd8c5d 8h6dJh8d Ad2dQd3h 6h3dAh7c",
      Solver.process("omaha-holdem 6c7sAcAsKc 6h3dAh7c 8h6dJh8d Ad2dQd3h 3sJd8c5d"));
  }

  @Test
  public void test_omaha_holdem_4437_4d4h7d9dJs_Ah9sTh5c_7s5hQd3h_As5s2s8d_KhAd6s8c_4sTsAcQc_Td3s8sQs() {
    assertEquals(
      "As5s2s8d KhAd6s8c 7s5hQd3h Ah9sTh5c 4sTsAcQc Td3s8sQs",
      Solver.process("omaha-holdem 4d4h7d9dJs Ah9sTh5c 7s5hQd3h As5s2s8d KhAd6s8c 4sTsAcQc Td3s8sQs"));
  }

  @Test
  public void test_omaha_holdem_4438_2c4s7dAhTc_As9c8hTd_Kd4h6d5s_3d7sQdTs_QhQc5c4c_6cThQs3h_8s7cJc4d_6s6h3cKs_Ad2h9s2s_9hAc8c5d() {
    assertEquals(
      "Kd4h6d5s 6s6h3cKs 6cThQs3h QhQc5c4c 9hAc8c5d 8s7cJc4d 3d7sQdTs As9c8hTd Ad2h9s2s",
      Solver.process("omaha-holdem 2c4s7dAhTc As9c8hTd Kd4h6d5s 3d7sQdTs QhQc5c4c 6cThQs3h 8s7cJc4d 6s6h3cKs Ad2h9s2s 9hAc8c5d"));
  }

  @Test
  public void test_omaha_holdem_4439_2d5s8cJsTh_7h8dTd2c_4hKh7d9c() {
    assertEquals(
      "7h8dTd2c 4hKh7d9c",
      Solver.process("omaha-holdem 2d5s8cJsTh 7h8dTd2c 4hKh7d9c"));
  }

  @Test
  public void test_omaha_holdem_4440_2c3cJhJsQd_Kd5h8d9s_6h2s4hAs_7s6d3d9h_8h7hAcQc_Kc5c9c3s() {
    assertEquals(
      "Kd5h8d9s 6h2s4hAs 7s6d3d9h Kc5c9c3s 8h7hAcQc",
      Solver.process("omaha-holdem 2c3cJhJsQd Kd5h8d9s 6h2s4hAs 7s6d3d9h 8h7hAcQc Kc5c9c3s"));
  }

  @Test
  public void test_omaha_holdem_4441_2c2d2h6dAs_3d7s7h3c_Kc9hQs8d_5c3h9dKd_4sQh7cQc() {
    assertEquals(
      "5c3h9dKd Kc9hQs8d 3d7s7h3c 4sQh7cQc",
      Solver.process("omaha-holdem 2c2d2h6dAs 3d7s7h3c Kc9hQs8d 5c3h9dKd 4sQh7cQc"));
  }

  @Test
  public void test_omaha_holdem_4442_5dAcAsKsTs_Qs3sTd5c_QhJh4c3d_Th8hJd9h_6s6hQcJc_7d3hKd7h_2d4d9d4s() {
    assertEquals(
      "2d4d9d4s Th8hJd9h 7d3hKd7h 6s6hQcJc=QhJh4c3d Qs3sTd5c",
      Solver.process("omaha-holdem 5dAcAsKsTs Qs3sTd5c QhJh4c3d Th8hJd9h 6s6hQcJc 7d3hKd7h 2d4d9d4s"));
  }

  @Test
  public void test_omaha_holdem_4443_3d4h6c7cQs_QhKh7h4d_Jd7s2sTc_8d6d9d6h_9c3hQd2d_Ad7d5s6s_Ac4s2hQc_Jc4c5hTs_8h3sTdKd_5c9h8s3c() {
    assertEquals(
      "8h3sTdKd Jd7s2sTc 9c3hQd2d Ac4s2hQc QhKh7h4d 8d6d9d6h Ad7d5s6s=Jc4c5hTs 5c9h8s3c",
      Solver.process("omaha-holdem 3d4h6c7cQs QhKh7h4d Jd7s2sTc 8d6d9d6h 9c3hQd2d Ad7d5s6s Ac4s2hQc Jc4c5hTs 8h3sTdKd 5c9h8s3c"));
  }

  @Test
  public void test_omaha_holdem_4444_7h8dJcJhKs_Kh9c6c8h_3c5c3dTh_Qc4c9h2d() {
    assertEquals(
      "Qc4c9h2d 3c5c3dTh Kh9c6c8h",
      Solver.process("omaha-holdem 7h8dJcJhKs Kh9c6c8h 3c5c3dTh Qc4c9h2d"));
  }

  @Test
  public void test_omaha_holdem_4445_3s4c7cAhJs_6s4s2h7h_Jc3c3h2s_6cKsKh4h_2cKc4dQc_8h5c9dAs_QsKdQdTc_Th8c8s5d() {
    assertEquals(
      "2cKc4dQc Th8c8s5d QsKdQdTc 6cKsKh4h 8h5c9dAs 6s4s2h7h Jc3c3h2s",
      Solver.process("omaha-holdem 3s4c7cAhJs 6s4s2h7h Jc3c3h2s 6cKsKh4h 2cKc4dQc 8h5c9dAs QsKdQdTc Th8c8s5d"));
  }

  @Test
  public void test_omaha_holdem_4446_5s6s8h9hKh_8d9sAd7c_5hKcTc2d() {
    assertEquals(
      "5hKcTc2d 8d9sAd7c",
      Solver.process("omaha-holdem 5s6s8h9hKh 8d9sAd7c 5hKcTc2d"));
  }

  @Test
  public void test_omaha_holdem_4447_3d3hJsQcTd_3s4hTsAh_Jc9s9dQh_Qd6h7h5s_5d8cThKd_2sKh2d9h_Jd4s2h4d_KsJh7sAd_2cQs6c8s_5c7dAsAc() {
    assertEquals(
      "5d8cThKd Jd4s2h4d Qd6h7h5s 2cQs6c8s Jc9s9dQh 5c7dAsAc 2sKh2d9h KsJh7sAd 3s4hTsAh",
      Solver.process("omaha-holdem 3d3hJsQcTd 3s4hTsAh Jc9s9dQh Qd6h7h5s 5d8cThKd 2sKh2d9h Jd4s2h4d KsJh7sAd 2cQs6c8s 5c7dAsAc"));
  }

  @Test
  public void test_omaha_holdem_4448_4h5d9cAsKc_ThQc6sJc_Td3c4c6c_Ks4sTc6h_QhQd4d5c_JsAh7dJd_Jh3h8h7h() {
    assertEquals(
      "Jh3h8h7h ThQc6sJc Td3c4c6c JsAh7dJd QhQd4d5c Ks4sTc6h",
      Solver.process("omaha-holdem 4h5d9cAsKc ThQc6sJc Td3c4c6c Ks4sTc6h QhQd4d5c JsAh7dJd Jh3h8h7h"));
  }

  @Test
  public void test_omaha_holdem_4449_2d4c8hAsTh_Ts4dKsAd_2c9c3c8d_5h3s4h7s_7h3h6cQd_JcQhAcQs_8sJhJs4s_9d6sKc2s_Ah5c8c5d() {
    assertEquals(
      "7h3h6cQd 9d6sKc2s JcQhAcQs 2c9c3c8d 8sJhJs4s Ah5c8c5d Ts4dKsAd 5h3s4h7s",
      Solver.process("omaha-holdem 2d4c8hAsTh Ts4dKsAd 2c9c3c8d 5h3s4h7s 7h3h6cQd JcQhAcQs 8sJhJs4s 9d6sKc2s Ah5c8c5d"));
  }

  @Test
  public void test_omaha_holdem_4450_8dAdJsKcQs_3h6h7c4c_5c8hQhAs_Ts4dJcAh_9dKd6c4h_5dKh7hJd_2cTc9h9c_5hJh7s3c_2d6dQc3s_Th6s2h8c() {
    assertEquals(
      "3h6h7c4c Th6s2h8c 5hJh7s3c 2d6dQc3s 9dKd6c4h 5dKh7hJd 5c8hQhAs 2cTc9h9c Ts4dJcAh",
      Solver.process("omaha-holdem 8dAdJsKcQs 3h6h7c4c 5c8hQhAs Ts4dJcAh 9dKd6c4h 5dKh7hJd 2cTc9h9c 5hJh7s3c 2d6dQc3s Th6s2h8c"));
  }

  @Test
  public void test_omaha_holdem_4451_2h4s7c8hQc_Ad7hJs3s_2c6s8dJc_Ac3h5c8s_9sKh9cJh_8cJd9d6d() {
    assertEquals(
      "Ad7hJs3s 8cJd9d6d Ac3h5c8s 9sKh9cJh 2c6s8dJc",
      Solver.process("omaha-holdem 2h4s7c8hQc Ad7hJs3s 2c6s8dJc Ac3h5c8s 9sKh9cJh 8cJd9d6d"));
  }

  @Test
  public void test_omaha_holdem_4452_3d4h6h9cQh_4d4s5c2s_As9hJd9d_Qd2c5sQc_Kc8h5h8d_Th5d7d8c_6c9s7s7h_6dJs6sTs() {
    assertEquals(
      "6c9s7s7h 6dJs6sTs As9hJd9d 4d4s5c2s=Qd2c5sQc Th5d7d8c Kc8h5h8d",
      Solver.process("omaha-holdem 3d4h6h9cQh 4d4s5c2s As9hJd9d Qd2c5sQc Kc8h5h8d Th5d7d8c 6c9s7s7h 6dJs6sTs"));
  }

  @Test
  public void test_omaha_holdem_4453_3h7dAcKhTh_Qh5c6c3d_2dJh4c5s_3s8s8h9d_7c2cKs6s() {
    assertEquals(
      "2dJh4c5s Qh5c6c3d 3s8s8h9d 7c2cKs6s",
      Solver.process("omaha-holdem 3h7dAcKhTh Qh5c6c3d 2dJh4c5s 3s8s8h9d 7c2cKs6s"));
  }

  @Test
  public void test_omaha_holdem_4454_2d5c5h6hKs_5s9c3hQd_7sTs8hTc_4d6c6sKh() {
    assertEquals(
      "7sTs8hTc 5s9c3hQd 4d6c6sKh",
      Solver.process("omaha-holdem 2d5c5h6hKs 5s9c3hQd 7sTs8hTc 4d6c6sKh"));
  }

  @Test
  public void test_omaha_holdem_4455_2h7s9dKcTc_8cAh4s8h_6sTs6h3d_2d2s3cQc_3hAs9sTh_Jd4d7dQs_7h9cKdTd_6d2c3s4h_4c5c5hJc() {
    assertEquals(
      "6d2c3s4h 4c5c5hJc 8cAh4s8h 6sTs6h3d 3hAs9sTh 7h9cKdTd 2d2s3cQc Jd4d7dQs",
      Solver.process("omaha-holdem 2h7s9dKcTc 8cAh4s8h 6sTs6h3d 2d2s3cQc 3hAs9sTh Jd4d7dQs 7h9cKdTd 6d2c3s4h 4c5c5hJc"));
  }

  @Test
  public void test_omaha_holdem_4456_2s4c4h8h8s_3h7hQhJd_6d9hQsAc_QcJs8dTd_6hJcQd2c_KsKcTh7c_2d9s2h3s_Tc8c3c5c() {
    assertEquals(
      "3h7hQhJd 6d9hQsAc 6hJcQd2c KsKcTh7c Tc8c3c5c QcJs8dTd 2d9s2h3s",
      Solver.process("omaha-holdem 2s4c4h8h8s 3h7hQhJd 6d9hQsAc QcJs8dTd 6hJcQd2c KsKcTh7c 2d9s2h3s Tc8c3c5c"));
  }

  @Test
  public void test_omaha_holdem_4457_2c7c7d8dJh_QcTh2hKs_7sKcJcQh_3c4hKd5c_4s9d3hQd_Ac6c8cAs() {
    assertEquals(
      "4s9d3hQd 3c4hKd5c QcTh2hKs Ac6c8cAs 7sKcJcQh",
      Solver.process("omaha-holdem 2c7c7d8dJh QcTh2hKs 7sKcJcQh 3c4hKd5c 4s9d3hQd Ac6c8cAs"));
  }

  @Test
  public void test_omaha_holdem_4458_2d4c5c6cKd_2cTc6d4h_Ah6h5s2s_9d4d5d3d() {
    assertEquals(
      "Ah6h5s2s 9d4d5d3d 2cTc6d4h",
      Solver.process("omaha-holdem 2d4c5c6cKd 2cTc6d4h Ah6h5s2s 9d4d5d3d"));
  }

  @Test
  public void test_omaha_holdem_4459_2h5h8hKdQd_4hAsQc5d_7d5cJd3s_9c2cTh8d_9d6s2s7h_Jh5sJs9h_3hTcKs3d_Kc7cAcQs_Qh9s6cTs_6h3c8s7s() {
    assertEquals(
      "9d6s2s7h 7d5cJd3s 6h3c8s7s Qh9s6cTs 3hTcKs3d 9c2cTh8d 4hAsQc5d Kc7cAcQs Jh5sJs9h",
      Solver.process("omaha-holdem 2h5h8hKdQd 4hAsQc5d 7d5cJd3s 9c2cTh8d 9d6s2s7h Jh5sJs9h 3hTcKs3d Kc7cAcQs Qh9s6cTs 6h3c8s7s"));
  }

  @Test
  public void test_omaha_holdem_4460_6cAdAsJhTc_Qd8s6d4h_4s6hJs9s_8h2c5sQh_3h3d9dAh_4dQs9c4c_7s6s2h5h_3c3s5c7d_KdTdKcKs() {
    assertEquals(
      "8h2c5sQh 3c3s5c7d 4dQs9c4c 7s6s2h5h Qd8s6d4h 4s6hJs9s KdTdKcKs 3h3d9dAh",
      Solver.process("omaha-holdem 6cAdAsJhTc Qd8s6d4h 4s6hJs9s 8h2c5sQh 3h3d9dAh 4dQs9c4c 7s6s2h5h 3c3s5c7d KdTdKcKs"));
  }

  @Test
  public void test_omaha_holdem_4461_3s4c6sJdQh_4hAs2s8c_Ah3d7h5s_TdTc7cKd_Qc9dJs6d_Jh4s2h8h_8dQs4d2c() {
    assertEquals(
      "4hAs2s8c TdTc7cKd Jh4s2h8h 8dQs4d2c Qc9dJs6d Ah3d7h5s",
      Solver.process("omaha-holdem 3s4c6sJdQh 4hAs2s8c Ah3d7h5s TdTc7cKd Qc9dJs6d Jh4s2h8h 8dQs4d2c"));
  }

  @Test
  public void test_omaha_holdem_4462_3s4h8sJcQc_KdTcQdTd_8d2h7dKh_5sJd8h4c_5c9h3h4d_9s9dKc5d_2s2d5hAs() {
    assertEquals(
      "2s2d5hAs 8d2h7dKh 9s9dKc5d KdTcQdTd 5c9h3h4d 5sJd8h4c",
      Solver.process("omaha-holdem 3s4h8sJcQc KdTcQdTd 8d2h7dKh 5sJd8h4c 5c9h3h4d 9s9dKc5d 2s2d5hAs"));
  }

  @Test
  public void test_omaha_holdem_4463_3h7sAcJsQc_2h3c5hAh_Jc7h4c4s_TcAsJd6s() {
    assertEquals(
      "Jc7h4c4s 2h3c5hAh TcAsJd6s",
      Solver.process("omaha-holdem 3h7sAcJsQc 2h3c5hAh Jc7h4c4s TcAsJd6s"));
  }

  @Test
  public void test_omaha_holdem_4464_2h5c9sJdKs_8d9hQc8c_4cAc4s7h() {
    assertEquals(
      "4cAc4s7h 8d9hQc8c",
      Solver.process("omaha-holdem 2h5c9sJdKs 8d9hQc8c 4cAc4s7h"));
  }

  @Test
  public void test_omaha_holdem_4465_5d6s7h9sAh_4d8sQcTd_8dQd2s4s_JdAs9hTc_3dQs7dKc_3sQh2d2h_6h9d5s4c_9c3cKs8c() {
    assertEquals(
      "3sQh2d2h 3dQs7dKc 6h9d5s4c JdAs9hTc 8dQd2s4s 9c3cKs8c 4d8sQcTd",
      Solver.process("omaha-holdem 5d6s7h9sAh 4d8sQcTd 8dQd2s4s JdAs9hTc 3dQs7dKc 3sQh2d2h 6h9d5s4c 9c3cKs8c"));
  }

  @Test
  public void test_omaha_holdem_4466_3c4h7hJcKc_QcKhJhQs_3h2hAsQh_2sTh8d6s_4s7d4cAd_Td2d5dTs_Qd6dJsTc_7s8h6h7c_8c3s3d9c_KsAcAh5s() {
    assertEquals(
      "2sTh8d6s 3h2hAsQh Td2d5dTs Qd6dJsTc KsAcAh5s QcKhJhQs 4s7d4cAd 7s8h6h7c 8c3s3d9c",
      Solver.process("omaha-holdem 3c4h7hJcKc QcKhJhQs 3h2hAsQh 2sTh8d6s 4s7d4cAd Td2d5dTs Qd6dJsTc 7s8h6h7c 8c3s3d9c KsAcAh5s"));
  }

  @Test
  public void test_omaha_holdem_4467_7c8cAcJcQh_9c6hTc9d_KcKh2dAs_6c6dTd5h_Kd4dQc8h_4cJh2c3s_7dThTs8d_Qd3hAh7h_9s3cAd4s() {
    assertEquals(
      "6c6dTd5h 9s3cAd4s KcKh2dAs 7dThTs8d Kd4dQc8h Qd3hAh7h 4cJh2c3s 9c6hTc9d",
      Solver.process("omaha-holdem 7c8cAcJcQh 9c6hTc9d KcKh2dAs 6c6dTd5h Kd4dQc8h 4cJh2c3s 7dThTs8d Qd3hAh7h 9s3cAd4s"));
  }

  @Test
  public void test_omaha_holdem_4468_3s4hKhQsTd_3d6c8s9d_As3h6h8d_7sAh6sKd() {
    assertEquals(
      "3d6c8s9d As3h6h8d 7sAh6sKd",
      Solver.process("omaha-holdem 3s4hKhQsTd 3d6c8s9d As3h6h8d 7sAh6sKd"));
  }

  @Test
  public void test_omaha_holdem_4469_3h3sAcJhTc_5s8h6dQs_Kc4d5d2h_Ts3d7h2c_6c8d7s4s_5h7d9d7c_Qc8c6h4h_2d6sQdTd_KhAs2sJc_3c8sQh9c() {
    assertEquals(
      "6c8d7s4s 5s8h6dQs=Qc8c6h4h Kc4d5d2h 5h7d9d7c 2d6sQdTd KhAs2sJc 3c8sQh9c Ts3d7h2c",
      Solver.process("omaha-holdem 3h3sAcJhTc 5s8h6dQs Kc4d5d2h Ts3d7h2c 6c8d7s4s 5h7d9d7c Qc8c6h4h 2d6sQdTd KhAs2sJc 3c8sQh9c"));
  }

  @Test
  public void test_omaha_holdem_4470_2s4h8sAdQh_7cQdAcJh_8d3hTdKd_Ks6hTs5h_9cKcTc3d() {
    assertEquals(
      "9cKcTc3d=Ks6hTs5h 8d3hTdKd 7cQdAcJh",
      Solver.process("omaha-holdem 2s4h8sAdQh 7cQdAcJh 8d3hTdKd Ks6hTs5h 9cKcTc3d"));
  }

  @Test
  public void test_omaha_holdem_4471_2c7s8sAsJh_Jd4c4h2h_8c2sKcKs_9d5c5dKh_5sTcQhJc() {
    assertEquals(
      "9d5c5dKh 5sTcQhJc Jd4c4h2h 8c2sKcKs",
      Solver.process("omaha-holdem 2c7s8sAsJh Jd4c4h2h 8c2sKcKs 9d5c5dKh 5sTcQhJc"));
  }

  @Test
  public void test_omaha_holdem_4472_2d4c4sJdJs_AcThAdKh_2sKs3s4d_Qc9c9d4h_6h5d9s8h_6s3c7sKd_TsQh9h7c_Td5s6c7d() {
    assertEquals(
      "6h5d9s8h Td5s6c7d TsQh9h7c 6s3c7sKd AcThAdKh Qc9c9d4h 2sKs3s4d",
      Solver.process("omaha-holdem 2d4c4sJdJs AcThAdKh 2sKs3s4d Qc9c9d4h 6h5d9s8h 6s3c7sKd TsQh9h7c Td5s6c7d"));
  }

  @Test
  public void test_omaha_holdem_4473_4d7c9sAhQh_6hQs6s6d_4h4s3hTs_Jd7s8dJc_ThTdAc2s_7dKh3c8c() {
    assertEquals(
      "7dKh3c8c Jd7s8dJc 6hQs6s6d ThTdAc2s 4h4s3hTs",
      Solver.process("omaha-holdem 4d7c9sAhQh 6hQs6s6d 4h4s3hTs Jd7s8dJc ThTdAc2s 7dKh3c8c"));
  }

  @Test
  public void test_omaha_holdem_4474_2h3h4dJsQd_9hQh8h7d_JcAc9d5d() {
    assertEquals(
      "9hQh8h7d JcAc9d5d",
      Solver.process("omaha-holdem 2h3h4dJsQd 9hQh8h7d JcAc9d5d"));
  }

  @Test
  public void test_omaha_holdem_4475_4c4s5d6dTs_2hAc3c9s_5s2c5hTh_Js8hAd8c() {
    assertEquals(
      "Js8hAd8c 2hAc3c9s 5s2c5hTh",
      Solver.process("omaha-holdem 4c4s5d6dTs 2hAc3c9s 5s2c5hTh Js8hAd8c"));
  }

  @Test
  public void test_omaha_holdem_4476_5c7s8sKdQc_3c3dTs6d_KhThAh8h_Tc2s5sAc_4s6h3hQd_Qs7cKc2c_9s4hKs2d_Jc4d2h7d() {
    assertEquals(
      "3c3dTs6d Tc2s5sAc Jc4d2h7d 9s4hKs2d KhThAh8h Qs7cKc2c 4s6h3hQd",
      Solver.process("omaha-holdem 5c7s8sKdQc 3c3dTs6d KhThAh8h Tc2s5sAc 4s6h3hQd Qs7cKc2c 9s4hKs2d Jc4d2h7d"));
  }

  @Test
  public void test_omaha_holdem_4477_2h2s6sJdQh_Kh4h5h2d_Qd4s4d7h_Kc2c6d5d() {
    assertEquals(
      "Qd4s4d7h Kh4h5h2d Kc2c6d5d",
      Solver.process("omaha-holdem 2h2s6sJdQh Kh4h5h2d Qd4s4d7h Kc2c6d5d"));
  }

  @Test
  public void test_omaha_holdem_4478_2c7h7s9dTs_4h2dKs8d_9h9c5cJh_JdKcAcKh_2hQsTcTh_5s8h6h9s_4d4s6cAd_Jc3dQd8c_AhAs3h7c() {
    assertEquals(
      "4h2dKs8d 4d4s6cAd JdKcAcKh AhAs3h7c 5s8h6h9s Jc3dQd8c 9h9c5cJh 2hQsTcTh",
      Solver.process("omaha-holdem 2c7h7s9dTs 4h2dKs8d 9h9c5cJh JdKcAcKh 2hQsTcTh 5s8h6h9s 4d4s6cAd Jc3dQd8c AhAs3h7c"));
  }

  @Test
  public void test_omaha_holdem_4479_3h3s8hJsKd_8sQc8c3d_Ad2cJc9h_5hAcKc3c_7d7sAsQs_4d7h2d6d_9s6c2sJd_TcJh6sTd_9d5dAhKs_4s5c2hQh() {
    assertEquals(
      "4d7h2d6d 4s5c2hQh 7d7sAsQs 9s6c2sJd TcJh6sTd Ad2cJc9h 9d5dAhKs 5hAcKc3c 8sQc8c3d",
      Solver.process("omaha-holdem 3h3s8hJsKd 8sQc8c3d Ad2cJc9h 5hAcKc3c 7d7sAsQs 4d7h2d6d 9s6c2sJd TcJh6sTd 9d5dAhKs 4s5c2hQh"));
  }

  @Test
  public void test_omaha_holdem_4480_3s4c8c9hJd_JhJcAh8s_2s2d3c5d_4s9c5h5s_Qc6c7c8d_5c2hAcTc() {
    assertEquals(
      "5c2hAcTc 2s2d3c5d Qc6c7c8d 4s9c5h5s JhJcAh8s",
      Solver.process("omaha-holdem 3s4c8c9hJd JhJcAh8s 2s2d3c5d 4s9c5h5s Qc6c7c8d 5c2hAcTc"));
  }

  @Test
  public void test_omaha_holdem_4481_4h6d6hTdTh_KhKs9h8d_8cKcQc2d() {
    assertEquals(
      "8cKcQc2d KhKs9h8d",
      Solver.process("omaha-holdem 4h6d6hTdTh KhKs9h8d 8cKcQc2d"));
  }

  @Test
  public void test_omaha_holdem_4482_2c5s8sKhTd_5c2d2s7h_KcAc4h3d_6cQsJsTs_8cAd9cJd_TcQcKd8d_2h5d6dTh_As6h7c8h_7d9h4d3s() {
    assertEquals(
      "7d9h4d3s 8cAd9cJd=As6h7c8h 6cQsJsTs KcAc4h3d 2h5d6dTh TcQcKd8d 5c2d2s7h",
      Solver.process("omaha-holdem 2c5s8sKhTd 5c2d2s7h KcAc4h3d 6cQsJsTs 8cAd9cJd TcQcKd8d 2h5d6dTh As6h7c8h 7d9h4d3s"));
  }

  @Test
  public void test_omaha_holdem_4483_8d8h9sKdQc_As8cKsTh_5c9d7s6s_QsTd7d4s() {
    assertEquals(
      "5c9d7s6s QsTd7d4s As8cKsTh",
      Solver.process("omaha-holdem 8d8h9sKdQc As8cKsTh 5c9d7s6s QsTd7d4s"));
  }

  @Test
  public void test_omaha_holdem_4484_3s6sAcJdQh_2cKsKc6h_3hTsKdJc_5sTc6cAd() {
    assertEquals(
      "2cKsKc6h 5sTc6cAd 3hTsKdJc",
      Solver.process("omaha-holdem 3s6sAcJdQh 2cKsKc6h 3hTsKdJc 5sTc6cAd"));
  }

  @Test
  public void test_omaha_holdem_4485_7s9hJhQdTc_As5dJc7d_Th3c3s3h_Kc8h4h4c_KsAh6c5c_9c2h4s4d() {
    assertEquals(
      "Kc8h4h4c 9c2h4s4d Th3c3s3h As5dJc7d KsAh6c5c",
      Solver.process("omaha-holdem 7s9hJhQdTc As5dJc7d Th3c3s3h Kc8h4h4c KsAh6c5c 9c2h4s4d"));
  }

  @Test
  public void test_omaha_holdem_4486_2c4s8s9dTc_3d7s8hAd_9sTs2s8c_7hAcJhKs() {
    assertEquals(
      "3d7s8hAd 9sTs2s8c 7hAcJhKs",
      Solver.process("omaha-holdem 2c4s8s9dTc 3d7s8hAd 9sTs2s8c 7hAcJhKs"));
  }

  @Test
  public void test_omaha_holdem_4487_3h4h8cAcQc_7hKd3c7s_AdTc6c5d_9s2dKc4d_4cKh2sQd_5c3d8h5s_8s9c9dAs_6h6s2hKs_Jh8d6dAh() {
    assertEquals(
      "9s2dKc4d 6h6s2hKs 7hKd3c7s 5c3d8h5s 4cKh2sQd 8s9c9dAs=Jh8d6dAh AdTc6c5d",
      Solver.process("omaha-holdem 3h4h8cAcQc 7hKd3c7s AdTc6c5d 9s2dKc4d 4cKh2sQd 5c3d8h5s 8s9c9dAs 6h6s2hKs Jh8d6dAh"));
  }

  @Test
  public void test_omaha_holdem_4488_3h4cAhJdQc_Ad8hAsKd_KsKc5c2s_9s9hQsQh_8c4h5s9c() {
    assertEquals(
      "8c4h5s9c 9s9hQsQh Ad8hAsKd KsKc5c2s",
      Solver.process("omaha-holdem 3h4cAhJdQc Ad8hAsKd KsKc5c2s 9s9hQsQh 8c4h5s9c"));
  }

  @Test
  public void test_omaha_holdem_4489_3c5h7hJcQd_6sAs8hQh_8dTc8c3s_5dJsKcTh_2d9d2sJd() {
    assertEquals(
      "8dTc8c3s 2d9d2sJd 6sAs8hQh 5dJsKcTh",
      Solver.process("omaha-holdem 3c5h7hJcQd 6sAs8hQh 8dTc8c3s 5dJsKcTh 2d9d2sJd"));
  }

  @Test
  public void test_omaha_holdem_4490_2s7h9sJcKd_5s3sQh6c_9c6sAd7d_Td8d8s6h_7sQs7cTh() {
    assertEquals(
      "5s3sQh6c 9c6sAd7d Td8d8s6h 7sQs7cTh",
      Solver.process("omaha-holdem 2s7h9sJcKd 5s3sQh6c 9c6sAd7d Td8d8s6h 7sQs7cTh"));
  }

  @Test
  public void test_omaha_holdem_4491_4c5c9dAcKh_5dQc6c3s_Jc9c4s4h_Ad3d8s9s_7d7sTh7h_5sJdKdJs_9hKsAh3h_8c7cTc4d_QhAs8h2h() {
    assertEquals(
      "7d7sTh7h QhAs8h2h 5sJdKdJs Ad3d8s9s 9hKsAh3h 8c7cTc4d Jc9c4s4h 5dQc6c3s",
      Solver.process("omaha-holdem 4c5c9dAcKh 5dQc6c3s Jc9c4s4h Ad3d8s9s 7d7sTh7h 5sJdKdJs 9hKsAh3h 8c7cTc4d QhAs8h2h"));
  }

  @Test
  public void test_omaha_holdem_4492_2h4c6d7sTs_Jc9s4sTc_QdJh2cKd() {
    assertEquals(
      "QdJh2cKd Jc9s4sTc",
      Solver.process("omaha-holdem 2h4c6d7sTs Jc9s4sTc QdJh2cKd"));
  }

  @Test
  public void test_omaha_holdem_4493_3c3h4cAcJh_Td7hKdTh_2s4s2cKc_9c8dAd7d_KhKs3s7c_Qs4h6h4d_5sJs2d6s_7s5cAh8s_9sQdAs5d_TsQcJc6c() {
    assertEquals(
      "Td7hKdTh 7s5cAh8s 9c8dAd7d 9sQdAs5d KhKs3s7c 5sJs2d6s TsQcJc6c 2s4s2cKc Qs4h6h4d",
      Solver.process("omaha-holdem 3c3h4cAcJh Td7hKdTh 2s4s2cKc 9c8dAd7d KhKs3s7c Qs4h6h4d 5sJs2d6s 7s5cAh8s 9sQdAs5d TsQcJc6c"));
  }

  @Test
  public void test_omaha_holdem_4494_4s5h5s9dQh_Jc3h7sAs_2h6c6s9s_TsAcKhKd_5cJd8sTd_JhKsKcAh_Js3c4d9c_Qd6d2d3d_7c7h2s9h_7d5d2c4c() {
    assertEquals(
      "Jc3h7sAs 2h6c6s9s 7c7h2s9h Js3c4d9c Qd6d2d3d JhKsKcAh=TsAcKhKd 5cJd8sTd 7d5d2c4c",
      Solver.process("omaha-holdem 4s5h5s9dQh Jc3h7sAs 2h6c6s9s TsAcKhKd 5cJd8sTd JhKsKcAh Js3c4d9c Qd6d2d3d 7c7h2s9h 7d5d2c4c"));
  }

  @Test
  public void test_omaha_holdem_4495_3h6d9sJcQc_Ah9h4dTd_Tc7s8h4c_4s9dKsJd_6c7dAc2s_As2d7h6s_KdQsJsKc_Kh3d5d8d_Jh7cThAd_2c5s5h8s() {
    assertEquals(
      "Kh3d5d8d 2c5s5h8s 6c7dAc2s=As2d7h6s Ah9h4dTd Jh7cThAd 4s9dKsJd KdQsJsKc Tc7s8h4c",
      Solver.process("omaha-holdem 3h6d9sJcQc Ah9h4dTd Tc7s8h4c 4s9dKsJd 6c7dAc2s As2d7h6s KdQsJsKc Kh3d5d8d Jh7cThAd 2c5s5h8s"));
  }

  @Test
  public void test_omaha_holdem_4496_2h3d3h7cQs_KdAdJdQc_5cKs3s6d_5hTc8d9h_QhTd6hTh_Kc5d5s3c_7h4sJsQd_As9d7s7d() {
    assertEquals(
      "5hTc8d9h QhTd6hTh KdAdJdQc 7h4sJsQd 5cKs3s6d=Kc5d5s3c As9d7s7d",
      Solver.process("omaha-holdem 2h3d3h7cQs KdAdJdQc 5cKs3s6d 5hTc8d9h QhTd6hTh Kc5d5s3c 7h4sJsQd As9d7s7d"));
  }

  @Test
  public void test_omaha_holdem_4497_3s5h8sAcKc_6d9c6h3c_Jc4dJdAd_8hKd9dTc_8c4s6s7s() {
    assertEquals(
      "6d9c6h3c 8c4s6s7s Jc4dJdAd 8hKd9dTc",
      Solver.process("omaha-holdem 3s5h8sAcKc 6d9c6h3c Jc4dJdAd 8hKd9dTc 8c4s6s7s"));
  }

  @Test
  public void test_omaha_holdem_4498_2h8dQsTcTd_9s5hAdTh_Jc3c8hKc_6cQc2s6h_5sQh9d3s_9c5cJs3d_KsJd2c2d_6d7s3h6s() {
    assertEquals(
      "6d7s3h6s Jc3c8hKc 6cQc2s6h 5sQh9d3s 9s5hAdTh 9c5cJs3d KsJd2c2d",
      Solver.process("omaha-holdem 2h8dQsTcTd 9s5hAdTh Jc3c8hKc 6cQc2s6h 5sQh9d3s 9c5cJs3d KsJd2c2d 6d7s3h6s"));
  }

  @Test
  public void test_omaha_holdem_4499_2c3d9sKhTd_6cQs4s7h_4cKs8dQc_AhJs9h5h_5c6h2s7c_Qh7s9d8c_4h5sQdTs() {
    assertEquals(
      "6cQs4s7h 5c6h2s7c Qh7s9d8c AhJs9h5h 4h5sQdTs 4cKs8dQc",
      Solver.process("omaha-holdem 2c3d9sKhTd 6cQs4s7h 4cKs8dQc AhJs9h5h 5c6h2s7c Qh7s9d8c 4h5sQdTs"));
  }

}
