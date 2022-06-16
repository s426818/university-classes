
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver33HiddenTest {


  @Test
  public void test_omaha_holdem_8250_6c6s7c9dTs_AsAd3c8d_7d9s9c5s_Tc7h2d3s_KdQsThJh_8sJdQd6d_Jc8h3hKs_7sJs2h9h_5h4sQh4d_Kh4cAh2c() {
    assertEquals(
      "Kh4cAh2c 5h4sQh4d 7sJs2h9h KdQsThJh Tc7h2d3s AsAd3c8d 8sJdQd6d=Jc8h3hKs 7d9s9c5s",
      Solver.process("omaha-holdem 6c6s7c9dTs AsAd3c8d 7d9s9c5s Tc7h2d3s KdQsThJh 8sJdQd6d Jc8h3hKs 7sJs2h9h 5h4sQh4d Kh4cAh2c"));
  }

  @Test
  public void test_omaha_holdem_8251_2d2h3h5d7h_5hTcTsKc_ThKd3dAd_Js6hKsJc() {
    assertEquals(
      "ThKd3dAd 5hTcTsKc Js6hKsJc",
      Solver.process("omaha-holdem 2d2h3h5d7h 5hTcTsKc ThKd3dAd Js6hKsJc"));
  }

  @Test
  public void test_omaha_holdem_8252_3c3d4s9h9s_7dTc3sTh_5sJhAd2s_JcQd7c7s_2d6d9d8d_2c8s4dAh_2h5h6sKs_KcQsTdQc() {
    assertEquals(
      "2h5h6sKs 5sJhAd2s 2c8s4dAh JcQd7c7s KcQsTdQc 7dTc3sTh 2d6d9d8d",
      Solver.process("omaha-holdem 3c3d4s9h9s 7dTc3sTh 5sJhAd2s JcQd7c7s 2d6d9d8d 2c8s4dAh 2h5h6sKs KcQsTdQc"));
  }

  @Test
  public void test_omaha_holdem_8253_3s4hKdQdTc_9s3c4dKh_3d6d9h9d_4cKsAhKc_8s2hQhAc_5s5d2c3h_6h9c7s8c() {
    assertEquals(
      "6h9c7s8c 5s5d2c3h 3d6d9h9d 8s2hQhAc 9s3c4dKh 4cKsAhKc",
      Solver.process("omaha-holdem 3s4hKdQdTc 9s3c4dKh 3d6d9h9d 4cKsAhKc 8s2hQhAc 5s5d2c3h 6h9c7s8c"));
  }

  @Test
  public void test_omaha_holdem_8254_5h8d8hAdJs_Ac7s9cTh_7hKh5cTd_5d6dJcKd_2c6cJh2h_2s9h3h9s_QdJd6hQs() {
    assertEquals(
      "7hKh5cTd 2s9h3h9s 2c6cJh2h 5d6dJcKd QdJd6hQs Ac7s9cTh",
      Solver.process("omaha-holdem 5h8d8hAdJs Ac7s9cTh 7hKh5cTd 5d6dJcKd 2c6cJh2h 2s9h3h9s QdJd6hQs"));
  }

  @Test
  public void test_omaha_holdem_8255_5h8h9cAdTh_2s5c9sKd_4sJcKcJs_3h7h6h9d_7d2c6cQs_Qc3sQd6d_4cAcQh4d_7cAsAh3d() {
    assertEquals(
      "4sJcKcJs Qc3sQd6d 4cAcQh4d 2s5c9sKd 7cAsAh3d 7d2c6cQs 3h7h6h9d",
      Solver.process("omaha-holdem 5h8h9cAdTh 2s5c9sKd 4sJcKcJs 3h7h6h9d 7d2c6cQs Qc3sQd6d 4cAcQh4d 7cAsAh3d"));
  }

  @Test
  public void test_omaha_holdem_8256_4s5s9dAdKc_AcTc7cQh_3d8c8hQc() {
    assertEquals(
      "3d8c8hQc AcTc7cQh",
      Solver.process("omaha-holdem 4s5s9dAdKc AcTc7cQh 3d8c8hQc"));
  }

  @Test
  public void test_omaha_holdem_8257_2d6h9cJdTc_6d8d4h4s_7sAhAs8c() {
    assertEquals(
      "6d8d4h4s 7sAhAs8c",
      Solver.process("omaha-holdem 2d6h9cJdTc 6d8d4h4s 7sAhAs8c"));
  }

  @Test
  public void test_omaha_holdem_8258_4c5c5d9cKs_6sKcQcTh_3cJh9d4d_7hKdQd2s_3s9sAh3h_Ts5s2h6c_7s2d4sTd_2cTc8h5h_Jc8dAsQh() {
    assertEquals(
      "Jc8dAsQh 7s2d4sTd 3cJh9d4d 3s9sAh3h 7hKdQd2s Ts5s2h6c 2cTc8h5h 6sKcQcTh",
      Solver.process("omaha-holdem 4c5c5d9cKs 6sKcQcTh 3cJh9d4d 7hKdQd2s 3s9sAh3h Ts5s2h6c 7s2d4sTd 2cTc8h5h Jc8dAsQh"));
  }

  @Test
  public void test_omaha_holdem_8259_4d4h6s9hKs_Kc6h3h8s_JsJc9c7c_9d4sJhJd() {
    assertEquals(
      "JsJc9c7c Kc6h3h8s 9d4sJhJd",
      Solver.process("omaha-holdem 4d4h6s9hKs Kc6h3h8s JsJc9c7c 9d4sJhJd"));
  }

  @Test
  public void test_omaha_holdem_8260_2sAcKdQsTh_4d9h8cQc_7h2h9s5d_AhQdQh3c_4h6d4c6c_4s5h7c7s() {
    assertEquals(
      "7h2h9s5d 4h6d4c6c 4s5h7c7s 4d9h8cQc AhQdQh3c",
      Solver.process("omaha-holdem 2sAcKdQsTh 4d9h8cQc 7h2h9s5d AhQdQh3c 4h6d4c6c 4s5h7c7s"));
  }

  @Test
  public void test_omaha_holdem_8261_2s4d6dAsJc_2c9s2d5d_5c7hQs6h_QcTcAd8s_4c8cTs7c() {
    assertEquals(
      "4c8cTs7c 5c7hQs6h QcTcAd8s 2c9s2d5d",
      Solver.process("omaha-holdem 2s4d6dAsJc 2c9s2d5d 5c7hQs6h QcTcAd8s 4c8cTs7c"));
  }

  @Test
  public void test_omaha_holdem_8262_6hAcJhJsTh_KdTcAd5d_7hKh4cQd_9c3hJd2c_6d6sTsQh() {
    assertEquals(
      "KdTcAd5d 9c3hJd2c 7hKh4cQd 6d6sTsQh",
      Solver.process("omaha-holdem 6hAcJhJsTh KdTcAd5d 7hKh4cQd 9c3hJd2c 6d6sTsQh"));
  }

  @Test
  public void test_omaha_holdem_8263_7h8hJcJdTd_Kd2d3d7c_Kh2s3hTc_7d6c3s6h() {
    assertEquals(
      "7d6c3s6h Kd2d3d7c Kh2s3hTc",
      Solver.process("omaha-holdem 7h8hJcJdTd Kd2d3d7c Kh2s3hTc 7d6c3s6h"));
  }

  @Test
  public void test_omaha_holdem_8264_2c2h4c6sKs_9c8cJhKh_7sAd2s3h_4hQdTsAc() {
    assertEquals(
      "4hQdTsAc 9c8cJhKh 7sAd2s3h",
      Solver.process("omaha-holdem 2c2h4c6sKs 9c8cJhKh 7sAd2s3h 4hQdTsAc"));
  }

  @Test
  public void test_omaha_holdem_8265_3h6c7c9sJc_7h5sTc7s_5c8h2d2s() {
    assertEquals(
      "7h5sTc7s 5c8h2d2s",
      Solver.process("omaha-holdem 3h6c7c9sJc 7h5sTc7s 5c8h2d2s"));
  }

  @Test
  public void test_omaha_holdem_8266_5s6d7c7sTh_Kc5h6c8h_8c2dAc8s_KhQcQhTd_2cQs4s6h() {
    assertEquals(
      "2cQs4s6h Kc5h6c8h 8c2dAc8s KhQcQhTd",
      Solver.process("omaha-holdem 5s6d7c7sTh Kc5h6c8h 8c2dAc8s KhQcQhTd 2cQs4s6h"));
  }

  @Test
  public void test_omaha_holdem_8267_5d7c8dJcKh_8s2c7s9c_KcAdAsTh_Qc2d2h3s_Ac3dKs4c_9hKd9sQs() {
    assertEquals(
      "Qc2d2h3s 9hKd9sQs Ac3dKs4c KcAdAsTh 8s2c7s9c",
      Solver.process("omaha-holdem 5d7c8dJcKh 8s2c7s9c KcAdAsTh Qc2d2h3s Ac3dKs4c 9hKd9sQs"));
  }

  @Test
  public void test_omaha_holdem_8268_3d8c9hKsQd_9s6c5sKd_KhThAcAd_2sTd3c2h_QhJd8h3h_Kc5h4hJs_Ah3s8s5d() {
    assertEquals(
      "2sTd3c2h Kc5h4hJs KhThAcAd Ah3s8s5d QhJd8h3h 9s6c5sKd",
      Solver.process("omaha-holdem 3d8c9hKsQd 9s6c5sKd KhThAcAd 2sTd3c2h QhJd8h3h Kc5h4hJs Ah3s8s5d"));
  }

  @Test
  public void test_omaha_holdem_8269_3h5h6sAhKd_6c4d3d4c_2c9hJs7h_8cJcQd4h_ThKh2sAd() {
    assertEquals(
      "8cJcQd4h 6c4d3d4c 2c9hJs7h ThKh2sAd",
      Solver.process("omaha-holdem 3h5h6sAhKd 6c4d3d4c 2c9hJs7h 8cJcQd4h ThKh2sAd"));
  }

  @Test
  public void test_omaha_holdem_8270_4d5d7d8hQc_9c5s4h7c_6s2dTc2s_KhKdKcAc() {
    assertEquals(
      "6s2dTc2s KhKdKcAc 9c5s4h7c",
      Solver.process("omaha-holdem 4d5d7d8hQc 9c5s4h7c 6s2dTc2s KhKdKcAc"));
  }

  @Test
  public void test_omaha_holdem_8271_6h6s7c8cJd_4s8d5h3h_4h9dTd2h_8s9h6cQs_3d5cJh4c_7dTc3s4d_KcQd9sTh_7sJsAs6d() {
    assertEquals(
      "7dTc3s4d 3d5cJh4c=4s8d5h3h 4h9dTd2h=KcQd9sTh 8s9h6cQs 7sJsAs6d",
      Solver.process("omaha-holdem 6h6s7c8cJd 4s8d5h3h 4h9dTd2h 8s9h6cQs 3d5cJh4c 7dTc3s4d KcQd9sTh 7sJsAs6d"));
  }

  @Test
  public void test_omaha_holdem_8272_2c3s9c9dKh_8sAc3h5s_5hTd4d8c_7cTs7hJs_5c6hJdQd_3d7d6cAs_5d7s4hKc_Ks3cTc9h() {
    assertEquals(
      "5hTd4d8c 5c6hJdQd 3d7d6cAs=8sAc3h5s 7cTs7hJs 5d7s4hKc Ks3cTc9h",
      Solver.process("omaha-holdem 2c3s9c9dKh 8sAc3h5s 5hTd4d8c 7cTs7hJs 5c6hJdQd 3d7d6cAs 5d7s4hKc Ks3cTc9h"));
  }

  @Test
  public void test_omaha_holdem_8273_3s4s5h6dQc_Ks9s8c4d_2s7d7s6h_Jc7cQhAs_Ac8h9hTh_8s8dTs7h_Tc6c9dKd_3dJd5sKh() {
    assertEquals(
      "Ac8h9hTh Ks9s8c4d Tc6c9dKd Jc7cQhAs 3dJd5sKh 2s7d7s6h 8s8dTs7h",
      Solver.process("omaha-holdem 3s4s5h6dQc Ks9s8c4d 2s7d7s6h Jc7cQhAs Ac8h9hTh 8s8dTs7h Tc6c9dKd 3dJd5sKh"));
  }

  @Test
  public void test_omaha_holdem_8274_2h7cJsQdQs_8dJd7d5c_8hKhJc4s_3hTc6s7h_6dKcTsKd_Td6h5h2s_QhAd5s9h_5d8cKs9s() {
    assertEquals(
      "5d8cKs9s Td6h5h2s 3hTc6s7h 8dJd7d5c 8hKhJc4s 6dKcTsKd QhAd5s9h",
      Solver.process("omaha-holdem 2h7cJsQdQs 8dJd7d5c 8hKhJc4s 3hTc6s7h 6dKcTsKd Td6h5h2s QhAd5s9h 5d8cKs9s"));
  }

  @Test
  public void test_omaha_holdem_8275_3h4h5sJcTd_KdKc7cQd_6d9c4cKh_2dTs8d6s_As2c5d3d_8cJd6hTc_8s3s9s2s_Jh2h9dAd_Th6cJs4d_8hKs7hQc() {
    assertEquals(
      "8hKs7hQc 8s3s9s2s 6d9c4cKh KdKc7cQd 8cJd6hTc=Th6cJs4d As2c5d3d=Jh2h9dAd 2dTs8d6s",
      Solver.process("omaha-holdem 3h4h5sJcTd KdKc7cQd 6d9c4cKh 2dTs8d6s As2c5d3d 8cJd6hTc 8s3s9s2s Jh2h9dAd Th6cJs4d 8hKs7hQc"));
  }

  @Test
  public void test_omaha_holdem_8276_3h4cJcJdKh_Js8s5dTh_9dAc8h3s() {
    assertEquals(
      "9dAc8h3s Js8s5dTh",
      Solver.process("omaha-holdem 3h4cJcJdKh Js8s5dTh 9dAc8h3s"));
  }

  @Test
  public void test_omaha_holdem_8277_3d4s5c5dQd_AsQsTd8d_8s9s3s2s_Kd7s3cTc_8h4dKs9h() {
    assertEquals(
      "8s9s3s2s Kd7s3cTc 8h4dKs9h AsQsTd8d",
      Solver.process("omaha-holdem 3d4s5c5dQd AsQsTd8d 8s9s3s2s Kd7s3cTc 8h4dKs9h"));
  }

  @Test
  public void test_omaha_holdem_8278_3d5c9hKhTh_Qs7c4dQc_Jd8sAh7s_6h8dQdJs_Kc2dKd4s_8h7h2c3s() {
    assertEquals(
      "Jd8sAh7s Qs7c4dQc Kc2dKd4s 6h8dQdJs 8h7h2c3s",
      Solver.process("omaha-holdem 3d5c9hKhTh Qs7c4dQc Jd8sAh7s 6h8dQdJs Kc2dKd4s 8h7h2c3s"));
  }

  @Test
  public void test_omaha_holdem_8279_2c4c6h7s8d_5cKd2s4s_Qc4hQs7d_Qh8cAh6d_7h3h3d9s() {
    assertEquals(
      "7h3h3d9s Qc4hQs7d Qh8cAh6d 5cKd2s4s",
      Solver.process("omaha-holdem 2c4c6h7s8d 5cKd2s4s Qc4hQs7d Qh8cAh6d 7h3h3d9s"));
  }

  @Test
  public void test_omaha_holdem_8280_3c3s4d6d8h_Qd5cJh6h_8s2cTd5s_6s2s9d4s_KcQh3hKh_8dJsAs4c() {
    assertEquals(
      "Qd5cJh6h 6s2s9d4s 8dJsAs4c KcQh3hKh 8s2cTd5s",
      Solver.process("omaha-holdem 3c3s4d6d8h Qd5cJh6h 8s2cTd5s 6s2s9d4s KcQh3hKh 8dJsAs4c"));
  }

  @Test
  public void test_omaha_holdem_8281_6h7s8d9dTs_Kd4s7d5c_4c9c9s3h_Th7cQdJh_Kc8c8h3c_2d4h6sAs_QhTdJcJd() {
    assertEquals(
      "2d4h6sAs Kc8c8h3c 4c9c9s3h Kd4s7d5c QhTdJcJd=Th7cQdJh",
      Solver.process("omaha-holdem 6h7s8d9dTs Kd4s7d5c 4c9c9s3h Th7cQdJh Kc8c8h3c 2d4h6sAs QhTdJcJd"));
  }

  @Test
  public void test_omaha_holdem_8282_6d7s9cAsJh_4h4cQh4s_Kh3d8dKc_Qc6sKs5h_4d5d3c9h_7c2sJc8c() {
    assertEquals(
      "4h4cQh4s Qc6sKs5h 4d5d3c9h Kh3d8dKc 7c2sJc8c",
      Solver.process("omaha-holdem 6d7s9cAsJh 4h4cQh4s Kh3d8dKc Qc6sKs5h 4d5d3c9h 7c2sJc8c"));
  }

  @Test
  public void test_omaha_holdem_8283_6c6h8sAdJd_5s3cKc8h_Qd5h2h6d_7h4d9cJc_2c9d7cAs_2dQc5c3h_3dTs7dTd_KdJs4c5d_Ks9s8d4s() {
    assertEquals(
      "2dQc5c3h 5s3cKc8h=Ks9s8d4s 3dTs7dTd 7h4d9cJc KdJs4c5d 2c9d7cAs Qd5h2h6d",
      Solver.process("omaha-holdem 6c6h8sAdJd 5s3cKc8h Qd5h2h6d 7h4d9cJc 2c9d7cAs 2dQc5c3h 3dTs7dTd KdJs4c5d Ks9s8d4s"));
  }

  @Test
  public void test_omaha_holdem_8284_2s7s9sAdTs_8s6cJd4c_Ks4h9hJc() {
    assertEquals(
      "Ks4h9hJc 8s6cJd4c",
      Solver.process("omaha-holdem 2s7s9sAdTs 8s6cJd4c Ks4h9hJc"));
  }

  @Test
  public void test_omaha_holdem_8285_2s3c3s7cQc_6cAd4s2d_8hQh9sQd() {
    assertEquals(
      "6cAd4s2d 8hQh9sQd",
      Solver.process("omaha-holdem 2s3c3s7cQc 6cAd4s2d 8hQh9sQd"));
  }

  @Test
  public void test_omaha_holdem_8286_2c4s6h7cAd_2d5s3cTs_Td6sJhKd_2hAs7d7h_Qh8dAhAc_JdKc9h2s_4cJs3s4d_KsTcQs3h_9c8sTh8h() {
    assertEquals(
      "KsTcQs3h JdKc9h2s Td6sJhKd 9c8sTh8h 4cJs3s4d 2hAs7d7h Qh8dAhAc 2d5s3cTs",
      Solver.process("omaha-holdem 2c4s6h7cAd 2d5s3cTs Td6sJhKd 2hAs7d7h Qh8dAhAc JdKc9h2s 4cJs3s4d KsTcQs3h 9c8sTh8h"));
  }

  @Test
  public void test_omaha_holdem_8287_2h4d7s8d9c_Kd6c8s7d_3h5s4hQd_Td5dKs8h_AcTcJh3s_JsQsThKc_4sAs3cJc_6h5c6dQh_7hQc3dKh_9d4c7cTs() {
    assertEquals(
      "3h5s4hQd 4sAs3cJc 7hQc3dKh Td5dKs8h Kd6c8s7d 9d4c7cTs 6h5c6dQh AcTcJh3s=JsQsThKc",
      Solver.process("omaha-holdem 2h4d7s8d9c Kd6c8s7d 3h5s4hQd Td5dKs8h AcTcJh3s JsQsThKc 4sAs3cJc 6h5c6dQh 7hQc3dKh 9d4c7cTs"));
  }

  @Test
  public void test_omaha_holdem_8288_3hAhKdQcQh_Kh5d3s2c_4s4c8cAs_5c2d8s2h_8hKsJc7h_Jd3c6dJs_6sJh9h7c_9c4d6h8d() {
    assertEquals(
      "9c4d6h8d 5c2d8s2h Jd3c6dJs Kh5d3s2c 4s4c8cAs 8hKsJc7h 6sJh9h7c",
      Solver.process("omaha-holdem 3hAhKdQcQh Kh5d3s2c 4s4c8cAs 5c2d8s2h 8hKsJc7h Jd3c6dJs 6sJh9h7c 9c4d6h8d"));
  }

  @Test
  public void test_omaha_holdem_8289_2h7d7h8c8s_Jd9c2sAc_6d7c2cQd() {
    assertEquals(
      "Jd9c2sAc 6d7c2cQd",
      Solver.process("omaha-holdem 2h7d7h8c8s Jd9c2sAc 6d7c2cQd"));
  }

  @Test
  public void test_omaha_holdem_8290_3d3s6d7dTh_6c9cAcJs_8hKh7c8c_4cJhQh3h_TsKdJd4h_5d4d6sQs_2s7s3c8s_As5s4s2h_9hKs6h5h_TcAhTd2c() {
    assertEquals(
      "9hKs6h5h 6c9cAcJs 8hKh7c8c 4cJhQh3h As5s4s2h TsKdJd4h 2s7s3c8s TcAhTd2c 5d4d6sQs",
      Solver.process("omaha-holdem 3d3s6d7dTh 6c9cAcJs 8hKh7c8c 4cJhQh3h TsKdJd4h 5d4d6sQs 2s7s3c8s As5s4s2h 9hKs6h5h TcAhTd2c"));
  }

  @Test
  public void test_omaha_holdem_8291_5c7s8cAhTc_9d4s6hJh_8sTd6dAd_2d8d3hQs_Ks7h9s8h_Kh3dJd9c_2c4dTh5d_As5hJs4c_Ts3cQhKc() {
    assertEquals(
      "2d8d3hQs Ks7h9s8h 2c4dTh5d As5hJs4c 8sTd6dAd 9d4s6hJh=Kh3dJd9c Ts3cQhKc",
      Solver.process("omaha-holdem 5c7s8cAhTc 9d4s6hJh 8sTd6dAd 2d8d3hQs Ks7h9s8h Kh3dJd9c 2c4dTh5d As5hJs4c Ts3cQhKc"));
  }

  @Test
  public void test_omaha_holdem_8292_5d7d8dAsJd_9h6d5s8c_AdKsTsTc_7cKc4cKh_QdTh2s2h_3s9s8h2c_3cQcJhAh() {
    assertEquals(
      "QdTh2s2h 3s9s8h2c 7cKc4cKh AdKsTsTc 3cQcJhAh 9h6d5s8c",
      Solver.process("omaha-holdem 5d7d8dAsJd 9h6d5s8c AdKsTsTc 7cKc4cKh QdTh2s2h 3s9s8h2c 3cQcJhAh"));
  }

  @Test
  public void test_omaha_holdem_8293_4h6c7c7dTd_2d9dKd2h_QcTsJc6d() {
    assertEquals(
      "2d9dKd2h QcTsJc6d",
      Solver.process("omaha-holdem 4h6c7c7dTd 2d9dKd2h QcTsJc6d"));
  }

  @Test
  public void test_omaha_holdem_8294_3h6d9sJdKd_Qh7h9h4h_7s8c6s9c_AhJh9d6c_TdKs5s4s() {
    assertEquals(
      "Qh7h9h4h TdKs5s4s 7s8c6s9c AhJh9d6c",
      Solver.process("omaha-holdem 3h6d9sJdKd Qh7h9h4h 7s8c6s9c AhJh9d6c TdKs5s4s"));
  }

  @Test
  public void test_omaha_holdem_8295_5s7d8hJhTs_AdQc5dAs_3s7h4s8c_2sQsTd6s_2h8s7s2c_5hAcKh4h_9cThAh9d_9sJs3c6c_JdTc9h3d_Kc4c5c6d() {
    assertEquals(
      "5hAcKh4h 2sQsTd6s AdQc5dAs 2h8s7s2c=3s7h4s8c Kc4c5c6d 9cThAh9d=9sJs3c6c=JdTc9h3d",
      Solver.process("omaha-holdem 5s7d8hJhTs AdQc5dAs 3s7h4s8c 2sQsTd6s 2h8s7s2c 5hAcKh4h 9cThAh9d 9sJs3c6c JdTc9h3d Kc4c5c6d"));
  }

  @Test
  public void test_omaha_holdem_8296_2d5cJsQsTh_TcJc6c2h_Kh3d9d8s() {
    assertEquals(
      "TcJc6c2h Kh3d9d8s",
      Solver.process("omaha-holdem 2d5cJsQsTh TcJc6c2h Kh3d9d8s"));
  }

  @Test
  public void test_omaha_holdem_8297_3d5h6cJhQs_3hKc2sAc_5cKd2d6s_Ad7c6d4d_KsAh4h3c_QdKh6h3s_9d7s8c7h_TsQc8s2h_TcQh4c5s() {
    assertEquals(
      "3hKc2sAc=KsAh4h3c 9d7s8c7h TsQc8s2h 5cKd2d6s TcQh4c5s QdKh6h3s Ad7c6d4d",
      Solver.process("omaha-holdem 3d5h6cJhQs 3hKc2sAc 5cKd2d6s Ad7c6d4d KsAh4h3c QdKh6h3s 9d7s8c7h TsQc8s2h TcQh4c5s"));
  }

  @Test
  public void test_omaha_holdem_8298_5s6h6s8dJh_QhAd5dKd_QcQs7s3h_3cTcJc7h() {
    assertEquals(
      "QhAd5dKd 3cTcJc7h QcQs7s3h",
      Solver.process("omaha-holdem 5s6h6s8dJh QhAd5dKd QcQs7s3h 3cTcJc7h"));
  }

  @Test
  public void test_omaha_holdem_8299_2d6s9hJcTs_Kh3d5s9d_2hJd6c6h_AcQhTcKd_9sKc7d4h() {
    assertEquals(
      "9sKc7d4h=Kh3d5s9d 2hJd6c6h AcQhTcKd",
      Solver.process("omaha-holdem 2d6s9hJcTs Kh3d5s9d 2hJd6c6h AcQhTcKd 9sKc7d4h"));
  }

  @Test
  public void test_omaha_holdem_8300_3s5h6h8dQh_Js3h9s3c_Th7c2c8h_5d4c7hKh_2d4s6dAh_2s8sKsKd_Jd7sQs9d_6sQcJhAs() {
    assertEquals(
      "2s8sKsKd 6sQcJhAs Js3h9s3c 2d4s6dAh Jd7sQs9d Th7c2c8h 5d4c7hKh",
      Solver.process("omaha-holdem 3s5h6h8dQh Js3h9s3c Th7c2c8h 5d4c7hKh 2d4s6dAh 2s8sKsKd Jd7sQs9d 6sQcJhAs"));
  }

  @Test
  public void test_omaha_holdem_8301_2s3s4s5sQd_5c7s9c3c_4d2d4h2h_6c7hQcJs_QhTd8sAc_Jc6h9d3d_TsKc3h5h_AsQs5d8h() {
    assertEquals(
      "QhTd8sAc 5c7s9c3c=TsKc3h5h 4d2d4h2h Jc6h9d3d 6c7hQcJs AsQs5d8h",
      Solver.process("omaha-holdem 2s3s4s5sQd 5c7s9c3c 4d2d4h2h 6c7hQcJs QhTd8sAc Jc6h9d3d TsKc3h5h AsQs5d8h"));
  }

  @Test
  public void test_omaha_holdem_8302_2c6s7d7hKd_AdKc2h4d_7sJc9sTs() {
    assertEquals(
      "AdKc2h4d 7sJc9sTs",
      Solver.process("omaha-holdem 2c6s7d7hKd AdKc2h4d 7sJc9sTs"));
  }

  @Test
  public void test_omaha_holdem_8303_3c3dKcKhQh_6h2s5c8d_4c5s7hAh_ThTdQd9d_4hJhJsQs() {
    assertEquals(
      "6h2s5c8d 4c5s7hAh ThTdQd9d 4hJhJsQs",
      Solver.process("omaha-holdem 3c3dKcKhQh 6h2s5c8d 4c5s7hAh ThTdQd9d 4hJhJsQs"));
  }

  @Test
  public void test_omaha_holdem_8304_5d8sAhQhTc_KhTh8cJh_Qc8h6c2h_Ks6d7c3c() {
    assertEquals(
      "Ks6d7c3c Qc8h6c2h KhTh8cJh",
      Solver.process("omaha-holdem 5d8sAhQhTc KhTh8cJh Qc8h6c2h Ks6d7c3c"));
  }

  @Test
  public void test_omaha_holdem_8305_6c6s9hQhTh_8cKd7h9s_7cJc3hTd_4d2hJd4s_JhKs4c7d_TsAd6h3d() {
    assertEquals(
      "4d2hJd4s 7cJc3hTd 8cKd7h9s JhKs4c7d TsAd6h3d",
      Solver.process("omaha-holdem 6c6s9hQhTh 8cKd7h9s 7cJc3hTd 4d2hJd4s JhKs4c7d TsAd6h3d"));
  }

  @Test
  public void test_omaha_holdem_8306_5h8sAhTdTs_Tc9sAdQs_4hKd2hKh_4dQd9h6s_4c2s2dJc_Jh5dQh8h_6dTh2c9c() {
    assertEquals(
      "4dQd9h6s 4c2s2dJc Jh5dQh8h 4hKd2hKh 6dTh2c9c Tc9sAdQs",
      Solver.process("omaha-holdem 5h8sAhTdTs Tc9sAdQs 4hKd2hKh 4dQd9h6s 4c2s2dJc Jh5dQh8h 6dTh2c9c"));
  }

  @Test
  public void test_omaha_holdem_8307_2c3cAcKsTs_3sKh4sKd_8dQs6c7s_7hJs6d5d_2hAh7d8h_2sJdJhQh_QdTc6hTh_5h8s6s3h() {
    assertEquals(
      "7hJs6d5d 8dQs6c7s 5h8s6s3h 2hAh7d8h QdTc6hTh 3sKh4sKd 2sJdJhQh",
      Solver.process("omaha-holdem 2c3cAcKsTs 3sKh4sKd 8dQs6c7s 7hJs6d5d 2hAh7d8h 2sJdJhQh QdTc6hTh 5h8s6s3h"));
  }

  @Test
  public void test_omaha_holdem_8308_3h8h9dJdJs_Ts2d8sAs_5h6s3cJh_9h5c4c2s_KdJcAcQd_Ah9cTdKc() {
    assertEquals(
      "Ts2d8sAs 9h5c4c2s Ah9cTdKc KdJcAcQd 5h6s3cJh",
      Solver.process("omaha-holdem 3h8h9dJdJs Ts2d8sAs 5h6s3cJh 9h5c4c2s KdJcAcQd Ah9cTdKc"));
  }

  @Test
  public void test_omaha_holdem_8309_5c9dKsQhTc_7cAc9s3s_7h7s8s5d_2s8hQsTs_3dQd6c8d() {
    assertEquals(
      "7h7s8s5d 7cAc9s3s 3dQd6c8d 2s8hQsTs",
      Solver.process("omaha-holdem 5c9dKsQhTc 7cAc9s3s 7h7s8s5d 2s8hQsTs 3dQd6c8d"));
  }

  @Test
  public void test_omaha_holdem_8310_2d6c6hAsKc_ThAd3s7s_Td5h3hTc_6s5d9h3c_Js4h8d7h_8sAh9dJc() {
    assertEquals(
      "Js4h8d7h Td5h3hTc ThAd3s7s 8sAh9dJc 6s5d9h3c",
      Solver.process("omaha-holdem 2d6c6hAsKc ThAd3s7s Td5h3hTc 6s5d9h3c Js4h8d7h 8sAh9dJc"));
  }

  @Test
  public void test_omaha_holdem_8311_3d4h7hQdTd_8hQh6h2h_6sAsKc9s_AhKh8s9c_Jc4sQsKs() {
    assertEquals(
      "6sAsKc9s=AhKh8s9c 8hQh6h2h Jc4sQsKs",
      Solver.process("omaha-holdem 3d4h7hQdTd 8hQh6h2h 6sAsKc9s AhKh8s9c Jc4sQsKs"));
  }

  @Test
  public void test_omaha_holdem_8312_5c7hAsKhTh_TsAd2s9h_6cTdQd2h() {
    assertEquals(
      "6cTdQd2h TsAd2s9h",
      Solver.process("omaha-holdem 5c7hAsKhTh TsAd2s9h 6cTdQd2h"));
  }

  @Test
  public void test_omaha_holdem_8313_2c3s4d6cJd_2d3d7h8h_9sAsQd4h_7c7s7d9d() {
    assertEquals(
      "9sAsQd4h 7c7s7d9d 2d3d7h8h",
      Solver.process("omaha-holdem 2c3s4d6cJd 2d3d7h8h 9sAsQd4h 7c7s7d9d"));
  }

  @Test
  public void test_omaha_holdem_8314_3h4d9hQcQs_JsKsTh8s_5dQh8d7s_2s9c9d4c() {
    assertEquals(
      "JsKsTh8s 5dQh8d7s 2s9c9d4c",
      Solver.process("omaha-holdem 3h4d9hQcQs JsKsTh8s 5dQh8d7s 2s9c9d4c"));
  }

  @Test
  public void test_omaha_holdem_8315_2d3h7sKcTh_4h2c4d9h_Ah5d7h7c_Kh8h3c6h_7dQcJhJc_8s2h6cAs_3dTcKd5s_8cJs9sTs_4cJdAc5c() {
    assertEquals(
      "4cJdAc5c 8s2h6cAs 4h2c4d9h 8cJs9sTs 7dQcJhJc Kh8h3c6h 3dTcKd5s Ah5d7h7c",
      Solver.process("omaha-holdem 2d3h7sKcTh 4h2c4d9h Ah5d7h7c Kh8h3c6h 7dQcJhJc 8s2h6cAs 3dTcKd5s 8cJs9sTs 4cJdAc5c"));
  }

  @Test
  public void test_omaha_holdem_8316_6c9cKcQhQs_2h3sJdTs_Kd5c8s8d_4d9s6h6s_6d3hJsAc_8cAhAdKh_Td7h3cAs_Ks2s8h5s() {
    assertEquals(
      "Td7h3cAs 6d3hJsAc Kd5c8s8d=Ks2s8h5s 8cAhAdKh 2h3sJdTs 4d9s6h6s",
      Solver.process("omaha-holdem 6c9cKcQhQs 2h3sJdTs Kd5c8s8d 4d9s6h6s 6d3hJsAc 8cAhAdKh Td7h3cAs Ks2s8h5s"));
  }

  @Test
  public void test_omaha_holdem_8317_2s3c5h9cKs_QdAs5c2d_9hJdThJs_Jc3h4c6d() {
    assertEquals(
      "9hJdThJs QdAs5c2d Jc3h4c6d",
      Solver.process("omaha-holdem 2s3c5h9cKs QdAs5c2d 9hJdThJs Jc3h4c6d"));
  }

  @Test
  public void test_omaha_holdem_8318_5h9dJhQhTh_8c9h7s3d_Qd9sKcAs_TsQsJs8s_6c3cQc7d_7hJc6h5c_2c5d2s2h_8hJd4hKs_Ac9c3s4c_Ah4d8d4s() {
    assertEquals(
      "Ah4d8d4s 2c5d2s2h Ac9c3s4c 6c3cQc7d 8c9h7s3d=TsQsJs8s Qd9sKcAs 7hJc6h5c 8hJd4hKs",
      Solver.process("omaha-holdem 5h9dJhQhTh 8c9h7s3d Qd9sKcAs TsQsJs8s 6c3cQc7d 7hJc6h5c 2c5d2s2h 8hJd4hKs Ac9c3s4c Ah4d8d4s"));
  }

  @Test
  public void test_omaha_holdem_8319_4h5h8sAsQd_8d3d9s2s_Kh2hAc8c_3sQs5d5c_4c6c2d3c_4s8h5sQh_Ks2cTdAd_KcTcKdTh() {
    assertEquals(
      "KcTcKdTh Ks2cTdAd 4s8h5sQh Kh2hAc8c 3sQs5d5c 4c6c2d3c=8d3d9s2s",
      Solver.process("omaha-holdem 4h5h8sAsQd 8d3d9s2s Kh2hAc8c 3sQs5d5c 4c6c2d3c 4s8h5sQh Ks2cTdAd KcTcKdTh"));
  }

  @Test
  public void test_omaha_holdem_8320_2c4c8dJdKh_7c3cKc5c_AcQh5s4s() {
    assertEquals(
      "AcQh5s4s 7c3cKc5c",
      Solver.process("omaha-holdem 2c4c8dJdKh 7c3cKc5c AcQh5s4s"));
  }

  @Test
  public void test_omaha_holdem_8321_6d8hJdKhTc_2hQs7d4c_Qc6h9s8c_TdQh3dAs_9h7c3h5s_4h8dKs4d() {
    assertEquals(
      "2hQs7d4c 4h8dKs4d 9h7c3h5s Qc6h9s8c TdQh3dAs",
      Solver.process("omaha-holdem 6d8hJdKhTc 2hQs7d4c Qc6h9s8c TdQh3dAs 9h7c3h5s 4h8dKs4d"));
  }

  @Test
  public void test_omaha_holdem_8322_5s8c9dAcJd_6d7hTcAh_Td4h7d5h_6s2h8s4d_JhThQs3c() {
    assertEquals(
      "6s2h8s4d 6d7hTcAh=Td4h7d5h JhThQs3c",
      Solver.process("omaha-holdem 5s8c9dAcJd 6d7hTcAh Td4h7d5h 6s2h8s4d JhThQs3c"));
  }

  @Test
  public void test_omaha_holdem_8323_6h7h8hJcJh_Ts5d3d7s_Qd8sTd5h_7dThQh9h_Jd9d6s5c_6cJsQc3s_2c4hKhTc_3cAd8d9c_4c5sKsAs() {
    assertEquals(
      "Ts5d3d7s Qd8sTd5h 3cAd8d9c 4c5sKsAs 2c4hKhTc 6cJsQc3s=Jd9d6s5c 7dThQh9h",
      Solver.process("omaha-holdem 6h7h8hJcJh Ts5d3d7s Qd8sTd5h 7dThQh9h Jd9d6s5c 6cJsQc3s 2c4hKhTc 3cAd8d9c 4c5sKsAs"));
  }

  @Test
  public void test_omaha_holdem_8324_3d3s4s8cJc_JhKc3c9s_2s8hJdAd_9c7s5s6h_Td7cKs3h_8d8sTc5h() {
    assertEquals(
      "9c7s5s6h 2s8hJdAd Td7cKs3h JhKc3c9s 8d8sTc5h",
      Solver.process("omaha-holdem 3d3s4s8cJc JhKc3c9s 2s8hJdAd 9c7s5s6h Td7cKs3h 8d8sTc5h"));
  }

  @Test
  public void test_omaha_holdem_8325_5dAcAdTcTd_QsKd5h6c_Ts5c5sQh_7s9c4sQd_7h4c8dTh_2c3cJs2s_2d9hQcJh() {
    assertEquals(
      "7s9c4sQd 2d9hQcJh 2c3cJs2s QsKd5h6c 7h4c8dTh Ts5c5sQh",
      Solver.process("omaha-holdem 5dAcAdTcTd QsKd5h6c Ts5c5sQh 7s9c4sQd 7h4c8dTh 2c3cJs2s 2d9hQcJh"));
  }

  @Test
  public void test_omaha_holdem_8326_2c3h9dAsJc_3s5s9sKh_QcKc6c4d_Ks2hQs2d_8h4s8c5d_3d6d4cQd_Js5cKd9c_Qh7h7sTh_Ad4hTd7d_2sJh3cAc() {
    assertEquals(
      "QcKc6c4d 3d6d4cQd Qh7h7sTh Ad4hTd7d 3s5s9sKh Js5cKd9c 2sJh3cAc Ks2hQs2d 8h4s8c5d",
      Solver.process("omaha-holdem 2c3h9dAsJc 3s5s9sKh QcKc6c4d Ks2hQs2d 8h4s8c5d 3d6d4cQd Js5cKd9c Qh7h7sTh Ad4hTd7d 2sJh3cAc"));
  }

  @Test
  public void test_omaha_holdem_8327_2d5dAhJdKd_7h4s5hTd_Ks3h3cQc_4d9h8hQh_Th7s6dJs_2sKh9sTs_2c7cKc7d_JhAs3sQs_3d9d2h4c_6hQd6c6s() {
    assertEquals(
      "4d9h8hQh 7h4s5hTd 6hQd6c6s Th7s6dJs Ks3h3cQc 2c7cKc7d=2sKh9sTs JhAs3sQs 3d9d2h4c",
      Solver.process("omaha-holdem 2d5dAhJdKd 7h4s5hTd Ks3h3cQc 4d9h8hQh Th7s6dJs 2sKh9sTs 2c7cKc7d JhAs3sQs 3d9d2h4c 6hQd6c6s"));
  }

  @Test
  public void test_omaha_holdem_8328_3s6dJcQhTd_9cKc6h7d_AsQs8h4h_Ks3hQcKh_2dKd5s6s_Ah4s2hJs_JhAd8cAc_9sQd3d5d() {
    assertEquals(
      "2dKd5s6s Ah4s2hJs AsQs8h4h JhAd8cAc 9sQd3d5d=Ks3hQcKh 9cKc6h7d",
      Solver.process("omaha-holdem 3s6dJcQhTd 9cKc6h7d AsQs8h4h Ks3hQcKh 2dKd5s6s Ah4s2hJs JhAd8cAc 9sQd3d5d"));
  }

  @Test
  public void test_omaha_holdem_8329_4h6c7d9sTd_Qc2d5s8s_8h4d2hTh_7sAh9cJs_8d6dKdJd() {
    assertEquals(
      "7sAh9cJs Qc2d5s8s 8h4d2hTh 8d6dKdJd",
      Solver.process("omaha-holdem 4h6c7d9sTd Qc2d5s8s 8h4d2hTh 7sAh9cJs 8d6dKdJd"));
  }

  @Test
  public void test_omaha_holdem_8330_2d3c6dTdTs_Th4h3h8s_AhQc4sKd_5h7s5d8d_2c7c3sTc_Jd9d7h6c_5s3d7d5c_KcQs6h6s_KhJs9cAs() {
    assertEquals(
      "AhQc4sKd=KhJs9cAs 5s3d7d5c 5h7s5d8d Jd9d7h6c KcQs6h6s 2c7c3sTc=Th4h3h8s",
      Solver.process("omaha-holdem 2d3c6dTdTs Th4h3h8s AhQc4sKd 5h7s5d8d 2c7c3sTc Jd9d7h6c 5s3d7d5c KcQs6h6s KhJs9cAs"));
  }

  @Test
  public void test_omaha_holdem_8331_2c7c9cAdQh_4s9h9d7h_5cKc3d7d_6s4dJd2d_6h6dKsAc_Ah6c8h8d() {
    assertEquals(
      "6s4dJd2d Ah6c8h8d 6h6dKsAc 4s9h9d7h 5cKc3d7d",
      Solver.process("omaha-holdem 2c7c9cAdQh 4s9h9d7h 5cKc3d7d 6s4dJd2d 6h6dKsAc Ah6c8h8d"));
  }

  @Test
  public void test_omaha_holdem_8332_4h5s7h8dTd_4c7s7cKh_3s2sAhJc_3c9s6c6h_6s9c5c2d_JhQc9h3d_5d4d9dTs_Ad7dTh2h_Ks6dTcKc() {
    assertEquals(
      "3s2sAhJc Ks6dTcKc 5d4d9dTs Ad7dTh2h 4c7s7cKh 3c9s6c6h=6s9c5c2d JhQc9h3d",
      Solver.process("omaha-holdem 4h5s7h8dTd 4c7s7cKh 3s2sAhJc 3c9s6c6h 6s9c5c2d JhQc9h3d 5d4d9dTs Ad7dTh2h Ks6dTcKc"));
  }

  @Test
  public void test_omaha_holdem_8333_5c8dJdJsTd_4hQs3d8s_9c7hAd5d_ThKcJc7s_Kh2d6d2c_2sTc4dJh_4c4s8h9h() {
    assertEquals(
      "4c4s8h9h 4hQs3d8s Kh2d6d2c 9c7hAd5d 2sTc4dJh=ThKcJc7s",
      Solver.process("omaha-holdem 5c8dJdJsTd 4hQs3d8s 9c7hAd5d ThKcJc7s Kh2d6d2c 2sTc4dJh 4c4s8h9h"));
  }

  @Test
  public void test_omaha_holdem_8334_2s9hAcKcKd_5h3h2dKh_Ts6hJs6d_Ks7c4cTh_8dQsTcAd() {
    assertEquals(
      "Ts6hJs6d 8dQsTcAd Ks7c4cTh 5h3h2dKh",
      Solver.process("omaha-holdem 2s9hAcKcKd 5h3h2dKh Ts6hJs6d Ks7c4cTh 8dQsTcAd"));
  }

  @Test
  public void test_omaha_holdem_8335_3s7c7d9sKs_8c5d5c6d_2cJd8dQs_4s5sAhTs_4dQhJcTh_3hAd9h7s_Qd2d9c4c_KhAs6h6s_Qc8s3cKd() {
    assertEquals(
      "2cJd8dQs=4dQhJcTh 8c5d5c6d Qd2d9c4c Qc8s3cKd 4s5sAhTs KhAs6h6s 3hAd9h7s",
      Solver.process("omaha-holdem 3s7c7d9sKs 8c5d5c6d 2cJd8dQs 4s5sAhTs 4dQhJcTh 3hAd9h7s Qd2d9c4c KhAs6h6s Qc8s3cKd"));
  }

  @Test
  public void test_omaha_holdem_8336_2h5c5s6cKs_3c2cTcAd_9h4c5h7h_7sJdKcQc_8hAhAs8s_Qd6h5dJs() {
    assertEquals(
      "3c2cTcAd 7sJdKcQc 8hAhAs8s 9h4c5h7h Qd6h5dJs",
      Solver.process("omaha-holdem 2h5c5s6cKs 3c2cTcAd 9h4c5h7h 7sJdKcQc 8hAhAs8s Qd6h5dJs"));
  }

  @Test
  public void test_omaha_holdem_8337_3d3h6hKhTh_9c7d8d2h_Js5c4cTs_Td7sJhQd_4sQh6dAs_4h6sTc2c_Ac9dQsJc_6c3s5hKc_Qc7cJd5d_2sKs9s8s() {
    assertEquals(
      "9c7d8d2h Qc7cJd5d Ac9dQsJc 4sQh6dAs Js5c4cTs Td7sJhQd 4h6sTc2c 2sKs9s8s 6c3s5hKc",
      Solver.process("omaha-holdem 3d3h6hKhTh 9c7d8d2h Js5c4cTs Td7sJhQd 4sQh6dAs 4h6sTc2c Ac9dQsJc 6c3s5hKc Qc7cJd5d 2sKs9s8s"));
  }

  @Test
  public void test_omaha_holdem_8338_2h3d7s8d9s_3h2d6c7d_KcTc7h5s_4hQs5c6s_2sAd8s9h_Th7c6hJc_9c3sJsJd_Ah8c4dTd_Ks4c3c5h_Ts4s9dAs() {
    assertEquals(
      "Ks4c3c5h KcTc7h5s Ah8c4dTd Ts4s9dAs 3h2d6c7d 9c3sJsJd 2sAd8s9h 4hQs5c6s Th7c6hJc",
      Solver.process("omaha-holdem 2h3d7s8d9s 3h2d6c7d KcTc7h5s 4hQs5c6s 2sAd8s9h Th7c6hJc 9c3sJsJd Ah8c4dTd Ks4c3c5h Ts4s9dAs"));
  }

  @Test
  public void test_omaha_holdem_8339_4h5s6dJhKh_4c7d4sQc_2cKc5cAs_Js9c7s3s() {
    assertEquals(
      "2cKc5cAs 4c7d4sQc Js9c7s3s",
      Solver.process("omaha-holdem 4h5s6dJhKh 4c7d4sQc 2cKc5cAs Js9c7s3s"));
  }

  @Test
  public void test_omaha_holdem_8340_2h9d9hKhQc_TcAh6hQd_7sThJhKs() {
    assertEquals(
      "7sThJhKs TcAh6hQd",
      Solver.process("omaha-holdem 2h9d9hKhQc TcAh6hQd 7sThJhKs"));
  }

  @Test
  public void test_omaha_holdem_8341_2c5h8dJhKd_6s8h7s3s_4c2hAcAs() {
    assertEquals(
      "6s8h7s3s 4c2hAcAs",
      Solver.process("omaha-holdem 2c5h8dJhKd 6s8h7s3s 4c2hAcAs"));
  }

  @Test
  public void test_omaha_holdem_8342_2h3s6hJsQd_4h9s4c5c_3c8hTs2d_Tc9cJc8d_6sAdAhQc() {
    assertEquals(
      "Tc9cJc8d 3c8hTs2d 6sAdAhQc 4h9s4c5c",
      Solver.process("omaha-holdem 2h3s6hJsQd 4h9s4c5c 3c8hTs2d Tc9cJc8d 6sAdAhQc"));
  }

  @Test
  public void test_omaha_holdem_8343_2c3s5sAsJs_Jc6h7d7s_JdAd5cAh_2hTd3cKc_8hKh5dTh_6s9d4cKd_7c8s8cQd_5hJhKs4h_QsAc9c4d() {
    assertEquals(
      "8hKh5dTh 7c8s8cQd Jc6h7d7s 2hTd3cKc JdAd5cAh 5hJhKs4h=QsAc9c4d 6s9d4cKd",
      Solver.process("omaha-holdem 2c3s5sAsJs Jc6h7d7s JdAd5cAh 2hTd3cKc 8hKh5dTh 6s9d4cKd 7c8s8cQd 5hJhKs4h QsAc9c4d"));
  }

  @Test
  public void test_omaha_holdem_8344_5dAcAhKdTd_6c8s2h2s_7sQsTh4c_9cAd3sKs_7d4sKhQd_6h8dTc2c_9h8h3h6d_4d5c3d6s() {
    assertEquals(
      "9h8h3h6d 6c8s2h2s 6h8dTc2c 7sQsTh4c 4d5c3d6s 7d4sKhQd 9cAd3sKs",
      Solver.process("omaha-holdem 5dAcAhKdTd 6c8s2h2s 7sQsTh4c 9cAd3sKs 7d4sKhQd 6h8dTc2c 9h8h3h6d 4d5c3d6s"));
  }

  @Test
  public void test_omaha_holdem_8345_2h4d6h7cKh_6c8cQdAs_8h8d2d3c_Ad7h6dTd_Kd3h4h2c_5s4sTcQs_3dThQcKc() {
    assertEquals(
      "5s4sTcQs 6c8cQdAs 8h8d2d3c 3dThQcKc Ad7h6dTd Kd3h4h2c",
      Solver.process("omaha-holdem 2h4d6h7cKh 6c8cQdAs 8h8d2d3c Ad7h6dTd Kd3h4h2c 5s4sTcQs 3dThQcKc"));
  }

  @Test
  public void test_omaha_holdem_8346_4h4s6c8dTc_5c2dJhAh_3dQdJdAc_8h4c9c9h_6s7c7h5h_9d2hTd8c_KdAd7d3c_ThQhAs3h_Jc8s7s3s() {
    assertEquals(
      "5c2dJhAh 3dQdJdAc KdAd7d3c Jc8s7s3s ThQhAs3h 9d2hTd8c 6s7c7h5h 8h4c9c9h",
      Solver.process("omaha-holdem 4h4s6c8dTc 5c2dJhAh 3dQdJdAc 8h4c9c9h 6s7c7h5h 9d2hTd8c KdAd7d3c ThQhAs3h Jc8s7s3s"));
  }

  @Test
  public void test_omaha_holdem_8347_3s5c9sAsQd_4dKhJsAd_5h6cTd3c_Kc7h8s2d_QsQh5d9c() {
    assertEquals(
      "Kc7h8s2d 4dKhJsAd 5h6cTd3c QsQh5d9c",
      Solver.process("omaha-holdem 3s5c9sAsQd 4dKhJsAd 5h6cTd3c Kc7h8s2d QsQh5d9c"));
  }

  @Test
  public void test_omaha_holdem_8348_3sJcJsKdTh_Jh5c4sQd_7cTs2sAd_2hKs4c7h_AhTc9c3d_Qs6c8d9d_Kc5s4hKh() {
    assertEquals(
      "7cTs2sAd=AhTc9c3d 2hKs4c7h Jh5c4sQd Qs6c8d9d Kc5s4hKh",
      Solver.process("omaha-holdem 3sJcJsKdTh Jh5c4sQd 7cTs2sAd 2hKs4c7h AhTc9c3d Qs6c8d9d Kc5s4hKh"));
  }

  @Test
  public void test_omaha_holdem_8349_6h7c9dAhAs_5d7d5sTh_Ts2dJdKh_Ks8dQcJc_4hJh6dKc_3h8h9s3c() {
    assertEquals(
      "Ts2dJdKh Ks8dQcJc 4hJh6dKc 5d7d5sTh 3h8h9s3c",
      Solver.process("omaha-holdem 6h7c9dAhAs 5d7d5sTh Ts2dJdKh Ks8dQcJc 4hJh6dKc 3h8h9s3c"));
  }

  @Test
  public void test_omaha_holdem_8350_5h6sJhJsKd_8c7d5c2s_8hTs3dKs_AsTh3c6h() {
    assertEquals(
      "8c7d5c2s AsTh3c6h 8hTs3dKs",
      Solver.process("omaha-holdem 5h6sJhJsKd 8c7d5c2s 8hTs3dKs AsTh3c6h"));
  }

  @Test
  public void test_omaha_holdem_8351_4c5d7d8dJh_2s3c7h5s_8s4h9h3h_Kc6sJsKh_As2hQdAh_Jd6dAc3s_Qs5c8hAd_2d7s4d6h_9cKd9s6c() {
    assertEquals(
      "Kc6sJsKh As2hQdAh 2s3c7h5s 8s4h9h3h Qs5c8hAd 9cKd9s6c 2d7s4d6h Jd6dAc3s",
      Solver.process("omaha-holdem 4c5d7d8dJh 2s3c7h5s 8s4h9h3h Kc6sJsKh As2hQdAh Jd6dAc3s Qs5c8hAd 2d7s4d6h 9cKd9s6c"));
  }

  @Test
  public void test_omaha_holdem_8352_2s3s4h5s8c_Qs9d5h4c_TsJdQd8s_QhKc2cJc_4sAcKs5d_7h7d8d7s_6d5c2dQc() {
    assertEquals(
      "QhKc2cJc 7h7d8d7s Qs9d5h4c 6d5c2dQc TsJdQd8s 4sAcKs5d",
      Solver.process("omaha-holdem 2s3s4h5s8c Qs9d5h4c TsJdQd8s QhKc2cJc 4sAcKs5d 7h7d8d7s 6d5c2dQc"));
  }

  @Test
  public void test_omaha_holdem_8353_6d7cJdKcTd_AcQdJh3c_6c3sKsKh_3hAhAsTs_2d6s2c3d_7d5h9c2h() {
    assertEquals(
      "7d5h9c2h 3hAhAsTs 6c3sKsKh AcQdJh3c 2d6s2c3d",
      Solver.process("omaha-holdem 6d7cJdKcTd AcQdJh3c 6c3sKsKh 3hAhAsTs 2d6s2c3d 7d5h9c2h"));
  }

  @Test
  public void test_omaha_holdem_8354_6s8hQdTcTh_4cJc3s7s_8d5h3cAc_Ks2d7d6h_Jh8sQhAd_2h4sAh7c_2s7h9hTd_JsTsAsQs() {
    assertEquals(
      "4cJc3s7s 2h4sAh7c Ks2d7d6h 8d5h3cAc Jh8sQhAd 2s7h9hTd JsTsAsQs",
      Solver.process("omaha-holdem 6s8hQdTcTh 4cJc3s7s 8d5h3cAc Ks2d7d6h Jh8sQhAd 2h4sAh7c 2s7h9hTd JsTsAsQs"));
  }

  @Test
  public void test_omaha_holdem_8355_8hJsKdQdTc_JcKs8c9h_4dAd5c7s_2hJhAs4c_Ac4s9s8s_Kh2c6s4h_3sQh7d2s_Qc5h3hJd_7c9d6c8d_Ts5d7h3c() {
    assertEquals(
      "4dAd5c7s Ts5d7h3c 3sQh7d2s Kh2c6s4h Qc5h3hJd 7c9d6c8d=Ac4s9s8s JcKs8c9h 2hJhAs4c",
      Solver.process("omaha-holdem 8hJsKdQdTc JcKs8c9h 4dAd5c7s 2hJhAs4c Ac4s9s8s Kh2c6s4h 3sQh7d2s Qc5h3hJd 7c9d6c8d Ts5d7h3c"));
  }

  @Test
  public void test_omaha_holdem_8356_2s5dAcJhJs_KhQhKd4h_8h5h3d5s_JcJd6cAs_Ah4d7sTd_Qc3c4c5c_2hQd7d7c_TsQs8s7h_Kc6s9h8d_Th2d2c4s() {
    assertEquals(
      "TsQs8s7h Kc6s9h8d 2hQd7d7c KhQhKd4h Ah4d7sTd Qc3c4c5c Th2d2c4s 8h5h3d5s JcJd6cAs",
      Solver.process("omaha-holdem 2s5dAcJhJs KhQhKd4h 8h5h3d5s JcJd6cAs Ah4d7sTd Qc3c4c5c 2hQd7d7c TsQs8s7h Kc6s9h8d Th2d2c4s"));
  }

  @Test
  public void test_omaha_holdem_8357_2c5sAhKdQs_7c5hAs8h_3s7dTcJd_KcTs8s6c_Td9sKh9c() {
    assertEquals(
      "KcTs8s6c=Td9sKh9c 7c5hAs8h 3s7dTcJd",
      Solver.process("omaha-holdem 2c5sAhKdQs 7c5hAs8h 3s7dTcJd KcTs8s6c Td9sKh9c"));
  }

  @Test
  public void test_omaha_holdem_8358_7h8hJsKcTh_KhAs3hQd_4sJd8sJc_4cTcTs6h_3cTdAc2c() {
    assertEquals(
      "3cTdAc2c 4cTcTs6h 4sJd8sJc KhAs3hQd",
      Solver.process("omaha-holdem 7h8hJsKcTh KhAs3hQd 4sJd8sJc 4cTcTs6h 3cTdAc2c"));
  }

  @Test
  public void test_omaha_holdem_8359_3c7c8sAcQs_8h5hQhKh_5sAd3sJc_3hQc2c6s() {
    assertEquals(
      "8h5hQhKh 5sAd3sJc 3hQc2c6s",
      Solver.process("omaha-holdem 3c7c8sAcQs 8h5hQhKh 5sAd3sJc 3hQc2c6s"));
  }

  @Test
  public void test_omaha_holdem_8360_2d6c6d9d9h_6hAcJhKs_3cKcKh8c_TcTd4hJd_Qs3s5c8h_7h4cJc8d_7cQcAs2c_2h5sQhJs_3d4d9sAd_6sAh4sTs() {
    assertEquals(
      "7h4cJc8d Qs3s5c8h 2h5sQhJs 7cQcAs2c 3cKcKh8c 6hAcJhKs=6sAh4sTs TcTd4hJd 3d4d9sAd",
      Solver.process("omaha-holdem 2d6c6d9d9h 6hAcJhKs 3cKcKh8c TcTd4hJd Qs3s5c8h 7h4cJc8d 7cQcAs2c 2h5sQhJs 3d4d9sAd 6sAh4sTs"));
  }

  @Test
  public void test_omaha_holdem_8361_6h9sAcTcTd_Qs3cQd6s_2c5d5s8h_8cAh2d5c_7hJs9hAs_6dQc8d3d_4s3sAd9c_4h7dJc4d_QhKdJhKh_4c8s7c9d() {
    assertEquals(
      "4h7dJc4d 2c5d5s8h 6dQc8d3d Qs3cQd6s QhKdJhKh 8cAh2d5c 4s3sAd9c 7hJs9hAs 4c8s7c9d",
      Solver.process("omaha-holdem 6h9sAcTcTd Qs3cQd6s 2c5d5s8h 8cAh2d5c 7hJs9hAs 6dQc8d3d 4s3sAd9c 4h7dJc4d QhKdJhKh 4c8s7c9d"));
  }

  @Test
  public void test_omaha_holdem_8362_2c2s3c6dAc_Jd4c7dTs_AdQs2h4s_9sQh8h3h_3dKcTcQd_9c7sAh8c_6h6sTd5d_4h2dQcKd() {
    assertEquals(
      "Jd4c7dTs 9sQh8h3h 4h2dQcKd 9c7sAh8c 3dKcTcQd AdQs2h4s 6h6sTd5d",
      Solver.process("omaha-holdem 2c2s3c6dAc Jd4c7dTs AdQs2h4s 9sQh8h3h 3dKcTcQd 9c7sAh8c 6h6sTd5d 4h2dQcKd"));
  }

  @Test
  public void test_omaha_holdem_8363_2c2s5h9cTs_5sJsQs9h_QdAh8sJd_7d3h7cKd_Qc6h4c2d_Ac8h5c6c() {
    assertEquals(
      "QdAh8sJd Ac8h5c6c 7d3h7cKd 5sJsQs9h Qc6h4c2d",
      Solver.process("omaha-holdem 2c2s5h9cTs 5sJsQs9h QdAh8sJd 7d3h7cKd Qc6h4c2d Ac8h5c6c"));
  }

  @Test
  public void test_omaha_holdem_8364_2d5h6dJdTc_4h7d5c6h_7s3h2sKd_Ah9dQdTh_2cQs9cTs() {
    assertEquals(
      "7s3h2sKd 4h7d5c6h 2cQs9cTs Ah9dQdTh",
      Solver.process("omaha-holdem 2d5h6dJdTc 4h7d5c6h 7s3h2sKd Ah9dQdTh 2cQs9cTs"));
  }

  @Test
  public void test_omaha_holdem_8365_4s6h8cKdTd_QhJsJc8s_AsQdJhTh_9s5d3c9c_Jd7c7h2s_Tc5sAh8h_7s3d2h5c_6d2dTs6c() {
    assertEquals(
      "Jd7c7h2s 9s5d3c9c AsQdJhTh QhJsJc8s Tc5sAh8h 6d2dTs6c 7s3d2h5c",
      Solver.process("omaha-holdem 4s6h8cKdTd QhJsJc8s AsQdJhTh 9s5d3c9c Jd7c7h2s Tc5sAh8h 7s3d2h5c 6d2dTs6c"));
  }

  @Test
  public void test_omaha_holdem_8366_2s4c4h8c9h_4s6cTdTc_8s3hKd2c_QdAd9sJd_Ts2dQhTh() {
    assertEquals(
      "8s3hKd2c QdAd9sJd Ts2dQhTh 4s6cTdTc",
      Solver.process("omaha-holdem 2s4c4h8c9h 4s6cTdTc 8s3hKd2c QdAd9sJd Ts2dQhTh"));
  }

  @Test
  public void test_omaha_holdem_8367_4h8c8d9cJc_9dQcJhAs_Kc6sJdTd_6hTsAhAd() {
    assertEquals(
      "Kc6sJdTd 9dQcJhAs 6hTsAhAd",
      Solver.process("omaha-holdem 4h8c8d9cJc 9dQcJhAs Kc6sJdTd 6hTsAhAd"));
  }

  @Test
  public void test_omaha_holdem_8368_2h4c4h8c9c_KdTc5s8d_7c2d5hKs() {
    assertEquals(
      "7c2d5hKs KdTc5s8d",
      Solver.process("omaha-holdem 2h4c4h8c9c KdTc5s8d 7c2d5hKs"));
  }

  @Test
  public void test_omaha_holdem_8369_4s7s9dJhKd_2dAs3cKc_5sTh5h8c_4h7h7c7d_Js6sKs4d_6hQh6d3h_9h8dJcAd_Ac8sTdJd_KhAhTs5d() {
    assertEquals(
      "6hQh6d3h 2dAs3cKc=KhAhTs5d 9h8dJcAd Js6sKs4d 4h7h7c7d 5sTh5h8c=Ac8sTdJd",
      Solver.process("omaha-holdem 4s7s9dJhKd 2dAs3cKc 5sTh5h8c 4h7h7c7d Js6sKs4d 6hQh6d3h 9h8dJcAd Ac8sTdJd KhAhTs5d"));
  }

  @Test
  public void test_omaha_holdem_8370_4d7s8hJcKs_6cAhKh3h_Jh7d2c8d_Kd2s5cAd_TsTc9cQc_4h9s3s7h_JsQs6d9d_7c5h3cTh_5s6h4s9h_5d3d8s2h() {
    assertEquals(
      "7c5h3cTh 5d3d8s2h JsQs6d9d 6cAhKh3h=Kd2s5cAd 4h9s3s7h Jh7d2c8d 5s6h4s9h TsTc9cQc",
      Solver.process("omaha-holdem 4d7s8hJcKs 6cAhKh3h Jh7d2c8d Kd2s5cAd TsTc9cQc 4h9s3s7h JsQs6d9d 7c5h3cTh 5s6h4s9h 5d3d8s2h"));
  }

  @Test
  public void test_omaha_holdem_8371_2d5d6d8dKh_7c8s6cQh_Qs8h5s2h_As2cKd3c_5hThAd4h_3d8c6sQc_3h5c3s4c_2s6hQdTd() {
    assertEquals(
      "5hThAd4h Qs8h5s2h 3d8c6sQc=7c8s6cQh As2cKd3c 3h5c3s4c 2s6hQdTd",
      Solver.process("omaha-holdem 2d5d6d8dKh 7c8s6cQh Qs8h5s2h As2cKd3c 5hThAd4h 3d8c6sQc 3h5c3s4c 2s6hQdTd"));
  }

  @Test
  public void test_omaha_holdem_8372_2d3s4h9dKh_8sAsKsTd_5hJc8hAd_Js9h3h7h_Th5s4dQh_Ac4s6h2h_Kd3cKc6d() {
    assertEquals(
      "Th5s4dQh 8sAsKsTd Ac4s6h2h Js9h3h7h Kd3cKc6d 5hJc8hAd",
      Solver.process("omaha-holdem 2d3s4h9dKh 8sAsKsTd 5hJc8hAd Js9h3h7h Th5s4dQh Ac4s6h2h Kd3cKc6d"));
  }

  @Test
  public void test_omaha_holdem_8373_4hAcAdJdQh_8d7sTdJs_8hJh7hJc_2c2d9h6d() {
    assertEquals(
      "2c2d9h6d 8d7sTdJs 8hJh7hJc",
      Solver.process("omaha-holdem 4hAcAdJdQh 8d7sTdJs 8hJh7hJc 2c2d9h6d"));
  }

  @Test
  public void test_omaha_holdem_8374_2c7h7sAdAh_6sTh9hQh_QsJh4d8c_JcTc2d3h_5d8sAc8h_6d2hAs9d_2s5s3sJd_KsQd8d7d() {
    assertEquals(
      "6sTh9hQh QsJh4d8c 2s5s3sJd=JcTc2d3h KsQd8d7d 5d8sAc8h 6d2hAs9d",
      Solver.process("omaha-holdem 2c7h7sAdAh 6sTh9hQh QsJh4d8c JcTc2d3h 5d8sAc8h 6d2hAs9d 2s5s3sJd KsQd8d7d"));
  }

  @Test
  public void test_omaha_holdem_8375_2h9hKcKsQh_Qs7d5s9s_Tc4sAc7h_ThKh8c5c_JdQd6hKd_2s7s2dJh_8s6sQcAh_4hJc8hTd() {
    assertEquals(
      "Tc4sAc7h Qs7d5s9s 8s6sQcAh 4hJc8hTd ThKh8c5c 2s7s2dJh JdQd6hKd",
      Solver.process("omaha-holdem 2h9hKcKsQh Qs7d5s9s Tc4sAc7h ThKh8c5c JdQd6hKd 2s7s2dJh 8s6sQcAh 4hJc8hTd"));
  }

  @Test
  public void test_omaha_holdem_8376_3d5s7h7s8d_3cKc5dKs_5h5cAh4d_9dTs9s3h_2hTc4cJh_6s9hQc8h_6hQs6cAd_AsQh8s8c_Kh2c9c4s_6dTd7d7c() {
    assertEquals(
      "2hTc4cJh Kh2c9c4s 6hQs6cAd 9dTs9s3h 3cKc5dKs 6s9hQc8h 5h5cAh4d AsQh8s8c 6dTd7d7c",
      Solver.process("omaha-holdem 3d5s7h7s8d 3cKc5dKs 5h5cAh4d 9dTs9s3h 2hTc4cJh 6s9hQc8h 6hQs6cAd AsQh8s8c Kh2c9c4s 6dTd7d7c"));
  }

  @Test
  public void test_omaha_holdem_8377_3h7s8cAcKd_Ad4cQd5c_2d3d6c9h_5h8h2c5d_Jc9sQcKs_6sAh8dTc_QhQsJd5s() {
    assertEquals(
      "2d3d6c9h 5h8h2c5d QhQsJd5s Jc9sQcKs Ad4cQd5c 6sAh8dTc",
      Solver.process("omaha-holdem 3h7s8cAcKd Ad4cQd5c 2d3d6c9h 5h8h2c5d Jc9sQcKs 6sAh8dTc QhQsJd5s"));
  }

  @Test
  public void test_omaha_holdem_8378_5h7s8dQdTd_4cQc4hJd_QhAd3d4d_2d7hJh9s_9d9c9h7d_AsKd4sAh() {
    assertEquals(
      "4cQc4hJd AsKd4sAh 2d7hJh9s 9d9c9h7d QhAd3d4d",
      Solver.process("omaha-holdem 5h7s8dQdTd 4cQc4hJd QhAd3d4d 2d7hJh9s 9d9c9h7d AsKd4sAh"));
  }

  @Test
  public void test_omaha_holdem_8379_3c5d8cAcQs_9c3d7hJs_6h4h9h8d_8h6dKsKd_5h6cQc3h() {
    assertEquals(
      "9c3d7hJs 6h4h9h8d 8h6dKsKd 5h6cQc3h",
      Solver.process("omaha-holdem 3c5d8cAcQs 9c3d7hJs 6h4h9h8d 8h6dKsKd 5h6cQc3h"));
  }

  @Test
  public void test_omaha_holdem_8380_3c4dKsQsTd_6s3d6cAc_5dAh7c3h_Qc7s8s9c_JdKd4h8d_Jh8h4c9d_2cQd2dTc() {
    assertEquals(
      "5dAh7c3h 6s3d6cAc Qc7s8s9c 2cQd2dTc JdKd4h8d Jh8h4c9d",
      Solver.process("omaha-holdem 3c4dKsQsTd 6s3d6cAc 5dAh7c3h Qc7s8s9c JdKd4h8d Jh8h4c9d 2cQd2dTc"));
  }

  @Test
  public void test_omaha_holdem_8381_2d6d7d7h8c_Qh3d5d8d_4s3hJc3s_Ah9sKs6c_As4d9c6h_Ac2hTcTh_5s7sAdQd_9d8s4hJd_Qs9hTd2s_6sKd2cTs() {
    assertEquals(
      "4s3hJc3s 6sKd2cTs Ah9sKs6c=As4d9c6h Ac2hTcTh Qs9hTd2s Qh3d5d8d 9d8s4hJd 5s7sAdQd",
      Solver.process("omaha-holdem 2d6d7d7h8c Qh3d5d8d 4s3hJc3s Ah9sKs6c As4d9c6h Ac2hTcTh 5s7sAdQd 9d8s4hJd Qs9hTd2s 6sKd2cTs"));
  }

  @Test
  public void test_omaha_holdem_8382_4h6h9d9hAs_Qc9cKhAd_4sJh2s8c() {
    assertEquals(
      "4sJh2s8c Qc9cKhAd",
      Solver.process("omaha-holdem 4h6h9d9hAs Qc9cKhAd 4sJh2s8c"));
  }

  @Test
  public void test_omaha_holdem_8383_2d4h5s8sJd_9h4c6dTh_6c7c9d4d_5d7hAcKd_2hKhQc6s_Js8cTsJc_8dKsQs5c_AhKc5h6h_Qd9s8h7d() {
    assertEquals(
      "2hKhQc6s 9h4c6dTh 5d7hAcKd=AhKc5h6h Qd9s8h7d 8dKsQs5c Js8cTsJc 6c7c9d4d",
      Solver.process("omaha-holdem 2d4h5s8sJd 9h4c6dTh 6c7c9d4d 5d7hAcKd 2hKhQc6s Js8cTsJc 8dKsQs5c AhKc5h6h Qd9s8h7d"));
  }

  @Test
  public void test_omaha_holdem_8384_4h6s7d9hJs_8sJd8d4c_6cQd7h6d() {
    assertEquals(
      "8sJd8d4c 6cQd7h6d",
      Solver.process("omaha-holdem 4h6s7d9hJs 8sJd8d4c 6cQd7h6d"));
  }

  @Test
  public void test_omaha_holdem_8385_2s4c9hQcTd_8d3s3dTh_Ah3h4d8c_6cJc5sAd() {
    assertEquals(
      "6cJc5sAd Ah3h4d8c 8d3s3dTh",
      Solver.process("omaha-holdem 2s4c9hQcTd 8d3s3dTh Ah3h4d8c 6cJc5sAd"));
  }

  @Test
  public void test_omaha_holdem_8386_7d9c9dJcJs_2c5d7sJd_5sTh6hQs_Jh3h4c8d_8h8c6c3d() {
    assertEquals(
      "5sTh6hQs 8h8c6c3d Jh3h4c8d 2c5d7sJd",
      Solver.process("omaha-holdem 7d9c9dJcJs 2c5d7sJd 5sTh6hQs Jh3h4c8d 8h8c6c3d"));
  }

  @Test
  public void test_omaha_holdem_8387_7h9c9hAhQc_3h6c8dTd_5s3dQh7s_9s5hJs2d_Ad5dAcKc_Jh5cTh6s_4h8c3c3s() {
    assertEquals(
      "3h6c8dTd 4h8c3c3s 5s3dQh7s 9s5hJs2d Jh5cTh6s Ad5dAcKc",
      Solver.process("omaha-holdem 7h9c9hAhQc 3h6c8dTd 5s3dQh7s 9s5hJs2d Ad5dAcKc Jh5cTh6s 4h8c3c3s"));
  }

  @Test
  public void test_omaha_holdem_8388_6d7d8cAhJd_As6hQd9s_Th8h4h2d_KhJcQsKs() {
    assertEquals(
      "Th8h4h2d KhJcQsKs As6hQd9s",
      Solver.process("omaha-holdem 6d7d8cAhJd As6hQd9s Th8h4h2d KhJcQsKs"));
  }

  @Test
  public void test_omaha_holdem_8389_3c5c5d6dTh_6c4sQh7s_8s4d3dKd_TsKc9h5s_8cQsAdAh_2s3hTcJc_4c6hAsTd() {
    assertEquals(
      "8s4d3dKd 2s3hTcJc 4c6hAsTd 8cQsAdAh 6c4sQh7s TsKc9h5s",
      Solver.process("omaha-holdem 3c5c5d6dTh 6c4sQh7s 8s4d3dKd TsKc9h5s 8cQsAdAh 2s3hTcJc 4c6hAsTd"));
  }

  @Test
  public void test_omaha_holdem_8390_3d5h5s6h7c_QsQc2hJc_8hKcTdAs_Kh9s8dKd() {
    assertEquals(
      "8hKcTdAs QsQc2hJc Kh9s8dKd",
      Solver.process("omaha-holdem 3d5h5s6h7c QsQc2hJc 8hKcTdAs Kh9s8dKd"));
  }

  @Test
  public void test_omaha_holdem_8391_5hAhKcTdTs_2c4h9d3h_5s8s3c9h() {
    assertEquals(
      "2c4h9d3h 5s8s3c9h",
      Solver.process("omaha-holdem 5hAhKcTdTs 2c4h9d3h 5s8s3c9h"));
  }

  @Test
  public void test_omaha_holdem_8392_6h7cAsKhTh_4cJdTcTs_5s8c9sQd_3s2d8hTd_Jh7s9d7d() {
    assertEquals(
      "3s2d8hTd Jh7s9d7d 4cJdTcTs 5s8c9sQd",
      Solver.process("omaha-holdem 6h7cAsKhTh 4cJdTcTs 5s8c9sQd 3s2d8hTd Jh7s9d7d"));
  }

  @Test
  public void test_omaha_holdem_8393_4c4d7sAcAh_Jd5c8d3h_4sJs8c2h_8s3cQs2d() {
    assertEquals(
      "Jd5c8d3h 8s3cQs2d 4sJs8c2h",
      Solver.process("omaha-holdem 4c4d7sAcAh Jd5c8d3h 4sJs8c2h 8s3cQs2d"));
  }

  @Test
  public void test_omaha_holdem_8394_2c2d7c7dAc_Ah4d2s3c_5dQc7sAs_4s6s5sQs_Th4h9cKc_9hTs6d5h() {
    assertEquals(
      "9hTs6d5h 4s6s5sQs Th4h9cKc Ah4d2s3c 5dQc7sAs",
      Solver.process("omaha-holdem 2c2d7c7dAc Ah4d2s3c 5dQc7sAs 4s6s5sQs Th4h9cKc 9hTs6d5h"));
  }

  @Test
  public void test_omaha_holdem_8395_3h6c7hJhQs_Kh9c6dQh_Ah8h7c9d_3c3d2d5c_2c9hTdAc() {
    assertEquals(
      "2c9hTdAc 3c3d2d5c Kh9c6dQh Ah8h7c9d",
      Solver.process("omaha-holdem 3h6c7hJhQs Kh9c6dQh Ah8h7c9d 3c3d2d5c 2c9hTdAc"));
  }

  @Test
  public void test_omaha_holdem_8396_3c3d5d9sAs_Kc3s7h5s_4h6c7s3h_6dAh6hKh_JcAc8s5h_2dJdKs2h_Qh8h9c6s() {
    assertEquals(
      "2dJdKs2h Qh8h9c6s 6dAh6hKh JcAc8s5h 4h6c7s3h Kc3s7h5s",
      Solver.process("omaha-holdem 3c3d5d9sAs Kc3s7h5s 4h6c7s3h 6dAh6hKh JcAc8s5h 2dJdKs2h Qh8h9c6s"));
  }

  @Test
  public void test_omaha_holdem_8397_3d4c4s6s8h_Tc6hAh7s_2hAs4d3c_3h7hAc6d_9h2s9s8c_6c7dThJs() {
    assertEquals(
      "6c7dThJs 3h7hAc6d=Tc6hAh7s 9h2s9s8c 2hAs4d3c",
      Solver.process("omaha-holdem 3d4c4s6s8h Tc6hAh7s 2hAs4d3c 3h7hAc6d 9h2s9s8c 6c7dThJs"));
  }

  @Test
  public void test_omaha_holdem_8398_2d2sAhJcQh_Jh5c5h7s_Js6hAs8d_9hTcKdQs() {
    assertEquals(
      "Jh5c5h7s Js6hAs8d 9hTcKdQs",
      Solver.process("omaha-holdem 2d2sAhJcQh Jh5c5h7s Js6hAs8d 9hTcKdQs"));
  }

  @Test
  public void test_omaha_holdem_8399_5s9cJcJdKd_9s4dKh4s_KcTd2c5h_7s6s5c9d() {
    assertEquals(
      "7s6s5c9d 9s4dKh4s KcTd2c5h",
      Solver.process("omaha-holdem 5s9cJcJdKd 9s4dKh4s KcTd2c5h 7s6s5c9d"));
  }

  @Test
  public void test_omaha_holdem_8400_3h3s6c6sTh_8h8cJs5d_Ah7hJd4s_4c9s2cKs() {
    assertEquals(
      "4c9s2cKs Ah7hJd4s 8h8cJs5d",
      Solver.process("omaha-holdem 3h3s6c6sTh 8h8cJs5d Ah7hJd4s 4c9s2cKs"));
  }

  @Test
  public void test_omaha_holdem_8401_4h5d7d8cKs_Jd5h2cTc_4d6h8dKc_Th7c4cAc_Ts3d3c3s() {
    assertEquals(
      "Ts3d3c3s Jd5h2cTc Th7c4cAc 4d6h8dKc",
      Solver.process("omaha-holdem 4h5d7d8cKs Jd5h2cTc 4d6h8dKc Th7c4cAc Ts3d3c3s"));
  }

  @Test
  public void test_omaha_holdem_8402_5c5s9dJsKd_JhAsAd2s_8s6d7sQc_Tc5d3sJc_8dTh7h2d_Qs5h9c4h_Ts6h2c9s_QdAhKhTd() {
    assertEquals(
      "8dTh7h2d 8s6d7sQc Ts6h2c9s JhAsAd2s QdAhKhTd Qs5h9c4h Tc5d3sJc",
      Solver.process("omaha-holdem 5c5s9dJsKd JhAsAd2s 8s6d7sQc Tc5d3sJc 8dTh7h2d Qs5h9c4h Ts6h2c9s QdAhKhTd"));
  }

  @Test
  public void test_omaha_holdem_8403_2d4hJcKcKh_As9s6s2s_Jd9c7s3c_QcThQd3s_4s2cKsQh_8sQsAd5h() {
    assertEquals(
      "8sQsAd5h As9s6s2s Jd9c7s3c QcThQd3s 4s2cKsQh",
      Solver.process("omaha-holdem 2d4hJcKcKh As9s6s2s Jd9c7s3c QcThQd3s 4s2cKsQh 8sQsAd5h"));
  }

  @Test
  public void test_omaha_holdem_8404_2h4d6d9dKc_2dAc7d6s_Kd3d2cJs_5dAhTc3s_JhAs8sKs_4cJc9s3h_7h5c7s6h() {
    assertEquals(
      "7h5c7s6h JhAs8sKs 4cJc9s3h 5dAhTc3s 2dAc7d6s Kd3d2cJs",
      Solver.process("omaha-holdem 2h4d6d9dKc 2dAc7d6s Kd3d2cJs 5dAhTc3s JhAs8sKs 4cJc9s3h 7h5c7s6h"));
  }

  @Test
  public void test_omaha_holdem_8405_3s4hJcKdTh_4d7hTsKc_8h9s3hAh_6dAd2cTd_Kh9d2h6h() {
    assertEquals(
      "8h9s3hAh 6dAd2cTd Kh9d2h6h 4d7hTsKc",
      Solver.process("omaha-holdem 3s4hJcKdTh 4d7hTsKc 8h9s3hAh 6dAd2cTd Kh9d2h6h"));
  }

  @Test
  public void test_omaha_holdem_8406_3s7c9dKcKd_7h7s6d4s_5s3d4hTh() {
    assertEquals(
      "5s3d4hTh 7h7s6d4s",
      Solver.process("omaha-holdem 3s7c9dKcKd 7h7s6d4s 5s3d4hTh"));
  }

  @Test
  public void test_omaha_holdem_8407_3d5cJdQcQd_8sKdJc6h_6s8h3h4c_Kc3sAs7h_Ah6c6d4s_AdQs9d7c_7sQhJs2c_AcTs9c5h_5s5d8c2d() {
    assertEquals(
      "6s8h3h4c Kc3sAs7h AcTs9c5h Ah6c6d4s 8sKdJc6h AdQs9d7c 5s5d8c2d 7sQhJs2c",
      Solver.process("omaha-holdem 3d5cJdQcQd 8sKdJc6h 6s8h3h4c Kc3sAs7h Ah6c6d4s AdQs9d7c 7sQhJs2c AcTs9c5h 5s5d8c2d"));
  }

  @Test
  public void test_omaha_holdem_8408_2h2s4c8hQc_Qd4hAcQh_6c9d9c9h_5hKdAh2d_6hKc3sJc_Ad5c4s2c_6d3dTdKh_3hJd7s8d_Tc8s6sAs_9sJsJh5d() {
    assertEquals(
      "6d3dTdKh 6hKc3sJc 3hJd7s8d Tc8s6sAs 6c9d9c9h 9sJsJh5d 5hKdAh2d Ad5c4s2c Qd4hAcQh",
      Solver.process("omaha-holdem 2h2s4c8hQc Qd4hAcQh 6c9d9c9h 5hKdAh2d 6hKc3sJc Ad5c4s2c 6d3dTdKh 3hJd7s8d Tc8s6sAs 9sJsJh5d"));
  }

  @Test
  public void test_omaha_holdem_8409_2s3hKdKsQd_2d5cTs3d_Qh3s8h6d_Ah2c4cTc_KhAd8s6h_3c6sJs8d_9d7c5d7d_Qs2h9h9c() {
    assertEquals(
      "Ah2c4cTc 2d5cTs3d 3c6sJs8d 9d7c5d7d Qh3s8h6d Qs2h9h9c KhAd8s6h",
      Solver.process("omaha-holdem 2s3hKdKsQd 2d5cTs3d Qh3s8h6d Ah2c4cTc KhAd8s6h 3c6sJs8d 9d7c5d7d Qs2h9h9c"));
  }

  @Test
  public void test_omaha_holdem_8410_4d4h6dJhKh_8cQcQdKd_9cTd9s4s_5c8s7c8h_AhJc5sTs_3c2h6hAc_6cThJsKc_Tc7s9dJd() {
    assertEquals(
      "5c8s7c8h Tc7s9dJd AhJc5sTs 8cQcQdKd 6cThJsKc 9cTd9s4s 3c2h6hAc",
      Solver.process("omaha-holdem 4d4h6dJhKh 8cQcQdKd 9cTd9s4s 5c8s7c8h AhJc5sTs 3c2h6hAc 6cThJsKc Tc7s9dJd"));
  }

  @Test
  public void test_omaha_holdem_8411_2c4d7hKdKh_9cJc2s9d_6hAs4cJd_5s3sQhQd_7c2h3dKc_7sQsJh9h_9sThAd2d_Tc6dAh3c_AcTd7d6c() {
    assertEquals(
      "Tc6dAh3c 9sThAd2d 6hAs4cJd 7sQsJh9h AcTd7d6c 9cJc2s9d 5s3sQhQd 7c2h3dKc",
      Solver.process("omaha-holdem 2c4d7hKdKh 9cJc2s9d 6hAs4cJd 5s3sQhQd 7c2h3dKc 7sQsJh9h 9sThAd2d Tc6dAh3c AcTd7d6c"));
  }

  @Test
  public void test_omaha_holdem_8412_6hAdJhKsQd_7h3sQsTc_Kd5d7c8h_TsKh3dJs_5c3cAc8s_6d4c5s8d_AhJc5h4s_2dQcAs9c() {
    assertEquals(
      "6d4c5s8d Kd5d7c8h 5c3cAc8s AhJc5h4s 2dQcAs9c 7h3sQsTc=TsKh3dJs",
      Solver.process("omaha-holdem 6hAdJhKsQd 7h3sQsTc Kd5d7c8h TsKh3dJs 5c3cAc8s 6d4c5s8d AhJc5h4s 2dQcAs9c"));
  }

  @Test
  public void test_omaha_holdem_8413_3s5sAdJsKh_2s5c6s7h_5h9s8d6d_6c4sAhQc_2dQsTdAs_Jc4c7dQh_9d3hQdKs_5dTs4h9c() {
    assertEquals(
      "5h9s8d6d 5dTs4h9c Jc4c7dQh 6c4sAhQc 9d3hQdKs 2s5c6s7h 2dQsTdAs",
      Solver.process("omaha-holdem 3s5sAdJsKh 2s5c6s7h 5h9s8d6d 6c4sAhQc 2dQsTdAs Jc4c7dQh 9d3hQdKs 5dTs4h9c"));
  }

  @Test
  public void test_omaha_holdem_8414_4d4h4s8dQd_8h5d9s2h_As3cAh5s_7c6h7dQc_Ts3hKdAc_8s2cJs6s_Th4cTcQs_9c7s5h5c() {
    assertEquals(
      "8h5d9s2h 8s2cJs6s Ts3hKdAc 9c7s5h5c 7c6h7dQc As3cAh5s Th4cTcQs",
      Solver.process("omaha-holdem 4d4h4s8dQd 8h5d9s2h As3cAh5s 7c6h7dQc Ts3hKdAc 8s2cJs6s Th4cTcQs 9c7s5h5c"));
  }

  @Test
  public void test_omaha_holdem_8415_2c5s9dAdKd_KsAs8sQs_AcTdQc6d_8h7s3sAh_5dTc8c6c_Jc2d9c7d_2s4cJs2h_Kh7c5cKc_8d7hQd3c_Jh6h3dTs() {
    assertEquals(
      "Jh6h3dTs 5dTc8c6c 8h7s3sAh KsAs8sQs 2s4cJs2h Kh7c5cKc Jc2d9c7d AcTdQc6d 8d7hQd3c",
      Solver.process("omaha-holdem 2c5s9dAdKd KsAs8sQs AcTdQc6d 8h7s3sAh 5dTc8c6c Jc2d9c7d 2s4cJs2h Kh7c5cKc 8d7hQd3c Jh6h3dTs"));
  }

  @Test
  public void test_omaha_holdem_8416_5s6c7hKsTs_Td3c2c5d_3h5c3d8c_9h9dJcQd_6dJd4c8h_TcTh2d2s_9s3sKhQs_7c5h6s6h_9cKdAd8s_2hQc7d4s() {
    assertEquals(
      "3h5c3d8c 2hQc7d4s 9h9dJcQd Td3c2c5d 7c5h6s6h TcTh2d2s 6dJd4c8h 9cKdAd8s 9s3sKhQs",
      Solver.process("omaha-holdem 5s6c7hKsTs Td3c2c5d 3h5c3d8c 9h9dJcQd 6dJd4c8h TcTh2d2s 9s3sKhQs 7c5h6s6h 9cKdAd8s 2hQc7d4s"));
  }

  @Test
  public void test_omaha_holdem_8417_5hKcKsTcTh_2sQc3sQd_Ac3h4sJh_Qh9c7h6d() {
    assertEquals(
      "Qh9c7h6d Ac3h4sJh 2sQc3sQd",
      Solver.process("omaha-holdem 5hKcKsTcTh 2sQc3sQd Ac3h4sJh Qh9c7h6d"));
  }

  @Test
  public void test_omaha_holdem_8418_5s7dJhKcTd_5dQc6d5c_JdJc2hTh_8d4s2d9c() {
    assertEquals(
      "5dQc6d5c JdJc2hTh 8d4s2d9c",
      Solver.process("omaha-holdem 5s7dJhKcTd 5dQc6d5c JdJc2hTh 8d4s2d9c"));
  }

  @Test
  public void test_omaha_holdem_8419_7d8h9hAcKh_5c5s7s3s_4d5hKcJh_Td6cKdJd_8dQs2d7h() {
    assertEquals(
      "5c5s7s3s 8dQs2d7h Td6cKdJd 4d5hKcJh",
      Solver.process("omaha-holdem 7d8h9hAcKh 5c5s7s3s 4d5hKcJh Td6cKdJd 8dQs2d7h"));
  }

  @Test
  public void test_omaha_holdem_8420_2c2s3s5hJd_Jh9s8s3h_5dQh5cKs_9dJs6sQc_9hJc3d7c_6d7h9cAd_6c4hThAs_8c7d8h4d() {
    assertEquals(
      "6d7h9cAd 8c7d8h4d 9dJs6sQc 9hJc3d7c=Jh9s8s3h 6c4hThAs 5dQh5cKs",
      Solver.process("omaha-holdem 2c2s3s5hJd Jh9s8s3h 5dQh5cKs 9dJs6sQc 9hJc3d7c 6d7h9cAd 6c4hThAs 8c7d8h4d"));
  }

  @Test
  public void test_omaha_holdem_8421_2h4d6d7dQh_TdQsKdAd_2d4c6hAs_3s8sAhJh_Jd6s3h9h_Th5h4s6c_5cKhTs7h_2sJc3dAc_Tc9s5sQc() {
    assertEquals(
      "3s8sAhJh 2sJc3dAc Jd6s3h9h 5cKhTs7h Tc9s5sQc 2d4c6hAs=Th5h4s6c TdQsKdAd",
      Solver.process("omaha-holdem 2h4d6d7dQh TdQsKdAd 2d4c6hAs 3s8sAhJh Jd6s3h9h Th5h4s6c 5cKhTs7h 2sJc3dAc Tc9s5sQc"));
  }

  @Test
  public void test_omaha_holdem_8422_5c9sKsQsTs_9h2hKd8d_JdJh7c6h_4cAcJs7h_8s6d3h7d() {
    assertEquals(
      "8s6d3h7d JdJh7c6h 9h2hKd8d 4cAcJs7h",
      Solver.process("omaha-holdem 5c9sKsQsTs 9h2hKd8d JdJh7c6h 4cAcJs7h 8s6d3h7d"));
  }

  @Test
  public void test_omaha_holdem_8423_3d6c6s7d9h_7h5d9sTh_5hAsQhJd_6d8cAh3c() {
    assertEquals(
      "5hAsQhJd 7h5d9sTh 6d8cAh3c",
      Solver.process("omaha-holdem 3d6c6s7d9h 7h5d9sTh 5hAsQhJd 6d8cAh3c"));
  }

  @Test
  public void test_omaha_holdem_8424_3c6h8d9hJs_8hKd7hQs_KhKcTdKs() {
    assertEquals(
      "8hKd7hQs KhKcTdKs",
      Solver.process("omaha-holdem 3c6h8d9hJs 8hKd7hQs KhKcTdKs"));
  }

  @Test
  public void test_omaha_holdem_8425_2c3c6d7d8s_JdKh5cJc_Ts3d6s4c_7cAh3h2d_2sKcTh8h_JhAd6hAc() {
    assertEquals(
      "JdKh5cJc JhAd6hAc Ts3d6s4c 7cAh3h2d 2sKcTh8h",
      Solver.process("omaha-holdem 2c3c6d7d8s JdKh5cJc Ts3d6s4c 7cAh3h2d 2sKcTh8h JhAd6hAc"));
  }

  @Test
  public void test_omaha_holdem_8426_5d6d6h7d9d_8hAhTsKd_6cAc4d6s_TdJd7hTc_Qh5h5c2c_Jc5s2s7c_4h3sKh3d_Ad9cThAs_8c2dJh3h() {
    assertEquals(
      "8c2dJh3h Jc5s2s7c Ad9cThAs 4h3sKh3d 8hAhTsKd TdJd7hTc Qh5h5c2c 6cAc4d6s",
      Solver.process("omaha-holdem 5d6d6h7d9d 8hAhTsKd 6cAc4d6s TdJd7hTc Qh5h5c2c Jc5s2s7c 4h3sKh3d Ad9cThAs 8c2dJh3h"));
  }

  @Test
  public void test_omaha_holdem_8427_4s6c8cQhTd_Kd7s2hJs_KhAc2s5h_6s2c9hJc_9c3s7cKs_8h3cTsAh_7dKc3hJd() {
    assertEquals(
      "7dKc3hJd=Kd7s2hJs KhAc2s5h 8h3cTsAh 9c3s7cKs 6s2c9hJc",
      Solver.process("omaha-holdem 4s6c8cQhTd Kd7s2hJs KhAc2s5h 6s2c9hJc 9c3s7cKs 8h3cTsAh 7dKc3hJd"));
  }

  @Test
  public void test_omaha_holdem_8428_2c3h6hKdTc_4h7d8cQs_8hTh4sAd_6d2h7c3s_7s9s4dJh_2sKc5dQh_5sJd5hKh_8d8sAc6s_3cAh9dJs() {
    assertEquals(
      "7s9s4dJh 4h7d8cQs 3cAh9dJs 8d8sAc6s 8hTh4sAd 5sJd5hKh 6d2h7c3s 2sKc5dQh",
      Solver.process("omaha-holdem 2c3h6hKdTc 4h7d8cQs 8hTh4sAd 6d2h7c3s 7s9s4dJh 2sKc5dQh 5sJd5hKh 8d8sAc6s 3cAh9dJs"));
  }

  @Test
  public void test_omaha_holdem_8429_2d3h8s9dKc_5c3s5hAs_Kd4sTd3c_7cQhAc9s() {
    assertEquals(
      "5c3s5hAs 7cQhAc9s Kd4sTd3c",
      Solver.process("omaha-holdem 2d3h8s9dKc 5c3s5hAs Kd4sTd3c 7cQhAc9s"));
  }

  @Test
  public void test_omaha_holdem_8430_2h6d8dQdTc_3s7dJhKh_Ks5s3dJc_3c4d5cKc_8h4c9h9s_7cQsAs6h_AcAh9c5d_3h2s8sTd() {
    assertEquals(
      "3c4d5cKc 3s7dJhKh=Ks5s3dJc 8h4c9h9s AcAh9c5d 3h2s8sTd 7cQsAs6h",
      Solver.process("omaha-holdem 2h6d8dQdTc 3s7dJhKh Ks5s3dJc 3c4d5cKc 8h4c9h9s 7cQsAs6h AcAh9c5d 3h2s8sTd"));
  }

  @Test
  public void test_omaha_holdem_8431_3c8d9c9sJc_9d7hThJs_2d6c6d9h_4cAh7cAs_TsAc7s3s_2c5d4dTc_TdKdQh8h() {
    assertEquals(
      "2d6c6d9h TsAc7s3s TdKdQh8h 4cAh7cAs 2c5d4dTc 9d7hThJs",
      Solver.process("omaha-holdem 3c8d9c9sJc 9d7hThJs 2d6c6d9h 4cAh7cAs TsAc7s3s 2c5d4dTc TdKdQh8h"));
  }

  @Test
  public void test_omaha_holdem_8432_7d7h8d9dAc_4c6cJsTd_2s4hTcQd_AdKhKdQc_Jh6d4d6h_2c8cQh5h_Ah5d3h3s_As9sKs4s_6sTh5cKc_5s3c2d8s() {
    assertEquals(
      "2s4hTcQd 5s3c2d8s 2c8cQh5h Ah5d3h3s As9sKs4s 6sTh5cKc 4c6cJsTd Jh6d4d6h AdKhKdQc",
      Solver.process("omaha-holdem 7d7h8d9dAc 4c6cJsTd 2s4hTcQd AdKhKdQc Jh6d4d6h 2c8cQh5h Ah5d3h3s As9sKs4s 6sTh5cKc 5s3c2d8s"));
  }

  @Test
  public void test_omaha_holdem_8433_4cAcAhQhQs_6h7c7sTs_JdQd4hAd_2s3cTcTh_KhJhQc5d_9s5h9c4d() {
    assertEquals(
      "6h7c7sTs 9s5h9c4d 2s3cTcTh KhJhQc5d JdQd4hAd",
      Solver.process("omaha-holdem 4cAcAhQhQs 6h7c7sTs JdQd4hAd 2s3cTcTh KhJhQc5d 9s5h9c4d"));
  }

  @Test
  public void test_omaha_holdem_8434_3h5h6cAcJc_Td2h7dJs_2d7c9s4d_Jh5dAh9h_2cKcTcQh_8s4c7s4h_3dTsKs8c() {
    assertEquals(
      "3dTsKs8c Td2h7dJs Jh5dAh9h 2d7c9s4d=8s4c7s4h 2cKcTcQh",
      Solver.process("omaha-holdem 3h5h6cAcJc Td2h7dJs 2d7c9s4d Jh5dAh9h 2cKcTcQh 8s4c7s4h 3dTsKs8c"));
  }

  @Test
  public void test_omaha_holdem_8435_5h6dJsKcTd_AhTh8d5d_5s9sAc9c() {
    assertEquals(
      "5s9sAc9c AhTh8d5d",
      Solver.process("omaha-holdem 5h6dJsKcTd AhTh8d5d 5s9sAc9c"));
  }

  @Test
  public void test_omaha_holdem_8436_7d7h8d9hJc_As3d8hQh_6hTs4cJd_9dQs5sTh_8cAh2c5c_Ac6s6dJh_Qc3c4dAd() {
    assertEquals(
      "Qc3c4dAd 8cAh2c5c=As3d8hQh Ac6s6dJh 6hTs4cJd 9dQs5sTh",
      Solver.process("omaha-holdem 7d7h8d9hJc As3d8hQh 6hTs4cJd 9dQs5sTh 8cAh2c5c Ac6s6dJh Qc3c4dAd"));
  }

  @Test
  public void test_omaha_holdem_8437_2h3h7c9dJs_Qh6dAhTd_5s7h2sKh_8d9c4c2d_QcKd8cQs_Ks3c4d6h_6sJc4h8h_3d5dAcAs_9hTcJd9s() {
    assertEquals(
      "Qh6dAhTd Ks3c4d6h 6sJc4h8h QcKd8cQs 3d5dAcAs 5s7h2sKh 8d9c4c2d 9hTcJd9s",
      Solver.process("omaha-holdem 2h3h7c9dJs Qh6dAhTd 5s7h2sKh 8d9c4c2d QcKd8cQs Ks3c4d6h 6sJc4h8h 3d5dAcAs 9hTcJd9s"));
  }

  @Test
  public void test_omaha_holdem_8438_2c4s7d8sAc_8hJd9hKs_6s8d6d7c_Js3s9s2d_KhJh9dQh_4d4cJc6c_Th5hKc5s_3h8c2sTs() {
    assertEquals(
      "KhJh9dQh Js3s9s2d Th5hKc5s 8hJd9hKs 3h8c2sTs 6s8d6d7c 4d4cJc6c",
      Solver.process("omaha-holdem 2c4s7d8sAc 8hJd9hKs 6s8d6d7c Js3s9s2d KhJh9dQh 4d4cJc6c Th5hKc5s 3h8c2sTs"));
  }

  @Test
  public void test_omaha_holdem_8439_7c7h8cJcTc_AcThJd3c_9c2h3s2d_9d7dAdTs_7s2sJh3d_6s5sKc5d_4sTd4cQs() {
    assertEquals(
      "9c2h3s2d 6s5sKc5d 4sTd4cQs AcThJd3c 9d7dAdTs 7s2sJh3d",
      Solver.process("omaha-holdem 7c7h8cJcTc AcThJd3c 9c2h3s2d 9d7dAdTs 7s2sJh3d 6s5sKc5d 4sTd4cQs"));
  }

  @Test
  public void test_omaha_holdem_8440_5s6d9hKdQd_8s7sJd4d_7cAs5c6s_2hKh8c6c_Qh9d9s3c() {
    assertEquals(
      "7cAs5c6s 2hKh8c6c Qh9d9s3c 8s7sJd4d",
      Solver.process("omaha-holdem 5s6d9hKdQd 8s7sJd4d 7cAs5c6s 2hKh8c6c Qh9d9s3c"));
  }

  @Test
  public void test_omaha_holdem_8441_2s6d7hAhJd_Qh7d8sQd_2c3dQc8c() {
    assertEquals(
      "2c3dQc8c Qh7d8sQd",
      Solver.process("omaha-holdem 2s6d7hAhJd Qh7d8sQd 2c3dQc8c"));
  }

  @Test
  public void test_omaha_holdem_8442_5h6h7sAhKs_KhJs9hJc_2sQhAd2c_4c2d5c7h_AcTdQs2h() {
    assertEquals(
      "2sQhAd2c=AcTdQs2h 4c2d5c7h KhJs9hJc",
      Solver.process("omaha-holdem 5h6h7sAhKs KhJs9hJc 2sQhAd2c 4c2d5c7h AcTdQs2h"));
  }

  @Test
  public void test_omaha_holdem_8443_3sJcQdTcTd_3dKc4c8d_AdAh8sTh_3h4sKs7c_AsJhQs5c_6d7d9d7s_2cKd2h9c_9s6c6s8c_2s6hQc4h() {
    assertEquals(
      "3dKc4c8d=3h4sKs7c 6d7d9d7s 2s6hQc4h AsJhQs5c AdAh8sTh 9s6c6s8c 2cKd2h9c",
      Solver.process("omaha-holdem 3sJcQdTcTd 3dKc4c8d AdAh8sTh 3h4sKs7c AsJhQs5c 6d7d9d7s 2cKd2h9c 9s6c6s8c 2s6hQc4h"));
  }

  @Test
  public void test_omaha_holdem_8444_5c6c8hKhTs_JcTcAd9c_2hAc3h3c() {
    assertEquals(
      "2hAc3h3c JcTcAd9c",
      Solver.process("omaha-holdem 5c6c8hKhTs JcTcAd9c 2hAc3h3c"));
  }

  @Test
  public void test_omaha_holdem_8445_9sAhJsKhTc_4c4hQd4d_8h5hAcQc_7c8s2s3h_KsJc6hTd_9c3d7h6s_6c7dTs2d_Jd5s3s5c_3c4sKd9h() {
    assertEquals(
      "4c4hQd4d 9c3d7h6s 6c7dTs2d Jd5s3s5c 3c4sKd9h KsJc6hTd 7c8s2s3h 8h5hAcQc",
      Solver.process("omaha-holdem 9sAhJsKhTc 4c4hQd4d 8h5hAcQc 7c8s2s3h KsJc6hTd 9c3d7h6s 6c7dTs2d Jd5s3s5c 3c4sKd9h"));
  }

  @Test
  public void test_omaha_holdem_8446_2s6d9dAhTh_8c9cKcAs_7h9s9h8d_7d5sKdQd_AcAd3hKs_6c2cKh6h_QcJd3c8h_8s7sTs2h() {
    assertEquals(
      "QcJd3c8h 7d5sKdQd 8c9cKcAs 6c2cKh6h AcAd3hKs 7h9s9h8d=8s7sTs2h",
      Solver.process("omaha-holdem 2s6d9dAhTh 8c9cKcAs 7h9s9h8d 7d5sKdQd AcAd3hKs 6c2cKh6h QcJd3c8h 8s7sTs2h"));
  }

  @Test
  public void test_omaha_holdem_8447_6c8c8hAdQh_3cKdJc9c_7dAh3sQc_8s2h5h7h_8d6d6sAc_Kh7s5c6h_3d4h4c5d_TsKc2sAs() {
    assertEquals(
      "3cKdJc9c 3d4h4c5d Kh7s5c6h TsKc2sAs 7dAh3sQc 8s2h5h7h 8d6d6sAc",
      Solver.process("omaha-holdem 6c8c8hAdQh 3cKdJc9c 7dAh3sQc 8s2h5h7h 8d6d6sAc Kh7s5c6h 3d4h4c5d TsKc2sAs"));
  }

  @Test
  public void test_omaha_holdem_8448_2c4c5h9sAd_AhQdJcJd_Qc2hQsTd_Jh5s8h7h() {
    assertEquals(
      "Jh5s8h7h Qc2hQsTd AhQdJcJd",
      Solver.process("omaha-holdem 2c4c5h9sAd AhQdJcJd Qc2hQsTd Jh5s8h7h"));
  }

  @Test
  public void test_omaha_holdem_8449_7h9c9sKsQh_4dQsAhKd_6d4sJcKc_9d3c8h8d_KhQd3hTc_TsAs6s5d() {
    assertEquals(
      "TsAs6s5d 6d4sJcKc 4dQsAhKd=KhQd3hTc 9d3c8h8d",
      Solver.process("omaha-holdem 7h9c9sKsQh 4dQsAhKd 6d4sJcKc 9d3c8h8d KhQd3hTc TsAs6s5d"));
  }

  @Test
  public void test_omaha_holdem_8450_2d2hAsJdTd_Kc2c8dTh_Ks3s9s3h_9dKh9c7c_3d8sQcAc_9h6h5c4h() {
    assertEquals(
      "9h6h5c4h Ks3s9s3h 9dKh9c7c 3d8sQcAc Kc2c8dTh",
      Solver.process("omaha-holdem 2d2hAsJdTd Kc2c8dTh Ks3s9s3h 9dKh9c7c 3d8sQcAc 9h6h5c4h"));
  }

  @Test
  public void test_omaha_holdem_8451_2d2h3s9dQs_TdQc8h8c_2sAcTh4c() {
    assertEquals(
      "TdQc8h8c 2sAcTh4c",
      Solver.process("omaha-holdem 2d2h3s9dQs TdQc8h8c 2sAcTh4c"));
  }

  @Test
  public void test_omaha_holdem_8452_2d3h5h7s9s_Kc9h7hQc_Ts8cAs5d_3c3s9d2h_4h8s7d7c_KhQs4dKd() {
    assertEquals(
      "Ts8cAs5d KhQs4dKd Kc9h7hQc 3c3s9d2h 4h8s7d7c",
      Solver.process("omaha-holdem 2d3h5h7s9s Kc9h7hQc Ts8cAs5d 3c3s9d2h 4h8s7d7c KhQs4dKd"));
  }

  @Test
  public void test_omaha_holdem_8453_5c6c9c9hJh_5sThAs4s_KcAdAc4c_2c6s4dJs_Qh3hKs5d_9s9d3s7s_2h6d8hKd() {
    assertEquals(
      "Qh3hKs5d 5sThAs4s 2h6d8hKd 2c6s4dJs KcAdAc4c 9s9d3s7s",
      Solver.process("omaha-holdem 5c6c9c9hJh 5sThAs4s KcAdAc4c 2c6s4dJs Qh3hKs5d 9s9d3s7s 2h6d8hKd"));
  }

  @Test
  public void test_omaha_holdem_8454_4h4sJhJsQd_9s6c9cQs_4dKdQc6d_3s7sJd8d_8c7d5c6h_As5d5sAd() {
    assertEquals(
      "8c7d5c6h 9s6c9cQs As5d5sAd 3s7sJd8d 4dKdQc6d",
      Solver.process("omaha-holdem 4h4sJhJsQd 9s6c9cQs 4dKdQc6d 3s7sJd8d 8c7d5c6h As5d5sAd"));
  }

  @Test
  public void test_omaha_holdem_8455_4c6s7d8sAh_5s8dQhTc_AcKh2h3c_Jc4sAd2d_Ks9c2s6c_Js8c9s8h_QsJd6h7s_9dThAs3s_5dTsQc3d_Jh3hQd7c() {
    assertEquals(
      "Ks9c2s6c Jh3hQd7c AcKh2h3c QsJd6h7s Jc4sAd2d Js8c9s8h 5dTsQc3d 5s8dQhTc 9dThAs3s",
      Solver.process("omaha-holdem 4c6s7d8sAh 5s8dQhTc AcKh2h3c Jc4sAd2d Ks9c2s6c Js8c9s8h QsJd6h7s 9dThAs3s 5dTsQc3d Jh3hQd7c"));
  }

  @Test
  public void test_omaha_holdem_8456_3d7dAhQcTs_6s8sTh8d_8c9cAdKs_5s8h7h9d_6d7sJh6c_2s3sJd5d_2d6h3cJc() {
    assertEquals(
      "2d6h3cJc=2s3sJd5d 5s8h7h9d 6d7sJh6c 6s8sTh8d 8c9cAdKs",
      Solver.process("omaha-holdem 3d7dAhQcTs 6s8sTh8d 8c9cAdKs 5s8h7h9d 6d7sJh6c 2s3sJd5d 2d6h3cJc"));
  }

  @Test
  public void test_omaha_holdem_8457_2h5h7hAhTd_3c4c9d7s_ThQdTs6c_6dQh6hJc() {
    assertEquals(
      "ThQdTs6c 3c4c9d7s 6dQh6hJc",
      Solver.process("omaha-holdem 2h5h7hAhTd 3c4c9d7s ThQdTs6c 6dQh6hJc"));
  }

  @Test
  public void test_omaha_holdem_8458_4c4h5h8cTd_TsKh8s3h_6sKd8d2s_9s8h2h7h_6c2dQsTh_9hKs6hAc_9d3cKc4s_Jc5s3s9c_5d3d2cTc_JdAhAs6d() {
    assertEquals(
      "9hKs6hAc Jc5s3s9c 9s8h2h7h 6sKd8d2s 6c2dQsTh 5d3d2cTc TsKh8s3h JdAhAs6d 9d3cKc4s",
      Solver.process("omaha-holdem 4c4h5h8cTd TsKh8s3h 6sKd8d2s 9s8h2h7h 6c2dQsTh 9hKs6hAc 9d3cKc4s Jc5s3s9c 5d3d2cTc JdAhAs6d"));
  }

  @Test
  public void test_omaha_holdem_8459_2h6h7hAdAh_KdTh4s9h_KcJc3hQh_TdQs2cQd() {
    assertEquals(
      "TdQs2cQd KdTh4s9h KcJc3hQh",
      Solver.process("omaha-holdem 2h6h7hAdAh KdTh4s9h KcJc3hQh TdQs2cQd"));
  }

  @Test
  public void test_omaha_holdem_8460_6h7h8h8sKs_8d9cAd5s_2s5h3cQs_2hAh6d7s_9d5c2cJd_AsThKdTs_4s4dTdJc_5d2d7c8c_9s7d4h3d() {
    assertEquals(
      "2s5h3cQs 4s4dTdJc 9s7d4h3d AsThKdTs 8d9cAd5s=9d5c2cJd 2hAh6d7s 5d2d7c8c",
      Solver.process("omaha-holdem 6h7h8h8sKs 8d9cAd5s 2s5h3cQs 2hAh6d7s 9d5c2cJd AsThKdTs 4s4dTdJc 5d2d7c8c 9s7d4h3d"));
  }

  @Test
  public void test_omaha_holdem_8461_3s8cJdKsQc_Th3d4hAs_Ah9s6hTc_Jc6c3h9c_6s4c4dQs_Ad7cKdQh() {
    assertEquals(
      "6s4c4dQs Jc6c3h9c Ad7cKdQh Ah9s6hTc=Th3d4hAs",
      Solver.process("omaha-holdem 3s8cJdKsQc Th3d4hAs Ah9s6hTc Jc6c3h9c 6s4c4dQs Ad7cKdQh"));
  }

  @Test
  public void test_omaha_holdem_8462_4h9dJdJsQs_Kd7cQdAc_KcTsKh2h_Qc4d2c7d_Th8h6h3s_2d6d7sQh_JcTd5d5h_3d5c3cAd_4s8dTcAh_5sAs9hKs() {
    assertEquals(
      "3d5c3cAd 5sAs9hKs 2d6d7sQh=Qc4d2c7d Kd7cQdAc JcTd5d5h 4s8dTcAh=Th8h6h3s KcTsKh2h",
      Solver.process("omaha-holdem 4h9dJdJsQs Kd7cQdAc KcTsKh2h Qc4d2c7d Th8h6h3s 2d6d7sQh JcTd5d5h 3d5c3cAd 4s8dTcAh 5sAs9hKs"));
  }

  @Test
  public void test_omaha_holdem_8463_6s8c9sKsQs_JsTd3dQd_Ad4c2dKc_TsQc2sTc_Kh5h9c3c_7h2c6h6c_9h8h3sQh_6dJh7cAs_Jc9d2h3h() {
    assertEquals(
      "6dJh7cAs Jc9d2h3h Ad4c2dKc 9h8h3sQh Kh5h9c3c 7h2c6h6c JsTd3dQd TsQc2sTc",
      Solver.process("omaha-holdem 6s8c9sKsQs JsTd3dQd Ad4c2dKc TsQc2sTc Kh5h9c3c 7h2c6h6c 9h8h3sQh 6dJh7cAs Jc9d2h3h"));
  }

  @Test
  public void test_omaha_holdem_8464_4h5c5h6cAd_8sKhJcAh_6hJh2s6d_6s7sQdQh_KdQc4dTs_9s3cTdJd_9hKc3sAc() {
    assertEquals(
      "9s3cTdJd KdQc4dTs 6s7sQdQh 8sKhJcAh=9hKc3sAc 6hJh2s6d",
      Solver.process("omaha-holdem 4h5c5h6cAd 8sKhJcAh 6hJh2s6d 6s7sQdQh KdQc4dTs 9s3cTdJd 9hKc3sAc"));
  }

  @Test
  public void test_omaha_holdem_8465_4c4h5s7hKs_3dKcAh3s_AdJdJs5h_8c7s5cKd_9h3hKh8d_Jc2d6sJh_6hAc9cQc_TcAsTs8h() {
    assertEquals(
      "6hAc9cQc TcAsTs8h AdJdJs5h=Jc2d6sJh 9h3hKh8d 3dKcAh3s 8c7s5cKd",
      Solver.process("omaha-holdem 4c4h5s7hKs 3dKcAh3s AdJdJs5h 8c7s5cKd 9h3hKh8d Jc2d6sJh 6hAc9cQc TcAsTs8h"));
  }

  @Test
  public void test_omaha_holdem_8466_2c3d4c4sJc_AsQd5d9h_2hQh7d2s_8s6dAh4d_7s2dJhTh_KcQs6h5c_Ks7c7hTd() {
    assertEquals(
      "Ks7c7hTd 7s2dJhTh 8s6dAh4d AsQd5d9h KcQs6h5c 2hQh7d2s",
      Solver.process("omaha-holdem 2c3d4c4sJc AsQd5d9h 2hQh7d2s 8s6dAh4d 7s2dJhTh KcQs6h5c Ks7c7hTd"));
  }

  @Test
  public void test_omaha_holdem_8467_5h6c8sAdTh_Kd8c9c5s_Kh2s6hTs_6s4sKs4c() {
    assertEquals(
      "6s4sKs4c Kd8c9c5s Kh2s6hTs",
      Solver.process("omaha-holdem 5h6c8sAdTh Kd8c9c5s Kh2s6hTs 6s4sKs4c"));
  }

  @Test
  public void test_omaha_holdem_8468_2c2h3sJsTs_9cAh5sAs_Td7hAd8c_Ks6d8d7c_Qh8hTcKh_KcQd8sJh_Qc3h5c4h_Ac7s7d6c_Jc9h2d6s() {
    assertEquals(
      "Ks6d8d7c Qc3h5c4h Ac7s7d6c Qh8hTcKh Td7hAd8c KcQd8sJh 9cAh5sAs Jc9h2d6s",
      Solver.process("omaha-holdem 2c2h3sJsTs 9cAh5sAs Td7hAd8c Ks6d8d7c Qh8hTcKh KcQd8sJh Qc3h5c4h Ac7s7d6c Jc9h2d6s"));
  }

  @Test
  public void test_omaha_holdem_8469_4h5c5h7sAs_Ah7h6hAd_5d8dKsQc_QdKc2hQs_3sQh4c5s_2sJh7dJc_3c9hJs2d_9d6d3d9s_Ts9cKd4s() {
    assertEquals(
      "Ts9cKd4s 2sJh7dJc QdKc2hQs 5d8dKsQc 3c9hJs2d 9d6d3d9s 3sQh4c5s Ah7h6hAd",
      Solver.process("omaha-holdem 4h5c5h7sAs Ah7h6hAd 5d8dKsQc QdKc2hQs 3sQh4c5s 2sJh7dJc 3c9hJs2d 9d6d3d9s Ts9cKd4s"));
  }

  @Test
  public void test_omaha_holdem_8470_2s6c7s8c9s_4c9d3c5s_6hKc6dJh_4h5cQcKd_4sQsJc7c_5dJdTdTh_2hAc9h9c_KsTsJsAh() {
    assertEquals(
      "6hKc6dJh 2hAc9h9c 4h5cQcKd 4c9d3c5s 5dJdTdTh 4sQsJc7c KsTsJsAh",
      Solver.process("omaha-holdem 2s6c7s8c9s 4c9d3c5s 6hKc6dJh 4h5cQcKd 4sQsJc7c 5dJdTdTh 2hAc9h9c KsTsJsAh"));
  }

  @Test
  public void test_omaha_holdem_8471_2d2s6cJcQd_5d5h2cJs_9sAhAc6h() {
    assertEquals(
      "9sAhAc6h 5d5h2cJs",
      Solver.process("omaha-holdem 2d2s6cJcQd 5d5h2cJs 9sAhAc6h"));
  }

  @Test
  public void test_omaha_holdem_8472_3c4s5c6sKc_9h2hTdJs_9sJcTsKd() {
    assertEquals(
      "9h2hTdJs 9sJcTsKd",
      Solver.process("omaha-holdem 3c4s5c6sKc 9h2hTdJs 9sJcTsKd"));
  }

  @Test
  public void test_omaha_holdem_8473_4d5c5s8dQd_7d2s3s4s_7cKc6dJs_KdQh8hAd_Kh9sTsJd_JhTh3c8c() {
    assertEquals(
      "Kh9sTsJd 7d2s3s4s JhTh3c8c 7cKc6dJs KdQh8hAd",
      Solver.process("omaha-holdem 4d5c5s8dQd 7d2s3s4s 7cKc6dJs KdQh8hAd Kh9sTsJd JhTh3c8c"));
  }

  @Test
  public void test_omaha_holdem_8474_4c4h6h8dTd_Tc8hAsJs_7cKc2dTh_2s2hKh5s_3d9dQdAd_6dQc8sJh_2c3h4d9c_Qs6s6cKd_Ks4s3s7h() {
    assertEquals(
      "3d9dQdAd 2s2hKh5s 6dQc8sJh 7cKc2dTh Tc8hAsJs 2c3h4d9c Ks4s3s7h Qs6s6cKd",
      Solver.process("omaha-holdem 4c4h6h8dTd Tc8hAsJs 7cKc2dTh 2s2hKh5s 3d9dQdAd 6dQc8sJh 2c3h4d9c Qs6s6cKd Ks4s3s7h"));
  }

  @Test
  public void test_omaha_holdem_8475_2c4hAdAhQh_7cQs2sAc_9sKd9hJc_Th3h5c9c_TcKh6d2d_3cQd6sJd_Js7sJh5h_4cQcTs8h_As8s9d8c_2h8d3s6c() {
    assertEquals(
      "2h8d3s6c TcKh6d2d 9sKd9hJc 4cQcTs8h 3cQd6sJd As8s9d8c Th3h5c9c Js7sJh5h 7cQs2sAc",
      Solver.process("omaha-holdem 2c4hAdAhQh 7cQs2sAc 9sKd9hJc Th3h5c9c TcKh6d2d 3cQd6sJd Js7sJh5h 4cQcTs8h As8s9d8c 2h8d3s6c"));
  }

  @Test
  public void test_omaha_holdem_8476_3c3h5h6d9c_9h2s8d9s_7sTdAd5d_Jh2d7h4d_5sQsKh2h_As8c4cTh_QdJc3d5c() {
    assertEquals(
      "As8c4cTh 5sQsKh2h 7sTdAd5d Jh2d7h4d QdJc3d5c 9h2s8d9s",
      Solver.process("omaha-holdem 3c3h5h6d9c 9h2s8d9s 7sTdAd5d Jh2d7h4d 5sQsKh2h As8c4cTh QdJc3d5c"));
  }

  @Test
  public void test_omaha_holdem_8477_2h3c3s6cKc_AcQc6h4s_Kd2s9cQs_8h4h6dQd_2c5d7d3d_Ts8c9s5c_8d4cJsAs_Tc9hJcKs_ThJd7sTd() {
    assertEquals(
      "8d4cJsAs 8h4h6dQd ThJd7sTd Kd2s9cQs Ts8c9s5c Tc9hJcKs AcQc6h4s 2c5d7d3d",
      Solver.process("omaha-holdem 2h3c3s6cKc AcQc6h4s Kd2s9cQs 8h4h6dQd 2c5d7d3d Ts8c9s5c 8d4cJsAs Tc9hJcKs ThJd7sTd"));
  }

  @Test
  public void test_omaha_holdem_8478_2c5c6d8dTs_8c2dAdQh_5d4hKs7s_3sTc9h8h() {
    assertEquals(
      "8c2dAdQh 3sTc9h8h 5d4hKs7s",
      Solver.process("omaha-holdem 2c5c6d8dTs 8c2dAdQh 5d4hKs7s 3sTc9h8h"));
  }

  @Test
  public void test_omaha_holdem_8479_5d9sAcKdKs_7d7cTcQs_8d3h3d5h_As7h3s3c_Kh6dTdJh_2hKc5cQd() {
    assertEquals(
      "8d3h3d5h 7d7cTcQs As7h3s3c Kh6dTdJh 2hKc5cQd",
      Solver.process("omaha-holdem 5d9sAcKdKs 7d7cTcQs 8d3h3d5h As7h3s3c Kh6dTdJh 2hKc5cQd"));
  }

  @Test
  public void test_omaha_holdem_8480_7s8sJsKhTc_2h7d5d6c_2c3h5hJc_3c6d6sQc_KcJh5c4c() {
    assertEquals(
      "3c6d6sQc 2h7d5d6c 2c3h5hJc KcJh5c4c",
      Solver.process("omaha-holdem 7s8sJsKhTc 2h7d5d6c 2c3h5hJc 3c6d6sQc KcJh5c4c"));
  }

  @Test
  public void test_omaha_holdem_8481_4d5c9c9sKc_8dQc6sTc_8s3s9hJd() {
    assertEquals(
      "8s3s9hJd 8dQc6sTc",
      Solver.process("omaha-holdem 4d5c9c9sKc 8dQc6sTc 8s3s9hJd"));
  }

  @Test
  public void test_omaha_holdem_8482_3s7sAhAsKd_3cQsQd4h_9s5s4d6h_Td8d2s3d_AcTcJs9d() {
    assertEquals(
      "Td8d2s3d 3cQsQd4h AcTcJs9d 9s5s4d6h",
      Solver.process("omaha-holdem 3s7sAhAsKd 3cQsQd4h 9s5s4d6h Td8d2s3d AcTcJs9d"));
  }

  @Test
  public void test_omaha_holdem_8483_3s4h6d6hAs_4dTcTd6c_Qs8d9s5d_Jd2dAd8c_AhJc2sKh_Qh7sKc7c_5s9c9d4c() {
    assertEquals(
      "Qs8d9s5d Qh7sKc7c 5s9c9d4c Jd2dAd8c AhJc2sKh 4dTcTd6c",
      Solver.process("omaha-holdem 3s4h6d6hAs 4dTcTd6c Qs8d9s5d Jd2dAd8c AhJc2sKh Qh7sKc7c 5s9c9d4c"));
  }

  @Test
  public void test_omaha_holdem_8484_4h6hKhThTs_4c7h3c3s_Qd2h2s8d_5d6sJd2c() {
    assertEquals(
      "Qd2h2s8d 4c7h3c3s 5d6sJd2c",
      Solver.process("omaha-holdem 4h6hKhThTs 4c7h3c3s Qd2h2s8d 5d6sJd2c"));
  }

  @Test
  public void test_omaha_holdem_8485_5c5d6s8sQc_Ac3h2d8c_5h7c9sAh_Qs4sJd6h_3s9cTc4c_7s2s2hQh_JsJhAd8d() {
    assertEquals(
      "3s9cTc4c Ac3h2d8c JsJhAd8d 7s2s2hQh Qs4sJd6h 5h7c9sAh",
      Solver.process("omaha-holdem 5c5d6s8sQc Ac3h2d8c 5h7c9sAh Qs4sJd6h 3s9cTc4c 7s2s2hQh JsJhAd8d"));
  }

  @Test
  public void test_omaha_holdem_8486_2s9sAdJcTh_Js4d9hQh_2hJh3s2d_4h3hQd7s_QcTcAhKh_4c5d2c6h_Ac8d3d7d_7h8h9dQs_5s3cTs6c_Td5cKc9c() {
    assertEquals(
      "4h3hQd7s 4c5d2c6h 5s3cTs6c Td5cKc9c Js4d9hQh 2hJh3s2d Ac8d3d7d 7h8h9dQs QcTcAhKh",
      Solver.process("omaha-holdem 2s9sAdJcTh Js4d9hQh 2hJh3s2d 4h3hQd7s QcTcAhKh 4c5d2c6h Ac8d3d7d 7h8h9dQs 5s3cTs6c Td5cKc9c"));
  }

  @Test
  public void test_omaha_holdem_8487_3d4c8c9cQd_3c6c7sKd_As6dTsQh() {
    assertEquals(
      "As6dTsQh 3c6c7sKd",
      Solver.process("omaha-holdem 3d4c8c9cQd 3c6c7sKd As6dTsQh"));
  }

  @Test
  public void test_omaha_holdem_8488_8sAhKcTcTd_5h8cKsJc_Kh7hQh2c_Ac5dQs4s_6hAs6s4c_2s9dJs3s_7d3d3c5s() {
    assertEquals(
      "2s9dJs3s 7d3d3c5s 5h8cKsJc Kh7hQh2c 6hAs6s4c Ac5dQs4s",
      Solver.process("omaha-holdem 8sAhKcTcTd 5h8cKsJc Kh7hQh2c Ac5dQs4s 6hAs6s4c 2s9dJs3s 7d3d3c5s"));
  }

  @Test
  public void test_omaha_holdem_8489_9c9dJdQdQh_3s6cTdJc_4hTs5h8s_5d8h3dTh_KdJs5sKs_AdTc7s4d_Jh8d4sAc_2c2dKcKh_2s7hAh7d() {
    assertEquals(
      "2s7hAh7d 3s6cTdJc Jh8d4sAc 2c2dKcKh=KdJs5sKs 4hTs5h8s 5d8h3dTh AdTc7s4d",
      Solver.process("omaha-holdem 9c9dJdQdQh 3s6cTdJc 4hTs5h8s 5d8h3dTh KdJs5sKs AdTc7s4d Jh8d4sAc 2c2dKcKh 2s7hAh7d"));
  }

  @Test
  public void test_omaha_holdem_8490_5c7hAcJsTh_JcTcKhTs_7cKcAs8d() {
    assertEquals(
      "7cKcAs8d JcTcKhTs",
      Solver.process("omaha-holdem 5c7hAcJsTh JcTcKhTs 7cKcAs8d"));
  }

  @Test
  public void test_omaha_holdem_8491_2c4hJsKhQc_AdTsQdJc_Kd8c7c7h_Ac9hTh2d_9s5c3s2s_6sKs3c4s_7s4d7dTc() {
    assertEquals(
      "9s5c3s2s 7s4d7dTc Kd8c7c7h 6sKs3c4s Ac9hTh2d=AdTsQdJc",
      Solver.process("omaha-holdem 2c4hJsKhQc AdTsQdJc Kd8c7c7h Ac9hTh2d 9s5c3s2s 6sKs3c4s 7s4d7dTc"));
  }

  @Test
  public void test_omaha_holdem_8492_3d4s5c9dAh_QcQs7dKs_9s2cAdKh() {
    assertEquals(
      "QcQs7dKs 9s2cAdKh",
      Solver.process("omaha-holdem 3d4s5c9dAh QcQs7dKs 9s2cAdKh"));
  }

  @Test
  public void test_omaha_holdem_8493_3h8cKdQdQs_5hQh5d7s_2dAd6d2s_7hAh3d4d_Td4h8h9c_Jh5cTs9d_4s7c5s7d_TcJs9s8d() {
    assertEquals(
      "Jh5cTs9d 2dAd6d2s 7hAh3d4d 4s7c5s7d Td4h8h9c TcJs9s8d 5hQh5d7s",
      Solver.process("omaha-holdem 3h8cKdQdQs 5hQh5d7s 2dAd6d2s 7hAh3d4d Td4h8h9c Jh5cTs9d 4s7c5s7d TcJs9s8d"));
  }

  @Test
  public void test_omaha_holdem_8494_5c6h7sQcQd_Ac2s7d9s_8sAsKhTd_2h7hJdAd_7cKsAh8h() {
    assertEquals(
      "8sAsKhTd 2h7hJdAd=7cKsAh8h=Ac2s7d9s",
      Solver.process("omaha-holdem 5c6h7sQcQd Ac2s7d9s 8sAsKhTd 2h7hJdAd 7cKsAh8h"));
  }

  @Test
  public void test_omaha_holdem_8495_4d6sKsQhTs_Js2d4c3c_Qd4hJc2h_7s8c7d6h_KdAd6dTd_2cTc5h4s_KcAh3dJd_3s3h7hTh_9c2s7c5d_5s8sAsAc() {
    assertEquals(
      "9c2s7c5d Js2d4c3c 7s8c7d6h 3s3h7hTh 2cTc5h4s Qd4hJc2h KdAd6dTd KcAh3dJd 5s8sAsAc",
      Solver.process("omaha-holdem 4d6sKsQhTs Js2d4c3c Qd4hJc2h 7s8c7d6h KdAd6dTd 2cTc5h4s KcAh3dJd 3s3h7hTh 9c2s7c5d 5s8sAsAc"));
  }

  @Test
  public void test_omaha_holdem_8496_5d6dAcAhQd_8d2h9h4d_Ks2c8cKh() {
    assertEquals(
      "Ks2c8cKh 8d2h9h4d",
      Solver.process("omaha-holdem 5d6dAcAhQd 8d2h9h4d Ks2c8cKh"));
  }

  @Test
  public void test_omaha_holdem_8497_4d4s6c8dQh_JdQs7s3h_3sAd7c5h() {
    assertEquals(
      "JdQs7s3h 3sAd7c5h",
      Solver.process("omaha-holdem 4d4s6c8dQh JdQs7s3h 3sAd7c5h"));
  }

  @Test
  public void test_omaha_holdem_8498_5d6h8cThTs_8hAcKdJd_KsQdTdJh() {
    assertEquals(
      "8hAcKdJd KsQdTdJh",
      Solver.process("omaha-holdem 5d6h8cThTs 8hAcKdJd KsQdTdJh"));
  }

  @Test
  public void test_omaha_holdem_8499_2s4c6h7dAd_Js9s3s6d_3hKh3d8d() {
    assertEquals(
      "3hKh3d8d Js9s3s6d",
      Solver.process("omaha-holdem 2s4c6h7dAd Js9s3s6d 3hKh3d8d"));
  }

}
