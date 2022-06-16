
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver35HiddenTest {


  @Test
  public void test_omaha_holdem_8750_4s6s8cJcTs_6c5hKc9c_Qc7sTdKs_7cAdJs7d() {
    assertEquals(
      "6c5hKc9c 7cAdJs7d Qc7sTdKs",
      Solver.process("omaha-holdem 4s6s8cJcTs 6c5hKc9c Qc7sTdKs 7cAdJs7d"));
  }

  @Test
  public void test_omaha_holdem_8751_2h9c9sKhTs_4dAcQs7h_5dAs4h5s_Th8c5c2s() {
    assertEquals(
      "4dAcQs7h 5dAs4h5s Th8c5c2s",
      Solver.process("omaha-holdem 2h9c9sKhTs 4dAcQs7h 5dAs4h5s Th8c5c2s"));
  }

  @Test
  public void test_omaha_holdem_8752_4d7d9cJhQc_9d8h2hQs_Jd3s5d7s_5c5h9hAd() {
    assertEquals(
      "5c5h9hAd Jd3s5d7s 9d8h2hQs",
      Solver.process("omaha-holdem 4d7d9cJhQc 9d8h2hQs Jd3s5d7s 5c5h9hAd"));
  }

  @Test
  public void test_omaha_holdem_8753_3d7dJdKcKs_9sQh3s7c_5c5d5h2h_KdJs8c9d_Jh4c7s9c_4hTs2d3c_6h6c4s5s_8h2cTcKh_Ah3hQcTh_AsAc8s6s() {
    assertEquals(
      "4hTs2d3c Ah3hQcTh 5c5d5h2h 6h6c4s5s 9sQh3s7c Jh4c7s9c AsAc8s6s 8h2cTcKh KdJs8c9d",
      Solver.process("omaha-holdem 3d7dJdKcKs 9sQh3s7c 5c5d5h2h KdJs8c9d Jh4c7s9c 4hTs2d3c 6h6c4s5s 8h2cTcKh Ah3hQcTh AsAc8s6s"));
  }

  @Test
  public void test_omaha_holdem_8754_4d5dAcJcJh_4c9d9s7s_KcQhAh7d() {
    assertEquals(
      "4c9d9s7s KcQhAh7d",
      Solver.process("omaha-holdem 4d5dAcJcJh 4c9d9s7s KcQhAh7d"));
  }

  @Test
  public void test_omaha_holdem_8755_2h7c8d9sTd_4h5s3cAh_2cJdTsAc_9h3s9d6d_8c8sQd7s_Ad4c7hQh_6s4s2sJc_6h3d8hTc_KsQcQs4d_JhThKd5h() {
    assertEquals(
      "4h5s3cAh 6s4s2sJc Ad4c7hQh KsQcQs4d 8c8sQd7s 6h3d8hTc=9h3s9d6d 2cJdTsAc=JhThKd5h",
      Solver.process("omaha-holdem 2h7c8d9sTd 4h5s3cAh 2cJdTsAc 9h3s9d6d 8c8sQd7s Ad4c7hQh 6s4s2sJc 6h3d8hTc KsQcQs4d JhThKd5h"));
  }

  @Test
  public void test_omaha_holdem_8756_2d4h8hTcTs_5d6c4d8c_6dQs3d9c_JcAc9h6h_AdQdKs4s_2h7c5sJd_Kh2s8d3s() {
    assertEquals(
      "6dQs3d9c JcAc9h6h 2h7c5sJd AdQdKs4s 5d6c4d8c Kh2s8d3s",
      Solver.process("omaha-holdem 2d4h8hTcTs 5d6c4d8c 6dQs3d9c JcAc9h6h AdQdKs4s 2h7c5sJd Kh2s8d3s"));
  }

  @Test
  public void test_omaha_holdem_8757_4s9dJsTcTs_8cQsAc2c_3c9c6d9h_QhKs6sJc_5c5d3dAh_KcQd2d7c_7dAsThAd_3s2h9s6c() {
    assertEquals(
      "5c5d3dAh 7dAsThAd 8cQsAc2c KcQd2d7c 3s2h9s6c QhKs6sJc 3c9c6d9h",
      Solver.process("omaha-holdem 4s9dJsTcTs 8cQsAc2c 3c9c6d9h QhKs6sJc 5c5d3dAh KcQd2d7c 7dAsThAd 3s2h9s6c"));
  }

  @Test
  public void test_omaha_holdem_8758_2h3s7h8d9c_AsThQd3d_8s7c6d7d_Kc9h6s9s_Kh6c3hJs_Jc3cKdQs_9d8h5dJd_4c6h4s2d() {
    assertEquals(
      "Jc3cKdQs=Kh6c3hJs AsThQd3d 4c6h4s2d 9d8h5dJd 8s7c6d7d Kc9h6s9s",
      Solver.process("omaha-holdem 2h3s7h8d9c AsThQd3d 8s7c6d7d Kc9h6s9s Kh6c3hJs Jc3cKdQs 9d8h5dJd 4c6h4s2d"));
  }

  @Test
  public void test_omaha_holdem_8759_3h5h7cJsQc_8d2c9sAh_Kd2s6s3s_9c5cTd4d_7dKc7hQs() {
    assertEquals(
      "8d2c9sAh Kd2s6s3s 9c5cTd4d 7dKc7hQs",
      Solver.process("omaha-holdem 3h5h7cJsQc 8d2c9sAh Kd2s6s3s 9c5cTd4d 7dKc7hQs"));
  }

  @Test
  public void test_omaha_holdem_8760_2d3h5sJcQd_8h4s9d4d_8c7c8dKs_Tc7dJs9s_5c3c4h9c_6cThTdQh_6dJhQc7h_2c8s6s3s() {
    assertEquals(
      "8h4s9d4d 8c7c8dKs Tc7dJs9s 6cThTdQh 2c8s6s3s 5c3c4h9c 6dJhQc7h",
      Solver.process("omaha-holdem 2d3h5sJcQd 8h4s9d4d 8c7c8dKs Tc7dJs9s 5c3c4h9c 6cThTdQh 6dJhQc7h 2c8s6s3s"));
  }

  @Test
  public void test_omaha_holdem_8761_7s9c9dJdQh_4dKh9sQs_AdKs8s6h_8h6c6d8d_2h7dKcQd_5c8cJh5d_AcQc2sAh_Ts7cJsJc() {
    assertEquals(
      "AdKs8s6h 8h6c6d8d 5c8cJh5d 2h7dKcQd AcQc2sAh 4dKh9sQs Ts7cJsJc",
      Solver.process("omaha-holdem 7s9c9dJdQh 4dKh9sQs AdKs8s6h 8h6c6d8d 2h7dKcQd 5c8cJh5d AcQc2sAh Ts7cJsJc"));
  }

  @Test
  public void test_omaha_holdem_8762_4d4h6h8sTs_3h8h8dQh_5h9hAcJc_Ad4c9d2h_Td7d7h8c_JhTcKhKs_2c7sAs2s_5d9cAh5c_Js5sQs3s() {
    assertEquals(
      "Js5sQs3s 5h9hAcJc 2c7sAs2s 5d9cAh5c Td7d7h8c JhTcKhKs Ad4c9d2h 3h8h8dQh",
      Solver.process("omaha-holdem 4d4h6h8sTs 3h8h8dQh 5h9hAcJc Ad4c9d2h Td7d7h8c JhTcKhKs 2c7sAs2s 5d9cAh5c Js5sQs3s"));
  }

  @Test
  public void test_omaha_holdem_8763_2h3d4c7hAd_9c2d9h8c_3hJs7c9s() {
    assertEquals(
      "9c2d9h8c 3hJs7c9s",
      Solver.process("omaha-holdem 2h3d4c7hAd 9c2d9h8c 3hJs7c9s"));
  }

  @Test
  public void test_omaha_holdem_8764_5c7d7hQdTc_5hKc9d6c_2dTh6h2h_Kd4d3h5d() {
    assertEquals(
      "5hKc9d6c=Kd4d3h5d 2dTh6h2h",
      Solver.process("omaha-holdem 5c7d7hQdTc 5hKc9d6c 2dTh6h2h Kd4d3h5d"));
  }

  @Test
  public void test_omaha_holdem_8765_3d4hQcQhTh_4c7h9hKd_Jd3c6cTd() {
    assertEquals(
      "Jd3c6cTd 4c7h9hKd",
      Solver.process("omaha-holdem 3d4hQcQhTh 4c7h9hKd Jd3c6cTd"));
  }

  @Test
  public void test_omaha_holdem_8766_2c7c8dKsQh_8h5h4c9d_3s9cAdAh_QdAs4dAc_5c7dKh5s_QsKd9h3d_9s2s6dQc() {
    assertEquals(
      "8h5h4c9d 3s9cAdAh=QdAs4dAc 9s2s6dQc 5c7dKh5s QsKd9h3d",
      Solver.process("omaha-holdem 2c7c8dKsQh 8h5h4c9d 3s9cAdAh QdAs4dAc 5c7dKh5s QsKd9h3d 9s2s6dQc"));
  }

  @Test
  public void test_omaha_holdem_8767_5s8sAcQsTs_2dQh3hJs_Jc5c7hTc_5d2h3c5h_KdAs9d6c() {
    assertEquals(
      "2dQh3hJs KdAs9d6c Jc5c7hTc 5d2h3c5h",
      Solver.process("omaha-holdem 5s8sAcQsTs 2dQh3hJs Jc5c7hTc 5d2h3c5h KdAs9d6c"));
  }

  @Test
  public void test_omaha_holdem_8768_2h4s6cJdQd_7sKcAh9h_9c7cQc3h_2sTsTh5c_6hQsJsKs_4c4h2d2c_9d3s9s3c_AcTdAs8h_Ad5s4dJc_5dKdJhTc() {
    assertEquals(
      "7sKcAh9h 9d3s9s3c 2sTsTh5c 5dKdJhTc 9c7cQc3h AcTdAs8h Ad5s4dJc 6hQsJsKs 4c4h2d2c",
      Solver.process("omaha-holdem 2h4s6cJdQd 7sKcAh9h 9c7cQc3h 2sTsTh5c 6hQsJsKs 4c4h2d2c 9d3s9s3c AcTdAs8h Ad5s4dJc 5dKdJhTc"));
  }

  @Test
  public void test_omaha_holdem_8769_2c6c7sAdKh_QdKd2d3c_Ts2s8hQh_Ac7d6dAh_Qs5c9s4s_5dTd5s3h() {
    assertEquals(
      "Qs5c9s4s Ts2s8hQh 5dTd5s3h QdKd2d3c Ac7d6dAh",
      Solver.process("omaha-holdem 2c6c7sAdKh QdKd2d3c Ts2s8hQh Ac7d6dAh Qs5c9s4s 5dTd5s3h"));
  }

  @Test
  public void test_omaha_holdem_8770_7c7d8s9cQs_Kc4h5sAh_3s9h5hTc_5d6c6s2d_Qc8d6d2h_7h9d3d8h_Ts6hAsQd_7s8cJs3c_Ks3h2cJc_AcKdTdJd() {
    assertEquals(
      "Ks3h2cJc Kc4h5sAh 3s9h5hTc Qc8d6d2h 5d6c6s2d Ts6hAsQd AcKdTdJd 7s8cJs3c 7h9d3d8h",
      Solver.process("omaha-holdem 7c7d8s9cQs Kc4h5sAh 3s9h5hTc 5d6c6s2d Qc8d6d2h 7h9d3d8h Ts6hAsQd 7s8cJs3c Ks3h2cJc AcKdTdJd"));
  }

  @Test
  public void test_omaha_holdem_8771_2h5c6d6s8s_JsKhJcQh_7c7dQd8c() {
    assertEquals(
      "7c7dQd8c JsKhJcQh",
      Solver.process("omaha-holdem 2h5c6d6s8s JsKhJcQh 7c7dQd8c"));
  }

  @Test
  public void test_omaha_holdem_8772_6c7h8c8d9c_As5s3cAd_TcQc3h5c_Ts3dTh8h_Jd7d4h7c_Qd3s4d4s_KdQhAc2c_6s4c6h2h_8sQs9dTd_5d2sKs9s() {
    assertEquals(
      "Qd3s4d4s As5s3cAd 5d2sKs9s Ts3dTh8h TcQc3h5c KdQhAc2c 6s4c6h2h Jd7d4h7c 8sQs9dTd",
      Solver.process("omaha-holdem 6c7h8c8d9c As5s3cAd TcQc3h5c Ts3dTh8h Jd7d4h7c Qd3s4d4s KdQhAc2c 6s4c6h2h 8sQs9dTd 5d2sKs9s"));
  }

  @Test
  public void test_omaha_holdem_8773_5s8c8d9dJs_4dJhTd3s_2dQd6d6c_As6s3hAc_5cTs5hAh_2h2s3dJc_7dKd9c4s_4cKs5d8h() {
    assertEquals(
      "2dQd6d6c 7dKd9c4s 2h2s3dJc 4dJhTd3s As6s3hAc 5cTs5hAh 4cKs5d8h",
      Solver.process("omaha-holdem 5s8c8d9dJs 4dJhTd3s 2dQd6d6c As6s3hAc 5cTs5hAh 2h2s3dJc 7dKd9c4s 4cKs5d8h"));
  }

  @Test
  public void test_omaha_holdem_8774_2s7d7h8sAs_6h5c6cKs_Qh8dAd6d_Kh3dJhQc_7s3c4dAh_5h2c9h4h_Th4c4sJs() {
    assertEquals(
      "Kh3dJhQc 5h2c9h4h 6h5c6cKs Qh8dAd6d Th4c4sJs 7s3c4dAh",
      Solver.process("omaha-holdem 2s7d7h8sAs 6h5c6cKs Qh8dAd6d Kh3dJhQc 7s3c4dAh 5h2c9h4h Th4c4sJs"));
  }

  @Test
  public void test_omaha_holdem_8775_3s4c7c7h8h_Kc9hAd5h_6cKh2c7s_3h5sTc8d_9s8cTs9c_6sAsQs5d() {
    assertEquals(
      "Kc9hAd5h 3h5sTc8d 9s8cTs9c 6cKh2c7s 6sAsQs5d",
      Solver.process("omaha-holdem 3s4c7c7h8h Kc9hAd5h 6cKh2c7s 3h5sTc8d 9s8cTs9c 6sAsQs5d"));
  }

  @Test
  public void test_omaha_holdem_8776_2h4s6s8h9d_7d2d4h7s_9cKs9s6c_Qd4dTc5c_3h5dTh7c_AdJdTs8c_QcJs6d9h_Kd5sTd3s() {
    assertEquals(
      "Qd4dTc5c AdJdTs8c 7d2d4h7s QcJs6d9h 9cKs9s6c Kd5sTd3s 3h5dTh7c",
      Solver.process("omaha-holdem 2h4s6s8h9d 7d2d4h7s 9cKs9s6c Qd4dTc5c 3h5dTh7c AdJdTs8c QcJs6d9h Kd5sTd3s"));
  }

  @Test
  public void test_omaha_holdem_8777_5s7c8cAsTd_5dKs4d3h_Qh2sKhAd_6hJs4s3c_3dThTc8h_KdQs9d4c_9cQd9hJh_5c8sQc4h_6c3s7s9s() {
    assertEquals(
      "KdQs9d4c 5dKs4d3h Qh2sKhAd 5c8sQc4h 3dThTc8h 6hJs4s3c 6c3s7s9s 9cQd9hJh",
      Solver.process("omaha-holdem 5s7c8cAsTd 5dKs4d3h Qh2sKhAd 6hJs4s3c 3dThTc8h KdQs9d4c 9cQd9hJh 5c8sQc4h 6c3s7s9s"));
  }

  @Test
  public void test_omaha_holdem_8778_4c5s7hAhQh_5hQcAdQd_9sJdJs8h_6hJhKh4h_2d4s2hAs_Ac9d7c2c_Kd8cKsTs_6c3s2s6d_JcTd5cKc() {
    assertEquals(
      "JcTd5cKc 9sJdJs8h Kd8cKsTs 2d4s2hAs Ac9d7c2c 5hQcAdQd 6c3s2s6d 6hJhKh4h",
      Solver.process("omaha-holdem 4c5s7hAhQh 5hQcAdQd 9sJdJs8h 6hJhKh4h 2d4s2hAs Ac9d7c2c Kd8cKsTs 6c3s2s6d JcTd5cKc"));
  }

  @Test
  public void test_omaha_holdem_8779_4s5c8h9dKc_5sKd6dJd_Ac6sJs4c_9h6hAh8s_Qc2sTcKh_TsQsAs7c() {
    assertEquals(
      "TsQsAs7c Ac6sJs4c Qc2sTcKh 9h6hAh8s 5sKd6dJd",
      Solver.process("omaha-holdem 4s5c8h9dKc 5sKd6dJd Ac6sJs4c 9h6hAh8s Qc2sTcKh TsQsAs7c"));
  }

  @Test
  public void test_omaha_holdem_8780_3d6c6h7cJd_Jh2s8c8s_3s9h4s7d_6sAs3h2c_8h9c7sKd_9sJs2hQs_2d3cTh6d_4d5cKs4h() {
    assertEquals(
      "3s9h4s7d 8h9c7sKd Jh2s8c8s 9sJs2hQs 4d5cKs4h 2d3cTh6d=6sAs3h2c",
      Solver.process("omaha-holdem 3d6c6h7cJd Jh2s8c8s 3s9h4s7d 6sAs3h2c 8h9c7sKd 9sJs2hQs 2d3cTh6d 4d5cKs4h"));
  }

  @Test
  public void test_omaha_holdem_8781_6d8sAsKhTc_6c8c2c7s_7h5c8h6s_Kc5sJhQd() {
    assertEquals(
      "6c8c2c7s=7h5c8h6s Kc5sJhQd",
      Solver.process("omaha-holdem 6d8sAsKhTc 6c8c2c7s 7h5c8h6s Kc5sJhQd"));
  }

  @Test
  public void test_omaha_holdem_8782_6h7c8hKhKs_4c9sKd5h_Jh9d5c3s_JcQc5dJd_Ah2h9c4h_8cTc4d2c() {
    assertEquals(
      "8cTc4d2c JcQc5dJd 4c9sKd5h=Jh9d5c3s Ah2h9c4h",
      Solver.process("omaha-holdem 6h7c8hKhKs 4c9sKd5h Jh9d5c3s JcQc5dJd Ah2h9c4h 8cTc4d2c"));
  }

  @Test
  public void test_omaha_holdem_8783_7dAcKcKhQd_2h8s9s6s_6hJs8h5c() {
    assertEquals(
      "2h8s9s6s 6hJs8h5c",
      Solver.process("omaha-holdem 7dAcKcKhQd 2h8s9s6s 6hJs8h5c"));
  }

  @Test
  public void test_omaha_holdem_8784_3s4s9cAhTc_JcJs2c2d_As2s5h4c_6hTs7dQc_6c6s9hKc_Kh7h8sKd_Ac4h5c6d_4d8c3dQd() {
    assertEquals(
      "6c6s9hKc 6hTs7dQc JcJs2c2d Kh7h8sKd 4d8c3dQd Ac4h5c6d As2s5h4c",
      Solver.process("omaha-holdem 3s4s9cAhTc JcJs2c2d As2s5h4c 6hTs7dQc 6c6s9hKc Kh7h8sKd Ac4h5c6d 4d8c3dQd"));
  }

  @Test
  public void test_omaha_holdem_8785_3d7h8sAsJd_2d2c6d2s_Td7d5dQd_5h8c4d8d_JsQsTh4c_6cKhQcKc_3sKd3h7c_9s8hAcKs_6s4h5s2h() {
    assertEquals(
      "6s4h5s2h 2d2c6d2s Td7d5dQd JsQsTh4c 6cKhQcKc 9s8hAcKs 3sKd3h7c 5h8c4d8d",
      Solver.process("omaha-holdem 3d7h8sAsJd 2d2c6d2s Td7d5dQd 5h8c4d8d JsQsTh4c 6cKhQcKc 3sKd3h7c 9s8hAcKs 6s4h5s2h"));
  }

  @Test
  public void test_omaha_holdem_8786_3d8s9sJdTh_Ad9d4dKs_5hAs5c6c_2d7h2hJs_4h3hQdTc_Ah6s7c7d() {
    assertEquals(
      "5hAs5c6c Ad9d4dKs Ah6s7c7d 2d7h2hJs 4h3hQdTc",
      Solver.process("omaha-holdem 3d8s9sJdTh Ad9d4dKs 5hAs5c6c 2d7h2hJs 4h3hQdTc Ah6s7c7d"));
  }

  @Test
  public void test_omaha_holdem_8787_2h5cAhJdTh_AdTs9dQs_6hKc5h4d_JcKdAsAc() {
    assertEquals(
      "AdTs9dQs JcKdAsAc 6hKc5h4d",
      Solver.process("omaha-holdem 2h5cAhJdTh AdTs9dQs 6hKc5h4d JcKdAsAc"));
  }

  @Test
  public void test_omaha_holdem_8788_2c4hJcKcQd_7s5hQs6s_3cTs9hQh_3s8c8sJs_8d6c9c7d_TdJd2d2h_3hKs9sAh() {
    assertEquals(
      "3s8c8sJs 7s5hQs6s 3hKs9sAh TdJd2d2h 3cTs9hQh 8d6c9c7d",
      Solver.process("omaha-holdem 2c4hJcKcQd 7s5hQs6s 3cTs9hQh 3s8c8sJs 8d6c9c7d TdJd2d2h 3hKs9sAh"));
  }

  @Test
  public void test_omaha_holdem_8789_4h5c6s7sAh_As4s2h5d_7d8s7hJs_Ts5h9h3h_Ks3c2cQs_Qc9s3dQh_4d9cAd8c_Jd3s5s9d() {
    assertEquals(
      "Qc9s3dQh As4s2h5d Ks3c2cQs Jd3s5s9d=Ts5h9h3h 7d8s7hJs 4d9cAd8c",
      Solver.process("omaha-holdem 4h5c6s7sAh As4s2h5d 7d8s7hJs Ts5h9h3h Ks3c2cQs Qc9s3dQh 4d9cAd8c Jd3s5s9d"));
  }

  @Test
  public void test_omaha_holdem_8790_2c7d8h9sTc_AsQhQc6d_2sJs7cQs_5hAcJcQd() {
    assertEquals(
      "AsQhQc6d 2sJs7cQs=5hAcJcQd",
      Solver.process("omaha-holdem 2c7d8h9sTc AsQhQc6d 2sJs7cQs 5hAcJcQd"));
  }

  @Test
  public void test_omaha_holdem_8791_5s8h9hAdKh_3d9d6dJc_6h6cTd2h_Jh4d9s8s_Qc7h5cAc_6sQh3s3c_8dTc4h9c_2sQsQd2c_4c7cKc7d_5h8cKs4s() {
    assertEquals(
      "6sQh3s3c 3d9d6dJc 2sQsQd2c 4c7cKc7d 8dTc4h9c=Jh4d9s8s 5h8cKs4s Qc7h5cAc 6h6cTd2h",
      Solver.process("omaha-holdem 5s8h9hAdKh 3d9d6dJc 6h6cTd2h Jh4d9s8s Qc7h5cAc 6sQh3s3c 8dTc4h9c 2sQsQd2c 4c7cKc7d 5h8cKs4s"));
  }

  @Test
  public void test_omaha_holdem_8792_2d4c9h9sQh_Ad8d3cKc_KdKh8cJs_Qs5d7s5h() {
    assertEquals(
      "Ad8d3cKc Qs5d7s5h KdKh8cJs",
      Solver.process("omaha-holdem 2d4c9h9sQh Ad8d3cKc KdKh8cJs Qs5d7s5h"));
  }

  @Test
  public void test_omaha_holdem_8793_7s8d9hJcJd_7c7dKc3h_Qc3dAs4h_2s6s7hJs_2c9d8cTc_6dAcQh3s_Jh6hAh5c_2h5d8hTd_2dThQd4d() {
    assertEquals(
      "6dAcQh3s=Qc3dAs4h Jh6hAh5c 2c9d8cTc=2h5d8hTd 2dThQd4d 7c7dKc3h 2s6s7hJs",
      Solver.process("omaha-holdem 7s8d9hJcJd 7c7dKc3h Qc3dAs4h 2s6s7hJs 2c9d8cTc 6dAcQh3s Jh6hAh5c 2h5d8hTd 2dThQd4d"));
  }

  @Test
  public void test_omaha_holdem_8794_2c3c3d4c8d_5h2s7dKs_4h3h9d9h_Qs3s5c7h_Ad5s9s7c_Jd6d8sQd_2hKcTcQh() {
    assertEquals(
      "5h2s7dKs Jd6d8sQd Qs3s5c7h Ad5s9s7c 2hKcTcQh 4h3h9d9h",
      Solver.process("omaha-holdem 2c3c3d4c8d 5h2s7dKs 4h3h9d9h Qs3s5c7h Ad5s9s7c Jd6d8sQd 2hKcTcQh"));
  }

  @Test
  public void test_omaha_holdem_8795_2h6cAsKsTs_9d8sAhJc_5hTcAdKc_4hJh2d3h_3d7hThKh_Js5c7d9c_4s6sKd6d_9sQh4dTd_7s2c5dAc_8d4c7cQc() {
    assertEquals(
      "Js5c7d9c 8d4c7cQc 4hJh2d3h 9sQh4dTd 9d8sAhJc 3d7hThKh 7s2c5dAc 5hTcAdKc 4s6sKd6d",
      Solver.process("omaha-holdem 2h6cAsKsTs 9d8sAhJc 5hTcAdKc 4hJh2d3h 3d7hThKh Js5c7d9c 4s6sKd6d 9sQh4dTd 7s2c5dAc 8d4c7cQc"));
  }

  @Test
  public void test_omaha_holdem_8796_3h4s7hJsQh_Jh9d5cTd_2sQcKd5h_Ks3d7c8c_2c2h6c9s_Kc6d7d9h_5dThTsAc_6hQs7sAd_Tc4d8sJc() {
    assertEquals(
      "2c2h6c9s Kc6d7d9h 5dThTsAc Jh9d5cTd 2sQcKd5h Ks3d7c8c Tc4d8sJc 6hQs7sAd",
      Solver.process("omaha-holdem 3h4s7hJsQh Jh9d5cTd 2sQcKd5h Ks3d7c8c 2c2h6c9s Kc6d7d9h 5dThTsAc 6hQs7sAd Tc4d8sJc"));
  }

  @Test
  public void test_omaha_holdem_8797_2h3h7c8dKs_5hJc7hTh_Kh4cAc7s_8hQc4sJd_3sJs4d6c() {
    assertEquals(
      "3sJs4d6c 5hJc7hTh 8hQc4sJd Kh4cAc7s",
      Solver.process("omaha-holdem 2h3h7c8dKs 5hJc7hTh Kh4cAc7s 8hQc4sJd 3sJs4d6c"));
  }

  @Test
  public void test_omaha_holdem_8798_3c4d5h6hTc_JdTs5dTd_4h7dQc4s_8sKcAh9c_4cAsJc7s() {
    assertEquals(
      "8sKcAh9c JdTs5dTd 4cAsJc7s=4h7dQc4s",
      Solver.process("omaha-holdem 3c4d5h6hTc JdTs5dTd 4h7dQc4s 8sKcAh9c 4cAsJc7s"));
  }

  @Test
  public void test_omaha_holdem_8799_2c8sAdQcTc_QsTs7d3d_Qh5hThJc_Ac5sKc3s_Ah5d9d3c_2s6c8d7h_Kd2h8hJs() {
    assertEquals(
      "Ah5d9d3c 2s6c8d7h Qh5hThJc=QsTs7d3d Kd2h8hJs Ac5sKc3s",
      Solver.process("omaha-holdem 2c8sAdQcTc QsTs7d3d Qh5hThJc Ac5sKc3s Ah5d9d3c 2s6c8d7h Kd2h8hJs"));
  }

  @Test
  public void test_omaha_holdem_8800_5c5s6c9cQd_Td9d7s7h_Qh5dTs7d_QcKsKd4d_6s2hKhJc_5hJd4h2d_Ad2c3s3h_4s8d2s6d_AcJs7c4c() {
    assertEquals(
      "Ad2c3s3h 4s8d2s6d 6s2hKhJc Td9d7s7h QcKsKd4d 5hJd4h2d AcJs7c4c Qh5dTs7d",
      Solver.process("omaha-holdem 5c5s6c9cQd Td9d7s7h Qh5dTs7d QcKsKd4d 6s2hKhJc 5hJd4h2d Ad2c3s3h 4s8d2s6d AcJs7c4c"));
  }

  @Test
  public void test_omaha_holdem_8801_2d3cAdAhKh_JdKc9cQh_Ac8cQd9s() {
    assertEquals(
      "JdKc9cQh Ac8cQd9s",
      Solver.process("omaha-holdem 2d3cAdAhKh JdKc9cQh Ac8cQd9s"));
  }

  @Test
  public void test_omaha_holdem_8802_AcKdKsQcQs_8d9h7dTh_Jh5hAs3s_Kh6d2c3c_QhJs7c8s() {
    assertEquals(
      "8d9h7dTh Jh5hAs3s QhJs7c8s Kh6d2c3c",
      Solver.process("omaha-holdem AcKdKsQcQs 8d9h7dTh Jh5hAs3s Kh6d2c3c QhJs7c8s"));
  }

  @Test
  public void test_omaha_holdem_8803_3h4s8s9hAh_9sKs2dJc_5d7h2h6s_Qs9cTs9d() {
    assertEquals(
      "9sKs2dJc Qs9cTs9d 5d7h2h6s",
      Solver.process("omaha-holdem 3h4s8s9hAh 9sKs2dJc 5d7h2h6s Qs9cTs9d"));
  }

  @Test
  public void test_omaha_holdem_8804_7sAhKdKhTc_8d9s7h2d_3sAd5c4h_2hTdAc4d_Jc4cQsKs_2cJd8h6d() {
    assertEquals(
      "2cJd8h6d 8d9s7h2d 3sAd5c4h 2hTdAc4d Jc4cQsKs",
      Solver.process("omaha-holdem 7sAhKdKhTc 8d9s7h2d 3sAd5c4h 2hTdAc4d Jc4cQsKs 2cJd8h6d"));
  }

  @Test
  public void test_omaha_holdem_8805_2c5c7hAsJh_7dJdJc9c_6s3h2hKs() {
    assertEquals(
      "6s3h2hKs 7dJdJc9c",
      Solver.process("omaha-holdem 2c5c7hAsJh 7dJdJc9c 6s3h2hKs"));
  }

  @Test
  public void test_omaha_holdem_8806_3cQcQhQsTs_ThTc2c8d_Kc3h9d6c_4sJh9s6h_Jc7d2s5c_9h2d7sJd_Ad4h3d2h() {
    assertEquals(
      "Jc7d2s5c 4sJh9s6h=9h2d7sJd Kc3h9d6c Ad4h3d2h ThTc2c8d",
      Solver.process("omaha-holdem 3cQcQhQsTs ThTc2c8d Kc3h9d6c 4sJh9s6h Jc7d2s5c 9h2d7sJd Ad4h3d2h"));
  }

  @Test
  public void test_omaha_holdem_8807_7h9c9hJcKc_8cAd6s6d_QcJsTdTc_5sQsQh5c_5h6h7d3c_TsJh6c3d_7s7cKd2c_2s8d5d3h_KsJdKhTh_4c2d9s3s() {
    assertEquals(
      "2s8d5d3h 8cAd6s6d 5h6h7d3c TsJh6c3d 5sQsQh5c 4c2d9s3s 7s7cKd2c KsJdKhTh QcJsTdTc",
      Solver.process("omaha-holdem 7h9c9hJcKc 8cAd6s6d QcJsTdTc 5sQsQh5c 5h6h7d3c TsJh6c3d 7s7cKd2c 2s8d5d3h KsJdKhTh 4c2d9s3s"));
  }

  @Test
  public void test_omaha_holdem_8808_3s7d9dQhTd_Jd4c7cAc_7h8sTs9s() {
    assertEquals(
      "Jd4c7cAc 7h8sTs9s",
      Solver.process("omaha-holdem 3s7d9dQhTd Jd4c7cAc 7h8sTs9s"));
  }

  @Test
  public void test_omaha_holdem_8809_2s3hJcJsTc_9hKsKdKc_Ad9s5d6s_Ts3sQsJd_Ac6h6c8c_6d3dTdKh() {
    assertEquals(
      "Ad9s5d6s Ac6h6c8c 6d3dTdKh 9hKsKdKc Ts3sQsJd",
      Solver.process("omaha-holdem 2s3hJcJsTc 9hKsKdKc Ad9s5d6s Ts3sQsJd Ac6h6c8c 6d3dTdKh"));
  }

  @Test
  public void test_omaha_holdem_8810_4c5h8sQcTs_7d8h5s7s_3d5d6cJs_4sAhKs2d() {
    assertEquals(
      "4sAhKs2d 3d5d6cJs 7d8h5s7s",
      Solver.process("omaha-holdem 4c5h8sQcTs 7d8h5s7s 3d5d6cJs 4sAhKs2d"));
  }

  @Test
  public void test_omaha_holdem_8811_3h5h5sKcTd_4c4h9d8s_2h7h6d2d_6h7sAh5d() {
    assertEquals(
      "2h7h6d2d 4c4h9d8s 6h7sAh5d",
      Solver.process("omaha-holdem 3h5h5sKcTd 4c4h9d8s 2h7h6d2d 6h7sAh5d"));
  }

  @Test
  public void test_omaha_holdem_8812_4c5h6s7sAs_KcJd8hTh_4dAh5c7c_Js2s8d6d_5sQc7dKs_Qs2hAc4s_8c9h3dJc() {
    assertEquals(
      "KcJd8hTh 4dAh5c7c 8c9h3dJc Js2s8d6d Qs2hAc4s 5sQc7dKs",
      Solver.process("omaha-holdem 4c5h6s7sAs KcJd8hTh 4dAh5c7c Js2s8d6d 5sQc7dKs Qs2hAc4s 8c9h3dJc"));
  }

  @Test
  public void test_omaha_holdem_8813_9d9h9sKdKs_7sAhJsTh_7dQh6sKc() {
    assertEquals(
      "7sAhJsTh 7dQh6sKc",
      Solver.process("omaha-holdem 9d9h9sKdKs 7sAhJsTh 7dQh6sKc"));
  }

  @Test
  public void test_omaha_holdem_8814_4c4dJcKsQh_3cAh6c2s_Qc5s2cQd_TsAd4sKd() {
    assertEquals(
      "3cAh6c2s TsAd4sKd Qc5s2cQd",
      Solver.process("omaha-holdem 4c4dJcKsQh 3cAh6c2s Qc5s2cQd TsAd4sKd"));
  }

  @Test
  public void test_omaha_holdem_8815_5c6d6s9dQd_8hKs2sKh_Jh4sQhAh_Ts9c8d2d_4dJs6c7d_5h8s3s3c_Kd5sQs7s_Kc4hAs9h_7hJcJdTc_Ad6h8c9s() {
    assertEquals(
      "5h8s3s3c Kc4hAs9h 7hJcJdTc Kd5sQs7s Jh4sQhAh 8hKs2sKh 4dJs6c7d Ts9c8d2d Ad6h8c9s",
      Solver.process("omaha-holdem 5c6d6s9dQd 8hKs2sKh Jh4sQhAh Ts9c8d2d 4dJs6c7d 5h8s3s3c Kd5sQs7s Kc4hAs9h 7hJcJdTc Ad6h8c9s"));
  }

  @Test
  public void test_omaha_holdem_8816_2c4s7c7hTd_2dAh4h9h_AsAd5c7d_Tc5s7s5d_8d6s2h4c_6h5h4d8c_Kd8s6c9c_8h3sTh2s() {
    assertEquals(
      "Kd8s6c9c 6h5h4d8c=8d6s2h4c 2dAh4h9h 8h3sTh2s AsAd5c7d Tc5s7s5d",
      Solver.process("omaha-holdem 2c4s7c7hTd 2dAh4h9h AsAd5c7d Tc5s7s5d 8d6s2h4c 6h5h4d8c Kd8s6c9c 8h3sTh2s"));
  }

  @Test
  public void test_omaha_holdem_8817_7h8cJcTdTs_Ac5d6hJh_9hKh5c2d_7dQcAdKc_7c7sAh3h_QdAs2h4s_3s3c4dTc_Th9s9c8h() {
    assertEquals(
      "9hKh5c2d QdAs2h4s 7dQcAdKc Ac5d6hJh 3s3c4dTc 7c7sAh3h Th9s9c8h",
      Solver.process("omaha-holdem 7h8cJcTdTs Ac5d6hJh 9hKh5c2d 7dQcAdKc 7c7sAh3h QdAs2h4s 3s3c4dTc Th9s9c8h"));
  }

  @Test
  public void test_omaha_holdem_8818_4d9sAcKsQd_3c4hThQh_5h2d9hQc_Kd5dJhAh_4sTc6h6d_3sAd6c2h_9c6s7c2s() {
    assertEquals(
      "4sTc6h6d 9c6s7c2s 3sAd6c2h 3c4hThQh 5h2d9hQc Kd5dJhAh",
      Solver.process("omaha-holdem 4d9sAcKsQd 3c4hThQh 5h2d9hQc Kd5dJhAh 4sTc6h6d 3sAd6c2h 9c6s7c2s"));
  }

  @Test
  public void test_omaha_holdem_8819_2h6c8dQsTs_8h9sAhAs_Td9d7cQc_3c3hJs5h_Ad7s8c9h_3s2c4hAc() {
    assertEquals(
      "3s2c4hAc 3c3hJs5h 8h9sAhAs Ad7s8c9h=Td9d7cQc",
      Solver.process("omaha-holdem 2h6c8dQsTs 8h9sAhAs Td9d7cQc 3c3hJs5h Ad7s8c9h 3s2c4hAc"));
  }

  @Test
  public void test_omaha_holdem_8820_2h5h8d9sJc_8c6s6hJs_2cKh4c7s_9d6d8hAd_As9c6c8s_Qs7cKs4d() {
    assertEquals(
      "Qs7cKs4d 2cKh4c7s 9d6d8hAd=As9c6c8s 8c6s6hJs",
      Solver.process("omaha-holdem 2h5h8d9sJc 8c6s6hJs 2cKh4c7s 9d6d8hAd As9c6c8s Qs7cKs4d"));
  }

  @Test
  public void test_omaha_holdem_8821_3c3s8cAdAs_AhQc4s7h_6cQd2sJd_TcJhJc5h_Kh8dTsTh_Js2hKs7c_9hKcAc6s_6d2d9d5d() {
    assertEquals(
      "6d2d9d5d 6cQd2sJd Js2hKs7c Kh8dTsTh TcJhJc5h AhQc4s7h 9hKcAc6s",
      Solver.process("omaha-holdem 3c3s8cAdAs AhQc4s7h 6cQd2sJd TcJhJc5h Kh8dTsTh Js2hKs7c 9hKcAc6s 6d2d9d5d"));
  }

  @Test
  public void test_omaha_holdem_8822_2h3d9sAcAh_3c9h8dQh_KdJd6hQs_3h5dQdKs_As6dJs7c() {
    assertEquals(
      "KdJd6hQs 3h5dQdKs 3c9h8dQh As6dJs7c",
      Solver.process("omaha-holdem 2h3d9sAcAh 3c9h8dQh KdJd6hQs 3h5dQdKs As6dJs7c"));
  }

  @Test
  public void test_omaha_holdem_8823_4s6sAsKcQh_6d3s9h5d_2hAd7cAh_7d8cJh4h_7sQd9cJs_8dJd5cTd_QsAcKsJc() {
    assertEquals(
      "7d8cJh4h 6d3s9h5d 2hAd7cAh 8dJd5cTd 7sQd9cJs QsAcKsJc",
      Solver.process("omaha-holdem 4s6sAsKcQh 6d3s9h5d 2hAd7cAh 7d8cJh4h 7sQd9cJs 8dJd5cTd QsAcKsJc"));
  }

  @Test
  public void test_omaha_holdem_8824_2h5h9dAsJd_9h2c5dAc_8d7d8c6d_8s4d3hKd_Kc9sJh4c_QdQc2s8h_5cTdAhJc_7s9c2dJs() {
    assertEquals(
      "8d7d8c6d QdQc2s8h 7s9c2dJs=Kc9sJh4c 9h2c5dAc 5cTdAhJc 8s4d3hKd",
      Solver.process("omaha-holdem 2h5h9dAsJd 9h2c5dAc 8d7d8c6d 8s4d3hKd Kc9sJh4c QdQc2s8h 5cTdAhJc 7s9c2dJs"));
  }

  @Test
  public void test_omaha_holdem_8825_5s8hAhJhTc_JcJd2hKs_9h9cKd2s_3dQc5d7s_3s8d7cTh_Qh4s4d9s_AcJs3c9d_6h2d7hQd_Kc3hQsAd_2c6dTd4h() {
    assertEquals(
      "3dQc5d7s 9h9cKd2s 2c6dTd4h 3s8d7cTh AcJs3c9d JcJd2hKs Qh4s4d9s Kc3hQsAd 6h2d7hQd",
      Solver.process("omaha-holdem 5s8hAhJhTc JcJd2hKs 9h9cKd2s 3dQc5d7s 3s8d7cTh Qh4s4d9s AcJs3c9d 6h2d7hQd Kc3hQsAd 2c6dTd4h"));
  }

  @Test
  public void test_omaha_holdem_8826_2h7d8dAhJd_Ac6s7c3h_3dKs6d8c_8hQs4sAd_9cKdKh5c_5hAs3c7h() {
    assertEquals(
      "9cKdKh5c 5hAs3c7h=Ac6s7c3h 8hQs4sAd 3dKs6d8c",
      Solver.process("omaha-holdem 2h7d8dAhJd Ac6s7c3h 3dKs6d8c 8hQs4sAd 9cKdKh5c 5hAs3c7h"));
  }

  @Test
  public void test_omaha_holdem_8827_3c8sAcKsTs_6c4dKhQh_8cAs4hAd_5dAh5hJs_Th5s4cJd_6s2s3d3h_4s5c7h6d_8d2hJcTd_7c9cQd9s_3s2dJhQc() {
    assertEquals(
      "4s5c7h6d 7c9cQd9s Th5s4cJd 6c4dKhQh 5dAh5hJs 8d2hJcTd 8cAs4hAd 3s2dJhQc 6s2s3d3h",
      Solver.process("omaha-holdem 3c8sAcKsTs 6c4dKhQh 8cAs4hAd 5dAh5hJs Th5s4cJd 6s2s3d3h 4s5c7h6d 8d2hJcTd 7c9cQd9s 3s2dJhQc"));
  }

  @Test
  public void test_omaha_holdem_8828_3h8dAcAsJd_4s4hJhKd_7s5s7cAd_6h2s3s6s_Qh9sTsTc_ThQs9c5c_2c5d6cQd_Jc9d8h7h_4d5h2d7d() {
    assertEquals(
      "4d5h2d7d 2c5d6cQd ThQs9c5c 6h2s3s6s Qh9sTsTc Jc9d8h7h 4s4hJhKd 7s5s7cAd",
      Solver.process("omaha-holdem 3h8dAcAsJd 4s4hJhKd 7s5s7cAd 6h2s3s6s Qh9sTsTc ThQs9c5c 2c5d6cQd Jc9d8h7h 4d5h2d7d"));
  }

  @Test
  public void test_omaha_holdem_8829_4h5s7d8hKd_7sQd2s7h_9h8cAd6c_QcAh8s9c_4s8d5dQs_Td4d4c6s_Kh5cKsAc_JcQh6d2c_6h9d3dAs() {
    assertEquals(
      "JcQh6d2c QcAh8s9c 4s8d5dQs 7sQd2s7h Kh5cKsAc Td4d4c6s 6h9d3dAs=9h8cAd6c",
      Solver.process("omaha-holdem 4h5s7d8hKd 7sQd2s7h 9h8cAd6c QcAh8s9c 4s8d5dQs Td4d4c6s Kh5cKsAc JcQh6d2c 6h9d3dAs"));
  }

  @Test
  public void test_omaha_holdem_8830_3c5h6hAhJc_8s8h5c3s_As6cKcQd_Tc8c6s9c() {
    assertEquals(
      "Tc8c6s9c 8s8h5c3s As6cKcQd",
      Solver.process("omaha-holdem 3c5h6hAhJc 8s8h5c3s As6cKcQd Tc8c6s9c"));
  }

  @Test
  public void test_omaha_holdem_8831_5s7d8s9dKd_Td4d8d2d_AdQd7s5c_7h2sAsKc_6sTcQh4h() {
    assertEquals(
      "7h2sAsKc 6sTcQh4h Td4d8d2d AdQd7s5c",
      Solver.process("omaha-holdem 5s7d8s9dKd Td4d8d2d AdQd7s5c 7h2sAsKc 6sTcQh4h"));
  }

  @Test
  public void test_omaha_holdem_8832_3d6sAsQhTs_Ac4h4d7c_7hThKh5c_2h8d2sKd_Ks7s8s6c_3h9h8c9d() {
    assertEquals(
      "2h8d2sKd 3h9h8c9d 7hThKh5c Ac4h4d7c Ks7s8s6c",
      Solver.process("omaha-holdem 3d6sAsQhTs Ac4h4d7c 7hThKh5c 2h8d2sKd Ks7s8s6c 3h9h8c9d"));
  }

  @Test
  public void test_omaha_holdem_8833_5d8d8h8s9c_9h5cQh7s_4c8cThJh_3c9sTc4d_Ad5h2h7h_KdAc2cAh_TdQdQc7d_2dQsKh6h() {
    assertEquals(
      "3c9sTc4d 9h5cQh7s 2dQsKh6h Ad5h2h7h TdQdQc7d KdAc2cAh 4c8cThJh",
      Solver.process("omaha-holdem 5d8d8h8s9c 9h5cQh7s 4c8cThJh 3c9sTc4d Ad5h2h7h KdAc2cAh TdQdQc7d 2dQsKh6h"));
  }

  @Test
  public void test_omaha_holdem_8834_3d4d7d8dTd_2d8h3hAh_As8sTsKs_7s8cQc4s() {
    assertEquals(
      "2d8h3hAh 7s8cQc4s As8sTsKs",
      Solver.process("omaha-holdem 3d4d7d8dTd 2d8h3hAh As8sTsKs 7s8cQc4s"));
  }

  @Test
  public void test_omaha_holdem_8835_2h4c4hAdKs_9d9hAsJh_Ah5h8s5s_6hKhQhQd_Kc8d8c8h() {
    assertEquals(
      "Kc8d8c8h 6hKhQhQd Ah5h8s5s 9d9hAsJh",
      Solver.process("omaha-holdem 2h4c4hAdKs 9d9hAsJh Ah5h8s5s 6hKhQhQd Kc8d8c8h"));
  }

  @Test
  public void test_omaha_holdem_8836_2d4c6h6sTd_Ts8hTc7h_JcJh3h3d_2sQsJd4s_9dAcKs5s_As9h5dKh_Kc8c5hQh_7cKd4hQc() {
    assertEquals(
      "Kc8c5hQh 9dAcKs5s=As9h5dKh 2sQsJd4s 7cKd4hQc JcJh3h3d Ts8hTc7h",
      Solver.process("omaha-holdem 2d4c6h6sTd Ts8hTc7h JcJh3h3d 2sQsJd4s 9dAcKs5s As9h5dKh Kc8c5hQh 7cKd4hQc"));
  }

  @Test
  public void test_omaha_holdem_8837_7d9c9sAdQd_Qh7s2s6d_6s4d6hJc_6cKd7h5h() {
    assertEquals(
      "6s4d6hJc 6cKd7h5h Qh7s2s6d",
      Solver.process("omaha-holdem 7d9c9sAdQd Qh7s2s6d 6s4d6hJc 6cKd7h5h"));
  }

  @Test
  public void test_omaha_holdem_8838_4c6sAdAhQs_3d3s7sKs_2sJcTcTs_8h9c9h9s_4d2d6dKc_5s6cTh3c_7d7cQc5h() {
    assertEquals(
      "3d3s7sKs 5s6cTh3c 4d2d6dKc 8h9c9h9s 2sJcTcTs 7d7cQc5h",
      Solver.process("omaha-holdem 4c6sAdAhQs 3d3s7sKs 2sJcTcTs 8h9c9h9s 4d2d6dKc 5s6cTh3c 7d7cQc5h"));
  }

  @Test
  public void test_omaha_holdem_8839_6s7h9hAcJc_9s5h8cQc_6h4d7d6c_Td4s2dKh_2hQs3cJs() {
    assertEquals(
      "Td4s2dKh 2hQs3cJs 6h4d7d6c 9s5h8cQc",
      Solver.process("omaha-holdem 6s7h9hAcJc 9s5h8cQc 6h4d7d6c Td4s2dKh 2hQs3cJs"));
  }

  @Test
  public void test_omaha_holdem_8840_2d5d6dAsQd_2cThJc9d_Ad7h4c3s_7c7sKhKc_6cAh4sAc_9cJdJs8h_2hTs6h8d_Qc3h4d8c() {
    assertEquals(
      "2cThJc9d 9cJdJs8h 7c7sKhKc 2hTs6h8d 6cAh4sAc Ad7h4c3s=Qc3h4d8c",
      Solver.process("omaha-holdem 2d5d6dAsQd 2cThJc9d Ad7h4c3s 7c7sKhKc 6cAh4sAc 9cJdJs8h 2hTs6h8d Qc3h4d8c"));
  }

  @Test
  public void test_omaha_holdem_8841_2s3c7hAdQd_9h4d9s7d_7cKd6sTc_8d9c8c5d_2c6hAcKc_4sKs6dJh_8h7sAhJd() {
    assertEquals(
      "4sKs6dJh 7cKd6sTc 8d9c8c5d 9h4d9s7d 2c6hAcKc 8h7sAhJd",
      Solver.process("omaha-holdem 2s3c7hAdQd 9h4d9s7d 7cKd6sTc 8d9c8c5d 2c6hAcKc 4sKs6dJh 8h7sAhJd"));
  }

  @Test
  public void test_omaha_holdem_8842_2d4c4d7h7s_AhKh7c5s_Ts9h6d4s_Qs6cJd4h() {
    assertEquals(
      "Ts9h6d4s Qs6cJd4h AhKh7c5s",
      Solver.process("omaha-holdem 2d4c4d7h7s AhKh7c5s Ts9h6d4s Qs6cJd4h"));
  }

  @Test
  public void test_omaha_holdem_8843_4c6s9sKcTc_Ks3c3sJs_7s3d9c7c_2d6d2hAd_9hAs3h5c_TdAhKh8d() {
    assertEquals(
      "2d6d2hAd 9hAs3h5c Ks3c3sJs TdAhKh8d 7s3d9c7c",
      Solver.process("omaha-holdem 4c6s9sKcTc Ks3c3sJs 7s3d9c7c 2d6d2hAd 9hAs3h5c TdAhKh8d"));
  }

  @Test
  public void test_omaha_holdem_8844_5c5h6sAcJc_9hKdTcJh_AsJd9sKc_Ts4s3h7h_Kh2dQs2s_6c3sAh7s() {
    assertEquals(
      "Ts4s3h7h Kh2dQs2s 9hKdTcJh 6c3sAh7s AsJd9sKc",
      Solver.process("omaha-holdem 5c5h6sAcJc 9hKdTcJh AsJd9sKc Ts4s3h7h Kh2dQs2s 6c3sAh7s"));
  }

  @Test
  public void test_omaha_holdem_8845_3h6h6sKdQc_4h3s7h2d_JhKhTc3d_Ks9c4c7s_2cJd5s7d_4d5cAs6c_KcQsAh6d_QhJc2h2s() {
    assertEquals(
      "2cJd5s7d 4h3s7h2d QhJc2h2s Ks9c4c7s JhKhTc3d 4d5cAs6c KcQsAh6d",
      Solver.process("omaha-holdem 3h6h6sKdQc 4h3s7h2d JhKhTc3d Ks9c4c7s 2cJd5s7d 4d5cAs6c KcQsAh6d QhJc2h2s"));
  }

  @Test
  public void test_omaha_holdem_8846_2c5c7s8sJh_2d4d7d6d_3hQcJc4h() {
    assertEquals(
      "3hQcJc4h 2d4d7d6d",
      Solver.process("omaha-holdem 2c5c7s8sJh 2d4d7d6d 3hQcJc4h"));
  }

  @Test
  public void test_omaha_holdem_8847_2d2h3h5sJd_4dTd9cKc_4s7h9sKs() {
    assertEquals(
      "4s7h9sKs 4dTd9cKc",
      Solver.process("omaha-holdem 2d2h3h5sJd 4dTd9cKc 4s7h9sKs"));
  }

  @Test
  public void test_omaha_holdem_8848_3d5d7sJhKh_TcKs8hJc_6hAh8s4d_4hKd4c5c() {
    assertEquals(
      "4hKd4c5c TcKs8hJc 6hAh8s4d",
      Solver.process("omaha-holdem 3d5d7sJhKh TcKs8hJc 6hAh8s4d 4hKd4c5c"));
  }

  @Test
  public void test_omaha_holdem_8849_3d7sAcKdKh_5c6d3c6h_8h4dJh8s_9c7d2s9h_Qh4hAh9s_6sQd8cQs() {
    assertEquals(
      "5c6d3c6h 8h4dJh8s 9c7d2s9h 6sQd8cQs Qh4hAh9s",
      Solver.process("omaha-holdem 3d7sAcKdKh 5c6d3c6h 8h4dJh8s 9c7d2s9h Qh4hAh9s 6sQd8cQs"));
  }

  @Test
  public void test_omaha_holdem_8850_5c6c6hTdTs_JdKd9d5s_4s3hAd2c_QhTc2h4c_4dQcQs6d_7hQd8cKs() {
    assertEquals(
      "7hQd8cKs 4s3hAd2c JdKd9d5s 4dQcQs6d QhTc2h4c",
      Solver.process("omaha-holdem 5c6c6hTdTs JdKd9d5s 4s3hAd2c QhTc2h4c 4dQcQs6d 7hQd8cKs"));
  }

  @Test
  public void test_omaha_holdem_8851_3d6s7dJdTh_8hTd6h5h_5dAc9dQs_7hTsKd3c_JsQhJcKc_9c2c7cAs_8c5c6cQd_Ah3s2hQc_9sJh4c5s_Ks4h3hKh() {
    assertEquals(
      "Ah3s2hQc 8c5c6cQd 9c2c7cAs Ks4h3hKh 8hTd6h5h 7hTsKd3c JsQhJcKc 9sJh4c5s 5dAc9dQs",
      Solver.process("omaha-holdem 3d6s7dJdTh 8hTd6h5h 5dAc9dQs 7hTsKd3c JsQhJcKc 9c2c7cAs 8c5c6cQd Ah3s2hQc 9sJh4c5s Ks4h3hKh"));
  }

  @Test
  public void test_omaha_holdem_8852_2sAsJhKhQs_7cQhTd8h_5d3hKsTc_Ah5cQc2h_5h8s2c5s_4hJc2dAc_9dJsKd7h() {
    assertEquals(
      "9dJsKd7h 4hJc2dAc Ah5cQc2h 5d3hKsTc=7cQhTd8h 5h8s2c5s",
      Solver.process("omaha-holdem 2sAsJhKhQs 7cQhTd8h 5d3hKsTc Ah5cQc2h 5h8s2c5s 4hJc2dAc 9dJsKd7h"));
  }

  @Test
  public void test_omaha_holdem_8853_2h4d8sKsQs_6hJh8c6s_Jc6cTsQh_Ad9cJs2c_5h2d5cKd_Kh4sTdTc_9s3c5d3d_8d3s4c4h_ThAs6d5s() {
    assertEquals(
      "Ad9cJs2c 9s3c5d3d 6hJh8c6s Jc6cTsQh 5h2d5cKd Kh4sTdTc 8d3s4c4h ThAs6d5s",
      Solver.process("omaha-holdem 2h4d8sKsQs 6hJh8c6s Jc6cTsQh Ad9cJs2c 5h2d5cKd Kh4sTdTc 9s3c5d3d 8d3s4c4h ThAs6d5s"));
  }

  @Test
  public void test_omaha_holdem_8854_5c6d7d9cQc_2h3h3s7c_9d6s4sAs() {
    assertEquals(
      "2h3h3s7c 9d6s4sAs",
      Solver.process("omaha-holdem 5c6d7d9cQc 2h3h3s7c 9d6s4sAs"));
  }

  @Test
  public void test_omaha_holdem_8855_2s4s6h6s9s_QdJc3c9d_9h9c7cJh_5h3h2d4d_Kh5s7sQc_5d8s2hKs_Th4c8cKd_JsTsTd7h_8hAs3dTc_8d2cAdQs() {
    assertEquals(
      "8hAs3dTc 8d2cAdQs Th4c8cKd QdJc3c9d 5h3h2d4d Kh5s7sQc JsTsTd7h 5d8s2hKs 9h9c7cJh",
      Solver.process("omaha-holdem 2s4s6h6s9s QdJc3c9d 9h9c7cJh 5h3h2d4d Kh5s7sQc 5d8s2hKs Th4c8cKd JsTsTd7h 8hAs3dTc 8d2cAdQs"));
  }

  @Test
  public void test_omaha_holdem_8856_4d9dQdQhTs_6dJh7dJd_Th2h2d4s_Js3c4h5c_9h9sKc8h() {
    assertEquals(
      "Js3c4h5c Th2h2d4s 6dJh7dJd 9h9sKc8h",
      Solver.process("omaha-holdem 4d9dQdQhTs 6dJh7dJd Th2h2d4s Js3c4h5c 9h9sKc8h"));
  }

  @Test
  public void test_omaha_holdem_8857_2h5c7cKcTd_8s7h3d6s_6c8c6d4c_8h4dQc3s_7s4s9c5d_KdJhAs9s_5s2s5h2d() {
    assertEquals(
      "8h4dQc3s 8s7h3d6s KdJhAs9s 7s4s9c5d 5s2s5h2d 6c8c6d4c",
      Solver.process("omaha-holdem 2h5c7cKcTd 8s7h3d6s 6c8c6d4c 8h4dQc3s 7s4s9c5d KdJhAs9s 5s2s5h2d"));
  }

  @Test
  public void test_omaha_holdem_8858_3c7cJcTcTs_7d7s8dAh_4cKs5s9d_3hThKdQh_6h4h7h3s_Kh6cAsAc_Qs9cAd6d_QdJs3dQc_8h5h8s9s() {
    assertEquals(
      "4cKs5s9d Qs9cAd6d 6h4h7h3s QdJs3dQc 8h5h8s9s Kh6cAsAc 7d7s8dAh 3hThKdQh",
      Solver.process("omaha-holdem 3c7cJcTcTs 7d7s8dAh 4cKs5s9d 3hThKdQh 6h4h7h3s Kh6cAsAc Qs9cAd6d QdJs3dQc 8h5h8s9s"));
  }

  @Test
  public void test_omaha_holdem_8859_3h4d6c9cTd_8s7h7sQs_Qc7c5hAs_Th3sAh6s_Qh6hQdJd_2c8hAcKh() {
    assertEquals(
      "2c8hAcKh Qh6hQdJd Th3sAh6s Qc7c5hAs 8s7h7sQs",
      Solver.process("omaha-holdem 3h4d6c9cTd 8s7h7sQs Qc7c5hAs Th3sAh6s Qh6hQdJd 2c8hAcKh"));
  }

  @Test
  public void test_omaha_holdem_8860_3d4cKhKsTc_7hKd7s5h_4h9s3h8d_JhQs6s2h_4d8h9c5c_6c2sQcAs() {
    assertEquals(
      "JhQs6s2h 6c2sQcAs 4d8h9c5c=4h9s3h8d 7hKd7s5h",
      Solver.process("omaha-holdem 3d4cKhKsTc 7hKd7s5h 4h9s3h8d JhQs6s2h 4d8h9c5c 6c2sQcAs"));
  }

  @Test
  public void test_omaha_holdem_8861_2sAcJsQhTc_4hKs9h2d_6sJc9dKd_2hQdTd4c_3cKhQsAh_9c2c7c5h() {
    assertEquals(
      "9c2c7c5h 2hQdTd4c 4hKs9h2d 3cKhQsAh=6sJc9dKd",
      Solver.process("omaha-holdem 2sAcJsQhTc 4hKs9h2d 6sJc9dKd 2hQdTd4c 3cKhQsAh 9c2c7c5h"));
  }

  @Test
  public void test_omaha_holdem_8862_3h6dAcQdTh_2d7cJs2h_5d6c7s9h_KcTs3d9c_6s5sJdAs_4d5cQsJc_Kd7h5h4s_Tc8d8c2s_8h9sQc9d() {
    assertEquals(
      "Kd7h5h4s 2d7cJs2h 5d6c7s9h Tc8d8c2s 8h9sQc9d 4d5cQsJc KcTs3d9c 6s5sJdAs",
      Solver.process("omaha-holdem 3h6dAcQdTh 2d7cJs2h 5d6c7s9h KcTs3d9c 6s5sJdAs 4d5cQsJc Kd7h5h4s Tc8d8c2s 8h9sQc9d"));
  }

  @Test
  public void test_omaha_holdem_8863_5s7hJsKhTc_4d4s9cKc_3d6c2c9d_AhAs6h4c() {
    assertEquals(
      "3d6c2c9d 4d4s9cKc AhAs6h4c",
      Solver.process("omaha-holdem 5s7hJsKhTc 4d4s9cKc 3d6c2c9d AhAs6h4c"));
  }

  @Test
  public void test_omaha_holdem_8864_2c5d6dJcKs_QdKdKh7c_9c4s3c3d_Js8h7s4d_6cQs5c8c_4hTc3sAd_Jh8d9s7d_Jd3h9dAs_6h2dAcTh() {
    assertEquals(
      "Js8h7s4d Jh8d9s7d Jd3h9dAs 6h2dAcTh 6cQs5c8c QdKdKh7c 4hTc3sAd=9c4s3c3d",
      Solver.process("omaha-holdem 2c5d6dJcKs QdKdKh7c 9c4s3c3d Js8h7s4d 6cQs5c8c 4hTc3sAd Jh8d9s7d Jd3h9dAs 6h2dAcTh"));
  }

  @Test
  public void test_omaha_holdem_8865_2d9sAdJdQc_5sJhAcTc_Qs3cTd6s_5d9dTsKs() {
    assertEquals(
      "Qs3cTd6s 5sJhAcTc 5d9dTsKs",
      Solver.process("omaha-holdem 2d9sAdJdQc 5sJhAcTc Qs3cTd6s 5d9dTsKs"));
  }

  @Test
  public void test_omaha_holdem_8866_3d5d7dAhQh_Qs2h8c7s_6cTd7hAc_6sTsKh5h_AdJh5sTh_Js3hKc3c_5c2s9d6h_9h9sJd8h_8sQcAsJc_8dKdQd2d() {
    assertEquals(
      "5c2s9d6h 6sTsKh5h 9h9sJd8h Qs2h8c7s AdJh5sTh 6cTd7hAc 8sQcAsJc Js3hKc3c 8dKdQd2d",
      Solver.process("omaha-holdem 3d5d7dAhQh Qs2h8c7s 6cTd7hAc 6sTsKh5h AdJh5sTh Js3hKc3c 5c2s9d6h 9h9sJd8h 8sQcAsJc 8dKdQd2d"));
  }

  @Test
  public void test_omaha_holdem_8867_3d6s7cTdTs_9s7hKcQc_KdKs7s2s_9hTh3h3c_2d4cJs5c_5hAdQs2h_8h3sQdAh() {
    assertEquals(
      "5hAdQs2h 8h3sQdAh 9s7hKcQc KdKs7s2s 2d4cJs5c 9hTh3h3c",
      Solver.process("omaha-holdem 3d6s7cTdTs 9s7hKcQc KdKs7s2s 9hTh3h3c 2d4cJs5c 5hAdQs2h 8h3sQdAh"));
  }

  @Test
  public void test_omaha_holdem_8868_6h9c9hKcTc_3d4hTd7s_8cQsTsAh_8h6sJd7c_8d6c2d7h_6d7dJh9d_AcQd8sQc_4d3cKhJc() {
    assertEquals(
      "3d4hTd7s 8cQsTsAh 8d6c2d7h=8h6sJd7c 4d3cKhJc AcQd8sQc 6d7dJh9d",
      Solver.process("omaha-holdem 6h9c9hKcTc 3d4hTd7s 8cQsTsAh 8h6sJd7c 8d6c2d7h 6d7dJh9d AcQd8sQc 4d3cKhJc"));
  }

  @Test
  public void test_omaha_holdem_8869_4s9sJhJsQd_3h8h2s2c_Ah8cQh2d_TdAd7s8d_6s2hKh3c_AsKd6h7d_3dTh9h4d_9dTcQs4h_6dJdJc7c() {
    assertEquals(
      "6s2hKh3c AsKd6h7d 3h8h2s2c 3dTh9h4d 9dTcQs4h Ah8cQh2d TdAd7s8d 6dJdJc7c",
      Solver.process("omaha-holdem 4s9sJhJsQd 3h8h2s2c Ah8cQh2d TdAd7s8d 6s2hKh3c AsKd6h7d 3dTh9h4d 9dTcQs4h 6dJdJc7c"));
  }

  @Test
  public void test_omaha_holdem_8870_3d4h5s7dJh_2c5h4s6c_3hJc6d8s_3s7sQc9c() {
    assertEquals(
      "3s7sQc9c 2c5h4s6c 3hJc6d8s",
      Solver.process("omaha-holdem 3d4h5s7dJh 2c5h4s6c 3hJc6d8s 3s7sQc9c"));
  }

  @Test
  public void test_omaha_holdem_8871_2h3c6h7d9s_2sKcThAh_9d7h9cTs_3dTd3s9h_6s7sQc4h_Tc8cJs4s_Ac2cKhAd_6c5sQhJh_Qs4cQd7c() {
    assertEquals(
      "2sKcThAh 6c5sQhJh Qs4cQd7c Ac2cKhAd 6s7sQc4h 3dTd3s9h 9d7h9cTs Tc8cJs4s",
      Solver.process("omaha-holdem 2h3c6h7d9s 2sKcThAh 9d7h9cTs 3dTd3s9h 6s7sQc4h Tc8cJs4s Ac2cKhAd 6c5sQhJh Qs4cQd7c"));
  }

  @Test
  public void test_omaha_holdem_8872_2c8c8h9d9h_4dQcTc4h_Jh2d4s6d_Kd9s5h5s_5cJs6sTd() {
    assertEquals(
      "5cJs6sTd Jh2d4s6d 4dQcTc4h Kd9s5h5s",
      Solver.process("omaha-holdem 2c8c8h9d9h 4dQcTc4h Jh2d4s6d Kd9s5h5s 5cJs6sTd"));
  }

  @Test
  public void test_omaha_holdem_8873_4d9cKcQhTc_KsKhQc5d_6c9d3hTs_8c3c7h4c_As8h9s6s_2sAcJcQs_Jh6hQdAd() {
    assertEquals(
      "As8h9s6s 6c9d3hTs KsKhQc5d Jh6hQdAd 8c3c7h4c 2sAcJcQs",
      Solver.process("omaha-holdem 4d9cKcQhTc KsKhQc5d 6c9d3hTs 8c3c7h4c As8h9s6s 2sAcJcQs Jh6hQdAd"));
  }

  @Test
  public void test_omaha_holdem_8874_8sJsQdQsTs_Qc4h9d8c_Kc3d9c8d_6s7d2c4s_3sAd2s6h() {
    assertEquals(
      "Kc3d9c8d 3sAd2s6h 6s7d2c4s Qc4h9d8c",
      Solver.process("omaha-holdem 8sJsQdQsTs Qc4h9d8c Kc3d9c8d 6s7d2c4s 3sAd2s6h"));
  }

  @Test
  public void test_omaha_holdem_8875_6hJcKhKsTs_2c8h3cAc_3h9hKd6s_9dQc2dTh_Jh5s5hAh_KcAd3d9s() {
    assertEquals(
      "2c8h3cAc Jh5s5hAh KcAd3d9s 9dQc2dTh 3h9hKd6s",
      Solver.process("omaha-holdem 6hJcKhKsTs 2c8h3cAc 3h9hKd6s 9dQc2dTh Jh5s5hAh KcAd3d9s"));
  }

  @Test
  public void test_omaha_holdem_8876_3h5d9hJsKh_ThAhQcAd_4sQh9c2s_As4c8c7d_9dTc7hKd_6s5cTs9s_3s4d5hKs_Qd4h8dJc() {
    assertEquals(
      "As4c8c7d 4sQh9c2s Qd4h8dJc 6s5cTs9s 3s4d5hKs 9dTc7hKd ThAhQcAd",
      Solver.process("omaha-holdem 3h5d9hJsKh ThAhQcAd 4sQh9c2s As4c8c7d 9dTc7hKd 6s5cTs9s 3s4d5hKs Qd4h8dJc"));
  }

  @Test
  public void test_omaha_holdem_8877_4c5h9dJsKc_3s8h6cAc_9s9c4d5d_8d3dTc6s_4h2hTs5s_JhThAs7h_2d8sKh3c_7c9hQdTd_4s6hQh6d() {
    assertEquals(
      "8d3dTc6s 3s8h6cAc 4s6hQh6d JhThAs7h 2d8sKh3c 4h2hTs5s 9s9c4d5d 7c9hQdTd",
      Solver.process("omaha-holdem 4c5h9dJsKc 3s8h6cAc 9s9c4d5d 8d3dTc6s 4h2hTs5s JhThAs7h 2d8sKh3c 7c9hQdTd 4s6hQh6d"));
  }

  @Test
  public void test_omaha_holdem_8878_2h9sAdQcQs_5sThQhKc_Jd5d2d8h_JhAs6s8c_JsKs6c7c_Ah7s8s4s_Jc3hKd5h_9c6d2s5c() {
    assertEquals(
      "Jc3hKd5h=JsKs6c7c Jd5d2d8h 9c6d2s5c Ah7s8s4s JhAs6s8c 5sThQhKc",
      Solver.process("omaha-holdem 2h9sAdQcQs 5sThQhKc Jd5d2d8h JhAs6s8c JsKs6c7c Ah7s8s4s Jc3hKd5h 9c6d2s5c"));
  }

  @Test
  public void test_omaha_holdem_8879_5d6h8d9c9h_KdQs3dJh_2d7c4s5c_Qc4dQd6s_2sAs4hQh_KsAc7h2c_3cTd9sTs_4cKh6d5h_7s3h2hAd_ThAh6c8c() {
    assertEquals(
      "KdQs3dJh 7s3h2hAd 2sAs4hQh KsAc7h2c 4cKh6d5h ThAh6c8c Qc4dQd6s 3cTd9sTs 2d7c4s5c",
      Solver.process("omaha-holdem 5d6h8d9c9h KdQs3dJh 2d7c4s5c Qc4dQd6s 2sAs4hQh KsAc7h2c 3cTd9sTs 4cKh6d5h 7s3h2hAd ThAh6c8c"));
  }

  @Test
  public void test_omaha_holdem_8880_6d8sAdKsQc_2cJh2hTd_7s4s4c9h_Js4d9c3c_QsKc7hJd_5d8c7dJc_8hKdKhAh_6hAc2sQh_Th6c3d6s() {
    assertEquals(
      "Js4d9c3c 7s4s4c9h 5d8c7dJc QsKc7hJd 6hAc2sQh Th6c3d6s 8hKdKhAh 2cJh2hTd",
      Solver.process("omaha-holdem 6d8sAdKsQc 2cJh2hTd 7s4s4c9h Js4d9c3c QsKc7hJd 5d8c7dJc 8hKdKhAh 6hAc2sQh Th6c3d6s"));
  }

  @Test
  public void test_omaha_holdem_8881_5c8h9dAhKd_2c3h2hAs_4cKhTsJd_2sJs8c8d() {
    assertEquals(
      "4cKhTsJd 2c3h2hAs 2sJs8c8d",
      Solver.process("omaha-holdem 5c8h9dAhKd 2c3h2hAs 4cKhTsJd 2sJs8c8d"));
  }

  @Test
  public void test_omaha_holdem_8882_4d7c7hAcJh_3sTc3h4s_Td5cAh3c_Jc2c2h9d() {
    assertEquals(
      "3sTc3h4s Jc2c2h9d Td5cAh3c",
      Solver.process("omaha-holdem 4d7c7hAcJh 3sTc3h4s Td5cAh3c Jc2c2h9d"));
  }

  @Test
  public void test_omaha_holdem_8883_4c6h9hQdTc_8s2cTd5d_Ah4hAdQh_3c7hJd3d_9s2d6cTh() {
    assertEquals(
      "3c7hJd3d 8s2cTd5d 9s2d6cTh Ah4hAdQh",
      Solver.process("omaha-holdem 4c6h9hQdTc 8s2cTd5d Ah4hAdQh 3c7hJd3d 9s2d6cTh"));
  }

  @Test
  public void test_omaha_holdem_8884_4d9dAcJcQh_Td8c2c4c_7h6h6cTh_TsQd5dAh() {
    assertEquals(
      "7h6h6cTh TsQd5dAh Td8c2c4c",
      Solver.process("omaha-holdem 4d9dAcJcQh Td8c2c4c 7h6h6cTh TsQd5dAh"));
  }

  @Test
  public void test_omaha_holdem_8885_3d4s5h5sAc_AdAh5c7c_2s3s6c7h_TdQsAsJh_Qh9h9cJd_4h8s9s2d_6s8h3hJs_Jc9d6hQc() {
    assertEquals(
      "Jc9d6hQc 6s8h3hJs Qh9h9cJd TdQsAsJh 4h8s9s2d 2s3s6c7h AdAh5c7c",
      Solver.process("omaha-holdem 3d4s5h5sAc AdAh5c7c 2s3s6c7h TdQsAsJh Qh9h9cJd 4h8s9s2d 6s8h3hJs Jc9d6hQc"));
  }

  @Test
  public void test_omaha_holdem_8886_2d2s3s8dQd_9s6sJd2h_Th4d4sAc_TcTs9h5d_3dQhQc7h_JhJcKh6d_5c5h9c3c_8h8sAs6c() {
    assertEquals(
      "Th4d4sAc 5c5h9c3c TcTs9h5d JhJcKh6d 9s6sJd2h 8h8sAs6c 3dQhQc7h",
      Solver.process("omaha-holdem 2d2s3s8dQd 9s6sJd2h Th4d4sAc TcTs9h5d 3dQhQc7h JhJcKh6d 5c5h9c3c 8h8sAs6c"));
  }

  @Test
  public void test_omaha_holdem_8887_2d5s8hAcTh_Qs3cJc4h_Ks7h3sJs_4s9sJh9c_9dKhTd8c_5h4dAhAd_QdTs7c2h() {
    assertEquals(
      "Ks7h3sJs 4s9sJh9c QdTs7c2h 9dKhTd8c 5h4dAhAd Qs3cJc4h",
      Solver.process("omaha-holdem 2d5s8hAcTh Qs3cJc4h Ks7h3sJs 4s9sJh9c 9dKhTd8c 5h4dAhAd QdTs7c2h"));
  }

  @Test
  public void test_omaha_holdem_8888_6h6s9sAdTh_Qh2h8c9h_3cAc8dKd_Ah7d7cQs_Kc3sJcTd_4d6d7hAs() {
    assertEquals(
      "Qh2h8c9h Kc3sJcTd Ah7d7cQs 3cAc8dKd 4d6d7hAs",
      Solver.process("omaha-holdem 6h6s9sAdTh Qh2h8c9h 3cAc8dKd Ah7d7cQs Kc3sJcTd 4d6d7hAs"));
  }

  @Test
  public void test_omaha_holdem_8889_5s6c6h9hKh_9dTs8h7h_3hJs8cAc_7d7s3cQd() {
    assertEquals(
      "3hJs8cAc 7d7s3cQd 9dTs8h7h",
      Solver.process("omaha-holdem 5s6c6h9hKh 9dTs8h7h 3hJs8cAc 7d7s3cQd"));
  }

  @Test
  public void test_omaha_holdem_8890_2d5h6c6h8s_TdAs8d9h_Kd7sJh7h_5c9sThQs_5dJdJs4d_2cQc8hJc_9c4h9dKh_3d8c7c3c_4cKc6dAh_6s4sQhKs() {
    assertEquals(
      "5c9sThQs Kd7sJh7h 3d8c7c3c 2cQc8hJc TdAs8d9h 9c4h9dKh 5dJdJs4d 6s4sQhKs 4cKc6dAh",
      Solver.process("omaha-holdem 2d5h6c6h8s TdAs8d9h Kd7sJh7h 5c9sThQs 5dJdJs4d 2cQc8hJc 9c4h9dKh 3d8c7c3c 4cKc6dAh 6s4sQhKs"));
  }

  @Test
  public void test_omaha_holdem_8891_3c5c6s7dAs_Jh8sJcTs_JdKhJs2d_Kd8c4dAh_5h7s3d6d_Kc9h9s6c_7c9d8hKs_AdQd3sTh_3h9c4s8d_4h4c5dAc() {
    assertEquals(
      "Kc9h9s6c JdKhJs2d=Jh8sJcTs 5h7s3d6d AdQd3sTh 4h4c5dAc Kd8c4dAh 3h9c4s8d=7c9d8hKs",
      Solver.process("omaha-holdem 3c5c6s7dAs Jh8sJcTs JdKhJs2d Kd8c4dAh 5h7s3d6d Kc9h9s6c 7c9d8hKs AdQd3sTh 3h9c4s8d 4h4c5dAc"));
  }

  @Test
  public void test_omaha_holdem_8892_8h8s9cJsKc_2hKd9d6h_6d3d5d8d_JcTh3cAs() {
    assertEquals(
      "JcTh3cAs 2hKd9d6h 6d3d5d8d",
      Solver.process("omaha-holdem 8h8s9cJsKc 2hKd9d6h 6d3d5d8d JcTh3cAs"));
  }

  @Test
  public void test_omaha_holdem_8893_5s8c9dKdTh_Ad8h6hJd_5h8d5c2c() {
    assertEquals(
      "Ad8h6hJd 5h8d5c2c",
      Solver.process("omaha-holdem 5s8c9dKdTh Ad8h6hJd 5h8d5c2c"));
  }

  @Test
  public void test_omaha_holdem_8894_4c5c9d9sJh_2dKh4hTd_6s5d3c7c() {
    assertEquals(
      "2dKh4hTd 6s5d3c7c",
      Solver.process("omaha-holdem 4c5c9d9sJh 2dKh4hTd 6s5d3c7c"));
  }

  @Test
  public void test_omaha_holdem_8895_5h6h7d7sAh_7cTd9dKs_2d3c6c4d_Jc8c4hAc_QcQs6d6s_Jd3dQd8s_8h4s4c2h_Ad9sThKd() {
    assertEquals(
      "Jd3dQd8s Ad9sThKd 7cTd9dKs 2d3c6c4d Jc8c4hAc 8h4s4c2h QcQs6d6s",
      Solver.process("omaha-holdem 5h6h7d7sAh 7cTd9dKs 2d3c6c4d Jc8c4hAc QcQs6d6s Jd3dQd8s 8h4s4c2h Ad9sThKd"));
  }

  @Test
  public void test_omaha_holdem_8896_3h4s8s9dJs_ThTdJd3c_Ah9c5c7h() {
    assertEquals(
      "Ah9c5c7h ThTdJd3c",
      Solver.process("omaha-holdem 3h4s8s9dJs ThTdJd3c Ah9c5c7h"));
  }

  @Test
  public void test_omaha_holdem_8897_2h5d6h9cAc_9d4cJc3s_9hTd7cAs_7d5c7hAd_Kh4d6dJs_JdKcQsJh_Ts8c3h6s_3c8d5h4h() {
    assertEquals(
      "Ts8c3h6s Kh4d6dJs JdKcQsJh 7d5c7hAd 9hTd7cAs 3c8d5h4h=9d4cJc3s",
      Solver.process("omaha-holdem 2h5d6h9cAc 9d4cJc3s 9hTd7cAs 7d5c7hAd Kh4d6dJs JdKcQsJh Ts8c3h6s 3c8d5h4h"));
  }

  @Test
  public void test_omaha_holdem_8898_6s7h8d8sJs_4h6hQd7d_AcJcAh9c_Qh2s3h3d_7s5c6dJh_Td8c4d5h_TsAs4s4c_6c2cKcKd_9s2hTcAd_Qc9d7c3c() {
    assertEquals(
      "Qh2s3h3d 4h6hQd7d=Qc9d7c3c 7s5c6dJh 6c2cKcKd AcJcAh9c Td8c4d5h 9s2hTcAd TsAs4s4c",
      Solver.process("omaha-holdem 6s7h8d8sJs 4h6hQd7d AcJcAh9c Qh2s3h3d 7s5c6dJh Td8c4d5h TsAs4s4c 6c2cKcKd 9s2hTcAd Qc9d7c3c"));
  }

  @Test
  public void test_omaha_holdem_8899_7hKcQcTdTh_3hQh5s3d_2c5h9h4c_9d9sTc4h_9c3c8cJh_6s6d4dAc_5d3s5c8d_Ad4sJdJc() {
    assertEquals(
      "2c5h9h4c 5d3s5c8d 6s6d4dAc 3hQh5s3d 9d9sTc4h 9c3c8cJh Ad4sJdJc",
      Solver.process("omaha-holdem 7hKcQcTdTh 3hQh5s3d 2c5h9h4c 9d9sTc4h 9c3c8cJh 6s6d4dAc 5d3s5c8d Ad4sJdJc"));
  }

  @Test
  public void test_omaha_holdem_8900_3s5s6hJhKh_9h7s7d6d_AhJs3d3c_Td8h5hQc() {
    assertEquals(
      "9h7s7d6d AhJs3d3c Td8h5hQc",
      Solver.process("omaha-holdem 3s5s6hJhKh 9h7s7d6d AhJs3d3c Td8h5hQc"));
  }

  @Test
  public void test_omaha_holdem_8901_5s6c7s9dJc_Td8dAd7c_JdThKc2s_4d7d3hQd_Kh3c6d8h_Tc8s6hQc() {
    assertEquals(
      "JdThKc2s 4d7d3hQd Kh3c6d8h Tc8s6hQc=Td8dAd7c",
      Solver.process("omaha-holdem 5s6c7s9dJc Td8dAd7c JdThKc2s 4d7d3hQd Kh3c6d8h Tc8s6hQc"));
  }

  @Test
  public void test_omaha_holdem_8902_4s5cAdAhKs_8s2c5d7s_3dKc6d9s_Qc4d3sJs_Td9dJhJd_6cQd9hJc_7hTc2d5s() {
    assertEquals(
      "6cQd9hJc Qc4d3sJs 8s2c5d7s 7hTc2d5s Td9dJhJd 3dKc6d9s",
      Solver.process("omaha-holdem 4s5cAdAhKs 8s2c5d7s 3dKc6d9s Qc4d3sJs Td9dJhJd 6cQd9hJc 7hTc2d5s"));
  }

  @Test
  public void test_omaha_holdem_8903_3c5c8c8sTc_4hJhKc9s_Qc7hThAd_Qh4c6s7s() {
    assertEquals(
      "Qh4c6s7s 4hJhKc9s Qc7hThAd",
      Solver.process("omaha-holdem 3c5c8c8sTc 4hJhKc9s Qc7hThAd Qh4c6s7s"));
  }

  @Test
  public void test_omaha_holdem_8904_2d5h7dKhTh_7sJd8dJs_8s4h6h2c_Qs7cQh9h_Qc2hKc7h_Ac3c4d3s_KdQd3d8h_4c5dJc8c_Ts6d5cAs() {
    assertEquals(
      "Ac3c4d3s 4c5dJc8c 7sJd8dJs KdQd3d8h Ts6d5cAs 8s4h6h2c Qc2hKc7h Qs7cQh9h",
      Solver.process("omaha-holdem 2d5h7dKhTh 7sJd8dJs 8s4h6h2c Qs7cQh9h Qc2hKc7h Ac3c4d3s KdQd3d8h 4c5dJc8c Ts6d5cAs"));
  }

  @Test
  public void test_omaha_holdem_8905_3h4d4h5cAh_JdQhKc3s_2d9s3dJh_8s7d8dTd_KsJc4c6c_QsThAc6d() {
    assertEquals(
      "JdQhKc3s 8s7d8dTd QsThAc6d KsJc4c6c 2d9s3dJh",
      Solver.process("omaha-holdem 3h4d4h5cAh JdQhKc3s 2d9s3dJh 8s7d8dTd KsJc4c6c QsThAc6d"));
  }

  @Test
  public void test_omaha_holdem_8906_3d4d5s8c9c_Ac6h7s8s_4hAsJhAd() {
    assertEquals(
      "4hAsJhAd Ac6h7s8s",
      Solver.process("omaha-holdem 3d4d5s8c9c Ac6h7s8s 4hAsJhAd"));
  }

  @Test
  public void test_omaha_holdem_8907_4d4s7sAdKs_9s3hJc9c_5s6sKh3s() {
    assertEquals(
      "9s3hJc9c 5s6sKh3s",
      Solver.process("omaha-holdem 4d4s7sAdKs 9s3hJc9c 5s6sKh3s"));
  }

  @Test
  public void test_omaha_holdem_8908_2h3h3s4s6c_Jh4c6h8s_QhQcTc6d_4d3cKcTh_8c7sJd7c_5sTd8d3d() {
    assertEquals(
      "Jh4c6h8s 8c7sJd7c QhQcTc6d 5sTd8d3d 4d3cKcTh",
      Solver.process("omaha-holdem 2h3h3s4s6c Jh4c6h8s QhQcTc6d 4d3cKcTh 8c7sJd7c 5sTd8d3d"));
  }

  @Test
  public void test_omaha_holdem_8909_3c6h8hKsQh_AdAh3d2s_4cKd8cAc() {
    assertEquals(
      "AdAh3d2s 4cKd8cAc",
      Solver.process("omaha-holdem 3c6h8hKsQh AdAh3d2s 4cKd8cAc"));
  }

  @Test
  public void test_omaha_holdem_8910_4s8c9hJdQd_Kh2cTh9d_Td3d7d6c() {
    assertEquals(
      "Td3d7d6c Kh2cTh9d",
      Solver.process("omaha-holdem 4s8c9hJdQd Kh2cTh9d Td3d7d6c"));
  }

  @Test
  public void test_omaha_holdem_8911_4c6hJhThTs_8hQd7d6s_5dJc3c8c_Ac2c7c2h_4h6d3d4d_As9dAd3h_5cKhKd8d_Qs7s4s9s() {
    assertEquals(
      "Ac2c7c2h Qs7s4s9s 8hQd7d6s 5dJc3c8c 5cKhKd8d As9dAd3h 4h6d3d4d",
      Solver.process("omaha-holdem 4c6hJhThTs 8hQd7d6s 5dJc3c8c Ac2c7c2h 4h6d3d4d As9dAd3h 5cKhKd8d Qs7s4s9s"));
  }

  @Test
  public void test_omaha_holdem_8912_2d8sAhKcQc_7dAd5d4h_4c9hJsQd_7s2cAs6h_Kh5h8cTd_Ts3hTcJc_9d9s7h8d_6d3sAc2s() {
    assertEquals(
      "9d9s7h8d 4c9hJsQd 7dAd5d4h Kh5h8cTd 6d3sAc2s=7s2cAs6h Ts3hTcJc",
      Solver.process("omaha-holdem 2d8sAhKcQc 7dAd5d4h 4c9hJsQd 7s2cAs6h Kh5h8cTd Ts3hTcJc 9d9s7h8d 6d3sAc2s"));
  }

  @Test
  public void test_omaha_holdem_8913_7s8cAhJdQs_4c2sAcJh_3c5dThTc() {
    assertEquals(
      "3c5dThTc 4c2sAcJh",
      Solver.process("omaha-holdem 7s8cAhJdQs 4c2sAcJh 3c5dThTc"));
  }

  @Test
  public void test_omaha_holdem_8914_3s4s7c9sKh_3cQh2cTd_8h3d6cAs() {
    assertEquals(
      "3cQh2cTd 8h3d6cAs",
      Solver.process("omaha-holdem 3s4s7c9sKh 3cQh2cTd 8h3d6cAs"));
  }

  @Test
  public void test_omaha_holdem_8915_3dKhQcTdTh_9d8c8hQd_5h6hJd2c_6cQh7c2s() {
    assertEquals(
      "5h6hJd2c 6cQh7c2s 9d8c8hQd",
      Solver.process("omaha-holdem 3dKhQcTdTh 9d8c8hQd 5h6hJd2c 6cQh7c2s"));
  }

  @Test
  public void test_omaha_holdem_8916_6s7sAhKdTd_2cJsAd2d_8h5d9c3s_Tc3d2s3h_Th7d8d9h_2hTsQhJh_5h8s3c8c() {
    assertEquals(
      "5h8s3c8c Tc3d2s3h 2cJsAd2d 8h5d9c3s=Th7d8d9h 2hTsQhJh",
      Solver.process("omaha-holdem 6s7sAhKdTd 2cJsAd2d 8h5d9c3s Tc3d2s3h Th7d8d9h 2hTsQhJh 5h8s3c8c"));
  }

  @Test
  public void test_omaha_holdem_8917_8dKsQdQsTd_5c4s7sAs_6sJdKc5h_6d7h6cJh_8s8cAdJs_4hQhTs4d_Tc2d9hTh() {
    assertEquals(
      "5c4s7sAs 6d7h6cJh 6sJdKc5h 8s8cAdJs Tc2d9hTh 4hQhTs4d",
      Solver.process("omaha-holdem 8dKsQdQsTd 5c4s7sAs 6sJdKc5h 6d7h6cJh 8s8cAdJs 4hQhTs4d Tc2d9hTh"));
  }

  @Test
  public void test_omaha_holdem_8918_3s8s9dKsQd_QcJd5sJs_2sQsKh7d_8dJh8c6s_4s9cTd5c_7c7sJcAh_6d4hKcAc_Qh7hAd5d() {
    assertEquals(
      "7c7sJcAh 4s9cTd5c Qh7hAd5d 6d4hKcAc 8dJh8c6s QcJd5sJs 2sQsKh7d",
      Solver.process("omaha-holdem 3s8s9dKsQd QcJd5sJs 2sQsKh7d 8dJh8c6s 4s9cTd5c 7c7sJcAh 6d4hKcAc Qh7hAd5d"));
  }

  @Test
  public void test_omaha_holdem_8919_7s9hJdJsKh_Qc2dTc7d_3s8sTdQh_3c9s6d8h_3h5dAs3d_5hKdTh6h_2h9d6sAh_8dJcTsJh_Ad2cAc7h() {
    assertEquals(
      "3h5dAs3d 3c9s6d8h 2h9d6sAh 5hKdTh6h Ad2cAc7h 3s8sTdQh=Qc2dTc7d 8dJcTsJh",
      Solver.process("omaha-holdem 7s9hJdJsKh Qc2dTc7d 3s8sTdQh 3c9s6d8h 3h5dAs3d 5hKdTh6h 2h9d6sAh 8dJcTsJh Ad2cAc7h"));
  }

  @Test
  public void test_omaha_holdem_8920_5h7c8s9cJh_5s4hKs2h_2d8dKc6h_7s3dJdKh_Kd5cAd6d_2s3c9d3s_TcAc8c7h_4d4c2cAs() {
    assertEquals(
      "4d4c2cAs 5s4hKs2h 2s3c9d3s 7s3dJdKh 2d8dKc6h=Kd5cAd6d TcAc8c7h",
      Solver.process("omaha-holdem 5h7c8s9cJh 5s4hKs2h 2d8dKc6h 7s3dJdKh Kd5cAd6d 2s3c9d3s TcAc8c7h 4d4c2cAs"));
  }

  @Test
  public void test_omaha_holdem_8921_3c4c6dJhTc_9c4h5dKh_8s2h4sJc_Jd8cQc4d_QsAd5hKd_Ts6cAh7d() {
    assertEquals(
      "QsAd5hKd 9c4h5dKh Ts6cAh7d 8s2h4sJc Jd8cQc4d",
      Solver.process("omaha-holdem 3c4c6dJhTc 9c4h5dKh 8s2h4sJc Jd8cQc4d QsAd5hKd Ts6cAh7d"));
  }

  @Test
  public void test_omaha_holdem_8922_2c6d6hQdTs_4dAsJs8s_9c3c5d4s_Kd9dTh7c_QcJcKc7s() {
    assertEquals(
      "9c3c5d4s 4dAsJs8s Kd9dTh7c QcJcKc7s",
      Solver.process("omaha-holdem 2c6d6hQdTs 4dAsJs8s 9c3c5d4s Kd9dTh7c QcJcKc7s"));
  }

  @Test
  public void test_omaha_holdem_8923_6c6d8sJcKd_7s5s8h3c_9h7c3dAd_3h5dTc8d_4c8cKcTd_Ac6hQc4s_As9s7h5c_3sJsKs2c_4hJdQhTh() {
    assertEquals(
      "9h7c3dAd=As9s7h5c 7s5s8h3c 3h5dTc8d 4hJdQhTh 4c8cKcTd 3sJsKs2c Ac6hQc4s",
      Solver.process("omaha-holdem 6c6d8sJcKd 7s5s8h3c 9h7c3dAd 3h5dTc8d 4c8cKcTd Ac6hQc4s As9s7h5c 3sJsKs2c 4hJdQhTh"));
  }

  @Test
  public void test_omaha_holdem_8924_4h6h8sAhTd_Ad3d6cAs_2c7c4d7d() {
    assertEquals(
      "2c7c4d7d Ad3d6cAs",
      Solver.process("omaha-holdem 4h6h8sAhTd Ad3d6cAs 2c7c4d7d"));
  }

  @Test
  public void test_omaha_holdem_8925_5h6hAcJsTc_Ts5s8c2s_Qh9dAd6s_3sQc2d9s_Jc4d3h5c_Ah4cKc8h_As7s9hKh() {
    assertEquals(
      "3sQc2d9s Ah4cKc8h=As7s9hKh Ts5s8c2s Jc4d3h5c Qh9dAd6s",
      Solver.process("omaha-holdem 5h6hAcJsTc Ts5s8c2s Qh9dAd6s 3sQc2d9s Jc4d3h5c Ah4cKc8h As7s9hKh"));
  }

  @Test
  public void test_omaha_holdem_8926_2c8c9cAsJh_3sTsAdJc_QdQs9sTh_6s2d7s4s() {
    assertEquals(
      "6s2d7s4s 3sTsAdJc QdQs9sTh",
      Solver.process("omaha-holdem 2c8c9cAsJh 3sTsAdJc QdQs9sTh 6s2d7s4s"));
  }

  @Test
  public void test_omaha_holdem_8927_3h4d4s9hAh_9s8s2h3c_Ac2d3d5d_Qc8hQsKh_4h4cKc9c_ThTcQdQh_Ks5c2c5h() {
    assertEquals(
      "9s8s2h3c Ac2d3d5d=Ks5c2c5h ThTcQdQh Qc8hQsKh 4h4cKc9c",
      Solver.process("omaha-holdem 3h4d4s9hAh 9s8s2h3c Ac2d3d5d Qc8hQsKh 4h4cKc9c ThTcQdQh Ks5c2c5h"));
  }

  @Test
  public void test_omaha_holdem_8928_3d4h5d6c8c_Jc9d3cTs_9h4d7sKc_ThKdKs8h_5s7d8s6d_8d3h2dJd() {
    assertEquals(
      "Jc9d3cTs ThKdKs8h 8d3h2dJd 5s7d8s6d 9h4d7sKc",
      Solver.process("omaha-holdem 3d4h5d6c8c Jc9d3cTs 9h4d7sKc ThKdKs8h 5s7d8s6d 8d3h2dJd"));
  }

  @Test
  public void test_omaha_holdem_8929_4d5h7d9hAs_Qd3d6sJs_QcQh7c5s_5c4cJc4s() {
    assertEquals(
      "QcQh7c5s 5c4cJc4s Qd3d6sJs",
      Solver.process("omaha-holdem 4d5h7d9hAs Qd3d6sJs QcQh7c5s 5c4cJc4s"));
  }

  @Test
  public void test_omaha_holdem_8930_3c3d6sAdKh_Ah8sQs9c_2h9h4s7c() {
    assertEquals(
      "2h9h4s7c Ah8sQs9c",
      Solver.process("omaha-holdem 3c3d6sAdKh Ah8sQs9c 2h9h4s7c"));
  }

  @Test
  public void test_omaha_holdem_8931_2s8s9dJsTc_QsAh9sKs_Kd8dJh3c_ThAd2c7s_5h6d6h5s_4s3h7d3d_9cQd7cJd_2d5cKhTs() {
    assertEquals(
      "4s3h7d3d 5h6d6h5s 2d5cKhTs Kd8dJh3c ThAd2c7s 9cQd7cJd QsAh9sKs",
      Solver.process("omaha-holdem 2s8s9dJsTc QsAh9sKs Kd8dJh3c ThAd2c7s 5h6d6h5s 4s3h7d3d 9cQd7cJd 2d5cKhTs"));
  }

  @Test
  public void test_omaha_holdem_8932_6h9c9dJhQc_5s5hQh9h_Ts6sKsKh_4d5dQsTc_8h9sKd5c_Ah4cJcJd() {
    assertEquals(
      "4d5dQsTc 8h9sKd5c Ts6sKsKh 5s5hQh9h Ah4cJcJd",
      Solver.process("omaha-holdem 6h9c9dJhQc 5s5hQh9h Ts6sKsKh 4d5dQsTc 8h9sKd5c Ah4cJcJd"));
  }

  @Test
  public void test_omaha_holdem_8933_2h3d6d9cQd_4cAdJc5h_5c4h8dKs_8sTd6s5s_Qh8c2sJh_Kh9d2d7d_QcQs7h2c_6c5d3h8h() {
    assertEquals(
      "8sTd6s5s 6c5d3h8h Qh8c2sJh QcQs7h2c 4cAdJc5h=5c4h8dKs Kh9d2d7d",
      Solver.process("omaha-holdem 2h3d6d9cQd 4cAdJc5h 5c4h8dKs 8sTd6s5s Qh8c2sJh Kh9d2d7d QcQs7h2c 6c5d3h8h"));
  }

  @Test
  public void test_omaha_holdem_8934_5c6dAdAhKs_7c3dJc8d_6s3c9cJs_QhKcJh4c_3s2dKh7d_9hQsTsJd_4sTc4dQc_2cTd9s6c() {
    assertEquals(
      "7c3dJc8d 9hQsTsJd 4sTc4dQc 2cTd9s6c 6s3c9cJs 3s2dKh7d QhKcJh4c",
      Solver.process("omaha-holdem 5c6dAdAhKs 7c3dJc8d 6s3c9cJs QhKcJh4c 3s2dKh7d 9hQsTsJd 4sTc4dQc 2cTd9s6c"));
  }

  @Test
  public void test_omaha_holdem_8935_2h3s4c6dTs_2c5hAsQh_7sAd6c8h_4s2d9hQd() {
    assertEquals(
      "7sAd6c8h 4s2d9hQd 2c5hAsQh",
      Solver.process("omaha-holdem 2h3s4c6dTs 2c5hAsQh 7sAd6c8h 4s2d9hQd"));
  }

  @Test
  public void test_omaha_holdem_8936_2d4c8s9sQs_Th5hJc3d_2s9c7cAh_QcKsAc3c_9d8cTs6c_9h5c5s6h_QdAsKh6s_3s8hTcJs() {
    assertEquals(
      "9h5c5s6h QcKsAc3c 2s9c7cAh 9d8cTs6c Th5hJc3d 3s8hTcJs QdAsKh6s",
      Solver.process("omaha-holdem 2d4c8s9sQs Th5hJc3d 2s9c7cAh QcKsAc3c 9d8cTs6c 9h5c5s6h QdAsKh6s 3s8hTcJs"));
  }

  @Test
  public void test_omaha_holdem_8937_6d7d7s8dAh_JdJs3dKd_Ks8sTs2h_Jh5hAs2d_4c7cQsQh_Ac5dJc2c_QdAd6s7h_Kh9c9s3c_4s8h3h5s() {
    assertEquals(
      "Ks8sTs2h Kh9c9s3c Ac5dJc2c=Jh5hAs2d 4c7cQsQh 4s8h3h5s JdJs3dKd QdAd6s7h",
      Solver.process("omaha-holdem 6d7d7s8dAh JdJs3dKd Ks8sTs2h Jh5hAs2d 4c7cQsQh Ac5dJc2c QdAd6s7h Kh9c9s3c 4s8h3h5s"));
  }

  @Test
  public void test_omaha_holdem_8938_5sJcKhQsTc_3cJhKs7h_6s8h8d5h_Th9d9s5d_3s2h4c5c_QhJdTsAs_Kc4h6hTd_4sAd7d3h_4dJs2c7s_AcKd7c6d() {
    assertEquals(
      "4sAd7d3h 3s2h4c5c 6s8h8d5h 4dJs2c7s Kc4h6hTd 3cJhKs7h Th9d9s5d AcKd7c6d=QhJdTsAs",
      Solver.process("omaha-holdem 5sJcKhQsTc 3cJhKs7h 6s8h8d5h Th9d9s5d 3s2h4c5c QhJdTsAs Kc4h6hTd 4sAd7d3h 4dJs2c7s AcKd7c6d"));
  }

  @Test
  public void test_omaha_holdem_8939_5d6d9cAdKh_JhQsJdKs_4h5cAsQd_9d2dJs2h_Kd7c3d4d() {
    assertEquals(
      "JhQsJdKs 4h5cAsQd 9d2dJs2h Kd7c3d4d",
      Solver.process("omaha-holdem 5d6d9cAdKh JhQsJdKs 4h5cAsQd 9d2dJs2h Kd7c3d4d"));
  }

  @Test
  public void test_omaha_holdem_8940_2s4s7c9cTd_Js5dAdJc_7dAhKc6h_8c9dTc2h_5h7h3sAc_2c3c4c8h_7s9hKsJd_5s6sAs2d_QhKhTsKd() {
    assertEquals(
      "5s6sAs2d 5h7h3sAc=7dAhKc6h Js5dAdJc QhKhTsKd 2c3c4c8h 7s9hKsJd 8c9dTc2h",
      Solver.process("omaha-holdem 2s4s7c9cTd Js5dAdJc 7dAhKc6h 8c9dTc2h 5h7h3sAc 2c3c4c8h 7s9hKsJd 5s6sAs2d QhKhTsKd"));
  }

  @Test
  public void test_omaha_holdem_8941_3d3h7d9hJc_8s5sQd2h_7h6dQhTh_9dAh8dQc_4sTs3s2d_JdAsKdKc_Jh2s5cTd_4d9c6c8c() {
    assertEquals(
      "8s5sQd2h 7h6dQhTh 4d9c6c8c 9dAh8dQc Jh2s5cTd JdAsKdKc 4sTs3s2d",
      Solver.process("omaha-holdem 3d3h7d9hJc 8s5sQd2h 7h6dQhTh 9dAh8dQc 4sTs3s2d JdAsKdKc Jh2s5cTd 4d9c6c8c"));
  }

  @Test
  public void test_omaha_holdem_8942_3s4h6d7s9h_8h4d6s6h_Jd5s4c9s_9dKc7dAs_5c6cAc8d() {
    assertEquals(
      "9dKc7dAs 8h4d6s6h Jd5s4c9s 5c6cAc8d",
      Solver.process("omaha-holdem 3s4h6d7s9h 8h4d6s6h Jd5s4c9s 9dKc7dAs 5c6cAc8d"));
  }

  @Test
  public void test_omaha_holdem_8943_6h7h9cKcQs_5s9d3c6d_8c8hTsQh_4c8s5hKh() {
    assertEquals(
      "5s9d3c6d 4c8s5hKh 8c8hTsQh",
      Solver.process("omaha-holdem 6h7h9cKcQs 5s9d3c6d 8c8hTsQh 4c8s5hKh"));
  }

  @Test
  public void test_omaha_holdem_8944_3s4c6hAcQs_9h6cAsQd_9c6d9s8h_Ad5h4h7d_2sJcQh7h_3c8d7s5s_ThTs4sKh_5c3dKc2c() {
    assertEquals(
      "9c6d9s8h ThTs4sKh 2sJcQh7h 9h6cAsQd 5c3dKc2c 3c8d7s5s=Ad5h4h7d",
      Solver.process("omaha-holdem 3s4c6hAcQs 9h6cAsQd 9c6d9s8h Ad5h4h7d 2sJcQh7h 3c8d7s5s ThTs4sKh 5c3dKc2c"));
  }

  @Test
  public void test_omaha_holdem_8945_6d6h6s7d9s_8s8d9cJc_Qs5h4dQh_JsAcJd2c_2hKs5s4c_As3hTc4s_Kc7cKd9d_3s3dAd5d() {
    assertEquals(
      "2hKs5s4c As3hTc4s 3s3dAd5d 8s8d9cJc JsAcJd2c Qs5h4dQh Kc7cKd9d",
      Solver.process("omaha-holdem 6d6h6s7d9s 8s8d9cJc Qs5h4dQh JsAcJd2c 2hKs5s4c As3hTc4s Kc7cKd9d 3s3dAd5d"));
  }

  @Test
  public void test_omaha_holdem_8946_5s6dJhQcTs_2h8c5c8d_6sAd7c5d_4s3cQdAs_9d8s6h7h_4dJc9cQs_Jd9h4c7d_TdAc2sKh_Th6cJsQh() {
    assertEquals(
      "2h8c5c8d Jd9h4c7d 4s3cQdAs 6sAd7c5d 4dJc9cQs=Th6cJsQh 9d8s6h7h TdAc2sKh",
      Solver.process("omaha-holdem 5s6dJhQcTs 2h8c5c8d 6sAd7c5d 4s3cQdAs 9d8s6h7h 4dJc9cQs Jd9h4c7d TdAc2sKh Th6cJsQh"));
  }

  @Test
  public void test_omaha_holdem_8947_2s5s6sAdQs_3c7sKh5c_8sJd3d4h_Kc7dKs6c_Tc8h4d9h_KdJsAh9c_9sQd7c2d() {
    assertEquals(
      "Tc8h4d9h 3c7sKh5c Kc7dKs6c KdJsAh9c 9sQd7c2d 8sJd3d4h",
      Solver.process("omaha-holdem 2s5s6sAdQs 3c7sKh5c 8sJd3d4h Kc7dKs6c Tc8h4d9h KdJsAh9c 9sQd7c2d"));
  }

  @Test
  public void test_omaha_holdem_8948_4s5s7cAcJc_9dKcJh4d_6sJd8h5c_Ah9sAd5d_4h4c2dQc() {
    assertEquals(
      "9dKcJh4d Ah9sAd5d 6sJd8h5c 4h4c2dQc",
      Solver.process("omaha-holdem 4s5s7cAcJc 9dKcJh4d 6sJd8h5c Ah9sAd5d 4h4c2dQc"));
  }

  @Test
  public void test_omaha_holdem_8949_3c3d7h7sJc_5hAd9cAh_9s5s7c9d_3hTsTh8c_Kh6dJh9h_6h6cKd3s_QdQcAcAs_6sJs7d4h_Ks2c4c5c() {
    assertEquals(
      "Ks2c4c5c Kh6dJh9h 5hAd9cAh=QdQcAcAs 3hTsTh8c 6h6cKd3s 9s5s7c9d 6sJs7d4h",
      Solver.process("omaha-holdem 3c3d7h7sJc 5hAd9cAh 9s5s7c9d 3hTsTh8c Kh6dJh9h 6h6cKd3s QdQcAcAs 6sJs7d4h Ks2c4c5c"));
  }

  @Test
  public void test_omaha_holdem_8950_2h3c7hKcKd_Js4d6sQd_Qc7c3hTc_Jd9dAd5s_3d9h2s2d_4s9c6dTh_8dAs2cQs_7sTd5d6h_9sAhQhJh() {
    assertEquals(
      "4s9c6dTh Js4d6sQd Jd9dAd5s 9sAhQhJh 8dAs2cQs 7sTd5d6h Qc7c3hTc 3d9h2s2d",
      Solver.process("omaha-holdem 2h3c7hKcKd Js4d6sQd Qc7c3hTc Jd9dAd5s 3d9h2s2d 4s9c6dTh 8dAs2cQs 7sTd5d6h 9sAhQhJh"));
  }

  @Test
  public void test_omaha_holdem_8951_3d6c6sQdQh_6hAh8cKc_4d2sTc3h_9cTs5s8s_3c4hTh5h() {
    assertEquals(
      "9cTs5s8s 3c4hTh5h=4d2sTc3h 6hAh8cKc",
      Solver.process("omaha-holdem 3d6c6sQdQh 6hAh8cKc 4d2sTc3h 9cTs5s8s 3c4hTh5h"));
  }

  @Test
  public void test_omaha_holdem_8952_3d6c8c9dKc_5d3cAsJs_4hAd7sAh_Ks2d8sTh() {
    assertEquals(
      "5d3cAsJs 4hAd7sAh Ks2d8sTh",
      Solver.process("omaha-holdem 3d6c8c9dKc 5d3cAsJs 4hAd7sAh Ks2d8sTh"));
  }

  @Test
  public void test_omaha_holdem_8953_3h6s9dAsQd_Th8s2hJc_7hTs4h7s_8d5hAd8h_Qs2sAh5d_4c5c7dJh_Js3c2d9s_AcQhTd7c_4s6dTcKd() {
    assertEquals(
      "4c5c7dJh Th8s2hJc 4s6dTcKd 7hTs4h7s 8d5hAd8h Js3c2d9s AcQhTd7c=Qs2sAh5d",
      Solver.process("omaha-holdem 3h6s9dAsQd Th8s2hJc 7hTs4h7s 8d5hAd8h Qs2sAh5d 4c5c7dJh Js3c2d9s AcQhTd7c 4s6dTcKd"));
  }

  @Test
  public void test_omaha_holdem_8954_9hAcJsKdQh_5h5cAs7s_4s6sAh5d_Qc3s6h2s_TdJd3c6c_3hQsKs7d_8c2h4h9d_2dKc5s8h() {
    assertEquals(
      "8c2h4h9d Qc3s6h2s 2dKc5s8h 4s6sAh5d 5h5cAs7s 3hQsKs7d TdJd3c6c",
      Solver.process("omaha-holdem 9hAcJsKdQh 5h5cAs7s 4s6sAh5d Qc3s6h2s TdJd3c6c 3hQsKs7d 8c2h4h9d 2dKc5s8h"));
  }

  @Test
  public void test_omaha_holdem_8955_2s3h9dKdQh_2hJs7s8h_5sQdAh8c_7hJc8s4d_9c5c9sKs() {
    assertEquals(
      "7hJc8s4d 2hJs7s8h 5sQdAh8c 9c5c9sKs",
      Solver.process("omaha-holdem 2s3h9dKdQh 2hJs7s8h 5sQdAh8c 7hJc8s4d 9c5c9sKs"));
  }

  @Test
  public void test_omaha_holdem_8956_2h3s4h6s9h_2cJh6cQc_6h5c6d7d_4dAdAs7s_TcKh9s9c_7cAcQsQh_Jd5s5d9d_TdKsThJc_8hTsAh8c() {
    assertEquals(
      "Jd5s5d9d TdKsThJc 7cAcQsQh 4dAdAs7s 2cJh6cQc TcKh9s9c 6h5c6d7d 8hTsAh8c",
      Solver.process("omaha-holdem 2h3s4h6s9h 2cJh6cQc 6h5c6d7d 4dAdAs7s TcKh9s9c 7cAcQsQh Jd5s5d9d TdKsThJc 8hTsAh8c"));
  }

  @Test
  public void test_omaha_holdem_8957_2d3s5h9hQs_3h3cAd4h_5cTd7sAc() {
    assertEquals(
      "5cTd7sAc 3h3cAd4h",
      Solver.process("omaha-holdem 2d3s5h9hQs 3h3cAd4h 5cTd7sAc"));
  }

  @Test
  public void test_omaha_holdem_8958_3d4s6h8c8s_3sAcTc4c_Kc3h9dAs_2sQc5d6s_2h5hAhAd_4h3c7c8h_QdKh7h2d() {
    assertEquals(
      "QdKh7h2d Kc3h9dAs 3sAcTc4c 2h5hAhAd=2sQc5d6s 4h3c7c8h",
      Solver.process("omaha-holdem 3d4s6h8c8s 3sAcTc4c Kc3h9dAs 2sQc5d6s 2h5hAhAd 4h3c7c8h QdKh7h2d"));
  }

  @Test
  public void test_omaha_holdem_8959_7h9cJdKcTh_2d8h4sJc_JsQd9sKh() {
    assertEquals(
      "2d8h4sJc JsQd9sKh",
      Solver.process("omaha-holdem 7h9cJdKcTh 2d8h4sJc JsQd9sKh"));
  }

  @Test
  public void test_omaha_holdem_8960_2d3s7cAdJd_Td7s9dQd_2s4sJc7h() {
    assertEquals(
      "2s4sJc7h Td7s9dQd",
      Solver.process("omaha-holdem 2d3s7cAdJd Td7s9dQd 2s4sJc7h"));
  }

  @Test
  public void test_omaha_holdem_8961_2h5dAcJsQs_8c5s4s3s_4d3dTc7d_8s9hKd6h() {
    assertEquals(
      "8s9hKd6h 4d3dTc7d=8c5s4s3s",
      Solver.process("omaha-holdem 2h5dAcJsQs 8c5s4s3s 4d3dTc7d 8s9hKd6h"));
  }

  @Test
  public void test_omaha_holdem_8962_3c6hAcJhQd_6d5dQc2h_4hAhTd7s_Ts7h9c3h_6s9s8s7c() {
    assertEquals(
      "Ts7h9c3h 6s9s8s7c 4hAhTd7s 6d5dQc2h",
      Solver.process("omaha-holdem 3c6hAcJhQd 6d5dQc2h 4hAhTd7s Ts7h9c3h 6s9s8s7c"));
  }

  @Test
  public void test_omaha_holdem_8963_2d3d6s9sJd_7c8d3hAd_Jh3c4sQs_8c6h8s9d() {
    assertEquals(
      "8c6h8s9d Jh3c4sQs 7c8d3hAd",
      Solver.process("omaha-holdem 2d3d6s9sJd 7c8d3hAd Jh3c4sQs 8c6h8s9d"));
  }

  @Test
  public void test_omaha_holdem_8964_2d6h8cAcTs_6dJh9s2h_AhTc5c5h_2sKs7cQd_3h4s3dKc_2c8d4c7h() {
    assertEquals(
      "2sKs7cQd 3h4s3dKc 6dJh9s2h 2c8d4c7h AhTc5c5h",
      Solver.process("omaha-holdem 2d6h8cAcTs 6dJh9s2h AhTc5c5h 2sKs7cQd 3h4s3dKc 2c8d4c7h"));
  }

  @Test
  public void test_omaha_holdem_8965_3h8c8dJsQd_Ah9s2dTc_AsKd8h2s_7d4h6c6h_TdKh3d9c_Ad4s7cTs_Th5h9h5d() {
    assertEquals(
      "Ad4s7cTs 7d4h6c6h AsKd8h2s Ah9s2dTc=TdKh3d9c=Th5h9h5d",
      Solver.process("omaha-holdem 3h8c8dJsQd Ah9s2dTc AsKd8h2s 7d4h6c6h TdKh3d9c Ad4s7cTs Th5h9h5d"));
  }

  @Test
  public void test_omaha_holdem_8966_3d4s6dKdQd_6sKsAcAh_3s4d6cQc_8cTcQs5h_5c5s2dJs_2cTs2s6h() {
    assertEquals(
      "2cTs2s6h 8cTcQs5h 3s4d6cQc 6sKsAcAh 5c5s2dJs",
      Solver.process("omaha-holdem 3d4s6dKdQd 6sKsAcAh 3s4d6cQc 8cTcQs5h 5c5s2dJs 2cTs2s6h"));
  }

  @Test
  public void test_omaha_holdem_8967_5d8dJdQcTh_Kh4s9h4d_Js9sAs5s_5hAd7s2h_Jh2c2sAc_Td2d8c8s() {
    assertEquals(
      "5hAd7s2h Jh2c2sAc Js9sAs5s Kh4s9h4d Td2d8c8s",
      Solver.process("omaha-holdem 5d8dJdQcTh Kh4s9h4d Js9sAs5s 5hAd7s2h Jh2c2sAc Td2d8c8s"));
  }

  @Test
  public void test_omaha_holdem_8968_4d5c9sAdQs_Kc6c2hTh_Ks8c3hAh_7sJcQh7c_8hTd5h9h_6sJh4c3s_TcKdTs7h_2d6h5s9d_4h7d8dKh() {
    assertEquals(
      "Kc6c2hTh 6sJh4c3s 4h7d8dKh TcKdTs7h 7sJcQh7c Ks8c3hAh 2d6h5s9d=8hTd5h9h",
      Solver.process("omaha-holdem 4d5c9sAdQs Kc6c2hTh Ks8c3hAh 7sJcQh7c 8hTd5h9h 6sJh4c3s TcKdTs7h 2d6h5s9d 4h7d8dKh"));
  }

  @Test
  public void test_omaha_holdem_8969_3c3d6d7hKs_4s9h5dJs_3h5c6sTs_8sQs7dQh_9cQc6c4h_5sAs3s7s_8d7cKcAc_Kh8h8c6h_4dTh5h9d() {
    assertEquals(
      "9cQc6c4h 8sQs7dQh Kh8h8c6h 8d7cKcAc 4dTh5h9d=4s9h5dJs 3h5c6sTs 5sAs3s7s",
      Solver.process("omaha-holdem 3c3d6d7hKs 4s9h5dJs 3h5c6sTs 8sQs7dQh 9cQc6c4h 5sAs3s7s 8d7cKcAc Kh8h8c6h 4dTh5h9d"));
  }

  @Test
  public void test_omaha_holdem_8970_4h6c7dJcKh_4c5s4s5d_9dTd3s9h_2dKd7cAs_4d2sTcAd_Th3dTsKs_2c7sJs9c_6h5cKcQd_Qs8hAc8c() {
    assertEquals(
      "4d2sTcAd Qs8hAc8c 9dTd3s9h Th3dTsKs 2c7sJs9c 6h5cKcQd 2dKd7cAs 4c5s4s5d",
      Solver.process("omaha-holdem 4h6c7dJcKh 4c5s4s5d 9dTd3s9h 2dKd7cAs 4d2sTcAd Th3dTsKs 2c7sJs9c 6h5cKcQd Qs8hAc8c"));
  }

  @Test
  public void test_omaha_holdem_8971_5s6d9sThTs_9dJsJh4h_8c3sAc9h_Qc6h4c5c_Qh7d2s3c_7cQsKdKh_QdAh6s4d_6cAd2dJc() {
    assertEquals(
      "Qh7d2s3c Qc6h4c5c 6cAd2dJc=QdAh6s4d 8c3sAc9h 9dJsJh4h 7cQsKdKh",
      Solver.process("omaha-holdem 5s6d9sThTs 9dJsJh4h 8c3sAc9h Qc6h4c5c Qh7d2s3c 7cQsKdKh QdAh6s4d 6cAd2dJc"));
  }

  @Test
  public void test_omaha_holdem_8972_3d7d9cAhTc_8d2cJcAd_2s9dJsKc_2h3hTdQc_3cAs5s6d() {
    assertEquals(
      "2s9dJsKc 2h3hTdQc 3cAs5s6d 8d2cJcAd",
      Solver.process("omaha-holdem 3d7d9cAhTc 8d2cJcAd 2s9dJsKc 2h3hTdQc 3cAs5s6d"));
  }

  @Test
  public void test_omaha_holdem_8973_2c8h9dAcJc_7cKd2hKc_8d5s7h9s() {
    assertEquals(
      "8d5s7h9s 7cKd2hKc",
      Solver.process("omaha-holdem 2c8h9dAcJc 7cKd2hKc 8d5s7h9s"));
  }

  @Test
  public void test_omaha_holdem_8974_2d2h4d8hJc_8sKsAdJd_QdAs9h3d_9s2c7h7c_Jh6d6hJs_QsTsTdAh_6s5h5s7d_9d7sTh3h_4hQc3sKh_4c3c8c2s() {
    assertEquals(
      "9d7sTh3h QdAs9h3d 4hQc3sKh 6s5h5s7d QsTsTdAh 8sKsAdJd 9s2c7h7c 4c3c8c2s Jh6d6hJs",
      Solver.process("omaha-holdem 2d2h4d8hJc 8sKsAdJd QdAs9h3d 9s2c7h7c Jh6d6hJs QsTsTdAh 6s5h5s7d 9d7sTh3h 4hQc3sKh 4c3c8c2s"));
  }

  @Test
  public void test_omaha_holdem_8975_5d6c6s7cJd_4c4sQh4d_2h3s8d3d_AhAsAdKc_8cQs9sJc_5cTcTs3h_Td6h7h9h_7s4h9d5h_8s8hQcKh() {
    assertEquals(
      "2h3s8d3d 4c4sQh4d 7s4h9d5h 8s8hQcKh 5cTcTs3h AhAsAdKc 8cQs9sJc Td6h7h9h",
      Solver.process("omaha-holdem 5d6c6s7cJd 4c4sQh4d 2h3s8d3d AhAsAdKc 8cQs9sJc 5cTcTs3h Td6h7h9h 7s4h9d5h 8s8hQcKh"));
  }

  @Test
  public void test_omaha_holdem_8976_4s5h7d7hKd_3cJc3s8h_9hJd2s7s_5dKs6c5c_8dQs8cKh_6s2cAc3h() {
    assertEquals(
      "3cJc3s8h 8dQs8cKh 9hJd2s7s 6s2cAc3h 5dKs6c5c",
      Solver.process("omaha-holdem 4s5h7d7hKd 3cJc3s8h 9hJd2s7s 5dKs6c5c 8dQs8cKh 6s2cAc3h"));
  }

  @Test
  public void test_omaha_holdem_8977_3s4d6dKhKs_Kc5d9h3c_6h9cAdKd_AhJh9s4s_9d4h6sQc_8d7s8h5s_Ac4cJd2c_2h7cAs3d_7d5cTd5h_8s3hJcTh() {
    assertEquals(
      "8s3hJcTh 2h7cAs3d Ac4cJd2c=AhJh9s4s 9d4h6sQc 7d5cTd5h=8d7s8h5s Kc5d9h3c 6h9cAdKd",
      Solver.process("omaha-holdem 3s4d6dKhKs Kc5d9h3c 6h9cAdKd AhJh9s4s 9d4h6sQc 8d7s8h5s Ac4cJd2c 2h7cAs3d 7d5cTd5h 8s3hJcTh"));
  }

  @Test
  public void test_omaha_holdem_8978_2h8dAsKdQs_2s9d6h3d_QdQh7s4h_3h5dAd7h_JhTs3cJc_7dJs6cQc_4c2d8c3s() {
    assertEquals(
      "2s9d6h3d 7dJs6cQc 3h5dAd7h 4c2d8c3s QdQh7s4h JhTs3cJc",
      Solver.process("omaha-holdem 2h8dAsKdQs 2s9d6h3d QdQh7s4h 3h5dAd7h JhTs3cJc 7dJs6cQc 4c2d8c3s"));
  }

  @Test
  public void test_omaha_holdem_8979_3h7s9dQsTs_KdQc3d4s_4h7hTc9c() {
    assertEquals(
      "4h7hTc9c KdQc3d4s",
      Solver.process("omaha-holdem 3h7s9dQsTs KdQc3d4s 4h7hTc9c"));
  }

  @Test
  public void test_omaha_holdem_8980_4s5h7c9hAh_2h6d3c2d_2c8hQsJs_3sTsAs7s_5s9sKd3h_4c6h9d3d_6s7h5d6c_KsAd5c4d_TcQh7d8s_Th9cQcKh() {
    assertEquals(
      "2c8hQsJs TcQh7d8s 6s7h5d6c 5s9sKd3h KsAd5c4d 3sTsAs7s 2h6d3c2d=4c6h9d3d Th9cQcKh",
      Solver.process("omaha-holdem 4s5h7c9hAh 2h6d3c2d 2c8hQsJs 3sTsAs7s 5s9sKd3h 4c6h9d3d 6s7h5d6c KsAd5c4d TcQh7d8s Th9cQcKh"));
  }

  @Test
  public void test_omaha_holdem_8981_2c7dAsJsKs_8dTs3h9s_5s2h3sTh_Qs7c4hTc_4d6s5h7h_8hAcKh8s_6cQc2dQh_Kd3c4sJc_9h5dKcQd() {
    assertEquals(
      "4d6s5h7h 6cQc2dQh 9h5dKcQd Kd3c4sJc 8hAcKh8s Qs7c4hTc 5s2h3sTh 8dTs3h9s",
      Solver.process("omaha-holdem 2c7dAsJsKs 8dTs3h9s 5s2h3sTh Qs7c4hTc 4d6s5h7h 8hAcKh8s 6cQc2dQh Kd3c4sJc 9h5dKcQd"));
  }

  @Test
  public void test_omaha_holdem_8982_2h6s7hAdTc_6h2d9s9d_2c5hTd8d_JdQh4d3d_Qd5sAhAc_8s7c8h9h() {
    assertEquals(
      "JdQh4d3d 6h2d9s9d 2c5hTd8d Qd5sAhAc 8s7c8h9h",
      Solver.process("omaha-holdem 2h6s7hAdTc 6h2d9s9d 2c5hTd8d JdQh4d3d Qd5sAhAc 8s7c8h9h"));
  }

  @Test
  public void test_omaha_holdem_8983_5h6h8d9hKs_Tc9dQs6s_7c2dQc4c_2s5sJc3h_8sTd4h6d() {
    assertEquals(
      "2s5sJc3h 8sTd4h6d Tc9dQs6s 7c2dQc4c",
      Solver.process("omaha-holdem 5h6h8d9hKs Tc9dQs6s 7c2dQc4c 2s5sJc3h 8sTd4h6d"));
  }

  @Test
  public void test_omaha_holdem_8984_3c3h6c9hKs_Qd8cQc9s_5hQh5d4h_Ad7h2cJs_3s7cTsJh_6s4s5c4c_TdJc9dTh_6d6h7d8h_KhJdAsAc() {
    assertEquals(
      "Ad7h2cJs 5hQh5d4h 6s4s5c4c TdJc9dTh Qd8cQc9s KhJdAsAc 3s7cTsJh 6d6h7d8h",
      Solver.process("omaha-holdem 3c3h6c9hKs Qd8cQc9s 5hQh5d4h Ad7h2cJs 3s7cTsJh 6s4s5c4c TdJc9dTh 6d6h7d8h KhJdAsAc"));
  }

  @Test
  public void test_omaha_holdem_8985_3h5h6c9dTs_5s9c6s6h_QsJh8dKc() {
    assertEquals(
      "QsJh8dKc 5s9c6s6h",
      Solver.process("omaha-holdem 3h5h6c9dTs 5s9c6s6h QsJh8dKc"));
  }

  @Test
  public void test_omaha_holdem_8986_5d6d8sAsJh_4sThKs5h_9s5s6s6h_2s3sQcAh_2c8hKc4c_7dQh9h7h() {
    assertEquals(
      "4sThKs5h 2c8hKc4c 2s3sQcAh 9s5s6s6h 7dQh9h7h",
      Solver.process("omaha-holdem 5d6d8sAsJh 4sThKs5h 9s5s6s6h 2s3sQcAh 2c8hKc4c 7dQh9h7h"));
  }

  @Test
  public void test_omaha_holdem_8987_7h8d8h9dJs_2hQhTc6h_4dKd2cQd() {
    assertEquals(
      "4dKd2cQd 2hQhTc6h",
      Solver.process("omaha-holdem 7h8d8h9dJs 2hQhTc6h 4dKd2cQd"));
  }

  @Test
  public void test_omaha_holdem_8988_2s8cAsJcQs_9h7c9sAc_4dTc7s6h_TdJs2d5s_8d8sKc5h_Jd6dThKh_5dAh7dQh_Kd4cTs6s_3c2h3d9c() {
    assertEquals(
      "4dTc7s6h 3c2h3d9c 9h7c9sAc 5dAh7dQh 8d8sKc5h Jd6dThKh Kd4cTs6s TdJs2d5s",
      Solver.process("omaha-holdem 2s8cAsJcQs 9h7c9sAc 4dTc7s6h TdJs2d5s 8d8sKc5h Jd6dThKh 5dAh7dQh Kd4cTs6s 3c2h3d9c"));
  }

  @Test
  public void test_omaha_holdem_8989_2c3h5s6hJs_7h4h8cQc_Ah6sAc7c() {
    assertEquals(
      "Ah6sAc7c 7h4h8cQc",
      Solver.process("omaha-holdem 2c3h5s6hJs 7h4h8cQc Ah6sAc7c"));
  }

  @Test
  public void test_omaha_holdem_8990_8d9sAcAsTs_Jd8s8c6d_2sKdJsKh_3h7dQsQc() {
    assertEquals(
      "3h7dQsQc 2sKdJsKh Jd8s8c6d",
      Solver.process("omaha-holdem 8d9sAcAsTs Jd8s8c6d 2sKdJsKh 3h7dQsQc"));
  }

  @Test
  public void test_omaha_holdem_8991_3s6d6s8cQs_9c3dJh3c_5hKsKc5d_4cJs7s7h_7d2c2d8s_5cAc4d2s_TcAd8h7c_QdTsKhKd_JdAs2h9h_Td4h3hQh() {
    assertEquals(
      "5cAc4d2s JdAs2h9h 7d2c2d8s TcAd8h7c Td4h3hQh 5hKsKc5d=QdTsKhKd 4cJs7s7h 9c3dJh3c",
      Solver.process("omaha-holdem 3s6d6s8cQs 9c3dJh3c 5hKsKc5d 4cJs7s7h 7d2c2d8s 5cAc4d2s TcAd8h7c QdTsKhKd JdAs2h9h Td4h3hQh"));
  }

  @Test
  public void test_omaha_holdem_8992_6hAdAhJhTh_7h5dKh5s_3d3h7cKs_9s6s5h8s_4d2cQc9h_QdTdTc7s_TsKc6c2d_Js3c2h2s_Kd8d5c8c_9c3sAcAs() {
    assertEquals(
      "4d2cQc9h 3d3h7cKs 9s6s5h8s Kd8d5c8c TsKc6c2d Js3c2h2s 7h5dKh5s QdTdTc7s 9c3sAcAs",
      Solver.process("omaha-holdem 6hAdAhJhTh 7h5dKh5s 3d3h7cKs 9s6s5h8s 4d2cQc9h QdTdTc7s TsKc6c2d Js3c2h2s Kd8d5c8c 9c3sAcAs"));
  }

  @Test
  public void test_omaha_holdem_8993_2d3s4dAcJh_8d3cJc6s_3h4hQhKc_As9dTh2s_7cJs2h5c() {
    assertEquals(
      "3h4hQhKc 8d3cJc6s As9dTh2s 7cJs2h5c",
      Solver.process("omaha-holdem 2d3s4dAcJh 8d3cJc6s 3h4hQhKc As9dTh2s 7cJs2h5c"));
  }

  @Test
  public void test_omaha_holdem_8994_3d7s9cAhQs_6hJs7h5d_5sKd8hJd_Ks4s9s2h() {
    assertEquals(
      "5sKd8hJd 6hJs7h5d Ks4s9s2h",
      Solver.process("omaha-holdem 3d7s9cAhQs 6hJs7h5d 5sKd8hJd Ks4s9s2h"));
  }

  @Test
  public void test_omaha_holdem_8995_2d2s6dAhTd_JcKc8dQh_9hQs5d4c_8sQcAc3h_9c2cTcJs_7s6hAdQd_As4d5hKd() {
    assertEquals(
      "9hQs5d4c JcKc8dQh 8sQcAc3h As4d5hKd 7s6hAdQd 9c2cTcJs",
      Solver.process("omaha-holdem 2d2s6dAhTd JcKc8dQh 9hQs5d4c 8sQcAc3h 9c2cTcJs 7s6hAdQd As4d5hKd"));
  }

  @Test
  public void test_omaha_holdem_8996_5d6d8cJhQc_Ah5s2hQd_2d4sTd8s_3hJc4c2s_AdTc8d7s() {
    assertEquals(
      "2d4sTd8s AdTc8d7s 3hJc4c2s Ah5s2hQd",
      Solver.process("omaha-holdem 5d6d8cJhQc Ah5s2hQd 2d4sTd8s 3hJc4c2s AdTc8d7s"));
  }

  @Test
  public void test_omaha_holdem_8997_4s8cAhJcJd_KhQhKc7s_Td8d3dKs_3sJhTs9c_Ac7h2d8h() {
    assertEquals(
      "Td8d3dKs KhQhKc7s Ac7h2d8h 3sJhTs9c",
      Solver.process("omaha-holdem 4s8cAhJcJd KhQhKc7s Td8d3dKs 3sJhTs9c Ac7h2d8h"));
  }

  @Test
  public void test_omaha_holdem_8998_2d5sAhQhQs_7dKh8cQd_6c7hAsQc_AdJs9h8s_Ts5cKc3d_7c9d3h7s() {
    assertEquals(
      "Ts5cKc3d 7c9d3h7s AdJs9h8s 7dKh8cQd 6c7hAsQc",
      Solver.process("omaha-holdem 2d5sAhQhQs 7dKh8cQd 6c7hAsQc AdJs9h8s Ts5cKc3d 7c9d3h7s"));
  }

  @Test
  public void test_omaha_holdem_8999_3c4d8d8hQc_6cQh9dTc_6d9hQd4s_Js2sTsQs() {
    assertEquals(
      "6d9hQd4s 6cQh9dTc Js2sTsQs",
      Solver.process("omaha-holdem 3c4d8d8hQc 6cQh9dTc 6d9hQd4s Js2sTsQs"));
  }

}
