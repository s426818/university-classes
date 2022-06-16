
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver17HiddenTest {


  @Test
  public void test_texas_holdem_4250_5c8d8h9sAd_4s8c_Tc4h_4d7h_3d5h_9dQs_5sKs_6sKh() {
    assertEquals(
      "4d7h Tc4h 6sKh 3d5h=5sKs 9dQs 4s8c",
      Solver.process("texas-holdem 5c8d8h9sAd 4s8c Tc4h 4d7h 3d5h 9dQs 5sKs 6sKh"));
  }

  @Test
  public void test_texas_holdem_4251_4d5h9dQcQh_Ts9h_4cJd_8cTc_2s9c_5cQs_8s6s_5sTh_3h9s() {
    assertEquals(
      "8s6s 8cTc 4cJd 5sTh 2s9c=3h9s Ts9h 5cQs",
      Solver.process("texas-holdem 4d5h9dQcQh Ts9h 4cJd 8cTc 2s9c 5cQs 8s6s 5sTh 3h9s"));
  }

  @Test
  public void test_texas_holdem_4252_3c5s9sAcJh_JcTh_7c8s_TcQh_5c6d_Js6h_9d8d_Qd2h_Kc7d() {
    assertEquals(
      "7c8s Qd2h TcQh Kc7d 5c6d 9d8d Js6h JcTh",
      Solver.process("texas-holdem 3c5s9sAcJh JcTh 7c8s TcQh 5c6d Js6h 9d8d Qd2h Kc7d"));
  }

  @Test
  public void test_texas_holdem_4253_2c6h6s7hKh_3h9s_7c2h_Qs4s_5hQh_Kd8c_2d9d_Qd2s_TdJd_Th4c() {
    assertEquals(
      "3h9s Th4c TdJd Qs4s 2d9d=Qd2s 7c2h Kd8c 5hQh",
      Solver.process("texas-holdem 2c6h6s7hKh 3h9s 7c2h Qs4s 5hQh Kd8c 2d9d Qd2s TdJd Th4c"));
  }

  @Test
  public void test_texas_holdem_4254_2d3h4h5d7d_6cKc_2h2s_Th8d_5c9d_QhTs_8s6h_As4d_7cAd() {
    assertEquals(
      "Th8d QhTs 5c9d 2h2s 7cAd=As4d 6cKc 8s6h",
      Solver.process("texas-holdem 2d3h4h5d7d 6cKc 2h2s Th8d 5c9d QhTs 8s6h As4d 7cAd"));
  }

  @Test
  public void test_texas_holdem_4255_2d3c5cKhTh_JdQs_8hKs_Qh7d_Td2c_Ad7s_5d4h_4sKd_3s8c() {
    assertEquals(
      "Qh7d JdQs Ad7s 3s8c 5d4h 4sKd 8hKs Td2c",
      Solver.process("texas-holdem 2d3c5cKhTh JdQs 8hKs Qh7d Td2c Ad7s 5d4h 4sKd 3s8c"));
  }

  @Test
  public void test_texas_holdem_4256_3s4d5s6h8d_TcTd_4h6s_JhKd_9cJs() {
    assertEquals(
      "9cJs JhKd TcTd 4h6s",
      Solver.process("texas-holdem 3s4d5s6h8d TcTd 4h6s JhKd 9cJs"));
  }

  @Test
  public void test_texas_holdem_4257_5s9hKdQcTh_7d8h_KsJd_2cTc_As5c_5dAh_6d7h_Jc6s_Qh4c_AdTs() {
    assertEquals(
      "6d7h 7d8h 5dAh=As5c 2cTc AdTs Qh4c Jc6s=KsJd",
      Solver.process("texas-holdem 5s9hKdQcTh 7d8h KsJd 2cTc As5c 5dAh 6d7h Jc6s Qh4c AdTs"));
  }

  @Test
  public void test_texas_holdem_4258_2c2h2s3c6s_4c9c_Td8h() {
    assertEquals(
      "4c9c Td8h",
      Solver.process("texas-holdem 2c2h2s3c6s 4c9c Td8h"));
  }

  @Test
  public void test_texas_holdem_4259_3h5d5h9cAd_6cQs_8hAc_Tc4s_Td3s() {
    assertEquals(
      "Tc4s 6cQs Td3s 8hAc",
      Solver.process("texas-holdem 3h5d5h9cAd 6cQs 8hAc Tc4s Td3s"));
  }

  @Test
  public void test_texas_holdem_4260_3d6s9hJdQc_5s6h_Ks3h() {
    assertEquals(
      "Ks3h 5s6h",
      Solver.process("texas-holdem 3d6s9hJdQc 5s6h Ks3h"));
  }

  @Test
  public void test_texas_holdem_4261_5c5h8h8s9h_Jd9d_8cQd_8dQc_4hTh_Ah4s_9c6h_5d7d_TsJh() {
    assertEquals(
      "TsJh Ah4s 9c6h Jd9d 4hTh 5d7d 8cQd=8dQc",
      Solver.process("texas-holdem 5c5h8h8s9h Jd9d 8cQd 8dQc 4hTh Ah4s 9c6h 5d7d TsJh"));
  }

  @Test
  public void test_texas_holdem_4262_5d7sAhQdTc_JsKh_3h9c_KcTs_Kd3s() {
    assertEquals(
      "3h9c Kd3s KcTs JsKh",
      Solver.process("texas-holdem 5d7sAhQdTc JsKh 3h9c KcTs Kd3s"));
  }

  @Test
  public void test_texas_holdem_4263_7s8dJcKcKs_3s6s_2h2c_Qc9s() {
    assertEquals(
      "3s6s Qc9s 2h2c",
      Solver.process("texas-holdem 7s8dJcKcKs 3s6s 2h2c Qc9s"));
  }

  @Test
  public void test_texas_holdem_4264_2d7cJhTdTs_JdKd_7sTh_Kc2h_Ah8h_9s3d_Qs7d_9cQc_8c5d_5c8s() {
    assertEquals(
      "5c8s=8c5d 9s3d 9cQc Ah8h Kc2h Qs7d JdKd 7sTh",
      Solver.process("texas-holdem 2d7cJhTdTs JdKd 7sTh Kc2h Ah8h 9s3d Qs7d 9cQc 8c5d 5c8s"));
  }

  @Test
  public void test_texas_holdem_4265_5c6d7cKcKh_AdQs_9dJd_Js9h_As3c_5hKs_4h3s_5s8h_6hJc_Qd2d() {
    assertEquals(
      "9dJd=Js9h Qd2d As3c AdQs 5s8h 6hJc 4h3s 5hKs",
      Solver.process("texas-holdem 5c6d7cKcKh AdQs 9dJd Js9h As3c 5hKs 4h3s 5s8h 6hJc Qd2d"));
  }

  @Test
  public void test_texas_holdem_4266_3cJhKcKhQs_2s2d_KdQd_7d7s_AcQh_3d8s_ThTc_6cAs_5cTd() {
    assertEquals(
      "5cTd 6cAs 2s2d 3d8s 7d7s ThTc AcQh KdQd",
      Solver.process("texas-holdem 3cJhKcKhQs 2s2d KdQd 7d7s AcQh 3d8s ThTc 6cAs 5cTd"));
  }

  @Test
  public void test_texas_holdem_4267_5h6c7d8hQd_5d2c_9c6h_2dKh_4cAs_8s4s_3h3d_8c6d_5cQs() {
    assertEquals(
      "2dKh 3h3d 5d2c 8c6d 5cQs 4cAs=8s4s 9c6h",
      Solver.process("texas-holdem 5h6c7d8hQd 5d2c 9c6h 2dKh 4cAs 8s4s 3h3d 8c6d 5cQs"));
  }

  @Test
  public void test_texas_holdem_4268_7d8sAcAhJs_Qd5s_8h5h_Kc2c_Qc4c_2dTc_8dKs_9sTd() {
    assertEquals(
      "2dTc Qc4c=Qd5s Kc2c 8h5h 8dKs 9sTd",
      Solver.process("texas-holdem 7d8sAcAhJs Qd5s 8h5h Kc2c Qc4c 2dTc 8dKs 9sTd"));
  }

  @Test
  public void test_texas_holdem_4269_2c3d3h4s7s_9sKs_6cKd_Ah9d_Qs9h_8hJh_4c8s() {
    assertEquals(
      "8hJh Qs9h 6cKd 9sKs Ah9d 4c8s",
      Solver.process("texas-holdem 2c3d3h4s7s 9sKs 6cKd Ah9d Qs9h 8hJh 4c8s"));
  }

  @Test
  public void test_texas_holdem_4270_3c3s4cJcTd_2dQh_3h9c_4s2s_As8h_3d8d_4h9d() {
    assertEquals(
      "2dQh As8h 4h9d=4s2s 3d8d=3h9c",
      Solver.process("texas-holdem 3c3s4cJcTd 2dQh 3h9c 4s2s As8h 3d8d 4h9d"));
  }

  @Test
  public void test_texas_holdem_4271_4h8dAcKhQd_5h5d_3c4s_TsKs_8h2s() {
    assertEquals(
      "3c4s 5h5d 8h2s TsKs",
      Solver.process("texas-holdem 4h8dAcKhQd 5h5d 3c4s TsKs 8h2s"));
  }

  @Test
  public void test_texas_holdem_4272_4d4sAsJsTs_7cKd_Jd9s_3c3s_Qs7s_3h4h_4c6s_6d7h_6c2c() {
    assertEquals(
      "6c2c=6d7h 7cKd 3h4h 3c3s 4c6s Jd9s Qs7s",
      Solver.process("texas-holdem 4d4sAsJsTs 7cKd Jd9s 3c3s Qs7s 3h4h 4c6s 6d7h 6c2c"));
  }

  @Test
  public void test_texas_holdem_4273_2c5s6c6dKd_7d9h_6s7c_Qh5c_2hAh_JdQc() {
    assertEquals(
      "7d9h JdQc 2hAh Qh5c 6s7c",
      Solver.process("texas-holdem 2c5s6c6dKd 7d9h 6s7c Qh5c 2hAh JdQc"));
  }

  @Test
  public void test_texas_holdem_4274_6sAdQhQsTs_Ac8d_7cTd_KhJd_7s7d_8h2c_5s4d_9d2s_Tc3h() {
    assertEquals(
      "5s4d 8h2c 9d2s 7s7d 7cTd=Tc3h Ac8d KhJd",
      Solver.process("texas-holdem 6sAdQhQsTs Ac8d 7cTd KhJd 7s7d 8h2c 5s4d 9d2s Tc3h"));
  }

  @Test
  public void test_texas_holdem_4275_4c7h8sAcKd_Ks3d_5c5d_Jd5s_QhTd_7cAh_JcTs_Qs5h_9s9d() {
    assertEquals(
      "Jd5s JcTs Qs5h QhTd 5c5d 9s9d Ks3d 7cAh",
      Solver.process("texas-holdem 4c7h8sAcKd Ks3d 5c5d Jd5s QhTd 7cAh JcTs Qs5h 9s9d"));
  }

  @Test
  public void test_texas_holdem_4276_3h5h8dJsQh_4cAd_QsKd() {
    assertEquals(
      "4cAd QsKd",
      Solver.process("texas-holdem 3h5h8dJsQh 4cAd QsKd"));
  }

  @Test
  public void test_texas_holdem_4277_4s6s7hAdAh_9c2h_Qs6c_8c5d_Td9s_6d4c_7c2c() {
    assertEquals(
      "9c2h Td9s 6d4c Qs6c 7c2c 8c5d",
      Solver.process("texas-holdem 4s6s7hAdAh 9c2h Qs6c 8c5d Td9s 6d4c 7c2c"));
  }

  @Test
  public void test_texas_holdem_4278_2dKcKhQcTh_Jc8s_2h9h_Ah8c_3sKs_3cTs_7s6c_QhTd() {
    assertEquals(
      "7s6c Jc8s Ah8c 2h9h 3cTs QhTd 3sKs",
      Solver.process("texas-holdem 2dKcKhQcTh Jc8s 2h9h Ah8c 3sKs 3cTs 7s6c QhTd"));
  }

  @Test
  public void test_texas_holdem_4279_2c8h9cKhQh_4cAs_Jh7d_5c3c() {
    assertEquals(
      "5c3c Jh7d 4cAs",
      Solver.process("texas-holdem 2c8h9cKhQh 4cAs Jh7d 5c3c"));
  }

  @Test
  public void test_texas_holdem_4280_4s6s7hAhKd_7cJd_Qd9h_8s7d_5d4c_6c8c_9cTc_As5s_4dKc_Qh9d() {
    assertEquals(
      "9cTc Qd9h=Qh9d 5d4c 6c8c 8s7d 7cJd As5s 4dKc",
      Solver.process("texas-holdem 4s6s7hAhKd 7cJd Qd9h 8s7d 5d4c 6c8c 9cTc As5s 4dKc Qh9d"));
  }

  @Test
  public void test_texas_holdem_4281_2h3c3h3s4s_6s8h_Td7d_KdAs() {
    assertEquals(
      "6s8h Td7d KdAs",
      Solver.process("texas-holdem 2h3c3h3s4s 6s8h Td7d KdAs"));
  }

  @Test
  public void test_texas_holdem_4282_3c5d8d9dKh_5cTd_6dAc_6h9c_8s2c_4s3s_8hKd_5hTc_7dJh() {
    assertEquals(
      "7dJh 6dAc 4s3s 5cTd=5hTc 8s2c 6h9c 8hKd",
      Solver.process("texas-holdem 3c5d8d9dKh 5cTd 6dAc 6h9c 8s2c 4s3s 8hKd 5hTc 7dJh"));
  }

  @Test
  public void test_texas_holdem_4283_5hJdJsQsTd_9c8d_6d4c_3h6c_7h2d_5d8c_7s4s_Ad4d_2h7d_Qc2c() {
    assertEquals(
      "3h6c=6d4c 2h7d=7h2d=7s4s Ad4d 5d8c Qc2c 9c8d",
      Solver.process("texas-holdem 5hJdJsQsTd 9c8d 6d4c 3h6c 7h2d 5d8c 7s4s Ad4d 2h7d Qc2c"));
  }

  @Test
  public void test_texas_holdem_4284_5s8s9c9dAc_6d3d_QcKd_2sTs() {
    assertEquals(
      "6d3d 2sTs QcKd",
      Solver.process("texas-holdem 5s8s9c9dAc 6d3d QcKd 2sTs"));
  }

  @Test
  public void test_texas_holdem_4285_3c3s6dJdJh_Qc3h_Kd5h() {
    assertEquals(
      "Kd5h Qc3h",
      Solver.process("texas-holdem 3c3s6dJdJh Qc3h Kd5h"));
  }

  @Test
  public void test_texas_holdem_4286_5c5d6d8d9c_8cQc_7dAs_5h3d_2h9d_Jc2s_3cJh_3hAh_QhAc_6hTd() {
    assertEquals(
      "3cJh=Jc2s 3hAh QhAc 6hTd 8cQc 2h9d 5h3d 7dAs",
      Solver.process("texas-holdem 5c5d6d8d9c 8cQc 7dAs 5h3d 2h9d Jc2s 3cJh 3hAh QhAc 6hTd"));
  }

  @Test
  public void test_texas_holdem_4287_9dAdKcKsQh_Qd7s_7cAs_2s5h() {
    assertEquals(
      "2s5h Qd7s 7cAs",
      Solver.process("texas-holdem 9dAdKcKsQh Qd7s 7cAs 2s5h"));
  }

  @Test
  public void test_texas_holdem_4288_3h5d6s8s9d_4cTs_7dKd() {
    assertEquals(
      "4cTs 7dKd",
      Solver.process("texas-holdem 3h5d6s8s9d 4cTs 7dKd"));
  }

  @Test
  public void test_texas_holdem_4289_9cKcQhTcTh_9dKs_5c7d_4dJd_8dKd_Qc4c_5hJs() {
    assertEquals(
      "5c7d 8dKd=9dKs 4dJd=5hJs Qc4c",
      Solver.process("texas-holdem 9cKcQhTcTh 9dKs 5c7d 4dJd 8dKd Qc4c 5hJs"));
  }

  @Test
  public void test_texas_holdem_4290_2d4d5c6hKs_AcJc_5d4h_Kd6d_ThAs() {
    assertEquals(
      "ThAs AcJc 5d4h Kd6d",
      Solver.process("texas-holdem 2d4d5c6hKs AcJc 5d4h Kd6d ThAs"));
  }

  @Test
  public void test_texas_holdem_4291_2d4d7d7hAd_Kd5h_Ac8h_3cJc_KhJs() {
    assertEquals(
      "3cJc KhJs Ac8h Kd5h",
      Solver.process("texas-holdem 2d4d7d7hAd Kd5h Ac8h 3cJc KhJs"));
  }

  @Test
  public void test_texas_holdem_4292_4h8s9c9hKd_5sAc_Jc2h() {
    assertEquals(
      "Jc2h 5sAc",
      Solver.process("texas-holdem 4h8s9c9hKd 5sAc Jc2h"));
  }

  @Test
  public void test_texas_holdem_4293_2d5s9cJdKs_3c7s_Ah6s() {
    assertEquals(
      "3c7s Ah6s",
      Solver.process("texas-holdem 2d5s9cJdKs 3c7s Ah6s"));
  }

  @Test
  public void test_texas_holdem_4294_5s7s9cJhKd_Kh8h_Js5d_4dAh_Ad2d_9s4c() {
    assertEquals(
      "4dAh=Ad2d 9s4c Kh8h Js5d",
      Solver.process("texas-holdem 5s7s9cJhKd Kh8h Js5d 4dAh Ad2d 9s4c"));
  }

  @Test
  public void test_texas_holdem_4295_4c4h6d7c9h_KcKs_Ad5c_Qh3c_TsKd_3d7h_Js5s_2s2c_7d5h() {
    assertEquals(
      "Js5s Qh3c TsKd Ad5c 2s2c 3d7h=7d5h KcKs",
      Solver.process("texas-holdem 4c4h6d7c9h KcKs Ad5c Qh3c TsKd 3d7h Js5s 2s2c 7d5h"));
  }

  @Test
  public void test_texas_holdem_4296_4s7dKcTcTh_KdJd_QhAs_4h7s() {
    assertEquals(
      "QhAs 4h7s KdJd",
      Solver.process("texas-holdem 4s7dKcTcTh KdJd QhAs 4h7s"));
  }

  @Test
  public void test_texas_holdem_4297_2h7c8h8sAh_3h3s_7dKs_5sTh_TsJs() {
    assertEquals(
      "5sTh TsJs 3h3s 7dKs",
      Solver.process("texas-holdem 2h7c8h8sAh 3h3s 7dKs 5sTh TsJs"));
  }

  @Test
  public void test_texas_holdem_4298_5h7c7hAcKd_8cQd_Jd9d_TcTh_7d2h_Kh3h_3sJs_5c4c_9h3c() {
    assertEquals(
      "9h3c 3sJs=Jd9d 8cQd 5c4c TcTh Kh3h 7d2h",
      Solver.process("texas-holdem 5h7c7hAcKd 8cQd Jd9d TcTh 7d2h Kh3h 3sJs 5c4c 9h3c"));
  }

  @Test
  public void test_texas_holdem_4299_4c5h6dJcQd_7dQh_7c9c_QsQc_6h5d_4d4h_Ac9d() {
    assertEquals(
      "7c9c Ac9d 7dQh 6h5d 4d4h QsQc",
      Solver.process("texas-holdem 4c5h6dJcQd 7dQh 7c9c QsQc 6h5d 4d4h Ac9d"));
  }

  @Test
  public void test_texas_holdem_4300_5c8hJhKdKh_Kc6h_6dAh_9h4d_7hTd_4s4h_7d5d() {
    assertEquals(
      "9h4d 7hTd 6dAh 4s4h 7d5d Kc6h",
      Solver.process("texas-holdem 5c8hJhKdKh Kc6h 6dAh 9h4d 7hTd 4s4h 7d5d"));
  }

  @Test
  public void test_texas_holdem_4301_2c3h5s6s8s_2s9s_Qs6c_7c7d_9dKc_Jd8d_8hAc() {
    assertEquals(
      "9dKc Qs6c 7c7d Jd8d 8hAc 2s9s",
      Solver.process("texas-holdem 2c3h5s6s8s 2s9s Qs6c 7c7d 9dKc Jd8d 8hAc"));
  }

  @Test
  public void test_texas_holdem_4302_4d6sJcKcQd_5d8d_2dQc_2s4c_7c7d() {
    assertEquals(
      "5d8d 2s4c 7c7d 2dQc",
      Solver.process("texas-holdem 4d6sJcKcQd 5d8d 2dQc 2s4c 7c7d"));
  }

  @Test
  public void test_texas_holdem_4303_9dAdAhJdKh_9s2c_Qd8h_6sKc_8d8s_6h9h_2d2h_7cQh_TdTs() {
    assertEquals(
      "7cQh=Qd8h 2d2h 8d8s 6h9h=9s2c TdTs 6sKc",
      Solver.process("texas-holdem 9dAdAhJdKh 9s2c Qd8h 6sKc 8d8s 6h9h 2d2h 7cQh TdTs"));
  }

  @Test
  public void test_texas_holdem_4304_5c6d6s9cAd_3hTh_8d7h_Ac7c_2h2s_9sAh_Qd6c_8sJh() {
    assertEquals(
      "3hTh 8sJh 2h2s Ac7c 9sAh Qd6c 8d7h",
      Solver.process("texas-holdem 5c6d6s9cAd 3hTh 8d7h Ac7c 2h2s 9sAh Qd6c 8sJh"));
  }

  @Test
  public void test_texas_holdem_4305_7d7hAhJsKd_7c9s_6cKs_Jc2h_7sTh_8c4s_QcQd_Jd8h_3h4d_TsQh() {
    assertEquals(
      "3h4d=8c4s Jc2h=Jd8h QcQd 6cKs 7c9s=7sTh TsQh",
      Solver.process("texas-holdem 7d7hAhJsKd 7c9s 6cKs Jc2h 7sTh 8c4s QcQd Jd8h 3h4d TsQh"));
  }

  @Test
  public void test_texas_holdem_4306_AsJdJsKsTh_7h3h_TcKh_8h4d_6s6d_7sAd_5sQs_6cTd() {
    assertEquals(
      "7h3h=8h4d 6s6d 6cTd TcKh 7sAd 5sQs",
      Solver.process("texas-holdem AsJdJsKsTh 7h3h TcKh 8h4d 6s6d 7sAd 5sQs 6cTd"));
  }

  @Test
  public void test_texas_holdem_4307_2d5c6dAcTc_AdJh_7d8h_5s3d_8d8c_9s8s_KhAh_JcQh_Ts3c() {
    assertEquals(
      "7d8h 9s8s JcQh 5s3d 8d8c Ts3c AdJh KhAh",
      Solver.process("texas-holdem 2d5c6dAcTc AdJh 7d8h 5s3d 8d8c 9s8s KhAh JcQh Ts3c"));
  }

  @Test
  public void test_texas_holdem_4308_2c6c8cJdJs_Kh9h_9d9s_8s9c_5c5d_4dQc_Ad3h_7d4s() {
    assertEquals(
      "7d4s 4dQc Kh9h Ad3h 5c5d 8s9c 9d9s",
      Solver.process("texas-holdem 2c6c8cJdJs Kh9h 9d9s 8s9c 5c5d 4dQc Ad3h 7d4s"));
  }

  @Test
  public void test_texas_holdem_4309_2c6dAdKsTs_Jd4c_Ah7h_8s2d_8h5s() {
    assertEquals(
      "8h5s Jd4c 8s2d Ah7h",
      Solver.process("texas-holdem 2c6dAdKsTs Jd4c Ah7h 8s2d 8h5s"));
  }

  @Test
  public void test_texas_holdem_4310_2s4h6s8d9d_ThJc_KsKd() {
    assertEquals(
      "ThJc KsKd",
      Solver.process("texas-holdem 2s4h6s8d9d ThJc KsKd"));
  }

  @Test
  public void test_texas_holdem_4311_2d3h8hKdTc_3cTh_JdQs_7h4s_4dJs_6cAd_6d2c_8d9d_4hTd() {
    assertEquals(
      "7h4s 4dJs JdQs 6cAd 6d2c 8d9d 4hTd 3cTh",
      Solver.process("texas-holdem 2d3h8hKdTc 3cTh JdQs 7h4s 4dJs 6cAd 6d2c 8d9d 4hTd"));
  }

  @Test
  public void test_texas_holdem_4312_6d6h9dJdKs_9h4s_2c4c_5s7d_3h9c_8c6c() {
    assertEquals(
      "2c4c=5s7d 3h9c=9h4s 8c6c",
      Solver.process("texas-holdem 6d6h9dJdKs 9h4s 2c4c 5s7d 3h9c 8c6c"));
  }

  @Test
  public void test_texas_holdem_4313_4d5c6d7c9s_8s3s_4c2h_Jc7d_8cTh() {
    assertEquals(
      "4c2h Jc7d 8s3s 8cTh",
      Solver.process("texas-holdem 4d5c6d7c9s 8s3s 4c2h Jc7d 8cTh"));
  }

  @Test
  public void test_texas_holdem_4314_2c2d3sKsTh_8s6c_8dAc_2s7d_AhJh_Qh9s_As4d_5dTs() {
    assertEquals(
      "8s6c Qh9s 8dAc=As4d AhJh 5dTs 2s7d",
      Solver.process("texas-holdem 2c2d3sKsTh 8s6c 8dAc 2s7d AhJh Qh9s As4d 5dTs"));
  }

  @Test
  public void test_texas_holdem_4315_2h6dQhQsTc_8h4s_TsJh_Qc5d_6h9c_AcAs() {
    assertEquals(
      "8h4s 6h9c TsJh AcAs Qc5d",
      Solver.process("texas-holdem 2h6dQhQsTc 8h4s TsJh Qc5d 6h9c AcAs"));
  }

  @Test
  public void test_texas_holdem_4316_8sKdKhQcTd_4d4h_6dTs_Th3s_Qh2h_2c4s_8h3c_4cTc_As6s() {
    assertEquals(
      "2c4s As6s 4d4h 8h3c 4cTc=6dTs=Th3s Qh2h",
      Solver.process("texas-holdem 8sKdKhQcTd 4d4h 6dTs Th3s Qh2h 2c4s 8h3c 4cTc As6s"));
  }

  @Test
  public void test_texas_holdem_4317_2d3s6c7dJh_6hQc_5c6d_Kd5h_3dAh_8c8d_Ad2h_QsKh_8s5d_Qh4c() {
    assertEquals(
      "8s5d Qh4c Kd5h QsKh Ad2h 3dAh 5c6d 6hQc 8c8d",
      Solver.process("texas-holdem 2d3s6c7dJh 6hQc 5c6d Kd5h 3dAh 8c8d Ad2h QsKh 8s5d Qh4c"));
  }

  @Test
  public void test_texas_holdem_4318_3c6d6hTcTd_9dQc_4s6c_3h9h_Jh2d_5hQd_8hQs_5s3d_8sJc() {
    assertEquals(
      "5s3d 3h9h 8sJc=Jh2d 5hQd=8hQs=9dQc 4s6c",
      Solver.process("texas-holdem 3c6d6hTcTd 9dQc 4s6c 3h9h Jh2d 5hQd 8hQs 5s3d 8sJc"));
  }

  @Test
  public void test_texas_holdem_4319_8s9dJhKhKs_Js3c_JcTh_JdAh() {
    assertEquals(
      "Js3c JcTh JdAh",
      Solver.process("texas-holdem 8s9dJhKhKs Js3c JcTh JdAh"));
  }

  @Test
  public void test_texas_holdem_4320_4c4h5d8d8s_7sAh_3h7c_6sKd_9c3s_Th9s() {
    assertEquals(
      "3h7c 9c3s Th9s 6sKd 7sAh",
      Solver.process("texas-holdem 4c4h5d8d8s 7sAh 3h7c 6sKd 9c3s Th9s"));
  }

  @Test
  public void test_texas_holdem_4321_3h5d6hAsQd_Jh7c_7hKh_Jc8d_6cTs_Th5h_7d5c_Td4d_Js9h_AcTc() {
    assertEquals(
      "Td4d Jh7c Jc8d Js9h 7hKh 7d5c Th5h 6cTs AcTc",
      Solver.process("texas-holdem 3h5d6hAsQd Jh7c 7hKh Jc8d 6cTs Th5h 7d5c Td4d Js9h AcTc"));
  }

  @Test
  public void test_texas_holdem_4322_6s7c9dAdKc_8d7d_Th3s_AsQs_5h5c_2h2s_TcQh_8s3d() {
    assertEquals(
      "8s3d Th3s TcQh 2h2s 5h5c 8d7d AsQs",
      Solver.process("texas-holdem 6s7c9dAdKc 8d7d Th3s AsQs 5h5c 2h2s TcQh 8s3d"));
  }

  @Test
  public void test_texas_holdem_4323_2c2h2s3dKc_9c3h_3cKh() {
    assertEquals(
      "9c3h 3cKh",
      Solver.process("texas-holdem 2c2h2s3dKc 9c3h 3cKh"));
  }

  @Test
  public void test_texas_holdem_4324_2c6h8d9dJs_9h8s_KsKd_QcAs_JhAd_7s4d_2h4c() {
    assertEquals(
      "7s4d QcAs 2h4c JhAd KsKd 9h8s",
      Solver.process("texas-holdem 2c6h8d9dJs 9h8s KsKd QcAs JhAd 7s4d 2h4c"));
  }

  @Test
  public void test_texas_holdem_4325_5d9cKcQhTc_9h4c_2c6d_7h4s() {
    assertEquals(
      "2c6d 7h4s 9h4c",
      Solver.process("texas-holdem 5d9cKcQhTc 9h4c 2c6d 7h4s"));
  }

  @Test
  public void test_texas_holdem_4326_3d5h6d7hTd_KcAc_4d4c_Th9h_3hKh_5s6h() {
    assertEquals(
      "KcAc 3hKh Th9h 5s6h 4d4c",
      Solver.process("texas-holdem 3d5h6d7hTd KcAc 4d4c Th9h 3hKh 5s6h"));
  }

  @Test
  public void test_texas_holdem_4327_3h4c7c7sTs_2c8c_5cJd_6cTc_KcKh_JsTd() {
    assertEquals(
      "2c8c 5cJd 6cTc JsTd KcKh",
      Solver.process("texas-holdem 3h4c7c7sTs 2c8c 5cJd 6cTc KcKh JsTd"));
  }

  @Test
  public void test_texas_holdem_4328_3d8dKcTcTs_5d4h_As9s_QhAh_Th7c_3c5c_Qs2h_5s7s() {
    assertEquals(
      "5d4h 5s7s Qs2h As9s QhAh 3c5c Th7c",
      Solver.process("texas-holdem 3d8dKcTcTs 5d4h As9s QhAh Th7c 3c5c Qs2h 5s7s"));
  }

  @Test
  public void test_texas_holdem_4329_3h7sQhTdTs_5h7c_9d5c_Qc4c_2cQs_2s6h_9cJs() {
    assertEquals(
      "2s6h 9d5c 9cJs 5h7c 2cQs=Qc4c",
      Solver.process("texas-holdem 3h7sQhTdTs 5h7c 9d5c Qc4c 2cQs 2s6h 9cJs"));
  }

  @Test
  public void test_texas_holdem_4330_3h4s6d8dJh_2sAh_9h6c_2hKh_AcTh_Ad6s() {
    assertEquals(
      "2hKh 2sAh AcTh 9h6c Ad6s",
      Solver.process("texas-holdem 3h4s6d8dJh 2sAh 9h6c 2hKh AcTh Ad6s"));
  }

  @Test
  public void test_texas_holdem_4331_6c9sJcJhQc_3c2c_Tc9c_7hAc_Th4h_Qh5s_3dKs_8dAh_9d7d_AsKh() {
    assertEquals(
      "Th4h 3dKs 7hAc=8dAh AsKh 9d7d Qh5s 3c2c Tc9c",
      Solver.process("texas-holdem 6c9sJcJhQc 3c2c Tc9c 7hAc Th4h Qh5s 3dKs 8dAh 9d7d AsKh"));
  }

  @Test
  public void test_texas_holdem_4332_2d3cAdJhJs_5hQd_Kd8c_4h7d_Kh8d() {
    assertEquals(
      "4h7d 5hQd Kd8c=Kh8d",
      Solver.process("texas-holdem 2d3cAdJhJs 5hQd Kd8c 4h7d Kh8d"));
  }

  @Test
  public void test_texas_holdem_4333_2d8h9c9sKd_2sTc_QsKh_7h6c_6d9h_3hQc() {
    assertEquals(
      "7h6c 3hQc 2sTc QsKh 6d9h",
      Solver.process("texas-holdem 2d8h9c9sKd 2sTc QsKh 7h6c 6d9h 3hQc"));
  }

  @Test
  public void test_texas_holdem_4334_7h9cJcJsKd_Ah2d_4cKs_8h4h_JdTc_6s3s_9d9s_Qs5d_Qh6c_2c8s() {
    assertEquals(
      "6s3s 2c8s=8h4h Qh6c=Qs5d Ah2d 4cKs JdTc 9d9s",
      Solver.process("texas-holdem 7h9cJcJsKd Ah2d 4cKs 8h4h JdTc 6s3s 9d9s Qs5d Qh6c 2c8s"));
  }

  @Test
  public void test_texas_holdem_4335_6h8cJhJsTh_Kh2c_AdQh_KcQc_Tc8s_8h5d_3cJd_3h7d_9c5h() {
    assertEquals(
      "3h7d 9c5h Kh2c KcQc AdQh 8h5d Tc8s 3cJd",
      Solver.process("texas-holdem 6h8cJhJsTh Kh2c AdQh KcQc Tc8s 8h5d 3cJd 3h7d 9c5h"));
  }

  @Test
  public void test_texas_holdem_4336_4h6s8hJdTs_4sJc_Th6c_5c2h_AcAh_7cJh_8sTd_7d3s_7h9s_5hJs() {
    assertEquals(
      "5c2h 7d3s 5hJs 7cJh AcAh Th6c 8sTd 4sJc 7h9s",
      Solver.process("texas-holdem 4h6s8hJdTs 4sJc Th6c 5c2h AcAh 7cJh 8sTd 7d3s 7h9s 5hJs"));
  }

  @Test
  public void test_texas_holdem_4337_2sAhKcKdQh_Qd4s_Kh4h_5sQs_As7c_Jh3d_TcTs_8d9h() {
    assertEquals(
      "8d9h Jh3d TcTs 5sQs=Qd4s As7c Kh4h",
      Solver.process("texas-holdem 2sAhKcKdQh Qd4s Kh4h 5sQs As7c Jh3d TcTs 8d9h"));
  }

  @Test
  public void test_texas_holdem_4338_2d5h7sAcQs_8s9h_AhTc_JcTs_6s3d() {
    assertEquals(
      "6s3d 8s9h JcTs AhTc",
      Solver.process("texas-holdem 2d5h7sAcQs 8s9h AhTc JcTs 6s3d"));
  }

  @Test
  public void test_texas_holdem_4339_2c8dAdKhQc_4c5s_9s4s_9d9h() {
    assertEquals(
      "4c5s 9s4s 9d9h",
      Solver.process("texas-holdem 2c8dAdKhQc 4c5s 9s4s 9d9h"));
  }

  @Test
  public void test_texas_holdem_4340_2d8d9c9hKs_9s5d_Kd6d_7s6c_As3h_Tc4c_4hKc_7hQd_8sAh() {
    assertEquals(
      "7s6c Tc4c 7hQd As3h 8sAh 4hKc=Kd6d 9s5d",
      Solver.process("texas-holdem 2d8d9c9hKs 9s5d Kd6d 7s6c As3h Tc4c 4hKc 7hQd 8sAh"));
  }

  @Test
  public void test_texas_holdem_4341_5c6s8cQcQd_QsKd_9c3h_Jh2s_QhJs_As3c() {
    assertEquals(
      "9c3h Jh2s As3c QhJs QsKd",
      Solver.process("texas-holdem 5c6s8cQcQd QsKd 9c3h Jh2s QhJs As3c"));
  }

  @Test
  public void test_texas_holdem_4342_2s4h9c9hJh_3d5s_AsTc_AhKh_6h5c_7d6s_5d3c_7cQd_4cKs_2hJd() {
    assertEquals(
      "3d5s=5d3c 6h5c 7d6s 7cQd AsTc 4cKs 2hJd AhKh",
      Solver.process("texas-holdem 2s4h9c9hJh 3d5s AsTc AhKh 6h5c 7d6s 5d3c 7cQd 4cKs 2hJd"));
  }

  @Test
  public void test_texas_holdem_4343_2s3c6d6sKc_AhKd_5c5h_Qh7s_4hAs_Ts4c_7hAd_TcJh_8cJs_Td2h() {
    assertEquals(
      "Ts4c 8cJs TcJh Qh7s 4hAs 7hAd Td2h 5c5h AhKd",
      Solver.process("texas-holdem 2s3c6d6sKc AhKd 5c5h Qh7s 4hAs Ts4c 7hAd TcJh 8cJs Td2h"));
  }

  @Test
  public void test_texas_holdem_4344_7c8c8hKhQh_4s7h_6h4h_5dQs_5s3c_2cQd_AhJs_2sAc_3s8d_8s3d() {
    assertEquals(
      "5s3c 2sAc=AhJs 4s7h 2cQd=5dQs 3s8d=8s3d 6h4h",
      Solver.process("texas-holdem 7c8c8hKhQh 4s7h 6h4h 5dQs 5s3c 2cQd AhJs 2sAc 3s8d 8s3d"));
  }

  @Test
  public void test_texas_holdem_4345_4s6c6sKcTc_AcJd_2h6d_ThAd_6h5s_AhKd_7hQc() {
    assertEquals(
      "7hQc AcJd ThAd AhKd 2h6d=6h5s",
      Solver.process("texas-holdem 4s6c6sKcTc AcJd 2h6d ThAd 6h5s AhKd 7hQc"));
  }

  @Test
  public void test_texas_holdem_4346_4d6c9cAdKc_TdJd_QdQc_TsTc_7c7d() {
    assertEquals(
      "TdJd 7c7d TsTc QdQc",
      Solver.process("texas-holdem 4d6c9cAdKc TdJd QdQc TsTc 7c7d"));
  }

  @Test
  public void test_texas_holdem_4347_3s4d8cAsKd_3dKs_7s3h_JhJc_5cQs_7d7c_7h4h_Tc9h_9cAd_Qh8h() {
    assertEquals(
      "Tc9h 5cQs 7s3h 7h4h 7d7c Qh8h JhJc 9cAd 3dKs",
      Solver.process("texas-holdem 3s4d8cAsKd 3dKs 7s3h JhJc 5cQs 7d7c 7h4h Tc9h 9cAd Qh8h"));
  }

  @Test
  public void test_texas_holdem_4348_2h5cJdKhTc_7dAd_4s4d_4h5d_Qs3c_QcJs_6h5h() {
    assertEquals(
      "Qs3c 7dAd 4s4d 4h5d=6h5h QcJs",
      Solver.process("texas-holdem 2h5cJdKhTc 7dAd 4s4d 4h5d Qs3c QcJs 6h5h"));
  }

  @Test
  public void test_texas_holdem_4349_2s5dJcJhQc_KsAs_Qh6d_8d8h() {
    assertEquals(
      "KsAs 8d8h Qh6d",
      Solver.process("texas-holdem 2s5dJcJhQc KsAs Qh6d 8d8h"));
  }

  @Test
  public void test_texas_holdem_4350_4d4s5d9sAd_Jd3s_As5c_KdAh_JcQd() {
    assertEquals(
      "Jd3s JcQd KdAh As5c",
      Solver.process("texas-holdem 4d4s5d9sAd Jd3s As5c KdAh JcQd"));
  }

  @Test
  public void test_texas_holdem_4351_4dAhKhThTs_5dJc_3cKs_Td7s() {
    assertEquals(
      "5dJc 3cKs Td7s",
      Solver.process("texas-holdem 4dAhKhThTs 5dJc 3cKs Td7s"));
  }

  @Test
  public void test_texas_holdem_4352_3d9hAhJhTh_3s8c_8hKh() {
    assertEquals(
      "3s8c 8hKh",
      Solver.process("texas-holdem 3d9hAhJhTh 3s8c 8hKh"));
  }

  @Test
  public void test_texas_holdem_4353_3h5s7cKhQc_JhAd_4d7d() {
    assertEquals(
      "JhAd 4d7d",
      Solver.process("texas-holdem 3h5s7cKhQc JhAd 4d7d"));
  }

  @Test
  public void test_texas_holdem_4354_3c3h7s8dTc_6h4s_QsAs_2cKc_6s8h_4h5s_Ad3d_Ah2s_Kd3s_JcAc() {
    assertEquals(
      "4h5s=6h4s 2cKc Ah2s JcAc QsAs 6s8h Kd3s Ad3d",
      Solver.process("texas-holdem 3c3h7s8dTc 6h4s QsAs 2cKc 6s8h 4h5s Ad3d Ah2s Kd3s JcAc"));
  }

  @Test
  public void test_texas_holdem_4355_2h8sAdKhTd_KcKs_6d8c_4d6c_2s3c_6h7s() {
    assertEquals(
      "4d6c 6h7s 2s3c 6d8c KcKs",
      Solver.process("texas-holdem 2h8sAdKhTd KcKs 6d8c 4d6c 2s3c 6h7s"));
  }

  @Test
  public void test_texas_holdem_4356_4h8hAcJdTd_3h5s_AsKs_3d5c_9sJs_9d6d() {
    assertEquals(
      "3d5c=3h5s 9d6d 9sJs AsKs",
      Solver.process("texas-holdem 4h8hAcJdTd 3h5s AsKs 3d5c 9sJs 9d6d"));
  }

  @Test
  public void test_texas_holdem_4357_2h3d7c9hJc_6h5d_7h2s_Qd5s_AhKd_Jh8h_4c2d_Kh9s_Tc4d() {
    assertEquals(
      "6h5d Tc4d Qd5s AhKd 4c2d Kh9s Jh8h 7h2s",
      Solver.process("texas-holdem 2h3d7c9hJc 6h5d 7h2s Qd5s AhKd Jh8h 4c2d Kh9s Tc4d"));
  }

  @Test
  public void test_texas_holdem_4358_2s4h6hAcTh_AdAh_7s5s_KdJc_7c7d_8s9c_3h7h_Qc9s_TsQh_8c6s() {
    assertEquals(
      "7s5s 8s9c Qc9s KdJc 8c6s 7c7d TsQh AdAh 3h7h",
      Solver.process("texas-holdem 2s4h6hAcTh AdAh 7s5s KdJc 7c7d 8s9c 3h7h Qc9s TsQh 8c6s"));
  }

  @Test
  public void test_texas_holdem_4359_2d2h3h8hAs_7c8d_5sKd_Td7h_5d4h_7d9c_4c3s_9dAh() {
    assertEquals(
      "7d9c Td7h 5sKd 4c3s 7c8d 9dAh 5d4h",
      Solver.process("texas-holdem 2d2h3h8hAs 7c8d 5sKd Td7h 5d4h 7d9c 4c3s 9dAh"));
  }

  @Test
  public void test_texas_holdem_4360_2h3s4c8cAc_Ts5d_AdQh_2s9h_2dTh_6dQs() {
    assertEquals(
      "6dQs 2s9h 2dTh AdQh Ts5d",
      Solver.process("texas-holdem 2h3s4c8cAc Ts5d AdQh 2s9h 2dTh 6dQs"));
  }

  @Test
  public void test_texas_holdem_4361_4c6c8c9dQc_6s6h_Qh3s() {
    assertEquals(
      "Qh3s 6s6h",
      Solver.process("texas-holdem 4c6c8c9dQc 6s6h Qh3s"));
  }

  @Test
  public void test_texas_holdem_4362_2d3c4d6d7d_2cJh_Ac5h_2s8s_6hKs_Qh9s_Kd3h_8h4c() {
    assertEquals(
      "Qh9s 2s8s 2cJh 8h4c 6hKs Ac5h Kd3h",
      Solver.process("texas-holdem 2d3c4d6d7d 2cJh Ac5h 2s8s 6hKs Qh9s Kd3h 8h4c"));
  }

  @Test
  public void test_texas_holdem_4363_4c7s8d9sKs_Js4d_2h5d() {
    assertEquals(
      "2h5d Js4d",
      Solver.process("texas-holdem 4c7s8d9sKs Js4d 2h5d"));
  }

  @Test
  public void test_texas_holdem_4364_6d7sJhTcTh_5h3d_4sQc_5cTd_7h8s_Js8d_2dAs() {
    assertEquals(
      "5h3d 4sQc 2dAs 7h8s Js8d 5cTd",
      Solver.process("texas-holdem 6d7sJhTcTh 5h3d 4sQc 5cTd 7h8s Js8d 2dAs"));
  }

  @Test
  public void test_texas_holdem_4365_3d5d6c6s9d_TsQd_3cQc_2hJd() {
    assertEquals(
      "2hJd TsQd 3cQc",
      Solver.process("texas-holdem 3d5d6c6s9d TsQd 3cQc 2hJd"));
  }

  @Test
  public void test_texas_holdem_4366_3s4c6s9cQd_3cKc_5c7h_7s7d() {
    assertEquals(
      "3cKc 7s7d 5c7h",
      Solver.process("texas-holdem 3s4c6s9cQd 3cKc 5c7h 7s7d"));
  }

  @Test
  public void test_texas_holdem_4367_2h5c7d9hKs_6c5d_QsKh_Ad6d_Ac8d_6h4c() {
    assertEquals(
      "6h4c Ad6d Ac8d 6c5d QsKh",
      Solver.process("texas-holdem 2h5c7d9hKs 6c5d QsKh Ad6d Ac8d 6h4c"));
  }

  @Test
  public void test_texas_holdem_4368_3d3h4h6c8h_5hTc_2sTh_7sKc_7dKh_Jh6d_QsAs_4c4d() {
    assertEquals(
      "2sTh=5hTc 7dKh=7sKc QsAs Jh6d 4c4d",
      Solver.process("texas-holdem 3d3h4h6c8h 5hTc 2sTh 7sKc 7dKh Jh6d QsAs 4c4d"));
  }

  @Test
  public void test_texas_holdem_4369_5d6c8h9hAs_4s5s_4hKs_QcJd_3h8s_3sQs_3c2s() {
    assertEquals(
      "3c2s 3sQs QcJd 4hKs 4s5s 3h8s",
      Solver.process("texas-holdem 5d6c8h9hAs 4s5s 4hKs QcJd 3h8s 3sQs 3c2s"));
  }

  @Test
  public void test_texas_holdem_4370_2h5c7dAsQc_Kc9s_2s8h_9c4c_2dJd_Kd4d_9d7s() {
    assertEquals(
      "9c4c Kd4d Kc9s 2s8h 2dJd 9d7s",
      Solver.process("texas-holdem 2h5c7dAsQc Kc9s 2s8h 9c4c 2dJd Kd4d 9d7s"));
  }

  @Test
  public void test_texas_holdem_4371_3c5h6s8h9h_TsKd_4cTd_2d4d_Jh3d_6hJs_Jd3s_Kc2c_9sTc_4s2h() {
    assertEquals(
      "4cTd Kc2c TsKd Jd3s=Jh3d 6hJs 9sTc 2d4d=4s2h",
      Solver.process("texas-holdem 3c5h6s8h9h TsKd 4cTd 2d4d Jh3d 6hJs Jd3s Kc2c 9sTc 4s2h"));
  }

  @Test
  public void test_texas_holdem_4372_5h7hAsKhTc_4s8d_QhQd_6h5d_3h9s_7d2d_AdQs_JsTh_6s9d() {
    assertEquals(
      "4s8d 3h9s=6s9d 6h5d 7d2d JsTh QhQd AdQs",
      Solver.process("texas-holdem 5h7hAsKhTc 4s8d QhQd 6h5d 3h9s 7d2d AdQs JsTh 6s9d"));
  }

  @Test
  public void test_texas_holdem_4373_2d3c5cAdJh_KsTd_5sKd_7h4s_8sJs() {
    assertEquals(
      "KsTd 5sKd 8sJs 7h4s",
      Solver.process("texas-holdem 2d3c5cAdJh KsTd 5sKd 7h4s 8sJs"));
  }

  @Test
  public void test_texas_holdem_4374_2c3d7d9dAd_As7s_7hKc() {
    assertEquals(
      "7hKc As7s",
      Solver.process("texas-holdem 2c3d7d9dAd As7s 7hKc"));
  }

  @Test
  public void test_texas_holdem_4375_4s6hQhTcTd_KdAs_Ac9d_3sQs_4h5d_4c2c_JsQd_QcKh() {
    assertEquals(
      "Ac9d KdAs 4c2c=4h5d 3sQs JsQd QcKh",
      Solver.process("texas-holdem 4s6hQhTcTd KdAs Ac9d 3sQs 4h5d 4c2c JsQd QcKh"));
  }

  @Test
  public void test_texas_holdem_4376_2h5c6c9hQh_8d4h_8s7d_6d9d_4cQd() {
    assertEquals(
      "8d4h 4cQd 6d9d 8s7d",
      Solver.process("texas-holdem 2h5c6c9hQh 8d4h 8s7d 6d9d 4cQd"));
  }

  @Test
  public void test_texas_holdem_4377_2d3s7c7dAd_Kh6d_3dAs_3cTc_TsQh_ThAc_4d7s_Js5d_Ks4s() {
    assertEquals(
      "Js5d TsQh Ks4s Kh6d 3cTc 3dAs ThAc 4d7s",
      Solver.process("texas-holdem 2d3s7c7dAd Kh6d 3dAs 3cTc TsQh ThAc 4d7s Js5d Ks4s"));
  }

  @Test
  public void test_texas_holdem_4378_3h8hAhAsTd_5h8s_JcTc_9cAc_Ad5s_Ts9s_6cKd() {
    assertEquals(
      "6cKd 5h8s Ts9s JcTc Ad5s 9cAc",
      Solver.process("texas-holdem 3h8hAhAsTd 5h8s JcTc 9cAc Ad5s Ts9s 6cKd"));
  }

  @Test
  public void test_texas_holdem_4379_2s3s7h9dAs_Td5h_QcJc_KcKs() {
    assertEquals(
      "Td5h QcJc KcKs",
      Solver.process("texas-holdem 2s3s7h9dAs Td5h QcJc KcKs"));
  }

  @Test
  public void test_texas_holdem_4380_3d3h5c8dKs_7sQc_9s4c_TsTc_6dKh_6cQd_Jh7d_AcAh_5h4d() {
    assertEquals(
      "9s4c Jh7d 6cQd=7sQc 5h4d TsTc 6dKh AcAh",
      Solver.process("texas-holdem 3d3h5c8dKs 7sQc 9s4c TsTc 6dKh 6cQd Jh7d AcAh 5h4d"));
  }

  @Test
  public void test_texas_holdem_4381_7c7h9sAdKh_JdQh_8cQd_3h3d_Ts5h_Jc4c_AcQc_2h9d_2c2d_9h8d() {
    assertEquals(
      "Ts5h Jc4c 8cQd=JdQh 2c2d 3h3d 2h9d=9h8d AcQc",
      Solver.process("texas-holdem 7c7h9sAdKh JdQh 8cQd 3h3d Ts5h Jc4c AcQc 2h9d 2c2d 9h8d"));
  }

  @Test
  public void test_texas_holdem_4382_2c2dAhAsJc_TcJd_TdQh_Jh5d() {
    assertEquals(
      "TdQh Jh5d TcJd",
      Solver.process("texas-holdem 2c2dAhAsJc TcJd TdQh Jh5d"));
  }

  @Test
  public void test_texas_holdem_4383_4d6h8dAsTd_2hQh_Js7h_3hAc_6cQd_9c3c_4c6s() {
    assertEquals(
      "9c3c Js7h 2hQh 6cQd 3hAc 4c6s",
      Solver.process("texas-holdem 4d6h8dAsTd 2hQh Js7h 3hAc 6cQd 9c3c 4c6s"));
  }

  @Test
  public void test_texas_holdem_4384_4s7s8dAdTs_Jh9h_Kd4c_QhTc_2d7c() {
    assertEquals(
      "Kd4c 2d7c QhTc Jh9h",
      Solver.process("texas-holdem 4s7s8dAdTs Jh9h Kd4c QhTc 2d7c"));
  }

  @Test
  public void test_texas_holdem_4385_4d4s8cJsQs_AsQc_3d6h_7s8d_Ad5h_6d6c_8s8h() {
    assertEquals(
      "3d6h Ad5h 6d6c 7s8d AsQc 8s8h",
      Solver.process("texas-holdem 4d4s8cJsQs AsQc 3d6h 7s8d Ad5h 6d6c 8s8h"));
  }

  @Test
  public void test_texas_holdem_4386_4s6c6d7cJh_QhKd_6h9d_AsTc_JsKs_Ts2h_QcQs_QdAd_8h5d_Kc8s() {
    assertEquals(
      "Ts2h Kc8s QhKd AsTc QdAd JsKs QcQs 6h9d 8h5d",
      Solver.process("texas-holdem 4s6c6d7cJh QhKd 6h9d AsTc JsKs Ts2h QcQs QdAd 8h5d Kc8s"));
  }

  @Test
  public void test_texas_holdem_4387_2h5d5s6h9s_4hKc_Js8h() {
    assertEquals(
      "Js8h 4hKc",
      Solver.process("texas-holdem 2h5d5s6h9s 4hKc Js8h"));
  }

  @Test
  public void test_texas_holdem_4388_6c7cJcKsTh_4h2d_Jd8d_7h8s_5hAh_4dQd_5c3h_JhTd_3c4c_8h5s() {
    assertEquals(
      "4h2d=5c3h 8h5s 4dQd 5hAh 7h8s Jd8d JhTd 3c4c",
      Solver.process("texas-holdem 6c7cJcKsTh 4h2d Jd8d 7h8s 5hAh 4dQd 5c3h JhTd 3c4c 8h5s"));
  }

  @Test
  public void test_texas_holdem_4389_3h7h7sAdJd_5s2s_9h5d_9d8s_KcTc_9c8d_Kd5h() {
    assertEquals(
      "5s2s 9c8d=9d8s=9h5d KcTc=Kd5h",
      Solver.process("texas-holdem 3h7h7sAdJd 5s2s 9h5d 9d8s KcTc 9c8d Kd5h"));
  }

  @Test
  public void test_texas_holdem_4390_3h4s6c6dQh_3c3d_Ks9c_5d9h_3s7h() {
    assertEquals(
      "5d9h Ks9c 3s7h 3c3d",
      Solver.process("texas-holdem 3h4s6c6dQh 3c3d Ks9c 5d9h 3s7h"));
  }

  @Test
  public void test_texas_holdem_4391_2s4c7dAdJd_3d4d_Td2h_4h3h_Ac5s_7sKs() {
    assertEquals(
      "Td2h 4h3h 7sKs Ac5s 3d4d",
      Solver.process("texas-holdem 2s4c7dAdJd 3d4d Td2h 4h3h Ac5s 7sKs"));
  }

  @Test
  public void test_texas_holdem_4392_4cAsKhQhTs_Kc6d_5dAh_QsJc_Qc5s_7sKd_5h2c_9s3s_8s6c() {
    assertEquals(
      "5h2c 8s6c 9s3s Qc5s 7sKd=Kc6d 5dAh QsJc",
      Solver.process("texas-holdem 4cAsKhQhTs Kc6d 5dAh QsJc Qc5s 7sKd 5h2c 9s3s 8s6c"));
  }

  @Test
  public void test_texas_holdem_4393_5d5s6d9hQh_5h3h_QsKh_2c7h_Qc7c_Jd4h_9cKc() {
    assertEquals(
      "2c7h Jd4h 9cKc Qc7c QsKh 5h3h",
      Solver.process("texas-holdem 5d5s6d9hQh 5h3h QsKh 2c7h Qc7c Jd4h 9cKc"));
  }

  @Test
  public void test_texas_holdem_4394_5s7d9cKsQd_Js8s_Jc3h() {
    assertEquals(
      "Jc3h Js8s",
      Solver.process("texas-holdem 5s7d9cKsQd Js8s Jc3h"));
  }

  @Test
  public void test_texas_holdem_4395_3c4h8hAsJh_5d9s_6h9c() {
    assertEquals(
      "5d9s 6h9c",
      Solver.process("texas-holdem 3c4h8hAsJh 5d9s 6h9c"));
  }

  @Test
  public void test_texas_holdem_4396_2h7c7dKhTd_Qc6h_5cQs_Js9s_AsQd_5d8d_3h9c_3dKs_3c8c_ThTs() {
    assertEquals(
      "3c8c=5d8d 3h9c Js9s 5cQs=Qc6h AsQd 3dKs ThTs",
      Solver.process("texas-holdem 2h7c7dKhTd Qc6h 5cQs Js9s AsQd 5d8d 3h9c 3dKs 3c8c ThTs"));
  }

  @Test
  public void test_texas_holdem_4397_2d3s6h7s8s_2h5h_Tc2s_7cKs_Qc6s_3h9c_9h8h() {
    assertEquals(
      "2h5h Tc2s 3h9c Qc6s 7cKs 9h8h",
      Solver.process("texas-holdem 2d3s6h7s8s 2h5h Tc2s 7cKs Qc6s 3h9c 9h8h"));
  }

  @Test
  public void test_texas_holdem_4398_2c3h4cJhKs_Qd6h_7hKc_Jd6c_9d7c_Jc4h_5dTh_Ac8s_8d8h_As7d() {
    assertEquals(
      "9d7c 5dTh Qd6h As7d Ac8s 8d8h Jd6c 7hKc Jc4h",
      Solver.process("texas-holdem 2c3h4cJhKs Qd6h 7hKc Jd6c 9d7c Jc4h 5dTh Ac8s 8d8h As7d"));
  }

  @Test
  public void test_texas_holdem_4399_9hAsJcKhTd_Ac8c_4s4h_3c9c_Qc7s_6h4c_5cKs_AhKd_2d9d_7hJs() {
    assertEquals(
      "6h4c 4s4h 2d9d=3c9c 7hJs 5cKs Ac8c AhKd Qc7s",
      Solver.process("texas-holdem 9hAsJcKhTd Ac8c 4s4h 3c9c Qc7s 6h4c 5cKs AhKd 2d9d 7hJs"));
  }

  @Test
  public void test_texas_holdem_4400_4h5s7hJcQc_Qh8d_Ac9s_3s8c() {
    assertEquals(
      "3s8c Ac9s Qh8d",
      Solver.process("texas-holdem 4h5s7hJcQc Qh8d Ac9s 3s8c"));
  }

  @Test
  public void test_texas_holdem_4401_4d8h8sQcTh_9hJh_4s5s_7cTd() {
    assertEquals(
      "4s5s 7cTd 9hJh",
      Solver.process("texas-holdem 4d8h8sQcTh 9hJh 4s5s 7cTd"));
  }

  @Test
  public void test_texas_holdem_4402_2h7d8d9hQs_2c9s_3h5s_4hKc_7sAc() {
    assertEquals(
      "3h5s 4hKc 7sAc 2c9s",
      Solver.process("texas-holdem 2h7d8d9hQs 2c9s 3h5s 4hKc 7sAc"));
  }

  @Test
  public void test_texas_holdem_4403_4c4d8h9cTc_5cJh_9dQd_2sKd_5dAd_3s6s_KhKs() {
    assertEquals(
      "3s6s 5cJh 2sKd 5dAd 9dQd KhKs",
      Solver.process("texas-holdem 4c4d8h9cTc 5cJh 9dQd 2sKd 5dAd 3s6s KhKs"));
  }

  @Test
  public void test_texas_holdem_4404_2h3d3h3s8s_Qs5h_6d4s() {
    assertEquals(
      "6d4s Qs5h",
      Solver.process("texas-holdem 2h3d3h3s8s Qs5h 6d4s"));
  }

  @Test
  public void test_texas_holdem_4405_2s4h5dKhQd_4c7d_2hJd_9s7s_4s8s_KcTh() {
    assertEquals(
      "9s7s 2hJd 4c7d 4s8s KcTh",
      Solver.process("texas-holdem 2s4h5dKhQd 4c7d 2hJd 9s7s 4s8s KcTh"));
  }

  @Test
  public void test_texas_holdem_4406_2d2s6s9cKd_8cTc_AhKc_2h5s_6d7c_3cQh() {
    assertEquals(
      "8cTc 3cQh 6d7c AhKc 2h5s",
      Solver.process("texas-holdem 2d2s6s9cKd 8cTc AhKc 2h5s 6d7c 3cQh"));
  }

  @Test
  public void test_texas_holdem_4407_2c3d5s8dTc_AcKc_7s5c_7c4h_3sKs_Jd6c_7d9c() {
    assertEquals(
      "7c4h 7d9c Jd6c AcKc 3sKs 7s5c",
      Solver.process("texas-holdem 2c3d5s8dTc AcKc 7s5c 7c4h 3sKs Jd6c 7d9c"));
  }

  @Test
  public void test_texas_holdem_4408_3h4d7d7sQs_TdTh_9dQc_3d7h_3c2c_8c8d() {
    assertEquals(
      "3c2c 8c8d TdTh 9dQc 3d7h",
      Solver.process("texas-holdem 3h4d7d7sQs TdTh 9dQc 3d7h 3c2c 8c8d"));
  }

  @Test
  public void test_texas_holdem_4409_7sAcQdQhQs_5d2d_Kc4d_9c9s_TsKs_3s5c_7h8s_4hAs() {
    assertEquals(
      "3s5c=5d2d Kc4d=TsKs 7h8s 9c9s 4hAs",
      Solver.process("texas-holdem 7sAcQdQhQs 5d2d Kc4d 9c9s TsKs 3s5c 7h8s 4hAs"));
  }

  @Test
  public void test_texas_holdem_4410_5dAcQcTcTh_6dKd_Kh8d_AsTd_7dKc_2h4h_8sQh_5sJh_Ad7s_JsQs() {
    assertEquals(
      "2h4h 6dKd=7dKc=Kh8d 5sJh 8sQh=JsQs Ad7s AsTd",
      Solver.process("texas-holdem 5dAcQcTcTh 6dKd Kh8d AsTd 7dKc 2h4h 8sQh 5sJh Ad7s JsQs"));
  }

  @Test
  public void test_texas_holdem_4411_4h9dAhAsQd_9cTd_3cTc_8cKs_9s8d_6hJd_3sKd_6s7c_QhAd_Th4c() {
    assertEquals(
      "6s7c 3cTc 6hJd 3sKd=8cKs Th4c 9cTd=9s8d QhAd",
      Solver.process("texas-holdem 4h9dAhAsQd 9cTd 3cTc 8cKs 9s8d 6hJd 3sKd 6s7c QhAd Th4c"));
  }

  @Test
  public void test_texas_holdem_4412_5c5h9h9sJh_Tc4d_Ks3c_KdTs_5d4h_7d7c_As7h_4sQs() {
    assertEquals(
      "Tc4d 4sQs KdTs=Ks3c As7h 7d7c 5d4h",
      Solver.process("texas-holdem 5c5h9h9sJh Tc4d Ks3c KdTs 5d4h 7d7c As7h 4sQs"));
  }

  @Test
  public void test_texas_holdem_4413_6dAhKsQhTc_Ad5h_Kc8h_7c8c_2d5d_9h2h_Jh8s_Ts2c_Kd5s_ThJs() {
    assertEquals(
      "2d5d 7c8c 9h2h Ts2c Kc8h=Kd5s Ad5h Jh8s=ThJs",
      Solver.process("texas-holdem 6dAhKsQhTc Ad5h Kc8h 7c8c 2d5d 9h2h Jh8s Ts2c Kd5s ThJs"));
  }

  @Test
  public void test_texas_holdem_4414_2s5d5h7h8d_4s9d_4cJh_6h8h_QsAd() {
    assertEquals(
      "4s9d 4cJh QsAd 6h8h",
      Solver.process("texas-holdem 2s5d5h7h8d 4s9d 4cJh 6h8h QsAd"));
  }

  @Test
  public void test_texas_holdem_4415_3h5d9c9dAc_7sJh_4h2s() {
    assertEquals(
      "7sJh 4h2s",
      Solver.process("texas-holdem 3h5d9c9dAc 7sJh 4h2s"));
  }

  @Test
  public void test_texas_holdem_4416_3d8s9sKhTd_4hJh_JcQs_8d5s_Kd8h_Tc2d_KcAh_2cTh_7d6s() {
    assertEquals(
      "4hJh 8d5s 2cTh=Tc2d KcAh Kd8h 7d6s JcQs",
      Solver.process("texas-holdem 3d8s9sKhTd 4hJh JcQs 8d5s Kd8h Tc2d KcAh 2cTh 7d6s"));
  }

  @Test
  public void test_texas_holdem_4417_3h4s8cJsTh_6h5d_5h8d_QdTc_4c9d_AsKd_9s6c_4hQc_6sJc() {
    assertEquals(
      "6h5d 9s6c AsKd 4c9d 4hQc 5h8d QdTc 6sJc",
      Solver.process("texas-holdem 3h4s8cJsTh 6h5d 5h8d QdTc 4c9d AsKd 9s6c 4hQc 6sJc"));
  }

  @Test
  public void test_texas_holdem_4418_2h5h6s9sTs_4s6d_4dAh_9dJc_4c6c_AdTc_8h3s_7hKc() {
    assertEquals(
      "8h3s 7hKc 4dAh 4c6c=4s6d 9dJc AdTc",
      Solver.process("texas-holdem 2h5h6s9sTs 4s6d 4dAh 9dJc 4c6c AdTc 8h3s 7hKc"));
  }

  @Test
  public void test_texas_holdem_4419_2c4s8sKhTc_4hTs_7d3h_KdQs_TdAc_5dAd_5hQh_As9s() {
    assertEquals(
      "7d3h 5hQh 5dAd As9s TdAc KdQs 4hTs",
      Solver.process("texas-holdem 2c4s8sKhTc 4hTs 7d3h KdQs TdAc 5dAd 5hQh As9s"));
  }

  @Test
  public void test_texas_holdem_4420_2h3s9c9hQd_4hJc_2dKd_7hKs_5h3d_Tc5c() {
    assertEquals(
      "Tc5c 4hJc 7hKs 2dKd 5h3d",
      Solver.process("texas-holdem 2h3s9c9hQd 4hJc 2dKd 7hKs 5h3d Tc5c"));
  }

  @Test
  public void test_texas_holdem_4421_2h3d7sAdQs_Jh7h_3c3s_As7d_5s5c_4sKd_8sTh() {
    assertEquals(
      "8sTh 4sKd 5s5c Jh7h As7d 3c3s",
      Solver.process("texas-holdem 2h3d7sAdQs Jh7h 3c3s As7d 5s5c 4sKd 8sTh"));
  }

  @Test
  public void test_texas_holdem_4422_2c2h4d4sQc_TdKh_7hJd_3h7c_Th5c_5dQh() {
    assertEquals(
      "3h7c=7hJd=Th5c TdKh 5dQh",
      Solver.process("texas-holdem 2c2h4d4sQc TdKh 7hJd 3h7c Th5c 5dQh"));
  }

  @Test
  public void test_texas_holdem_4423_2d4d4s6s8d_8s3h_JhTd_JsTh_7sQs_KhKd_AhAd_5hJd() {
    assertEquals(
      "5hJd JhTd=JsTh 7sQs 8s3h KhKd AhAd",
      Solver.process("texas-holdem 2d4d4s6s8d 8s3h JhTd JsTh 7sQs KhKd AhAd 5hJd"));
  }

  @Test
  public void test_texas_holdem_4424_6sAcAdJsKd_3c2d_7hQs_QdTc_Td8c_2sKc() {
    assertEquals(
      "3c2d Td8c 7hQs 2sKc QdTc",
      Solver.process("texas-holdem 6sAcAdJsKd 3c2d 7hQs QdTc Td8c 2sKc"));
  }

  @Test
  public void test_texas_holdem_4425_2dAcJcJsQh_7hJd_5h6d_4sKs_Td8h_KdKh_AhAd_6c5d_Qc3d_9c4d() {
    assertEquals(
      "5h6d=6c5d 9c4d Td8h 4sKs Qc3d KdKh 7hJd AhAd",
      Solver.process("texas-holdem 2dAcJcJsQh 7hJd 5h6d 4sKs Td8h KdKh AhAd 6c5d Qc3d 9c4d"));
  }

  @Test
  public void test_texas_holdem_4426_2s5s9hAcQs_6hTc_AdAs_9c7s_8hTd_8cQh_ThQc() {
    assertEquals(
      "6hTc 8hTd 9c7s 8cQh ThQc AdAs",
      Solver.process("texas-holdem 2s5s9hAcQs 6hTc AdAs 9c7s 8hTd 8cQh ThQc"));
  }

  @Test
  public void test_texas_holdem_4427_2d3h4s6h7d_2s6d_Ac3c_As8d_9dTs() {
    assertEquals(
      "9dTs As8d Ac3c 2s6d",
      Solver.process("texas-holdem 2d3h4s6h7d 2s6d Ac3c As8d 9dTs"));
  }

  @Test
  public void test_texas_holdem_4428_3c3s7dAdKc_Kh5d_JcKs_Ts4s_4d3d_As9d_5sJd_8h2h_6c9s_9hTd() {
    assertEquals(
      "8h2h 6c9s 9hTd=Ts4s 5sJd JcKs=Kh5d As9d 4d3d",
      Solver.process("texas-holdem 3c3s7dAdKc Kh5d JcKs Ts4s 4d3d As9d 5sJd 8h2h 6c9s 9hTd"));
  }

  @Test
  public void test_texas_holdem_4429_6h7cAcKhTd_2h9c_Qh4c_9d2c_6cKc_Jd3h_5dQs_Ts2s_3d9h() {
    assertEquals(
      "2h9c=3d9h=9d2c Jd3h 5dQs=Qh4c Ts2s 6cKc",
      Solver.process("texas-holdem 6h7cAcKhTd 2h9c Qh4c 9d2c 6cKc Jd3h 5dQs Ts2s 3d9h"));
  }

  @Test
  public void test_texas_holdem_4430_3c8c8dKsTs_4dJs_Qc9c_8h7s_2hKc_6sJc_Kd7d_4hQd() {
    assertEquals(
      "4dJs=6sJc 4hQd=Qc9c 2hKc=Kd7d 8h7s",
      Solver.process("texas-holdem 3c8c8dKsTs 4dJs Qc9c 8h7s 2hKc 6sJc Kd7d 4hQd"));
  }

  @Test
  public void test_texas_holdem_4431_4s7c9sQhTc_JhTs_7hQc_JsKs_7d7s_3d6h_Jc3s() {
    assertEquals(
      "3d6h Jc3s JhTs 7hQc 7d7s JsKs",
      Solver.process("texas-holdem 4s7c9sQhTc JhTs 7hQc JsKs 7d7s 3d6h Jc3s"));
  }

  @Test
  public void test_texas_holdem_4432_5d6d6s9cKd_2s3s_4hJs_7c8c_QdAh_Kh2d_5h6h_Ks9h_AsTh_9dJd() {
    assertEquals(
      "2s3s 4hJs AsTh QdAh Kh2d Ks9h 7c8c 9dJd 5h6h",
      Solver.process("texas-holdem 5d6d6s9cKd 2s3s 4hJs 7c8c QdAh Kh2d 5h6h Ks9h AsTh 9dJd"));
  }

  @Test
  public void test_texas_holdem_4433_2d2h4cJsTd_KsAh_2c8s_9hAd() {
    assertEquals(
      "9hAd KsAh 2c8s",
      Solver.process("texas-holdem 2d2h4cJsTd KsAh 2c8s 9hAd"));
  }

  @Test
  public void test_texas_holdem_4434_3d5s8hAcQs_QcJc_Qh5h_JdTd_9hKc_Qd5c_6s7d() {
    assertEquals(
      "6s7d JdTd 9hKc QcJc Qd5c=Qh5h",
      Solver.process("texas-holdem 3d5s8hAcQs QcJc Qh5h JdTd 9hKc Qd5c 6s7d"));
  }

  @Test
  public void test_texas_holdem_4435_2c5h7h8dTd_9h2s_4sAs_7s9c_4d9s() {
    assertEquals(
      "4d9s 4sAs 9h2s 7s9c",
      Solver.process("texas-holdem 2c5h7h8dTd 9h2s 4sAs 7s9c 4d9s"));
  }

  @Test
  public void test_texas_holdem_4436_3h6cJhKcQc_8h6s_9d4s_8sKh_8d3d_AsAh_Td5c_3s5s_5d4c() {
    assertEquals(
      "5d4c 9d4s Td5c 3s5s=8d3d 8h6s 8sKh AsAh",
      Solver.process("texas-holdem 3h6cJhKcQc 8h6s 9d4s 8sKh 8d3d AsAh Td5c 3s5s 5d4c"));
  }

  @Test
  public void test_texas_holdem_4437_7cAdAsKdQc_JcAc_3sTc_5d9s_Qh7d_9c8c_5h9d_4s4c_Kc8d() {
    assertEquals(
      "5d9s=5h9d=9c8c 3sTc 4s4c Qh7d Kc8d JcAc",
      Solver.process("texas-holdem 7cAdAsKdQc JcAc 3sTc 5d9s Qh7d 9c8c 5h9d 4s4c Kc8d"));
  }

  @Test
  public void test_texas_holdem_4438_3d4c7c8sQd_3h9d_9c7d_KsAd_TcTd_3sTs() {
    assertEquals(
      "KsAd 3h9d 3sTs 9c7d TcTd",
      Solver.process("texas-holdem 3d4c7c8sQd 3h9d 9c7d KsAd TcTd 3sTs"));
  }

  @Test
  public void test_texas_holdem_4439_4d4h5c9sQc_5h8s_5s8d() {
    assertEquals(
      "5h8s=5s8d",
      Solver.process("texas-holdem 4d4h5c9sQc 5h8s 5s8d"));
  }

  @Test
  public void test_texas_holdem_4440_5h6d8c8h9s_9c7s_2cAs_5cKd_Ad3c_5dQd_4dQc_3h4s_6s7d_2sTs() {
    assertEquals(
      "3h4s 2sTs 4dQc 2cAs=Ad3c 5dQd 5cKd 6s7d=9c7s",
      Solver.process("texas-holdem 5h6d8c8h9s 9c7s 2cAs 5cKd Ad3c 5dQd 4dQc 3h4s 6s7d 2sTs"));
  }

  @Test
  public void test_texas_holdem_4441_2s6h6sAhKd_7d9h_6dTc_9cQd_8d7s_9sQh_Td5d() {
    assertEquals(
      "8d7s 7d9h Td5d 9cQd=9sQh 6dTc",
      Solver.process("texas-holdem 2s6h6sAhKd 7d9h 6dTc 9cQd 8d7s 9sQh Td5d"));
  }

  @Test
  public void test_texas_holdem_4442_2d9hJsKcQd_7s8d_Qs3s_Jc3d() {
    assertEquals(
      "7s8d Jc3d Qs3s",
      Solver.process("texas-holdem 2d9hJsKcQd 7s8d Qs3s Jc3d"));
  }

  @Test
  public void test_texas_holdem_4443_2s4s5d8dTc_Qs9c_Jh3h_3dQd_As5h_6c7h_9s5s() {
    assertEquals(
      "Jh3h 3dQd Qs9c 9s5s As5h 6c7h",
      Solver.process("texas-holdem 2s4s5d8dTc Qs9c Jh3h 3dQd As5h 6c7h 9s5s"));
  }

  @Test
  public void test_texas_holdem_4444_2h5s7cAsQh_7s9c_7d4s_4d8d_2sKc_Jc3c_TsTc_9s2c_5hKh_6c3h() {
    assertEquals(
      "6c3h 4d8d Jc3c 9s2c 2sKc 5hKh 7d4s 7s9c TsTc",
      Solver.process("texas-holdem 2h5s7cAsQh 7s9c 7d4s 4d8d 2sKc Jc3c TsTc 9s2c 5hKh 6c3h"));
  }

  @Test
  public void test_texas_holdem_4445_2h4sAhKhTh_9h8d_9s7c_3cQs_2cJh() {
    assertEquals(
      "9s7c 3cQs 9h8d 2cJh",
      Solver.process("texas-holdem 2h4sAhKhTh 9h8d 9s7c 3cQs 2cJh"));
  }

  @Test
  public void test_texas_holdem_4446_8sAcJdJhKs_Ah9c_5cQs_8cTc_9h4c_ThTs_5d6h_4d7h() {
    assertEquals(
      "4d7h=5d6h 9h4c 5cQs 8cTc ThTs Ah9c",
      Solver.process("texas-holdem 8sAcJdJhKs Ah9c 5cQs 8cTc 9h4c ThTs 5d6h 4d7h"));
  }

  @Test
  public void test_texas_holdem_4447_2h4c5dAhKh_8s6d_ThTd_4h3d_6c6h_7c3c_7s8c_6sJd() {
    assertEquals(
      "8s6d 7s8c 6sJd 6c6h ThTd 4h3d=7c3c",
      Solver.process("texas-holdem 2h4c5dAhKh 8s6d ThTd 4h3d 6c6h 7c3c 7s8c 6sJd"));
  }

  @Test
  public void test_texas_holdem_4448_3c4s5d8cKs_7sTd_2c3h_4d3d_AdAc() {
    assertEquals(
      "7sTd 2c3h AdAc 4d3d",
      Solver.process("texas-holdem 3c4s5d8cKs 7sTd 2c3h 4d3d AdAc"));
  }

  @Test
  public void test_texas_holdem_4449_6h8s9c9dKs_6cQc_4c6d_2cQs_7h7d_ThQd_4sTs() {
    assertEquals(
      "4sTs 2cQs ThQd 4c6d=6cQc 7h7d",
      Solver.process("texas-holdem 6h8s9c9dKs 6cQc 4c6d 2cQs 7h7d ThQd 4sTs"));
  }

  @Test
  public void test_texas_holdem_4450_3sAhJsThTs_9hAc_4c5d_2cQh_5h6c_Kh5c_6h4h() {
    assertEquals(
      "4c5d 5h6c=6h4h 2cQh Kh5c 9hAc",
      Solver.process("texas-holdem 3sAhJsThTs 9hAc 4c5d 2cQh 5h6c Kh5c 6h4h"));
  }

  @Test
  public void test_texas_holdem_4451_6s8h9hAcJs_Jh8d_4hKh_Qh5c() {
    assertEquals(
      "Qh5c 4hKh Jh8d",
      Solver.process("texas-holdem 6s8h9hAcJs Jh8d 4hKh Qh5c"));
  }

  @Test
  public void test_texas_holdem_4452_4d5sAcAsJc_JsQc_5h6d_6h7d_7h2s_AdTc_3sQd_4c9c_Kc6s_8d8h() {
    assertEquals(
      "7h2s 6h7d 3sQd Kc6s 4c9c 5h6d 8d8h JsQc AdTc",
      Solver.process("texas-holdem 4d5sAcAsJc JsQc 5h6d 6h7d 7h2s AdTc 3sQd 4c9c Kc6s 8d8h"));
  }

  @Test
  public void test_texas_holdem_4453_3s4c4s6sKd_5cJs_7sKs_3h2d_8d9s_KcTh_7d7h() {
    assertEquals(
      "8d9s 5cJs 3h2d 7d7h KcTh 7sKs",
      Solver.process("texas-holdem 3s4c4s6sKd 5cJs 7sKs 3h2d 8d9s KcTh 7d7h"));
  }

  @Test
  public void test_texas_holdem_4454_4c7h8hAdQc_9c5h_9dJs_Th2h() {
    assertEquals(
      "9c5h Th2h 9dJs",
      Solver.process("texas-holdem 4c7h8hAdQc 9c5h 9dJs Th2h"));
  }

  @Test
  public void test_texas_holdem_4455_4s9dAcAsJd_9h5d_5c8h() {
    assertEquals(
      "5c8h 9h5d",
      Solver.process("texas-holdem 4s9dAcAsJd 9h5d 5c8h"));
  }

  @Test
  public void test_texas_holdem_4456_2c5sAhKhKs_2sJh_5c9d_Qh3d_8c7c_KcTh_Td4d() {
    assertEquals(
      "8c7c Td4d Qh3d 2sJh 5c9d KcTh",
      Solver.process("texas-holdem 2c5sAhKhKs 2sJh 5c9d Qh3d 8c7c KcTh Td4d"));
  }

  @Test
  public void test_texas_holdem_4457_6h7cAdQdTh_KsJs_5s4s_Jd3c_9s9c_Qs7d_Jh4d_Kh7s() {
    assertEquals(
      "5s4s Jd3c=Jh4d Kh7s 9s9c Qs7d KsJs",
      Solver.process("texas-holdem 6h7cAdQdTh KsJs 5s4s Jd3c 9s9c Qs7d Jh4d Kh7s"));
  }

  @Test
  public void test_texas_holdem_4458_5c6d9sKcKd_3dTd_AsAd() {
    assertEquals(
      "3dTd AsAd",
      Solver.process("texas-holdem 5c6d9sKcKd 3dTd AsAd"));
  }

  @Test
  public void test_texas_holdem_4459_2c7s8c8hTc_6cKd_6d6s_9sJs_9cQs_Kh6h() {
    assertEquals(
      "9cQs 6cKd=Kh6h 6d6s 9sJs",
      Solver.process("texas-holdem 2c7s8c8hTc 6cKd 6d6s 9sJs 9cQs Kh6h"));
  }

  @Test
  public void test_texas_holdem_4460_2c2h9dAhQd_6s3c_5s4h_9cKd_7sQh() {
    assertEquals(
      "5s4h=6s3c 9cKd 7sQh",
      Solver.process("texas-holdem 2c2h9dAhQd 6s3c 5s4h 9cKd 7sQh"));
  }

  @Test
  public void test_texas_holdem_4461_5h8c8h9dAs_4h6c_5c2h_QhAd_Kc3c_Qc8s_Th7h_Ks3s_7sAc_2c5d() {
    assertEquals(
      "4h6c Th7h Kc3c=Ks3s 2c5d=5c2h 7sAc QhAd Qc8s",
      Solver.process("texas-holdem 5h8c8h9dAs 4h6c 5c2h QhAd Kc3c Qc8s Th7h Ks3s 7sAc 2c5d"));
  }

  @Test
  public void test_texas_holdem_4462_5h6d6sAhQh_Jd7h_Qd3h_7sAd() {
    assertEquals(
      "Jd7h Qd3h 7sAd",
      Solver.process("texas-holdem 5h6d6sAhQh Jd7h Qd3h 7sAd"));
  }

  @Test
  public void test_texas_holdem_4463_4c4dKdQcQs_3d8s_Ah2c_5cQh_Tc2h_2dKh_8h3h_Ac9s_7dAd() {
    assertEquals(
      "3d8s=8h3h=Tc2h 7dAd=Ac9s=Ah2c 2dKh 5cQh",
      Solver.process("texas-holdem 4c4dKdQcQs 3d8s Ah2c 5cQh Tc2h 2dKh 8h3h Ac9s 7dAd"));
  }

  @Test
  public void test_texas_holdem_4464_4d6c8sJdKd_KsAc_7cTd_7h2d() {
    assertEquals(
      "7h2d 7cTd KsAc",
      Solver.process("texas-holdem 4d6c8sJdKd KsAc 7cTd 7h2d"));
  }

  @Test
  public void test_texas_holdem_4465_6h8sAdAhQh_Kh6c_3hJh_5c4s_QcKd_Jc8h_9s3d_9c5d_7c5h() {
    assertEquals(
      "5c4s 7c5h 9c5d=9s3d Kh6c Jc8h QcKd 3hJh",
      Solver.process("texas-holdem 6h8sAdAhQh Kh6c 3hJh 5c4s QcKd Jc8h 9s3d 9c5d 7c5h"));
  }

  @Test
  public void test_texas_holdem_4466_2h3d4h6hTd_4s6d_3h7s_4c8h_Ad4d_7d9d_Ks2d() {
    assertEquals(
      "7d9d Ks2d 3h7s 4c8h Ad4d 4s6d",
      Solver.process("texas-holdem 2h3d4h6hTd 4s6d 3h7s 4c8h Ad4d 7d9d Ks2d"));
  }

  @Test
  public void test_texas_holdem_4467_2d4c4hJdKs_8c5c_2h9h_7cKh() {
    assertEquals(
      "8c5c 2h9h 7cKh",
      Solver.process("texas-holdem 2d4c4hJdKs 8c5c 2h9h 7cKh"));
  }

  @Test
  public void test_texas_holdem_4468_7hAdKdTcTh_3d5s_9dJc_Qs5h_9s7c_As3c_7s9c() {
    assertEquals(
      "3d5s 9dJc Qs5h 7s9c=9s7c As3c",
      Solver.process("texas-holdem 7hAdKdTcTh 3d5s 9dJc Qs5h 9s7c As3c 7s9c"));
  }

  @Test
  public void test_texas_holdem_4469_3d6cKsQsTh_5sJs_5d7d_6h8c_2hJc_Td8s_Qh2c_8hTc_QdTs_6dKh() {
    assertEquals(
      "5d7d 2hJc=5sJs 6h8c 8hTc=Td8s Qh2c QdTs 6dKh",
      Solver.process("texas-holdem 3d6cKsQsTh 5sJs 5d7d 6h8c 2hJc Td8s Qh2c 8hTc QdTs 6dKh"));
  }

  @Test
  public void test_texas_holdem_4470_5c6h7sTcTd_5d7d_QcJd_2h9d_JhTh_Ah6d_9h4h_6cQh_4cKd_8d4s() {
    assertEquals(
      "2h9d=9h4h QcJd 4cKd 6cQh Ah6d 5d7d JhTh 8d4s",
      Solver.process("texas-holdem 5c6h7sTcTd 5d7d QcJd 2h9d JhTh Ah6d 9h4h 6cQh 4cKd 8d4s"));
  }

  @Test
  public void test_texas_holdem_4471_2c2d4cAhQd_Qc6h_Ad5c_5d3d_8sTs_JhTd_5h2h_7s6d() {
    assertEquals(
      "7s6d 8sTs JhTd Qc6h Ad5c 5h2h 5d3d",
      Solver.process("texas-holdem 2c2d4cAhQd Qc6h Ad5c 5d3d 8sTs JhTd 5h2h 7s6d"));
  }

  @Test
  public void test_texas_holdem_4472_3h5c9cAdQd_2cQh_Kd3c_3dKs_4hAh_7c9h_Td4c_5s8c_Js6h() {
    assertEquals(
      "Td4c Js6h 3dKs=Kd3c 5s8c 7c9h 2cQh 4hAh",
      Solver.process("texas-holdem 3h5c9cAdQd 2cQh Kd3c 3dKs 4hAh 7c9h Td4c 5s8c Js6h"));
  }

  @Test
  public void test_texas_holdem_4473_4s6h8sKcQc_5d4c_As8c_Qd2s_QhTd() {
    assertEquals(
      "5d4c As8c Qd2s QhTd",
      Solver.process("texas-holdem 4s6h8sKcQc 5d4c As8c Qd2s QhTd"));
  }

  @Test
  public void test_texas_holdem_4474_5c6d8h9hTd_Tc7s_6c7d() {
    assertEquals(
      "6c7d=Tc7s",
      Solver.process("texas-holdem 5c6d8h9hTd Tc7s 6c7d"));
  }

  @Test
  public void test_texas_holdem_4475_3h3s7hJsTh_8d8h_9s2h_7c8s_KdAs_5sKh_7d3d() {
    assertEquals(
      "9s2h 5sKh KdAs 7c8s 8d8h 7d3d",
      Solver.process("texas-holdem 3h3s7hJsTh 8d8h 9s2h 7c8s KdAs 5sKh 7d3d"));
  }

  @Test
  public void test_texas_holdem_4476_2c2d3cKhQh_7s9d_9hAc_2h3s_Jc6h() {
    assertEquals(
      "7s9d Jc6h 9hAc 2h3s",
      Solver.process("texas-holdem 2c2d3cKhQh 7s9d 9hAc 2h3s Jc6h"));
  }

  @Test
  public void test_texas_holdem_4477_3s8dJdQcQs_4dKs_Tc3d_Ts6d_7c7h() {
    assertEquals(
      "Ts6d 4dKs Tc3d 7c7h",
      Solver.process("texas-holdem 3s8dJdQcQs 4dKs Tc3d Ts6d 7c7h"));
  }

  @Test
  public void test_texas_holdem_4478_5h6s8cTcTs_5d9s_4c2d_Th7d_JdQs_7c7s() {
    assertEquals(
      "4c2d JdQs 5d9s 7c7s Th7d",
      Solver.process("texas-holdem 5h6s8cTcTs 5d9s 4c2d Th7d JdQs 7c7s"));
  }

  @Test
  public void test_texas_holdem_4479_2c4c9d9hAh_KsTd_TcJh_3dKc_2hJc_Qs2d_JsTh_4s8d_Ad9c() {
    assertEquals(
      "JsTh=TcJh 3dKc KsTd 2hJc=Qs2d 4s8d Ad9c",
      Solver.process("texas-holdem 2c4c9d9hAh KsTd TcJh 3dKc 2hJc Qs2d JsTh 4s8d Ad9c"));
  }

  @Test
  public void test_texas_holdem_4480_2c5d6cJsKs_Ac5s_5cQd_Qs6d_3dTc_8c4s_JcJh() {
    assertEquals(
      "8c4s 3dTc 5cQd Ac5s Qs6d JcJh",
      Solver.process("texas-holdem 2c5d6cJsKs Ac5s 5cQd Qs6d 3dTc 8c4s JcJh"));
  }

  @Test
  public void test_texas_holdem_4481_2h2s4c4s6d_9cQc_4hQd() {
    assertEquals(
      "9cQc 4hQd",
      Solver.process("texas-holdem 2h2s4c4s6d 9cQc 4hQd"));
  }

  @Test
  public void test_texas_holdem_4482_2c4d9sKdTh_7h4c_JdAc() {
    assertEquals(
      "JdAc 7h4c",
      Solver.process("texas-holdem 2c4d9sKdTh 7h4c JdAc"));
  }

  @Test
  public void test_texas_holdem_4483_2h6sAcQdTh_7dQs_3c6c_Jd9s_9d5c_2dTs_5s8h_7h8d_Ad5d() {
    assertEquals(
      "5s8h 7h8d 9d5c Jd9s 3c6c 7dQs Ad5d 2dTs",
      Solver.process("texas-holdem 2h6sAcQdTh 7dQs 3c6c Jd9s 9d5c 2dTs 5s8h 7h8d Ad5d"));
  }

  @Test
  public void test_texas_holdem_4484_2d4d7d7s9c_Th5h_Kd5d_3d8c_8h6c_2hAh_6hQc_4sAc_6d4h_Ad8s() {
    assertEquals(
      "3d8c 8h6c Th5h 6hQc Ad8s 2hAh 6d4h 4sAc Kd5d",
      Solver.process("texas-holdem 2d4d7d7s9c Th5h Kd5d 3d8c 8h6c 2hAh 6hQc 4sAc 6d4h Ad8s"));
  }

  @Test
  public void test_texas_holdem_4485_2s4s8c8sJc_8dKc_Jd6c_5cJh() {
    assertEquals(
      "5cJh Jd6c 8dKc",
      Solver.process("texas-holdem 2s4s8c8sJc 8dKc Jd6c 5cJh"));
  }

  @Test
  public void test_texas_holdem_4486_4c5c6c7s8c_JhTs_5s6s_Tc8s_Td7c_6dKd_4d7h() {
    assertEquals(
      "4d7h=5s6s=6dKd=JhTs Tc8s Td7c",
      Solver.process("texas-holdem 4c5c6c7s8c JhTs 5s6s Tc8s Td7c 6dKd 4d7h"));
  }

  @Test
  public void test_texas_holdem_4487_3c7h8dJcTs_7c2h_AhTh_9cJh_9dKd_Qs9s_JdAd() {
    assertEquals(
      "7c2h AhTh JdAd 9cJh=9dKd Qs9s",
      Solver.process("texas-holdem 3c7h8dJcTs 7c2h AhTh 9cJh 9dKd Qs9s JdAd"));
  }

  @Test
  public void test_texas_holdem_4488_3d5d8hAcQh_Kh2s_4sJc_7c8c_4h3h_Th6c_JdTc() {
    assertEquals(
      "Th6c 4sJc JdTc Kh2s 4h3h 7c8c",
      Solver.process("texas-holdem 3d5d8hAcQh Kh2s 4sJc 7c8c 4h3h Th6c JdTc"));
  }

  @Test
  public void test_texas_holdem_4489_2h4h7dJcTc_6d4d_2d5h_Ks9h_JhAh_3d9d_5s6c_6s2c_4sQs_5cJs() {
    assertEquals(
      "5s6c 3d9d Ks9h 2d5h=6s2c 6d4d 4sQs 5cJs JhAh",
      Solver.process("texas-holdem 2h4h7dJcTc 6d4d 2d5h Ks9h JhAh 3d9d 5s6c 6s2c 4sQs 5cJs"));
  }

  @Test
  public void test_texas_holdem_4490_4c9cKsQdQs_8s3c_4s7h_8dJd_KdAs_7d6c_2c4h_JhJc_3s8c_2s6d() {
    assertEquals(
      "2s6d 7d6c 3s8c=8s3c 8dJd 2c4h=4s7h JhJc KdAs",
      Solver.process("texas-holdem 4c9cKsQdQs 8s3c 4s7h 8dJd KdAs 7d6c 2c4h JhJc 3s8c 2s6d"));
  }

  @Test
  public void test_texas_holdem_4491_2c4c8d8hJd_7cKc_Js9h_9c2h_Ts6h_KsQc() {
    assertEquals(
      "Ts6h 7cKc KsQc 9c2h Js9h",
      Solver.process("texas-holdem 2c4c8d8hJd 7cKc Js9h 9c2h Ts6h KsQc"));
  }

  @Test
  public void test_texas_holdem_4492_2d2s4d4hAh_TdTs_6d3s() {
    assertEquals(
      "6d3s TdTs",
      Solver.process("texas-holdem 2d2s4d4hAh TdTs 6d3s"));
  }

  @Test
  public void test_texas_holdem_4493_AcJhTcThTs_7c2c_9h5h_8hKd_6d3h() {
    assertEquals(
      "6d3h=7c2c=9h5h 8hKd",
      Solver.process("texas-holdem AcJhTcThTs 7c2c 9h5h 8hKd 6d3h"));
  }

  @Test
  public void test_texas_holdem_4494_2d3d7h9hJc_3c3h_5hKd_Qs6h_7cJs() {
    assertEquals(
      "Qs6h 5hKd 7cJs 3c3h",
      Solver.process("texas-holdem 2d3d7h9hJc 3c3h 5hKd Qs6h 7cJs"));
  }

  @Test
  public void test_texas_holdem_4495_4d5h8d9sQs_2d8h_Js8c_Kh3c_KcKs_9c3h_As5s() {
    assertEquals(
      "Kh3c As5s 2d8h Js8c 9c3h KcKs",
      Solver.process("texas-holdem 4d5h8d9sQs 2d8h Js8c Kh3c KcKs 9c3h As5s"));
  }

  @Test
  public void test_texas_holdem_4496_3s4c4d7h8h_Ac5d_6hJc_4h2s_8cAd_QcTd() {
    assertEquals(
      "6hJc QcTd Ac5d 8cAd 4h2s",
      Solver.process("texas-holdem 3s4c4d7h8h Ac5d 6hJc 4h2s 8cAd QcTd"));
  }

  @Test
  public void test_texas_holdem_4497_4s6c7h8hAd_4c8c_8d5c_6dTd_4dTs() {
    assertEquals(
      "4dTs 6dTd 4c8c 8d5c",
      Solver.process("texas-holdem 4s6c7h8hAd 4c8c 8d5c 6dTd 4dTs"));
  }

  @Test
  public void test_texas_holdem_4498_4d6c6h8hKd_Tc6d_9dJh_7s4s_As3c_9hKs_2h9s_3dJc_Ac2d_6s7d() {
    assertEquals(
      "2h9s 3dJc 9dJh Ac2d=As3c 7s4s 9hKs 6s7d Tc6d",
      Solver.process("texas-holdem 4d6c6h8hKd Tc6d 9dJh 7s4s As3c 9hKs 2h9s 3dJc Ac2d 6s7d"));
  }

  @Test
  public void test_texas_holdem_4499_4h7s8cKhTd_9c9s_3h6s_9h3s_Kc6c_TsTh_7cJc_Tc8h_2dQc_7d6d() {
    assertEquals(
      "3h6s 9h3s 2dQc 7d6d 7cJc 9c9s Kc6c Tc8h TsTh",
      Solver.process("texas-holdem 4h7s8cKhTd 9c9s 3h6s 9h3s Kc6c TsTh 7cJc Tc8h 2dQc 7d6d"));
  }

}
