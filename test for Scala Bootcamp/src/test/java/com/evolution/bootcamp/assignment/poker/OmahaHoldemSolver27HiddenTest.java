
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver27HiddenTest {


  @Test
  public void test_omaha_holdem_6750_4d5d6dJcTc_8h6hJs3h_2cAhKd5h_JhQs8d8s_5cKcQc5s_9dKh3s2s_2h4h4cAd_Jd7s9h7d_4s7hQh9s_2dQdAsTh() {
    assertEquals(
      "4s7hQh9s 2cAhKd5h JhQs8d8s 8h6hJs3h 2h4h4cAd 5cKcQc5s 9dKh3s2s Jd7s9h7d 2dQdAsTh",
      Solver.process("omaha-holdem 4d5d6dJcTc 8h6hJs3h 2cAhKd5h JhQs8d8s 5cKcQc5s 9dKh3s2s 2h4h4cAd Jd7s9h7d 4s7hQh9s 2dQdAsTh"));
  }

  @Test
  public void test_omaha_holdem_6751_3c3d3s4dKh_7c6s2cQd_6c8s5h4c() {
    assertEquals(
      "6c8s5h4c 7c6s2cQd",
      Solver.process("omaha-holdem 3c3d3s4dKh 7c6s2cQd 6c8s5h4c"));
  }

  @Test
  public void test_omaha_holdem_6752_5h6dKcQcQd_4dQs7h9s_TsAs3c4h_Ac2c5s3s() {
    assertEquals(
      "TsAs3c4h Ac2c5s3s 4dQs7h9s",
      Solver.process("omaha-holdem 5h6dKcQcQd 4dQs7h9s TsAs3c4h Ac2c5s3s"));
  }

  @Test
  public void test_omaha_holdem_6753_8c8d8hKhTc_4hJcAc6s_KsAh2hTs_7h6cJdAd_3c7d3h9h_6h3s4sJh_9s6d5d2s_Qd4cKd7s_7c2dQsQc() {
    assertEquals(
      "9s6d5d2s 6h3s4sJh Qd4cKd7s 4hJcAc6s=7h6cJdAd KsAh2hTs 3c7d3h9h 7c2dQsQc",
      Solver.process("omaha-holdem 8c8d8hKhTc 4hJcAc6s KsAh2hTs 7h6cJdAd 3c7d3h9h 6h3s4sJh 9s6d5d2s Qd4cKd7s 7c2dQsQc"));
  }

  @Test
  public void test_omaha_holdem_6754_2s3sAsQcTh_2dTcKc9h_4d2h8cKs_4c2cJhQs_5s6h9d6d_4hAh7d9s() {
    assertEquals(
      "4d2h8cKs 5s6h9d6d 4hAh7d9s 2dTcKc9h 4c2cJhQs",
      Solver.process("omaha-holdem 2s3sAsQcTh 2dTcKc9h 4d2h8cKs 4c2cJhQs 5s6h9d6d 4hAh7d9s"));
  }

  @Test
  public void test_omaha_holdem_6755_3c5hJsKdQc_KhAcTc2h_6c8cAhAs_8sTsAd9d_5s3dKc8d_Jc3s9cTh_8h6s5cJd() {
    assertEquals(
      "6c8cAhAs 8h6s5cJd 5s3dKc8d Jc3s9cTh 8sTsAd9d=KhAcTc2h",
      Solver.process("omaha-holdem 3c5hJsKdQc KhAcTc2h 6c8cAhAs 8sTsAd9d 5s3dKc8d Jc3s9cTh 8h6s5cJd"));
  }

  @Test
  public void test_omaha_holdem_6756_4h5c6sAcKh_7dAdTh9c_5d9d3s6h_2c6d9s8d() {
    assertEquals(
      "2c6d9s8d 7dAdTh9c 5d9d3s6h",
      Solver.process("omaha-holdem 4h5c6sAcKh 7dAdTh9c 5d9d3s6h 2c6d9s8d"));
  }

  @Test
  public void test_omaha_holdem_6757_3c4c9cThTs_Kd8cKs5h_Qs7dTc7c() {
    assertEquals(
      "Kd8cKs5h Qs7dTc7c",
      Solver.process("omaha-holdem 3c4c9cThTs Kd8cKs5h Qs7dTc7c"));
  }

  @Test
  public void test_omaha_holdem_6758_3c3s7sQhTc_2s7c3d2h_9s8dJcKd_6sKh4d5h_ThQdQc4s_KsJdAs8h_6hTd7h8c_2dKc3h4c() {
    assertEquals(
      "6sKh4d5h 9s8dJcKd KsJdAs8h 6hTd7h8c 2dKc3h4c 2s7c3d2h ThQdQc4s",
      Solver.process("omaha-holdem 3c3s7sQhTc 2s7c3d2h 9s8dJcKd 6sKh4d5h ThQdQc4s KsJdAs8h 6hTd7h8c 2dKc3h4c"));
  }

  @Test
  public void test_omaha_holdem_6759_2h3s4d4hAc_7cQc9sJs_4cTd5cJc_5hKd7s9d() {
    assertEquals(
      "7cQc9sJs 5hKd7s9d 4cTd5cJc",
      Solver.process("omaha-holdem 2h3s4d4hAc 7cQc9sJs 4cTd5cJc 5hKd7s9d"));
  }

  @Test
  public void test_omaha_holdem_6760_2d3h8c9dKd_6h4h7dAs_9sJhJd4d_8s7sTd8h_3dKh6d5c() {
    assertEquals(
      "6h4h7dAs 8s7sTd8h 3dKh6d5c 9sJhJd4d",
      Solver.process("omaha-holdem 2d3h8c9dKd 6h4h7dAs 9sJhJd4d 8s7sTd8h 3dKh6d5c"));
  }

  @Test
  public void test_omaha_holdem_6761_4h9sJsKsTs_5s3dAh4c_2cQdTdAd_8cKdJhKh_6s5cAs7s_Jc6cJd9c() {
    assertEquals(
      "5s3dAh4c Jc6cJd9c 8cKdJhKh 2cQdTdAd 6s5cAs7s",
      Solver.process("omaha-holdem 4h9sJsKsTs 5s3dAh4c 2cQdTdAd 8cKdJhKh 6s5cAs7s Jc6cJd9c"));
  }

  @Test
  public void test_omaha_holdem_6762_3hAcJsKcTh_6c4s2d4c_6d7s2s2h_TcKdQsQh() {
    assertEquals(
      "6d7s2s2h 6c4s2d4c TcKdQsQh",
      Solver.process("omaha-holdem 3hAcJsKcTh 6c4s2d4c 6d7s2s2h TcKdQsQh"));
  }

  @Test
  public void test_omaha_holdem_6763_3d3h4h5hAd_AcKd7cQc_Td8cKc5c_6d9cJs7s_Jh7hTh3c_5s6s8sJc_Tc8dJdAh_2s2cAs9h_6hKsKh8h() {
    assertEquals(
      "5s6s8sJc Td8cKc5c Tc8dJdAh AcKd7cQc 2s2cAs9h 6d9cJs7s Jh7hTh3c 6hKsKh8h",
      Solver.process("omaha-holdem 3d3h4h5hAd AcKd7cQc Td8cKc5c 6d9cJs7s Jh7hTh3c 5s6s8sJc Tc8dJdAh 2s2cAs9h 6hKsKh8h"));
  }

  @Test
  public void test_omaha_holdem_6764_3d5c6cAsJd_3h2sQc5s_KcKh9c8d_Th4d6h6s_TdKs2c4h_5h7c6d9h_QhJhJc2h_9s8hTs4c_2dTc7d7s_JsQd7hQs() {
    assertEquals(
      "9s8hTs4c 2dTc7d7s JsQd7hQs KcKh9c8d 3h2sQc5s 5h7c6d9h Th4d6h6s QhJhJc2h TdKs2c4h",
      Solver.process("omaha-holdem 3d5c6cAsJd 3h2sQc5s KcKh9c8d Th4d6h6s TdKs2c4h 5h7c6d9h QhJhJc2h 9s8hTs4c 2dTc7d7s JsQd7hQs"));
  }

  @Test
  public void test_omaha_holdem_6765_4h5s6d9sQd_8sAhTc5c_3c5hKhQc_2s4sKd6h_Qs8d9d2h_Js9h3hTh() {
    assertEquals(
      "8sAhTc5c Js9h3hTh 2s4sKd6h 3c5hKhQc Qs8d9d2h",
      Solver.process("omaha-holdem 4h5s6d9sQd 8sAhTc5c 3c5hKhQc 2s4sKd6h Qs8d9d2h Js9h3hTh"));
  }

  @Test
  public void test_omaha_holdem_6766_5s7c8h9hTh_KdJdQh7h_8cKcTd6d() {
    assertEquals(
      "8cKcTd6d KdJdQh7h",
      Solver.process("omaha-holdem 5s7c8h9hTh KdJdQh7h 8cKcTd6d"));
  }

  @Test
  public void test_omaha_holdem_6767_2d4h4sTdTh_7c2cQd9c_3hJs3s3d_JdKdJh9d_Ts8s7d8h_Ad2sQs6c_Qc5s8d5d_6d7h6sAc_7sTcJc8c_5cAsKsKh() {
    assertEquals(
      "7c2cQd9c Ad2sQs6c 3hJs3s3d Qc5s8d5d 6d7h6sAc JdKdJh9d 5cAsKsKh Ts8s7d8h 7sTcJc8c",
      Solver.process("omaha-holdem 2d4h4sTdTh 7c2cQd9c 3hJs3s3d JdKdJh9d Ts8s7d8h Ad2sQs6c Qc5s8d5d 6d7h6sAc 7sTcJc8c 5cAsKsKh"));
  }

  @Test
  public void test_omaha_holdem_6768_2c3s6d9hTs_5cKs6s4s_As3c7s7c_8d9s9cTh_Jh4dTdJc_Qd2h3hAd_5dQc2d9d_Kd8sAc4c_8h6hTc4h_2s3d8c5s() {
    assertEquals(
      "Kd8sAc4c As3c7s7c Jh4dTdJc 2s3d8c5s=Qd2h3hAd 5dQc2d9d 8h6hTc4h 8d9s9cTh 5cKs6s4s",
      Solver.process("omaha-holdem 2c3s6d9hTs 5cKs6s4s As3c7s7c 8d9s9cTh Jh4dTdJc Qd2h3hAd 5dQc2d9d Kd8sAc4c 8h6hTc4h 2s3d8c5s"));
  }

  @Test
  public void test_omaha_holdem_6769_2d3h6d8dJd_TdJcAd9s_8h6c7s9d_7dAhKsAc_Qd3dTcQc_8c5c7h3c_KhJs6s5h_Ts2h5s7c_5dTh9c2s_KcQhJh4d() {
    assertEquals(
      "5dTh9c2s=Ts2h5s7c KcQhJh4d 7dAhKsAc 8c5c7h3c 8h6c7s9d KhJs6s5h Qd3dTcQc TdJcAd9s",
      Solver.process("omaha-holdem 2d3h6d8dJd TdJcAd9s 8h6c7s9d 7dAhKsAc Qd3dTcQc 8c5c7h3c KhJs6s5h Ts2h5s7c 5dTh9c2s KcQhJh4d"));
  }

  @Test
  public void test_omaha_holdem_6770_3d6d8sJsTc_5d4d3s9d_3cKc7sJh_7h8d3h8c_7c5h5s5c_6hKs9s2d_4s6cQcQd_Ad9hKhQh_6sTdAh2s() {
    assertEquals(
      "5d4d3s9d 7c5h5s5c 6hKs9s2d 4s6cQcQd 6sTdAh2s 3cKc7sJh 7h8d3h8c Ad9hKhQh",
      Solver.process("omaha-holdem 3d6d8sJsTc 5d4d3s9d 3cKc7sJh 7h8d3h8c 7c5h5s5c 6hKs9s2d 4s6cQcQd Ad9hKhQh 6sTdAh2s"));
  }

  @Test
  public void test_omaha_holdem_6771_5c9cJhKdKs_TcJc8d3c_3hAh4h3d_8s6hTd4s_Jd4dThTs_AcQd6s2s_Kc6dKhAs() {
    assertEquals(
      "8s6hTd4s AcQd6s2s 3hAh4h3d Jd4dThTs=TcJc8d3c Kc6dKhAs",
      Solver.process("omaha-holdem 5c9cJhKdKs TcJc8d3c 3hAh4h3d 8s6hTd4s Jd4dThTs AcQd6s2s Kc6dKhAs"));
  }

  @Test
  public void test_omaha_holdem_6772_2c4d6d8h8s_Qc2sTh7d_Kh8dAc8c() {
    assertEquals(
      "Qc2sTh7d Kh8dAc8c",
      Solver.process("omaha-holdem 2c4d6d8h8s Qc2sTh7d Kh8dAc8c"));
  }

  @Test
  public void test_omaha_holdem_6773_6c8cAhQdQs_5s2h2dJd_7c9c2s4s_9d8s7dJc_6dTc4h4c_3cKh8dJh_7h9sAs6s_7s5dKcQh_6h5c3d2c_TsAdQcAc() {
    assertEquals(
      "7c9c2s4s 5s2h2dJd 6h5c3d2c 6dTc4h4c 9d8s7dJc 3cKh8dJh 7h9sAs6s 7s5dKcQh TsAdQcAc",
      Solver.process("omaha-holdem 6c8cAhQdQs 5s2h2dJd 7c9c2s4s 9d8s7dJc 6dTc4h4c 3cKh8dJh 7h9sAs6s 7s5dKcQh 6h5c3d2c TsAdQcAc"));
  }

  @Test
  public void test_omaha_holdem_6774_2h4s9dJcKh_Kc8dTd9h_Ah6s4dKs() {
    assertEquals(
      "Ah6s4dKs Kc8dTd9h",
      Solver.process("omaha-holdem 2h4s9dJcKh Kc8dTd9h Ah6s4dKs"));
  }

  @Test
  public void test_omaha_holdem_6775_2c3dAcJdQc_Qd4dKc8h_Qs5d6d6s_As8d9c7s_Ks8s2d4h_5sJsAh2h_7h5c4cQh_Tc7d8c9s_Ts9h3s3c_JcJh6h4s() {
    assertEquals(
      "Ks8s2d4h Qs5d6d6s Qd4dKc8h As8d9c7s 5sJsAh2h Ts9h3s3c JcJh6h4s 7h5c4cQh Tc7d8c9s",
      Solver.process("omaha-holdem 2c3dAcJdQc Qd4dKc8h Qs5d6d6s As8d9c7s Ks8s2d4h 5sJsAh2h 7h5c4cQh Tc7d8c9s Ts9h3s3c JcJh6h4s"));
  }

  @Test
  public void test_omaha_holdem_6776_5d8sAsQhTs_Jd9d5hKh_2s3hJsJc() {
    assertEquals(
      "Jd9d5hKh 2s3hJsJc",
      Solver.process("omaha-holdem 5d8sAsQhTs Jd9d5hKh 2s3hJsJc"));
  }

  @Test
  public void test_omaha_holdem_6777_2d3c4hJdKs_2c4c9d5h_5sKh7s8h_8cTd6sTc() {
    assertEquals(
      "8cTd6sTc 5sKh7s8h 2c4c9d5h",
      Solver.process("omaha-holdem 2d3c4hJdKs 2c4c9d5h 5sKh7s8h 8cTd6sTc"));
  }

  @Test
  public void test_omaha_holdem_6778_3d6dQcQhTh_TsAs7h4c_6h4d2h5d() {
    assertEquals(
      "6h4d2h5d TsAs7h4c",
      Solver.process("omaha-holdem 3d6dQcQhTh TsAs7h4c 6h4d2h5d"));
  }

  @Test
  public void test_omaha_holdem_6779_2h4d4sAcJs_TsJh4c5d_Qc2sAdQd_8sTc3d6d_9sAh3c3h_Th2d9d2c_Jd8h7dKs_QhKdKc4h_5h5c6hJc() {
    assertEquals(
      "8sTc3d6d 5h5c6hJc Jd8h7dKs 9sAh3c3h Qc2sAdQd QhKdKc4h Th2d9d2c TsJh4c5d",
      Solver.process("omaha-holdem 2h4d4sAcJs TsJh4c5d Qc2sAdQd 8sTc3d6d 9sAh3c3h Th2d9d2c Jd8h7dKs QhKdKc4h 5h5c6hJc"));
  }

  @Test
  public void test_omaha_holdem_6780_4c6d9sQdTc_8h8d9c7d_2s5d7h6c_3c4dJc6s_4s8s2d3d_Ad3hKsKc_Ac5hJd9d_Kh9h7c8c_5sAhQhQs_4hJhTsKd() {
    assertEquals(
      "4s8s2d3d 2s5d7h6c Ac5hJd9d Ad3hKsKc 3c4dJc6s 5sAhQhQs 8h8d9c7d=Kh9h7c8c 4hJhTsKd",
      Solver.process("omaha-holdem 4c6d9sQdTc 8h8d9c7d 2s5d7h6c 3c4dJc6s 4s8s2d3d Ad3hKsKc Ac5hJd9d Kh9h7c8c 5sAhQhQs 4hJhTsKd"));
  }

  @Test
  public void test_omaha_holdem_6781_3d3s5s9sTc_Ad3c6h6c_2s2dAc8c_KcAsKhJc_5d4dQh2c() {
    assertEquals(
      "2s2dAc8c 5d4dQh2c KcAsKhJc Ad3c6h6c",
      Solver.process("omaha-holdem 3d3s5s9sTc Ad3c6h6c 2s2dAc8c KcAsKhJc 5d4dQh2c"));
  }

  @Test
  public void test_omaha_holdem_6782_3h4cTdThTs_Qh8dKc9c_Ah4s9s6d_Jd3dAs2s_3c5s8h2h_Ac5c3sAd_Kh7s7d9d() {
    assertEquals(
      "3c5s8h2h Qh8dKc9c Ah4s9s6d Jd3dAs2s Kh7s7d9d Ac5c3sAd",
      Solver.process("omaha-holdem 3h4cTdThTs Qh8dKc9c Ah4s9s6d Jd3dAs2s 3c5s8h2h Ac5c3sAd Kh7s7d9d"));
  }

  @Test
  public void test_omaha_holdem_6783_2s5c5dKsQc_Jd2d3c5s_9h8c4dQh_TcJc3s4s_TdThKdQs_6cAs9s9d_2c6h5h7h_7cAd6s4h_Jh6dKh7d() {
    assertEquals(
      "TcJc3s4s 7cAd6s4h 6cAs9s9d 9h8c4dQh Jh6dKh7d TdThKdQs 2c6h5h7h=Jd2d3c5s",
      Solver.process("omaha-holdem 2s5c5dKsQc Jd2d3c5s 9h8c4dQh TcJc3s4s TdThKdQs 6cAs9s9d 2c6h5h7h 7cAd6s4h Jh6dKh7d"));
  }

  @Test
  public void test_omaha_holdem_6784_5s6s8s9sKs_Kd3dKc5c_7d7sJd2s_4h9c2cTh_QdQs9d4c_4d2d6h8h_5d9h3sTs_7hJhQc7c() {
    assertEquals(
      "7hJhQc7c 4h9c2cTh QdQs9d4c 4d2d6h8h Kd3dKc5c 7d7sJd2s 5d9h3sTs",
      Solver.process("omaha-holdem 5s6s8s9sKs Kd3dKc5c 7d7sJd2s 4h9c2cTh QdQs9d4c 4d2d6h8h 5d9h3sTs 7hJhQc7c"));
  }

  @Test
  public void test_omaha_holdem_6785_7d7s8dAcKs_QcQsJs2d_3s4cJdAd_6cTd4d8h_ThKc3h9d() {
    assertEquals(
      "6cTd4d8h QcQsJs2d ThKc3h9d 3s4cJdAd",
      Solver.process("omaha-holdem 7d7s8dAcKs QcQsJs2d 3s4cJdAd 6cTd4d8h ThKc3h9d"));
  }

  @Test
  public void test_omaha_holdem_6786_4cAcAdKdTd_9dTs2d5s_5d9s7h2h() {
    assertEquals(
      "5d9s7h2h 9dTs2d5s",
      Solver.process("omaha-holdem 4cAcAdKdTd 9dTs2d5s 5d9s7h2h"));
  }

  @Test
  public void test_omaha_holdem_6787_4h8c8d8hAc_2s7d3d6c_Kc6s2c9d_QdTh6d3h_2d4c7s7h_9s9c6hJc() {
    assertEquals(
      "2s7d3d6c QdTh6d3h Kc6s2c9d 2d4c7s7h 9s9c6hJc",
      Solver.process("omaha-holdem 4h8c8d8hAc 2s7d3d6c Kc6s2c9d QdTh6d3h 2d4c7s7h 9s9c6hJc"));
  }

  @Test
  public void test_omaha_holdem_6788_2h2s8cAhKd_3h7hAdJs_5h8dQh2c_ThAs7dJc_TsKc6h5c_9hKs3dAc() {
    assertEquals(
      "TsKc6h5c 3h7hAdJs=ThAs7dJc 9hKs3dAc 5h8dQh2c",
      Solver.process("omaha-holdem 2h2s8cAhKd 3h7hAdJs 5h8dQh2c ThAs7dJc TsKc6h5c 9hKs3dAc"));
  }

  @Test
  public void test_omaha_holdem_6789_4h6s7c9dTs_5dAsJhKh_TdKd8cTc_5cTh3d2c_3cQc6c5h_9sKsJs6h() {
    assertEquals(
      "5dAsJhKh 9sKsJs6h 3cQc6c5h=5cTh3d2c TdKd8cTc",
      Solver.process("omaha-holdem 4h6s7c9dTs 5dAsJhKh TdKd8cTc 5cTh3d2c 3cQc6c5h 9sKsJs6h"));
  }

  @Test
  public void test_omaha_holdem_6790_2c8c8h9cAh_Td7d3c6s_3h9sKd4h_Ad4s5d5s_Kc6cAc4d_6d3s5hAs_TsKh2d6h_3dThQcQs_8dKs9h4c() {
    assertEquals(
      "Td7d3c6s TsKh2d6h 3h9sKd4h 3dThQcQs Ad4s5d5s 6d3s5hAs Kc6cAc4d 8dKs9h4c",
      Solver.process("omaha-holdem 2c8c8h9cAh Td7d3c6s 3h9sKd4h Ad4s5d5s Kc6cAc4d 6d3s5hAs TsKh2d6h 3dThQcQs 8dKs9h4c"));
  }

  @Test
  public void test_omaha_holdem_6791_2h3h4dJsKc_3s7c8cTc_9c4sTd3c_6dKh8d7d() {
    assertEquals(
      "3s7c8cTc 6dKh8d7d 9c4sTd3c",
      Solver.process("omaha-holdem 2h3h4dJsKc 3s7c8cTc 9c4sTd3c 6dKh8d7d"));
  }

  @Test
  public void test_omaha_holdem_6792_3s4s6c9cTd_8h6sJsJc_3d4c4hQh_5s9d7c7h_9hAh2cQs_7dKcTsJh() {
    assertEquals(
      "9hAh2cQs 7dKcTsJh 8h6sJsJc 3d4c4hQh 5s9d7c7h",
      Solver.process("omaha-holdem 3s4s6c9cTd 8h6sJsJc 3d4c4hQh 5s9d7c7h 9hAh2cQs 7dKcTsJh"));
  }

  @Test
  public void test_omaha_holdem_6793_3d5cAcJcKd_Js9cTs5h_4h9h9d6c_3cQcThQh() {
    assertEquals(
      "4h9h9d6c Js9cTs5h 3cQcThQh",
      Solver.process("omaha-holdem 3d5cAcJcKd Js9cTs5h 4h9h9d6c 3cQcThQh"));
  }

  @Test
  public void test_omaha_holdem_6794_4c6h7h8hJd_5cAc5hQh_8c6cKcQc_8dJsAd2d() {
    assertEquals(
      "8c6cKcQc 8dJsAd2d 5cAc5hQh",
      Solver.process("omaha-holdem 4c6h7h8hJd 5cAc5hQh 8c6cKcQc 8dJsAd2d"));
  }

  @Test
  public void test_omaha_holdem_6795_3d5sAsKsQh_Kh7h6c9s_Th7d9dQd_Jc8sTc9h_QsJd6s5h_Js3sAdTd_4h3h2sTs_3c5c2d4d() {
    assertEquals(
      "Th7d9dQd Kh7h6c9s 3c5c2d4d Jc8sTc9h 4h3h2sTs Js3sAdTd QsJd6s5h",
      Solver.process("omaha-holdem 3d5sAsKsQh Kh7h6c9s Th7d9dQd Jc8sTc9h QsJd6s5h Js3sAdTd 4h3h2sTs 3c5c2d4d"));
  }

  @Test
  public void test_omaha_holdem_6796_2c3c3s5hTd_7d3h5c7h_Qd6s7s2d_9d5d3dKh_4d8cJcTs_2sJd4hAd() {
    assertEquals(
      "Qd6s7s2d 4d8cJcTs 2sJd4hAd 7d3h5c7h=9d5d3dKh",
      Solver.process("omaha-holdem 2c3c3s5hTd 7d3h5c7h Qd6s7s2d 9d5d3dKh 4d8cJcTs 2sJd4hAd"));
  }

  @Test
  public void test_omaha_holdem_6797_4d8dAhJdTh_6h6cQh4h_Jc8h5sQc_9c7h2dTc_QdKc3s3h_Ts9s7sKd_6dKh2s8c_Td6s9d7c_3c2h4c3d_4s7d8s2c() {
    assertEquals(
      "3c2h4c3d 6h6cQh4h 6dKh2s8c 4s7d8s2c Jc8h5sQc 9c7h2dTc=Ts9s7sKd QdKc3s3h Td6s9d7c",
      Solver.process("omaha-holdem 4d8dAhJdTh 6h6cQh4h Jc8h5sQc 9c7h2dTc QdKc3s3h Ts9s7sKd 6dKh2s8c Td6s9d7c 3c2h4c3d 4s7d8s2c"));
  }

  @Test
  public void test_omaha_holdem_6798_8sAsKdThTs_Ah5d5s7c_KhQh6hQc_QsKs9s4h_AcJsKcAd_Qd3h2dTc_4c4dTd9d_3c9h3s6d_8d4s5c6s() {
    assertEquals(
      "3c9h3s6d KhQh6hQc Ah5d5s7c 4c4dTd9d Qd3h2dTc 8d4s5c6s QsKs9s4h AcJsKcAd",
      Solver.process("omaha-holdem 8sAsKdThTs Ah5d5s7c KhQh6hQc QsKs9s4h AcJsKcAd Qd3h2dTc 4c4dTd9d 3c9h3s6d 8d4s5c6s"));
  }

  @Test
  public void test_omaha_holdem_6799_2h7sAhKcTc_7h4d3dQs_7d6sKh5s_9h6h4cAd() {
    assertEquals(
      "7h4d3dQs 9h6h4cAd 7d6sKh5s",
      Solver.process("omaha-holdem 2h7sAhKcTc 7h4d3dQs 7d6sKh5s 9h6h4cAd"));
  }

  @Test
  public void test_omaha_holdem_6800_6h8s9sJhQc_TsJc9hAs_Td7s5h3c_Kh6cQsAh_QhAdTc4s_8h9d3h5d_5cKdKs4h() {
    assertEquals(
      "5cKdKs4h 8h9d3h5d Kh6cQsAh Td7s5h3c QhAdTc4s=TsJc9hAs",
      Solver.process("omaha-holdem 6h8s9sJhQc TsJc9hAs Td7s5h3c Kh6cQsAh QhAdTc4s 8h9d3h5d 5cKdKs4h"));
  }

  @Test
  public void test_omaha_holdem_6801_3h4c4hAcKd_As9c3dTh_8c6h3cQc() {
    assertEquals(
      "8c6h3cQc As9c3dTh",
      Solver.process("omaha-holdem 3h4c4hAcKd As9c3dTh 8c6h3cQc"));
  }

  @Test
  public void test_omaha_holdem_6802_3h4s7c8h9c_Qh3s7s8d_2cKs3cJh() {
    assertEquals(
      "2cKs3cJh Qh3s7s8d",
      Solver.process("omaha-holdem 3h4s7c8h9c Qh3s7s8d 2cKs3cJh"));
  }

  @Test
  public void test_omaha_holdem_6803_4c7c8h9hQs_7s9c6h8d_8s9d2sJd_Th3d2hAs_Js5c6c7d_3sTc5h5d() {
    assertEquals(
      "Th3d2hAs 3sTc5h5d 7s9c6h8d=8s9d2sJd Js5c6c7d",
      Solver.process("omaha-holdem 4c7c8h9hQs 7s9c6h8d 8s9d2sJd Th3d2hAs Js5c6c7d 3sTc5h5d"));
  }

  @Test
  public void test_omaha_holdem_6804_4s7s9h9sJh_8c2c5hKh_7hQcKsQd_9dJd2s3h_Th8hJsQh_TdAsJc3d_2h5cAc7c() {
    assertEquals(
      "8c2c5hKh 2h5cAc7c TdAsJc3d 7hQcKsQd Th8hJsQh 9dJd2s3h",
      Solver.process("omaha-holdem 4s7s9h9sJh 8c2c5hKh 7hQcKsQd 9dJd2s3h Th8hJsQh TdAsJc3d 2h5cAc7c"));
  }

  @Test
  public void test_omaha_holdem_6805_3d6d8c9hAc_9sJd5d3h_8sKdTc5c_7d4cQd2c_ThQcKs2s_7sJcJs6c_3cJh8d5h_9cTs5sKh_AsAhKcQs() {
    assertEquals(
      "7d4cQd2c ThQcKs2s 8sKdTc5c 9cTs5sKh 7sJcJs6c 3cJh8d5h 9sJd5d3h AsAhKcQs",
      Solver.process("omaha-holdem 3d6d8c9hAc 9sJd5d3h 8sKdTc5c 7d4cQd2c ThQcKs2s 7sJcJs6c 3cJh8d5h 9cTs5sKh AsAhKcQs"));
  }

  @Test
  public void test_omaha_holdem_6806_3h5s7hAsTc_Td4c9h3c_4dAd6dJh_5c6s7dAc_3d6c3sKh_Jd9s7sAh_2d8s2hQc() {
    assertEquals(
      "2d8s2hQc Td4c9h3c 5c6s7dAc=Jd9s7sAh 3d6c3sKh 4dAd6dJh",
      Solver.process("omaha-holdem 3h5s7hAsTc Td4c9h3c 4dAd6dJh 5c6s7dAc 3d6c3sKh Jd9s7sAh 2d8s2hQc"));
  }

  @Test
  public void test_omaha_holdem_6807_4d7d7h9c9d_ThJhKd4c_5s2s2h5c_KcKs2dQc_4hAd3h6d_5dAs8d6c_Kh9h9sTd_2cTc8sQh_3dAh6sJc() {
    assertEquals(
      "2cTc8sQh 3dAh6sJc ThJhKd4c 5s2s2h5c KcKs2dQc 5dAs8d6c 4hAd3h6d Kh9h9sTd",
      Solver.process("omaha-holdem 4d7d7h9c9d ThJhKd4c 5s2s2h5c KcKs2dQc 4hAd3h6d 5dAs8d6c Kh9h9sTd 2cTc8sQh 3dAh6sJc"));
  }

  @Test
  public void test_omaha_holdem_6808_2d4cJhKhTs_4hJc5dAc_6s3s4d6d_KsAs9d8d_8h3c7h2s_2hTd5h7c() {
    assertEquals(
      "8h3c7h2s 6s3s4d6d KsAs9d8d 2hTd5h7c 4hJc5dAc",
      Solver.process("omaha-holdem 2d4cJhKhTs 4hJc5dAc 6s3s4d6d KsAs9d8d 8h3c7h2s 2hTd5h7c"));
  }

  @Test
  public void test_omaha_holdem_6809_5c7hAdKhTh_6h8h4s3s_8s6sTcQd() {
    assertEquals(
      "8s6sTcQd 6h8h4s3s",
      Solver.process("omaha-holdem 5c7hAdKhTh 6h8h4s3s 8s6sTcQd"));
  }

  @Test
  public void test_omaha_holdem_6810_2c3c5s6c9d_QcAh4d2h_6h2sTdKs_8d8h4h9s_QsThKd3h_Js7c4c5c_5h4sTc3d() {
    assertEquals(
      "QsThKd3h 8d8h4h9s 6h2sTdKs 5h4sTc3d=QcAh4d2h Js7c4c5c",
      Solver.process("omaha-holdem 2c3c5s6c9d QcAh4d2h 6h2sTdKs 8d8h4h9s QsThKd3h Js7c4c5c 5h4sTc3d"));
  }

  @Test
  public void test_omaha_holdem_6811_4c4h6d8cQc_9c5d3sTd_JcKs2s5c() {
    assertEquals(
      "9c5d3sTd JcKs2s5c",
      Solver.process("omaha-holdem 4c4h6d8cQc 9c5d3sTd JcKs2s5c"));
  }

  @Test
  public void test_omaha_holdem_6812_2d7s9d9h9s_3d8cKc3s_JsAcJh4s() {
    assertEquals(
      "3d8cKc3s JsAcJh4s",
      Solver.process("omaha-holdem 2d7s9d9h9s 3d8cKc3s JsAcJh4s"));
  }

  @Test
  public void test_omaha_holdem_6813_2d5s7s9sTs_3h2hKdKh_Jc9hJh9c_AhKc5h5d_7hAs7cJs_QhQcQdKs_6hQs7d3s_2sJd4h4d() {
    assertEquals(
      "2sJd4h4d QhQcQdKs 3h2hKdKh AhKc5h5d Jc9hJh9c 6hQs7d3s 7hAs7cJs",
      Solver.process("omaha-holdem 2d5s7s9sTs 3h2hKdKh Jc9hJh9c AhKc5h5d 7hAs7cJs QhQcQdKs 6hQs7d3s 2sJd4h4d"));
  }

  @Test
  public void test_omaha_holdem_6814_AdKhQdTcTd_8cJh4s3s_7s7c9c4d_6d8h4c9s_2c8sKc2d_7h2h6c5h() {
    assertEquals(
      "7h2h6c5h 6d8h4c9s 8cJh4s3s 7s7c9c4d 2c8sKc2d",
      Solver.process("omaha-holdem AdKhQdTcTd 8cJh4s3s 7s7c9c4d 6d8h4c9s 2c8sKc2d 7h2h6c5h"));
  }

  @Test
  public void test_omaha_holdem_6815_3h5dKhQhQs_3sAh2dJs_Kd7d4hTd_AdAs6hJh_6d5sJc4c_9s6c4dJd_7s5c2c5h_9c6sQcKs_9dAcTc3c() {
    assertEquals(
      "9s6c4dJd 3sAh2dJs=9dAcTc3c 6d5sJc4c Kd7d4hTd AdAs6hJh 7s5c2c5h 9c6sQcKs",
      Solver.process("omaha-holdem 3h5dKhQhQs 3sAh2dJs Kd7d4hTd AdAs6hJh 6d5sJc4c 9s6c4dJd 7s5c2c5h 9c6sQcKs 9dAcTc3c"));
  }

  @Test
  public void test_omaha_holdem_6816_3s4h9sKdQd_6d6h3h4d_8hKcTh2h_3cQc3d9d_Jh4s8cKh_JdAh9h7c_8s7dQs9c_4c8dAc7h_Ks7sJsTc() {
    assertEquals(
      "4c8dAc7h JdAh9h7c 8hKcTh2h 6d6h3h4d 8s7dQs9c Jh4s8cKh 3cQc3d9d Ks7sJsTc",
      Solver.process("omaha-holdem 3s4h9sKdQd 6d6h3h4d 8hKcTh2h 3cQc3d9d Jh4s8cKh JdAh9h7c 8s7dQs9c 4c8dAc7h Ks7sJsTc"));
  }

  @Test
  public void test_omaha_holdem_6817_5s8sJcJdKc_9d8d9s2s_As7d8h6s_Ad5cTd5h_3c3dTcTh_Kh6d7s4d_Kd7h6c9c_Qc8cQd5d_Ac9h4h4c() {
    assertEquals(
      "Ac9h4h4c As7d8h6s 9d8d9s2s 3c3dTcTh Qc8cQd5d Kh6d7s4d Kd7h6c9c Ad5cTd5h",
      Solver.process("omaha-holdem 5s8sJcJdKc 9d8d9s2s As7d8h6s Ad5cTd5h 3c3dTcTh Kh6d7s4d Kd7h6c9c Qc8cQd5d Ac9h4h4c"));
  }

  @Test
  public void test_omaha_holdem_6818_2c2h5s9dJh_KsJsTcQd_8sTd3sJd_Ac2d5h8d_8c4cKh9h_6dTh6c8h_AhQh4h3c_7h5c7s2s_3dAs3hQc() {
    assertEquals(
      "AhQh4h3c 3dAs3hQc 6dTh6c8h 8c4cKh9h 8sTd3sJd KsJsTcQd 7h5c7s2s=Ac2d5h8d",
      Solver.process("omaha-holdem 2c2h5s9dJh KsJsTcQd 8sTd3sJd Ac2d5h8d 8c4cKh9h 6dTh6c8h AhQh4h3c 7h5c7s2s 3dAs3hQc"));
  }

  @Test
  public void test_omaha_holdem_6819_3s7d7h7sJd_2dKsThJh_2s6dTsQd_6c7c4c2c_KcTd9d4s() {
    assertEquals(
      "2s6dTsQd KcTd9d4s 2dKsThJh 6c7c4c2c",
      Solver.process("omaha-holdem 3s7d7h7sJd 2dKsThJh 2s6dTsQd 6c7c4c2c KcTd9d4s"));
  }

  @Test
  public void test_omaha_holdem_6820_2s9cAsTcTh_JdQs8h3h_2hJcAc9d_2cKh9sTs_5s9h4h8c_7d5c4d7c() {
    assertEquals(
      "JdQs8h3h 7d5c4d7c 5s9h4h8c 2hJcAc9d 2cKh9sTs",
      Solver.process("omaha-holdem 2s9cAsTcTh JdQs8h3h 2hJcAc9d 2cKh9sTs 5s9h4h8c 7d5c4d7c"));
  }

  @Test
  public void test_omaha_holdem_6821_3c3d4c5c8c_KcKh5h9d_5s2c7hQh_3hQsTd5d_2h7c2d9c_4hAsThAh_4dQc6d6h_3sKdTs6c() {
    assertEquals(
      "5s2c7hQh 4dQc6d6h KcKh5h9d 4hAsThAh 3sKdTs6c 2h7c2d9c 3hQsTd5d",
      Solver.process("omaha-holdem 3c3d4c5c8c KcKh5h9d 5s2c7hQh 3hQsTd5d 2h7c2d9c 4hAsThAh 4dQc6d6h 3sKdTs6c"));
  }

  @Test
  public void test_omaha_holdem_6822_4h5d7s9c9s_4sTs4dAd_Jd8cKh6s_2s6dQs2h_KcQc6hJs_9h5hTd3d_Th8sKsAh_6c3hAc2c_Qh8d5s8h() {
    assertEquals(
      "KcQc6hJs Th8sKsAh 2s6dQs2h Qh8d5s8h 6c3hAc2c Jd8cKh6s 4sTs4dAd 9h5hTd3d",
      Solver.process("omaha-holdem 4h5d7s9c9s 4sTs4dAd Jd8cKh6s 2s6dQs2h KcQc6hJs 9h5hTd3d Th8sKsAh 6c3hAc2c Qh8d5s8h"));
  }

  @Test
  public void test_omaha_holdem_6823_9cJsKcKsTd_Ts4s5d9h_2d6cAh7d_7sKd8s9d_2cAcJhTh_7c2s5sJc_3d7hQsAs_QdAd5hTc() {
    assertEquals(
      "2d6cAh7d Ts4s5d9h 7c2s5sJc 2cAcJhTh 3d7hQsAs=QdAd5hTc 7sKd8s9d",
      Solver.process("omaha-holdem 9cJsKcKsTd Ts4s5d9h 2d6cAh7d 7sKd8s9d 2cAcJhTh 7c2s5sJc 3d7hQsAs QdAd5hTc"));
  }

  @Test
  public void test_omaha_holdem_6824_3d5d6d9hTd_Qh9dKd9s_2sAh3c4d_Qc8dJc7c_5c6h6s7d() {
    assertEquals(
      "5c6h6s7d 2sAh3c4d Qc8dJc7c Qh9dKd9s",
      Solver.process("omaha-holdem 3d5d6d9hTd Qh9dKd9s 2sAh3c4d Qc8dJc7c 5c6h6s7d"));
  }

  @Test
  public void test_omaha_holdem_6825_4h5s9h9sQs_2h9dAhKd_JcTd4s4d_3cJdQd6d_5c7d8c2c_Kh3d3h6s_ThQh7c6c_6hTsAsKs() {
    assertEquals(
      "Kh3d3h6s 5c7d8c2c ThQh7c6c 3cJdQd6d 2h9dAhKd 6hTsAsKs JcTd4s4d",
      Solver.process("omaha-holdem 4h5s9h9sQs 2h9dAhKd JcTd4s4d 3cJdQd6d 5c7d8c2c Kh3d3h6s ThQh7c6c 6hTsAsKs"));
  }

  @Test
  public void test_omaha_holdem_6826_4h6d8hJhTs_5dAhThTc_6c2d9sKc_Kd7s4dQc_7hAd3cQd_4c8cKs7d_5sJd9c7c_3h2c3s6s_2hAc2s5h() {
    assertEquals(
      "7hAd3cQd Kd7s4dQc 3h2c3s6s 6c2d9sKc 4c8cKs7d 5sJd9c7c 2hAc2s5h 5dAhThTc",
      Solver.process("omaha-holdem 4h6d8hJhTs 5dAhThTc 6c2d9sKc Kd7s4dQc 7hAd3cQd 4c8cKs7d 5sJd9c7c 3h2c3s6s 2hAc2s5h"));
  }

  @Test
  public void test_omaha_holdem_6827_2d2s3d3hKc_6h8hJh2c_7hTh5hAc_4cTd8dAh_TcJs3s6s() {
    assertEquals(
      "4cTd8dAh=7hTh5hAc 6h8hJh2c TcJs3s6s",
      Solver.process("omaha-holdem 2d2s3d3hKc 6h8hJh2c 7hTh5hAc 4cTd8dAh TcJs3s6s"));
  }

  @Test
  public void test_omaha_holdem_6828_2h6s9cKsTs_9h8dTh7h_9d3s3h8h_Qs5hAh2c_KcTc4d2s_Ac4s6d8c() {
    assertEquals(
      "Qs5hAh2c Ac4s6d8c 9d3s3h8h KcTc4d2s 9h8dTh7h",
      Solver.process("omaha-holdem 2h6s9cKsTs 9h8dTh7h 9d3s3h8h Qs5hAh2c KcTc4d2s Ac4s6d8c"));
  }

  @Test
  public void test_omaha_holdem_6829_3h5h6d8d8h_JsJcJh7s_4s4c8c4d_Ac6cTs2d_As2sKhAh_7h6sAd9c_5s9h7cTd() {
    assertEquals(
      "Ac6cTs2d JsJcJh7s 4s4c8c4d 5s9h7cTd=7h6sAd9c As2sKhAh",
      Solver.process("omaha-holdem 3h5h6d8d8h JsJcJh7s 4s4c8c4d Ac6cTs2d As2sKhAh 7h6sAd9c 5s9h7cTd"));
  }

  @Test
  public void test_omaha_holdem_6830_2h3d3s5cQs_5d5s5hTc_4dJs9c7d_7s6sJd7h_4cQdTh9h_6c7cKdKs_As4s2sAc_JhAhKh6d_8hQcAd9d() {
    assertEquals(
      "4dJs9c7d JhAhKh6d 7s6sJd7h 4cQdTh9h 8hQcAd9d 6c7cKdKs As4s2sAc 5d5s5hTc",
      Solver.process("omaha-holdem 2h3d3s5cQs 5d5s5hTc 4dJs9c7d 7s6sJd7h 4cQdTh9h 6c7cKdKs As4s2sAc JhAhKh6d 8hQcAd9d"));
  }

  @Test
  public void test_omaha_holdem_6831_2d4s6d7h8d_3hKs5dJs_2s2c8h7s_4c9cAdTd_3dTh4d2h_5cTcKhKc() {
    assertEquals(
      "5cTcKhKc 2s2c8h7s 3hKs5dJs 3dTh4d2h 4c9cAdTd",
      Solver.process("omaha-holdem 2d4s6d7h8d 3hKs5dJs 2s2c8h7s 4c9cAdTd 3dTh4d2h 5cTcKhKc"));
  }

  @Test
  public void test_omaha_holdem_6832_4h6sKsTcTd_7dKd7sAd_8c2dAs6h_Th3c3d5s_Qs5hTs5d() {
    assertEquals(
      "8c2dAs6h 7dKd7sAd Th3c3d5s Qs5hTs5d",
      Solver.process("omaha-holdem 4h6sKsTcTd 7dKd7sAd 8c2dAs6h Th3c3d5s Qs5hTs5d"));
  }

  @Test
  public void test_omaha_holdem_6833_2d4hJhQcQs_QdKs6s5c_Ah6h3d3c_TcAd3sKc_2h9h5s8c_6c3h5h6d_7d2s7s7c() {
    assertEquals(
      "TcAd3sKc 2h9h5s8c Ah6h3d3c 6c3h5h6d 7d2s7s7c QdKs6s5c",
      Solver.process("omaha-holdem 2d4hJhQcQs QdKs6s5c Ah6h3d3c TcAd3sKc 2h9h5s8c 6c3h5h6d 7d2s7s7c"));
  }

  @Test
  public void test_omaha_holdem_6834_5h6d8c8s9c_2c7s7h7d_3c4s8dAd_TdQhKdJc_9h2sAh9s_QsAc6c3h_Ts4cJh4d_Qc3dKcJs() {
    assertEquals(
      "Qc3dKcJs=TdQhKdJc Ts4cJh4d QsAc6c3h 2c7s7h7d 3c4s8dAd 9h2sAh9s",
      Solver.process("omaha-holdem 5h6d8c8s9c 2c7s7h7d 3c4s8dAd TdQhKdJc 9h2sAh9s QsAc6c3h Ts4cJh4d Qc3dKcJs"));
  }

  @Test
  public void test_omaha_holdem_6835_3c3s4h6s7d_8dAhTc8c_6h4s6d5s() {
    assertEquals(
      "8dAhTc8c 6h4s6d5s",
      Solver.process("omaha-holdem 3c3s4h6s7d 8dAhTc8c 6h4s6d5s"));
  }

  @Test
  public void test_omaha_holdem_6836_2s3c3s5c9h_Jc8hQhAc_9dTs8c3h_6cKc8sAs_6dTc8dQd() {
    assertEquals(
      "6dTc8dQd Jc8hQhAc 6cKc8sAs 9dTs8c3h",
      Solver.process("omaha-holdem 2s3c3s5c9h Jc8hQhAc 9dTs8c3h 6cKc8sAs 6dTc8dQd"));
  }

  @Test
  public void test_omaha_holdem_6837_2d2h6dJhKc_9c4cAdQd_Kh7d9hJd_7s5cAh2c_8s7hJs3h_TsJc4dTh_5d3d8d9d_Qc5h4s3s_8hTc7c5s_6c2s6hKs() {
    assertEquals(
      "5d3d8d9d 8hTc7c5s Qc5h4s3s 9c4cAdQd 8s7hJs3h TsJc4dTh Kh7d9hJd 7s5cAh2c 6c2s6hKs",
      Solver.process("omaha-holdem 2d2h6dJhKc 9c4cAdQd Kh7d9hJd 7s5cAh2c 8s7hJs3h TsJc4dTh 5d3d8d9d Qc5h4s3s 8hTc7c5s 6c2s6hKs"));
  }

  @Test
  public void test_omaha_holdem_6838_JsKcKhQdTc_ThQh5d3c_9dTsAc2c() {
    assertEquals(
      "ThQh5d3c 9dTsAc2c",
      Solver.process("omaha-holdem JsKcKhQdTc ThQh5d3c 9dTsAc2c"));
  }

  @Test
  public void test_omaha_holdem_6839_2c5d9hAcKh_7dKs4cQc_Kd6h7h3s_5s4dJhJs_5cKc2h3c_9s7s8dAd_QdTd3d8s() {
    assertEquals(
      "QdTd3d8s 5s4dJhJs Kd6h7h3s 7dKs4cQc 5cKc2h3c 9s7s8dAd",
      Solver.process("omaha-holdem 2c5d9hAcKh 7dKs4cQc Kd6h7h3s 5s4dJhJs 5cKc2h3c 9s7s8dAd QdTd3d8s"));
  }

  @Test
  public void test_omaha_holdem_6840_6s9dQcQdTd_KhKs2dTs_3s8c9s7s() {
    assertEquals(
      "KhKs2dTs 3s8c9s7s",
      Solver.process("omaha-holdem 6s9dQcQdTd KhKs2dTs 3s8c9s7s"));
  }

  @Test
  public void test_omaha_holdem_6841_8c8d8s9cTh_QsKh4hJh_3c4s3dTd_6sAhAd5c_5d6h2hQh_5s3sAc7s_9d7h8hJc() {
    assertEquals(
      "5d6h2hQh 5s3sAc7s QsKh4hJh 3c4s3dTd 6sAhAd5c 9d7h8hJc",
      Solver.process("omaha-holdem 8c8d8s9cTh QsKh4hJh 3c4s3dTd 6sAhAd5c 5d6h2hQh 5s3sAc7s 9d7h8hJc"));
  }

  @Test
  public void test_omaha_holdem_6842_4h6c9hAdKh_6sJd8c5c_7h2c7sQh_QsTd3d6d_7d3c9cKc() {
    assertEquals(
      "6sJd8c5c QsTd3d6d 7d3c9cKc 7h2c7sQh",
      Solver.process("omaha-holdem 4h6c9hAdKh 6sJd8c5c 7h2c7sQh QsTd3d6d 7d3c9cKc"));
  }

  @Test
  public void test_omaha_holdem_6843_2c3h4dAsQc_2d3c6h9h_Qs4s9s8s_6sKs7c2s_Jh7sJc9c_6cAc9dTh_8d8hQh3d_KdAd6d7h() {
    assertEquals(
      "6sKs7c2s Jh7sJc9c 6cAc9dTh KdAd6d7h 2d3c6h9h 8d8hQh3d Qs4s9s8s",
      Solver.process("omaha-holdem 2c3h4dAsQc 2d3c6h9h Qs4s9s8s 6sKs7c2s Jh7sJc9c 6cAc9dTh 8d8hQh3d KdAd6d7h"));
  }

  @Test
  public void test_omaha_holdem_6844_2s4c8d9sQd_Kc2cQc9d_TcAd6c3c_5dQhAh2h_3d4hJcJd_3s7dQs4s_Th7cKh5h_8sJh3hKd_4d8c8h6d() {
    assertEquals(
      "Th7cKh5h TcAd6c3c 8sJh3hKd 3d4hJcJd 5dQhAh2h 3s7dQs4s Kc2cQc9d 4d8c8h6d",
      Solver.process("omaha-holdem 2s4c8d9sQd Kc2cQc9d TcAd6c3c 5dQhAh2h 3d4hJcJd 3s7dQs4s Th7cKh5h 8sJh3hKd 4d8c8h6d"));
  }

  @Test
  public void test_omaha_holdem_6845_2d7d8c9dQd_Jh4cJs6c_TcTdJd5h_5s5c6dKd_3cQhTh8h_8sQc5dKh_2cKsAh3d_6s7h2s9c() {
    assertEquals(
      "2cKsAh3d Jh4cJs6c 6s7h2s9c 3cQhTh8h=8sQc5dKh TcTdJd5h 5s5c6dKd",
      Solver.process("omaha-holdem 2d7d8c9dQd Jh4cJs6c TcTdJd5h 5s5c6dKd 3cQhTh8h 8sQc5dKh 2cKsAh3d 6s7h2s9c"));
  }

  @Test
  public void test_omaha_holdem_6846_2d7s8dJhQs_Jc5h4c6s_7d9h6hJd_Kd9s9dKc() {
    assertEquals(
      "Jc5h4c6s Kd9s9dKc 7d9h6hJd",
      Solver.process("omaha-holdem 2d7s8dJhQs Jc5h4c6s 7d9h6hJd Kd9s9dKc"));
  }

  @Test
  public void test_omaha_holdem_6847_2h4h7c8cAc_AdKh7dJd_9d4s6c4c() {
    assertEquals(
      "AdKh7dJd 9d4s6c4c",
      Solver.process("omaha-holdem 2h4h7c8cAc AdKh7dJd 9d4s6c4c"));
  }

  @Test
  public void test_omaha_holdem_6848_8d9dTcTdTh_KcKdAc6c_3h6dAd7c_3s2hKh2s_9cKsTs5d_As5hJc4d_8sQh7h9h_QsJdQd5s_6s4sAh7s_4c3c8cJs() {
    assertEquals(
      "4c3c8cJs 8sQh7h9h As5hJc4d 6s4sAh7s 3h6dAd7c 3s2hKh2s KcKdAc6c 9cKsTs5d QsJdQd5s",
      Solver.process("omaha-holdem 8d9dTcTdTh KcKdAc6c 3h6dAd7c 3s2hKh2s 9cKsTs5d As5hJc4d 8sQh7h9h QsJdQd5s 6s4sAh7s 4c3c8cJs"));
  }

  @Test
  public void test_omaha_holdem_6849_2h4cAhQsTh_Jc9h8dTs_3s9s9dAd_9c6s6c6d_KsJd5sAs_3hQdKh2c_TcKd8c5c_4h5dQh5h_4d6h2d8s_Kc2s7c7d() {
    assertEquals(
      "9c6s6c6d Kc2s7c7d Jc9h8dTs TcKd8c5c 3s9s9dAd 4d6h2d8s KsJd5sAs 4h5dQh5h 3hQdKh2c",
      Solver.process("omaha-holdem 2h4cAhQsTh Jc9h8dTs 3s9s9dAd 9c6s6c6d KsJd5sAs 3hQdKh2c TcKd8c5c 4h5dQh5h 4d6h2d8s Kc2s7c7d"));
  }

  @Test
  public void test_omaha_holdem_6850_4h9sJhQsTc_Kc9h6sJd_5cJcQh8d_5d6hAh4c_8h4sTs4d_7sTd7d2d() {
    assertEquals(
      "5d6hAh4c 7sTd7d2d 5cJcQh8d=8h4sTs4d Kc9h6sJd",
      Solver.process("omaha-holdem 4h9sJhQsTc Kc9h6sJd 5cJcQh8d 5d6hAh4c 8h4sTs4d 7sTd7d2d"));
  }

  @Test
  public void test_omaha_holdem_6851_3s6d9cAdJs_7hKcTh8h_5h4c8sTd_4s4d3d7s() {
    assertEquals(
      "5h4c8sTd 7hKcTh8h 4s4d3d7s",
      Solver.process("omaha-holdem 3s6d9cAdJs 7hKcTh8h 5h4c8sTd 4s4d3d7s"));
  }

  @Test
  public void test_omaha_holdem_6852_2d4c6d7c8s_2cQhJd7d_Tc2hAdJh_7s3cKh8h_TdQs6h8c_Kc5s5c6c() {
    assertEquals(
      "Tc2hAdJh 2cQhJd7d TdQs6h8c 7s3cKh8h Kc5s5c6c",
      Solver.process("omaha-holdem 2d4c6d7c8s 2cQhJd7d Tc2hAdJh 7s3cKh8h TdQs6h8c Kc5s5c6c"));
  }

  @Test
  public void test_omaha_holdem_6853_5c8c8d8s9s_2hKdQh7h_3d8h4s6c() {
    assertEquals(
      "2hKdQh7h 3d8h4s6c",
      Solver.process("omaha-holdem 5c8c8d8s9s 2hKdQh7h 3d8h4s6c"));
  }

  @Test
  public void test_omaha_holdem_6854_8c9cAdAhJs_TdAc7s3d_7hKc3hQh_4s6dJc2c() {
    assertEquals(
      "7hKc3hQh 4s6dJc2c TdAc7s3d",
      Solver.process("omaha-holdem 8c9cAdAhJs TdAc7s3d 7hKc3hQh 4s6dJc2c"));
  }

  @Test
  public void test_omaha_holdem_6855_2h8cKdKhKs_JcQhJhTh_Kc4s4c3c_6dJdQsQc_9c8h2s9h_6c4d3s6s_QdJs2d5d() {
    assertEquals(
      "QdJs2d5d 6c4d3s6s 9c8h2s9h JcQhJhTh 6dJdQsQc Kc4s4c3c",
      Solver.process("omaha-holdem 2h8cKdKhKs JcQhJhTh Kc4s4c3c 6dJdQsQc 9c8h2s9h 6c4d3s6s QdJs2d5d"));
  }

  @Test
  public void test_omaha_holdem_6856_5h6h7h9hKs_Th8cKh4s_Jc9s8dAh_6cTd9d5c_Tc3hTs2d_6dQd7s6s_4h2c2hKd_2s5d3sQc_8h3c7c4c_AdJh4dJs() {
    assertEquals(
      "2s5d3sQc Tc3hTs2d AdJh4dJs 6cTd9d5c 6dQd7s6s 8h3c7c4c=Jc9s8dAh 4h2c2hKd Th8cKh4s",
      Solver.process("omaha-holdem 5h6h7h9hKs Th8cKh4s Jc9s8dAh 6cTd9d5c Tc3hTs2d 6dQd7s6s 4h2c2hKd 2s5d3sQc 8h3c7c4c AdJh4dJs"));
  }

  @Test
  public void test_omaha_holdem_6857_2h3h6d6hKc_5s7h3s9d_8d5c5h7s_2d9c5dJs_4hJhKdTd_Ks8hJdTc_Ac7dQh9s_8c9hQcTs_As4sAd2c_ThJcKh2s() {
    assertEquals(
      "8c9hQcTs Ac7dQh9s 2d9c5dJs 5s7h3s9d 8d5c5h7s Ks8hJdTc As4sAd2c 4hJhKdTd ThJcKh2s",
      Solver.process("omaha-holdem 2h3h6d6hKc 5s7h3s9d 8d5c5h7s 2d9c5dJs 4hJhKdTd Ks8hJdTc Ac7dQh9s 8c9hQcTs As4sAd2c ThJcKh2s"));
  }

  @Test
  public void test_omaha_holdem_6858_5d5s8sQdTc_Ac8cJsQc_3s3cKh5h_Ad3h8d2s_9cJd5c7d_2dTd2h6d() {
    assertEquals(
      "Ad3h8d2s 2dTd2h6d Ac8cJsQc 3s3cKh5h 9cJd5c7d",
      Solver.process("omaha-holdem 5d5s8sQdTc Ac8cJsQc 3s3cKh5h Ad3h8d2s 9cJd5c7d 2dTd2h6d"));
  }

  @Test
  public void test_omaha_holdem_6859_4c9dAdQhTs_KdQs9s2c_8s5c3h2h() {
    assertEquals(
      "8s5c3h2h KdQs9s2c",
      Solver.process("omaha-holdem 4c9dAdQhTs KdQs9s2c 8s5c3h2h"));
  }

  @Test
  public void test_omaha_holdem_6860_2s6s7dJdTd_Ks9h6hQh_5h7hAdJh_8cQsQd5c_As2dTc9d() {
    assertEquals(
      "Ks9h6hQh 8cQsQd5c 5h7hAdJh As2dTc9d",
      Solver.process("omaha-holdem 2s6s7dJdTd Ks9h6hQh 5h7hAdJh 8cQsQd5c As2dTc9d"));
  }

  @Test
  public void test_omaha_holdem_6861_2h4h5c5h8h_JcAcTs2s_9h7s7d4s_Jh9s8sTc_4cKhQd6h() {
    assertEquals(
      "JcAcTs2s 9h7s7d4s Jh9s8sTc 4cKhQd6h",
      Solver.process("omaha-holdem 2h4h5c5h8h JcAcTs2s 9h7s7d4s Jh9s8sTc 4cKhQd6h"));
  }

  @Test
  public void test_omaha_holdem_6862_2s4d6c6hAd_7dTs9hKd_2cJcKh4c_Tc8c5d2h_Jh2d3h7c_5hJsJd4h_7s6d9d3d() {
    assertEquals(
      "7dTs9hKd Tc8c5d2h Jh2d3h7c 2cJcKh4c 5hJsJd4h 7s6d9d3d",
      Solver.process("omaha-holdem 2s4d6c6hAd 7dTs9hKd 2cJcKh4c Tc8c5d2h Jh2d3h7c 5hJsJd4h 7s6d9d3d"));
  }

  @Test
  public void test_omaha_holdem_6863_2c4c6sJdTh_Js7sTcAc_Jc8h7h4d_AhQs9c3h() {
    assertEquals(
      "AhQs9c3h Jc8h7h4d Js7sTcAc",
      Solver.process("omaha-holdem 2c4c6sJdTh Js7sTcAc Jc8h7h4d AhQs9c3h"));
  }

  @Test
  public void test_omaha_holdem_6864_3h3s5cQsTs_Ac7h6c4h_Jh4cTc9c_AdQcAhTd_KsKh2s7d_Qh8dJdJc_Kc9s6h6s_7s8s8c3c() {
    assertEquals(
      "Ac7h6c4h Jh4cTc9c Qh8dJdJc AdQcAhTd 7s8s8c3c Kc9s6h6s KsKh2s7d",
      Solver.process("omaha-holdem 3h3s5cQsTs Ac7h6c4h Jh4cTc9c AdQcAhTd KsKh2s7d Qh8dJdJc Kc9s6h6s 7s8s8c3c"));
  }

  @Test
  public void test_omaha_holdem_6865_3c3d8c8hQd_Kc4s6h2h_4d7cKhQs() {
    assertEquals(
      "Kc4s6h2h 4d7cKhQs",
      Solver.process("omaha-holdem 3c3d8c8hQd Kc4s6h2h 4d7cKhQs"));
  }

  @Test
  public void test_omaha_holdem_6866_2c3c4hJsQh_Qc8dQd5c_3hAh6d7s_JdTdJc5d_9s3dAc6s_QsKsKc7h_Ad2d9hKh_7d9cAsTc_4d5s2h7c() {
    assertEquals(
      "7d9cAsTc Ad2d9hKh 3hAh6d7s=9s3dAc6s QsKsKc7h 4d5s2h7c JdTdJc5d Qc8dQd5c",
      Solver.process("omaha-holdem 2c3c4hJsQh Qc8dQd5c 3hAh6d7s JdTdJc5d 9s3dAc6s QsKsKc7h Ad2d9hKh 7d9cAsTc 4d5s2h7c"));
  }

  @Test
  public void test_omaha_holdem_6867_2c2d7sJhKc_5c5sQhAh_8cAcKsTs_Tc5dQd3d_9h3s7hKh_8hAsQc8d_Ad4s3h2s_8s9s6cTd() {
    assertEquals(
      "8s9s6cTd Tc5dQd3d 5c5sQhAh 8hAsQc8d 8cAcKsTs 9h3s7hKh Ad4s3h2s",
      Solver.process("omaha-holdem 2c2d7sJhKc 5c5sQhAh 8cAcKsTs Tc5dQd3d 9h3s7hKh 8hAsQc8d Ad4s3h2s 8s9s6cTd"));
  }

  @Test
  public void test_omaha_holdem_6868_3d3h6h7cQc_5c7d4d3c_5dQs4cAs_TdAd9d7s_Ah2dJd8c_9sTc3s2h_ThKd9h2c() {
    assertEquals(
      "ThKd9h2c Ah2dJd8c TdAd9d7s 9sTc3s2h 5dQs4cAs 5c7d4d3c",
      Solver.process("omaha-holdem 3d3h6h7cQc 5c7d4d3c 5dQs4cAs TdAd9d7s Ah2dJd8c 9sTc3s2h ThKd9h2c"));
  }

  @Test
  public void test_omaha_holdem_6869_4h9hAcQdTc_Td2sJd5c_9d7cJhAh_Js2c5sAs_8d8s4d9s_2dQh5d7d_8h6h9cTs() {
    assertEquals(
      "Td2sJd5c 2dQh5d7d Js2c5sAs 8d8s4d9s 8h6h9cTs 9d7cJhAh",
      Solver.process("omaha-holdem 4h9hAcQdTc Td2sJd5c 9d7cJhAh Js2c5sAs 8d8s4d9s 2dQh5d7d 8h6h9cTs"));
  }

  @Test
  public void test_omaha_holdem_6870_JhKcKdKsQs_Qh6s9s7s_3s2h6c8d() {
    assertEquals(
      "3s2h6c8d Qh6s9s7s",
      Solver.process("omaha-holdem JhKcKdKsQs Qh6s9s7s 3s2h6c8d"));
  }

  @Test
  public void test_omaha_holdem_6871_6d6s7dJsQc_3c9sJc9h_5s5dKsQd() {
    assertEquals(
      "3c9sJc9h 5s5dKsQd",
      Solver.process("omaha-holdem 6d6s7dJsQc 3c9sJc9h 5s5dKsQd"));
  }

  @Test
  public void test_omaha_holdem_6872_3h4s8cAsJc_9cQs2s9d_Kd9hAd3d_8d3s8s5h_Ah2cJs7d_6d5s6cQh_JhAc4dTs_9s4c2hQc_Ks5d5cKc() {
    assertEquals(
      "9s4c2hQc 6d5s6cQh 9cQs2s9d Ks5d5cKc Kd9hAd3d Ah2cJs7d=JhAc4dTs 8d3s8s5h",
      Solver.process("omaha-holdem 3h4s8cAsJc 9cQs2s9d Kd9hAd3d 8d3s8s5h Ah2cJs7d 6d5s6cQh JhAc4dTs 9s4c2hQc Ks5d5cKc"));
  }

  @Test
  public void test_omaha_holdem_6873_2c2d7cAhQd_6sTd5d9d_7hThKdTs_2s8cAc5s() {
    assertEquals(
      "6sTd5d9d 7hThKdTs 2s8cAc5s",
      Solver.process("omaha-holdem 2c2d7cAhQd 6sTd5d9d 7hThKdTs 2s8cAc5s"));
  }

  @Test
  public void test_omaha_holdem_6874_2c5d7cQsTd_Ad7h4h8d_As6sTsAc_ThJs8hQd_8cJdKcKd() {
    assertEquals(
      "Ad7h4h8d 8cJdKcKd As6sTsAc ThJs8hQd",
      Solver.process("omaha-holdem 2c5d7cQsTd Ad7h4h8d As6sTsAc ThJs8hQd 8cJdKcKd"));
  }

  @Test
  public void test_omaha_holdem_6875_3h5c5h9cJs_Jh6c8c2s_Kd4c3d6s_8s8h2d9s_Th5d2c7s_4d7cAcAd() {
    assertEquals(
      "Kd4c3d6s 8s8h2d9s Jh6c8c2s 4d7cAcAd Th5d2c7s",
      Solver.process("omaha-holdem 3h5c5h9cJs Jh6c8c2s Kd4c3d6s 8s8h2d9s Th5d2c7s 4d7cAcAd"));
  }

  @Test
  public void test_omaha_holdem_6876_3h6d7d7h8c_Ts4dTh8d_2c5sAh4h_6hJd7sJs_9c9hAs4s_6cQh6s5h_QsQc2s5d_2h8hKcQd() {
    assertEquals(
      "2h8hKcQd 9c9hAs4s Ts4dTh8d QsQc2s5d 2c5sAh4h 6cQh6s5h 6hJd7sJs",
      Solver.process("omaha-holdem 3h6d7d7h8c Ts4dTh8d 2c5sAh4h 6hJd7sJs 9c9hAs4s 6cQh6s5h QsQc2s5d 2h8hKcQd"));
  }

  @Test
  public void test_omaha_holdem_6877_2s5dKsQhTh_8sTd6s3h_Js5h9s3d_3s4cQc7d_KcAc6h4s() {
    assertEquals(
      "8sTd6s3h 3s4cQc7d KcAc6h4s Js5h9s3d",
      Solver.process("omaha-holdem 2s5dKsQhTh 8sTd6s3h Js5h9s3d 3s4cQc7d KcAc6h4s"));
  }

  @Test
  public void test_omaha_holdem_6878_2h6cAhKdKs_Jh6s7hAd_KhAcQs4c_2c5s4hQc_5c2d8cJc_4d7c5d9h_6d3hTs8s() {
    assertEquals(
      "4d7c5d9h 5c2d8cJc 2c5s4hQc 6d3hTs8s Jh6s7hAd KhAcQs4c",
      Solver.process("omaha-holdem 2h6cAhKdKs Jh6s7hAd KhAcQs4c 2c5s4hQc 5c2d8cJc 4d7c5d9h 6d3hTs8s"));
  }

  @Test
  public void test_omaha_holdem_6879_2d6d9hJcTd_5hAhAd7h_Jd5cThKh_Qh3h7s4d_2c9c5d6h_5s9dKs4c_8dQc3s3c() {
    assertEquals(
      "Qh3h7s4d 5s9dKs4c 5hAhAd7h 2c9c5d6h Jd5cThKh 8dQc3s3c",
      Solver.process("omaha-holdem 2d6d9hJcTd 5hAhAd7h Jd5cThKh Qh3h7s4d 2c9c5d6h 5s9dKs4c 8dQc3s3c"));
  }

  @Test
  public void test_omaha_holdem_6880_2h7dJhKcKd_2dAhQsTh_2s3hAs6h() {
    assertEquals(
      "2dAhQsTh=2s3hAs6h",
      Solver.process("omaha-holdem 2h7dJhKcKd 2dAhQsTh 2s3hAs6h"));
  }

  @Test
  public void test_omaha_holdem_6881_3h4h6s9c9s_JhQh7hKh_3c8s2sTc_5sQs6c8d_Js5h2d2c_Qc9dKd9h_4s7s5cAd_Ah4dQdKc_Ks3s7dAs_6d4cJcTh() {
    assertEquals(
      "JhQh7hKh 3c8s2sTc Ks3s7dAs Ah4dQdKc 6d4cJcTh 5sQs6c8d Js5h2d2c 4s7s5cAd Qc9dKd9h",
      Solver.process("omaha-holdem 3h4h6s9c9s JhQh7hKh 3c8s2sTc 5sQs6c8d Js5h2d2c Qc9dKd9h 4s7s5cAd Ah4dQdKc Ks3s7dAs 6d4cJcTh"));
  }

  @Test
  public void test_omaha_holdem_6882_6h8d9hJsKs_8s7cTs4s_6cAh9s5s_4h3hKh2h_Kc2cKd6d_3d3cJh4c_2dAs5dJd_QdTc9cQc_3s2sAcJc_TdQsTh6s() {
    assertEquals(
      "3d3cJh4c 2dAs5dJd=3s2sAcJc 4h3hKh2h 6cAh9s5s Kc2cKd6d 8s7cTs4s QdTc9cQc=TdQsTh6s",
      Solver.process("omaha-holdem 6h8d9hJsKs 8s7cTs4s 6cAh9s5s 4h3hKh2h Kc2cKd6d 3d3cJh4c 2dAs5dJd QdTc9cQc 3s2sAcJc TdQsTh6s"));
  }

  @Test
  public void test_omaha_holdem_6883_4d5s6c7cJd_9dKh6sAh_Th8c9s8s_Js8h2dAd_5d9c6hKc_QcAs4s5h_3c3d9h2c_Ac4cQs8d() {
    assertEquals(
      "9dKh6sAh Js8h2dAd QcAs4s5h 5d9c6hKc 3c3d9h2c Ac4cQs8d Th8c9s8s",
      Solver.process("omaha-holdem 4d5s6c7cJd 9dKh6sAh Th8c9s8s Js8h2dAd 5d9c6hKc QcAs4s5h 3c3d9h2c Ac4cQs8d"));
  }

  @Test
  public void test_omaha_holdem_6884_6d7sAcAdQs_3dTd8c4h_KsQc5s5c_7cJd8hQh_7d2s9s7h_6h3s9d2h_3c2cKh8d_9c6c2d5h_9h3hAs4s() {
    assertEquals(
      "3dTd8c4h 3c2cKh8d 6h3s9d2h=9c6c2d5h 7cJd8hQh KsQc5s5c 9h3hAs4s 7d2s9s7h",
      Solver.process("omaha-holdem 6d7sAcAdQs 3dTd8c4h KsQc5s5c 7cJd8hQh 7d2s9s7h 6h3s9d2h 3c2cKh8d 9c6c2d5h 9h3hAs4s"));
  }

  @Test
  public void test_omaha_holdem_6885_2d3h3s8dKd_Kh7sQd5c_6hQhQsKs_Jh2s2c6c_KcJcAdJd() {
    assertEquals(
      "6hQhQsKs=Kh7sQd5c KcJcAdJd Jh2s2c6c",
      Solver.process("omaha-holdem 2d3h3s8dKd Kh7sQd5c 6hQhQsKs Jh2s2c6c KcJcAdJd"));
  }

  @Test
  public void test_omaha_holdem_6886_3s4c5c8cJd_ThJc2sJh_Kd4dAdAc_5h4h6h4s() {
    assertEquals(
      "Kd4dAdAc 5h4h6h4s ThJc2sJh",
      Solver.process("omaha-holdem 3s4c5c8cJd ThJc2sJh Kd4dAdAc 5h4h6h4s"));
  }

  @Test
  public void test_omaha_holdem_6887_4c6d9cQcTd_7c8sTsJh_Ks4s5c6c_AhQsJcKd_7s2s9sAd_8h2c5hKh_Tc9dQh5d() {
    assertEquals(
      "8h2c5hKh 7s2s9sAd Tc9dQh5d 7c8sTsJh AhQsJcKd Ks4s5c6c",
      Solver.process("omaha-holdem 4c6d9cQcTd 7c8sTsJh Ks4s5c6c AhQsJcKd 7s2s9sAd 8h2c5hKh Tc9dQh5d"));
  }

  @Test
  public void test_omaha_holdem_6888_3c8c8dJcKh_3hJd9d5c_4d9c8hTh() {
    assertEquals(
      "3hJd9d5c 4d9c8hTh",
      Solver.process("omaha-holdem 3c8c8dJcKh 3hJd9d5c 4d9c8hTh"));
  }

  @Test
  public void test_omaha_holdem_6889_2h3c4s5s6h_9c4cKh3d_9s6d9dAd_8hJcJhTh_Td9hQc6c_8cAs5h7h_3h2d7cAc() {
    assertEquals(
      "Td9hQc6c 9s6d9dAd 8hJcJhTh 9c4cKh3d 3h2d7cAc 8cAs5h7h",
      Solver.process("omaha-holdem 2h3c4s5s6h 9c4cKh3d 9s6d9dAd 8hJcJhTh Td9hQc6c 8cAs5h7h 3h2d7cAc"));
  }

  @Test
  public void test_omaha_holdem_6890_3h4cAdKcQh_3sQsJh6d_8h7s7hJd_6s9dJc8c_9sAh5hQc_Ks2cKdTs_AsAc9h2h_6hQd4h5c_3c7dJs8d_5d5s6c3d() {
    assertEquals(
      "6s9dJc8c 3c7dJs8d 5d5s6c3d 8h7s7hJd 3sQsJh6d 6hQd4h5c 9sAh5hQc Ks2cKdTs AsAc9h2h",
      Solver.process("omaha-holdem 3h4cAdKcQh 3sQsJh6d 8h7s7hJd 6s9dJc8c 9sAh5hQc Ks2cKdTs AsAc9h2h 6hQd4h5c 3c7dJs8d 5d5s6c3d"));
  }

  @Test
  public void test_omaha_holdem_6891_4c7hAcJdQd_TdAh8h9s_Kc5h8d6h_Qh6dTs3d_5s5d9d2h_3sAd2s9c_QcAs3cKh_3h7d6s4d_TcKd4h8c_2dJh7s8s() {
    assertEquals(
      "Kc5h8d6h 5s5d9d2h Qh6dTs3d 3sAd2s9c TdAh8h9s 3h7d6s4d 2dJh7s8s QcAs3cKh TcKd4h8c",
      Solver.process("omaha-holdem 4c7hAcJdQd TdAh8h9s Kc5h8d6h Qh6dTs3d 5s5d9d2h 3sAd2s9c QcAs3cKh 3h7d6s4d TcKd4h8c 2dJh7s8s"));
  }

  @Test
  public void test_omaha_holdem_6892_5hAsJcJsTh_Kd9c7d3s_Kh7cQh5s_6s8s4hQs_9h3hAd8d() {
    assertEquals(
      "6s8s4hQs Kd9c7d3s 9h3hAd8d Kh7cQh5s",
      Solver.process("omaha-holdem 5hAsJcJsTh Kd9c7d3s Kh7cQh5s 6s8s4hQs 9h3hAd8d"));
  }

  @Test
  public void test_omaha_holdem_6893_2d3h7s8s9c_7d3dJcAc_5s9dKhAh() {
    assertEquals(
      "5s9dKhAh 7d3dJcAc",
      Solver.process("omaha-holdem 2d3h7s8s9c 7d3dJcAc 5s9dKhAh"));
  }

  @Test
  public void test_omaha_holdem_6894_2h4c4s6hTh_JcQs2s4h_8s8cAh2d_Jd5d9d2c_Ad5sKd5c_6cTc8h3c_7dQc3d4d_6sKh9sQh_9h3h6d8d() {
    assertEquals(
      "Jd5d9d2c Ad5sKd5c 8s8cAh2d 6cTc8h3c 7dQc3d4d 9h3h6d8d 6sKh9sQh JcQs2s4h",
      Solver.process("omaha-holdem 2h4c4s6hTh JcQs2s4h 8s8cAh2d Jd5d9d2c Ad5sKd5c 6cTc8h3c 7dQc3d4d 6sKh9sQh 9h3h6d8d"));
  }

  @Test
  public void test_omaha_holdem_6895_2d6s8s9sQd_7c5dKd4d_TsJh3cKh_Qc9d9c8c_9hJd4h7d_Qs6d8h3h_Ah4s3dTh_6c4c3s2s() {
    assertEquals(
      "Ah4s3dTh 9hJd4h7d Qs6d8h3h Qc9d9c8c 7c5dKd4d TsJh3cKh 6c4c3s2s",
      Solver.process("omaha-holdem 2d6s8s9sQd 7c5dKd4d TsJh3cKh Qc9d9c8c 9hJd4h7d Qs6d8h3h Ah4s3dTh 6c4c3s2s"));
  }

  @Test
  public void test_omaha_holdem_6896_2d7d8d9sJs_4s3sJc7c_5s4d6c8s_9dTdQh7h_7s9c3d5d() {
    assertEquals(
      "4s3sJc7c 5s4d6c8s 7s9c3d5d 9dTdQh7h",
      Solver.process("omaha-holdem 2d7d8d9sJs 4s3sJc7c 5s4d6c8s 9dTdQh7h 7s9c3d5d"));
  }

  @Test
  public void test_omaha_holdem_6897_2s6s8d8sAd_TcTs9cTh_6c9hJc7s_Ah3c8h4d_QcKc7d5c_2h4h9d9s() {
    assertEquals(
      "QcKc7d5c 6c9hJc7s 2h4h9d9s TcTs9cTh Ah3c8h4d",
      Solver.process("omaha-holdem 2s6s8d8sAd TcTs9cTh 6c9hJc7s Ah3c8h4d QcKc7d5c 2h4h9d9s"));
  }

  @Test
  public void test_omaha_holdem_6898_8c8d9hAcJd_7d4h7cTh_7h5hAh9s() {
    assertEquals(
      "7h5hAh9s 7d4h7cTh",
      Solver.process("omaha-holdem 8c8d9hAcJd 7d4h7cTh 7h5hAh9s"));
  }

  @Test
  public void test_omaha_holdem_6899_3d6h8hAcJd_Jh4s5c2s_2dAh6d3s_8c5sKh7h_8dQdQc4c() {
    assertEquals(
      "8c5sKh7h Jh4s5c2s 8dQdQc4c 2dAh6d3s",
      Solver.process("omaha-holdem 3d6h8hAcJd Jh4s5c2s 2dAh6d3s 8c5sKh7h 8dQdQc4c"));
  }

  @Test
  public void test_omaha_holdem_6900_4cAcJhQhTc_6d2h4s9d_KhJc2s3c_5sAdAsJs_Qc7d7sQs_8h5c4d7c() {
    assertEquals(
      "6d2h4s9d Qc7d7sQs 5sAdAsJs 8h5c4d7c KhJc2s3c",
      Solver.process("omaha-holdem 4cAcJhQhTc 6d2h4s9d KhJc2s3c 5sAdAsJs Qc7d7sQs 8h5c4d7c"));
  }

  @Test
  public void test_omaha_holdem_6901_2d2h5s8c8d_QdKs8h9d_JsJcQhAh_Qs3s6c2c_9sTc6d4c_Kc8s7s5c() {
    assertEquals(
      "9sTc6d4c JsJcQhAh Qs3s6c2c QdKs8h9d Kc8s7s5c",
      Solver.process("omaha-holdem 2d2h5s8c8d QdKs8h9d JsJcQhAh Qs3s6c2c 9sTc6d4c Kc8s7s5c"));
  }

  @Test
  public void test_omaha_holdem_6902_3sAcAsKhQs_9h8c8s2c_JdQhJsTs_Jc7d5h8h_Qc2d9d9s_8d6s2h4d_3c4s7cAd_7s9cQdAh_6c5s2s7h_5c5dKdKs() {
    assertEquals(
      "8d6s2h4d Jc7d5h8h 9h8c8s2c Qc2d9d9s 6c5s2s7h JdQhJsTs 5c5dKdKs 3c4s7cAd 7s9cQdAh",
      Solver.process("omaha-holdem 3sAcAsKhQs 9h8c8s2c JdQhJsTs Jc7d5h8h Qc2d9d9s 8d6s2h4d 3c4s7cAd 7s9cQdAh 6c5s2s7h 5c5dKdKs"));
  }

  @Test
  public void test_omaha_holdem_6903_2h6h7sAcTd_As8d7c6s_KdTc2c9c_9s3d6dTs_Ks4c6cKc() {
    assertEquals(
      "Ks4c6cKc KdTc2c9c 9s3d6dTs As8d7c6s",
      Solver.process("omaha-holdem 2h6h7sAcTd As8d7c6s KdTc2c9c 9s3d6dTs Ks4c6cKc"));
  }

  @Test
  public void test_omaha_holdem_6904_2d3s9hJsTs_Ac3c2s4h_5dKs5sTh_JhJd9c3d_4s7dQcQs_Jc2h9d5h_6c7h2c8s() {
    assertEquals(
      "Ac3c2s4h Jc2h9d5h JhJd9c3d 6c7h2c8s 4s7dQcQs 5dKs5sTh",
      Solver.process("omaha-holdem 2d3s9hJsTs Ac3c2s4h 5dKs5sTh JhJd9c3d 4s7dQcQs Jc2h9d5h 6c7h2c8s"));
  }

  @Test
  public void test_omaha_holdem_6905_5s7dJhKsTh_7s3s2hKd_3c3dTc4h_Jd8hJcAc_6c8c4d9s_4c7c7h6d_QhQs5hAd() {
    assertEquals(
      "3c3dTc4h 7s3s2hKd 4c7c7h6d Jd8hJcAc 6c8c4d9s QhQs5hAd",
      Solver.process("omaha-holdem 5s7dJhKsTh 7s3s2hKd 3c3dTc4h Jd8hJcAc 6c8c4d9s 4c7c7h6d QhQs5hAd"));
  }

  @Test
  public void test_omaha_holdem_6906_2c3d5dAhAs_5h4h7s7c_Jh4cJsAd_Jd9hTsKs_4s3s8sTd_Kd2d6s7h_5sQcTh2h_QsAc9d6d_4d9c9s6h() {
    assertEquals(
      "Jd9hTsKs Kd2d6s7h 5sQcTh2h QsAc9d6d 4s3s8sTd=5h4h7s7c=Jh4cJsAd 4d9c9s6h",
      Solver.process("omaha-holdem 2c3d5dAhAs 5h4h7s7c Jh4cJsAd Jd9hTsKs 4s3s8sTd Kd2d6s7h 5sQcTh2h QsAc9d6d 4d9c9s6h"));
  }

  @Test
  public void test_omaha_holdem_6907_7c7dJhKdTs_JdTc4hAh_Ac3h9cJc_5h9d3d6d_2c6s3s2d_9sKs8cKc_QdJsAs6c_7h9h3c6h_5d4d8d8h_QcTd2s4s() {
    assertEquals(
      "5h9d3d6d 2c6s3s2d 5d4d8d8h QcTd2s4s Ac3h9cJc JdTc4hAh 7h9h3c6h QdJsAs6c 9sKs8cKc",
      Solver.process("omaha-holdem 7c7dJhKdTs JdTc4hAh Ac3h9cJc 5h9d3d6d 2c6s3s2d 9sKs8cKc QdJsAs6c 7h9h3c6h 5d4d8d8h QcTd2s4s"));
  }

  @Test
  public void test_omaha_holdem_6908_5c6d7d9sAs_3s8c8dTs_7hQhAd4d() {
    assertEquals(
      "7hQhAd4d 3s8c8dTs",
      Solver.process("omaha-holdem 5c6d7d9sAs 3s8c8dTs 7hQhAd4d"));
  }

  @Test
  public void test_omaha_holdem_6909_2c2h5dAcKs_QsKd5cJs_As3cAd4h_5hQc8sJh_Qd7s8dKc_TcAh7d2s_7h4s6s3d_6h3s8h9d_Th9c9sJc() {
    assertEquals(
      "6h3s8h9d 5hQc8sJh Th9c9sJc Qd7s8dKc QsKd5cJs 7h4s6s3d TcAh7d2s As3cAd4h",
      Solver.process("omaha-holdem 2c2h5dAcKs QsKd5cJs As3cAd4h 5hQc8sJh Qd7s8dKc TcAh7d2s 7h4s6s3d 6h3s8h9d Th9c9sJc"));
  }

  @Test
  public void test_omaha_holdem_6910_4s5sAcAhTh_6s4hJhAs_4cQc5dKd_8d9s6d5h_Qs7dKcJs_KsJd6h5c_9hAd9c4d_2c3c8s7h() {
    assertEquals(
      "Qs7dKcJs 8d9s6d5h 4cQc5dKd=KsJd6h5c 2c3c8s7h 6s4hJhAs=9hAd9c4d",
      Solver.process("omaha-holdem 4s5sAcAhTh 6s4hJhAs 4cQc5dKd 8d9s6d5h Qs7dKcJs KsJd6h5c 9hAd9c4d 2c3c8s7h"));
  }

  @Test
  public void test_omaha_holdem_6911_7d9dAsKhQd_5cAh6d6s_6c9s5dTd_6h2s8h3c_Ks4s8s5h_Th3s4d4c_7cJhJcQs_2h9h2dJd_8c9cQcAc_QhAd4h2c() {
    assertEquals(
      "6h2s8h3c Th3s4d4c Ks4s8s5h 5cAh6d6s 7cJhJcQs 8c9cQcAc=QhAd4h2c 6c9s5dTd 2h9h2dJd",
      Solver.process("omaha-holdem 7d9dAsKhQd 5cAh6d6s 6c9s5dTd 6h2s8h3c Ks4s8s5h Th3s4d4c 7cJhJcQs 2h9h2dJd 8c9cQcAc QhAd4h2c"));
  }

  @Test
  public void test_omaha_holdem_6912_2d2s7dAcKd_JdTh3d9d_Qs5h8h9c_As8c2cJs_Jh6s4c7c_9s9hKhKc_Td7s4d3s_3h2h8d4s() {
    assertEquals(
      "Qs5h8h9c Jh6s4c7c 3h2h8d4s Td7s4d3s JdTh3d9d As8c2cJs 9s9hKhKc",
      Solver.process("omaha-holdem 2d2s7dAcKd JdTh3d9d Qs5h8h9c As8c2cJs Jh6s4c7c 9s9hKhKc Td7s4d3s 3h2h8d4s"));
  }

  @Test
  public void test_omaha_holdem_6913_5h9dAsKdTh_6d8hQcJh_4cKc2d2c() {
    assertEquals(
      "4cKc2d2c 6d8hQcJh",
      Solver.process("omaha-holdem 5h9dAsKdTh 6d8hQcJh 4cKc2d2c"));
  }

  @Test
  public void test_omaha_holdem_6914_3h5c8d8hTc_7sQd6s9d_ThAd3c8s_4cJd2s4h_7h3dQhJs_9s4dJhQs_8c3sKs2c_2d6cKd7c() {
    assertEquals(
      "7sQd6s9d 9s4dJhQs 2d6cKd7c 7h3dQhJs 4cJd2s4h 8c3sKs2c ThAd3c8s",
      Solver.process("omaha-holdem 3h5c8d8hTc 7sQd6s9d ThAd3c8s 4cJd2s4h 7h3dQhJs 9s4dJhQs 8c3sKs2c 2d6cKd7c"));
  }

  @Test
  public void test_omaha_holdem_6915_4h6dKdTdTh_4c9d2cKc_9c7c2sAc_6c7d8dAh_5sKh8sTs_3dJc4s3c_Js8h9s8c_7hQc9h2h_AdQdJdQh() {
    assertEquals(
      "7hQc9h2h 9c7c2sAc 3dJc4s3c Js8h9s8c 4c9d2cKc 6c7d8dAh AdQdJdQh 5sKh8sTs",
      Solver.process("omaha-holdem 4h6dKdTdTh 4c9d2cKc 9c7c2sAc 6c7d8dAh 5sKh8sTs 3dJc4s3c Js8h9s8c 7hQc9h2h AdQdJdQh"));
  }

  @Test
  public void test_omaha_holdem_6916_2d3s5d9dTh_7s9s8sKd_QcQdTd4s() {
    assertEquals(
      "7s9s8sKd QcQdTd4s",
      Solver.process("omaha-holdem 2d3s5d9dTh 7s9s8sKd QcQdTd4s"));
  }

  @Test
  public void test_omaha_holdem_6917_2h3h4h6dKd_9hTcQs5c_8dQd7dAd_Js4sJhQc_3s2d6c8c_4d9d7h3d_Ts8h5hAs_2c5s8sKc_7cAc5dTd_KhQhAh6s() {
    assertEquals(
      "9hTcQs5c 8dQd7dAd Js4sJhQc 4d9d7h3d 3s2d6c8c 2c5s8sKc 7cAc5dTd Ts8h5hAs KhQhAh6s",
      Solver.process("omaha-holdem 2h3h4h6dKd 9hTcQs5c 8dQd7dAd Js4sJhQc 3s2d6c8c 4d9d7h3d Ts8h5hAs 2c5s8sKc 7cAc5dTd KhQhAh6s"));
  }

  @Test
  public void test_omaha_holdem_6918_4h5c7d9cKs_Jh8hJs7c_Th4cKh3c_8c8d9dJc_3s6s5s6h_Ac3dKcJd_2c6c6dQd_9hKdAsQs_5d4s4d9s_8s2h3hTd() {
    assertEquals(
      "8s2h3hTd 2c6c6dQd 8c8d9dJc Jh8hJs7c Ac3dKcJd Th4cKh3c 9hKdAsQs 5d4s4d9s 3s6s5s6h",
      Solver.process("omaha-holdem 4h5c7d9cKs Jh8hJs7c Th4cKh3c 8c8d9dJc 3s6s5s6h Ac3dKcJd 2c6c6dQd 9hKdAsQs 5d4s4d9s 8s2h3hTd"));
  }

  @Test
  public void test_omaha_holdem_6919_3h5c7cKhQs_9c2d8h8d_AhAcThJs_QhQc7sAd_Qd4c2s2c_9hKc2h4h_5hAs9sJd_Jh7h3c6h() {
    assertEquals(
      "5hAs9sJd 9c2d8h8d Qd4c2s2c 9hKc2h4h AhAcThJs Jh7h3c6h QhQc7sAd",
      Solver.process("omaha-holdem 3h5c7cKhQs 9c2d8h8d AhAcThJs QhQc7sAd Qd4c2s2c 9hKc2h4h 5hAs9sJd Jh7h3c6h"));
  }

  @Test
  public void test_omaha_holdem_6920_2c6cJdJsTd_9s2dAs5c_QdAc5h3d_3s8d4h8h_7h6dJh7c() {
    assertEquals(
      "QdAc5h3d 9s2dAs5c 3s8d4h8h 7h6dJh7c",
      Solver.process("omaha-holdem 2c6cJdJsTd 9s2dAs5c QdAc5h3d 3s8d4h8h 7h6dJh7c"));
  }

  @Test
  public void test_omaha_holdem_6921_4h4s8sAcTd_Kh5hTcQh_7cQd7d3d() {
    assertEquals(
      "7cQd7d3d Kh5hTcQh",
      Solver.process("omaha-holdem 4h4s8sAcTd Kh5hTcQh 7cQd7d3d"));
  }

  @Test
  public void test_omaha_holdem_6922_2c2h7s9sTh_4h9c5s2s_3c9hAsKd_5dJdTc8s_KhJcKcAc_6hQs6s5c_4s4d8h6c() {
    assertEquals(
      "6hQs6s5c 3c9hAsKd KhJcKcAc 4s4d8h6c 5dJdTc8s 4h9c5s2s",
      Solver.process("omaha-holdem 2c2h7s9sTh 4h9c5s2s 3c9hAsKd 5dJdTc8s KhJcKcAc 6hQs6s5c 4s4d8h6c"));
  }

  @Test
  public void test_omaha_holdem_6923_5c9c9dAcQh_3sAdQd7s_3dJhQc6s_8h4c5s2d_TdKsJs9s() {
    assertEquals(
      "8h4c5s2d 3dJhQc6s 3sAdQd7s TdKsJs9s",
      Solver.process("omaha-holdem 5c9c9dAcQh 3sAdQd7s 3dJhQc6s 8h4c5s2d TdKsJs9s"));
  }

  @Test
  public void test_omaha_holdem_6924_3h5c7sAsJd_3d5h8d2h_Kc7c5dQd_8cQsKh2d_JsKd9s4d_5sAhJc9h_Qc2c4s6h_4h3s8sKs_6c4c9dTc() {
    assertEquals(
      "8cQsKh2d 4h3s8sKs JsKd9s4d 3d5h8d2h Kc7c5dQd 5sAhJc9h 6c4c9dTc=Qc2c4s6h",
      Solver.process("omaha-holdem 3h5c7sAsJd 3d5h8d2h Kc7c5dQd 8cQsKh2d JsKd9s4d 5sAhJc9h Qc2c4s6h 4h3s8sKs 6c4c9dTc"));
  }

  @Test
  public void test_omaha_holdem_6925_3c7cAcJsQs_QhJcKs3s_8h6sTh9d() {
    assertEquals(
      "8h6sTh9d QhJcKs3s",
      Solver.process("omaha-holdem 3c7cAcJsQs QhJcKs3s 8h6sTh9d"));
  }

  @Test
  public void test_omaha_holdem_6926_2h3c4c5c5s_7hJh8dTc_3s4dQdJd() {
    assertEquals(
      "7hJh8dTc 3s4dQdJd",
      Solver.process("omaha-holdem 2h3c4c5c5s 7hJh8dTc 3s4dQdJd"));
  }

  @Test
  public void test_omaha_holdem_6927_5d6c6hAhKs_3dTdKcQc_8s8dJh2c_2dTs4s8h_4dTcJd5h_3c7d2h7h_9c6sKhQd_Qh9hQs5s() {
    assertEquals(
      "2dTs4s8h 4dTcJd5h 3c7d2h7h 8s8dJh2c Qh9hQs5s 3dTdKcQc 9c6sKhQd",
      Solver.process("omaha-holdem 5d6c6hAhKs 3dTdKcQc 8s8dJh2c 2dTs4s8h 4dTcJd5h 3c7d2h7h 9c6sKhQd Qh9hQs5s"));
  }

  @Test
  public void test_omaha_holdem_6928_3d4s7c9dJh_8hQdAsTs_5h6d4dTd_Ah5s8s5c_6sJc6hTc_Ad8d7dQh_9c2h9sKh_2cQsJs3c_4cQc5d3s() {
    assertEquals(
      "Ah5s8s5c Ad8d7dQh 6sJc6hTc 4cQc5d3s 2cQsJs3c 9c2h9sKh 5h6d4dTd 8hQdAsTs",
      Solver.process("omaha-holdem 3d4s7c9dJh 8hQdAsTs 5h6d4dTd Ah5s8s5c 6sJc6hTc Ad8d7dQh 9c2h9sKh 2cQsJs3c 4cQc5d3s"));
  }

  @Test
  public void test_omaha_holdem_6929_5h7cKsQdTh_8h6s9sAc_2h2sQc7s() {
    assertEquals(
      "8h6s9sAc 2h2sQc7s",
      Solver.process("omaha-holdem 5h7cKsQdTh 8h6s9sAc 2h2sQc7s"));
  }

  @Test
  public void test_omaha_holdem_6930_2s4sAsKcTc_3s8hAdQd_7c6d5s2c() {
    assertEquals(
      "7c6d5s2c 3s8hAdQd",
      Solver.process("omaha-holdem 2s4sAsKcTc 3s8hAdQd 7c6d5s2c"));
  }

  @Test
  public void test_omaha_holdem_6931_4hJhKcKsQs_8dAh3dQd_5s8c2h3h() {
    assertEquals(
      "5s8c2h3h 8dAh3dQd",
      Solver.process("omaha-holdem 4hJhKcKsQs 8dAh3dQd 5s8c2h3h"));
  }

  @Test
  public void test_omaha_holdem_6932_3h4c7dAhQd_8d9d6dQs_Td5d4d7s_AdKdKsKc_3d3c2hAs() {
    assertEquals(
      "8d9d6dQs AdKdKsKc Td5d4d7s 3d3c2hAs",
      Solver.process("omaha-holdem 3h4c7dAhQd 8d9d6dQs Td5d4d7s AdKdKsKc 3d3c2hAs"));
  }

  @Test
  public void test_omaha_holdem_6933_3d4c5s6cTh_7h4sJcQd_7c8s2hKc_Ah9sJd6h_QcKs8dAd() {
    assertEquals(
      "QcKs8dAd Ah9sJd6h 7h4sJcQd 7c8s2hKc",
      Solver.process("omaha-holdem 3d4c5s6cTh 7h4sJcQd 7c8s2hKc Ah9sJd6h QcKs8dAd"));
  }

  @Test
  public void test_omaha_holdem_6934_2h3h4h7dKd_KcTs8hKh_5d6c6hKs_Jh9h5hAs_Th3sJs3d_2sQd4cQs_5c3cTcAd() {
    assertEquals(
      "2sQd4cQs Th3sJs3d 5c3cTcAd 5d6c6hKs Jh9h5hAs KcTs8hKh",
      Solver.process("omaha-holdem 2h3h4h7dKd KcTs8hKh 5d6c6hKs Jh9h5hAs Th3sJs3d 2sQd4cQs 5c3cTcAd"));
  }

  @Test
  public void test_omaha_holdem_6935_9dKhQcTcTs_7c4s9sQs_2h4c6s4h_6d3cAd5h_JdQh5dTh_Kd8hKcTd_2c6c7s7d() {
    assertEquals(
      "6d3cAd5h 2h4c6s4h 2c6c7s7d 7c4s9sQs JdQh5dTh Kd8hKcTd",
      Solver.process("omaha-holdem 9dKhQcTcTs 7c4s9sQs 2h4c6s4h 6d3cAd5h JdQh5dTh Kd8hKcTd 2c6c7s7d"));
  }

  @Test
  public void test_omaha_holdem_6936_3s5d8h8sTd_Jh2s6h2d_Kh4c8c2c_AcThQcQh_Js9c5hKs_Ts3hAsJc() {
    assertEquals(
      "Jh2s6h2d Js9c5hKs Ts3hAsJc AcThQcQh Kh4c8c2c",
      Solver.process("omaha-holdem 3s5d8h8sTd Jh2s6h2d Kh4c8c2c AcThQcQh Js9c5hKs Ts3hAsJc"));
  }

  @Test
  public void test_omaha_holdem_6937_3d4sJhKcKd_2sTh9c4h_4d9hQc7h_Ac8dJsJc_6c5c3hAs_Tc3s8s6h() {
    assertEquals(
      "Tc3s8s6h 6c5c3hAs 2sTh9c4h 4d9hQc7h Ac8dJsJc",
      Solver.process("omaha-holdem 3d4sJhKcKd 2sTh9c4h 4d9hQc7h Ac8dJsJc 6c5c3hAs Tc3s8s6h"));
  }

  @Test
  public void test_omaha_holdem_6938_3c9dAcQcQs_3d4h7c9s_4c6c5s5c_Ad3h9h2s() {
    assertEquals(
      "3d4h7c9s Ad3h9h2s 4c6c5s5c",
      Solver.process("omaha-holdem 3c9dAcQcQs 3d4h7c9s 4c6c5s5c Ad3h9h2s"));
  }

  @Test
  public void test_omaha_holdem_6939_3c7c7s9cTc_Ac5sKh5h_3d5d9h9d_Kc2sAh8c_Jc2cKs3h_Ts2h7d6c_8h4sKd6d_QdQc4cTh() {
    assertEquals(
      "Ac5sKh5h 8h4sKd6d Jc2cKs3h QdQc4cTh Kc2sAh8c Ts2h7d6c 3d5d9h9d",
      Solver.process("omaha-holdem 3c7c7s9cTc Ac5sKh5h 3d5d9h9d Kc2sAh8c Jc2cKs3h Ts2h7d6c 8h4sKd6d QdQc4cTh"));
  }

  @Test
  public void test_omaha_holdem_6940_4c7c8c8hJd_JsJc7hAc_2hKdAs2c_3h9dAh3c_5sTd2sQc_Qd6d7dQs_6hQhKc5h_Kh5d6s4h_Ad4d2dKs_9c3s8s5c() {
    assertEquals(
      "5sTd2sQc 2hKdAs2c 3h9dAh3c Ad4d2dKs Qd6d7dQs 6hQhKc5h=Kh5d6s4h 9c3s8s5c JsJc7hAc",
      Solver.process("omaha-holdem 4c7c8c8hJd JsJc7hAc 2hKdAs2c 3h9dAh3c 5sTd2sQc Qd6d7dQs 6hQhKc5h Kh5d6s4h Ad4d2dKs 9c3s8s5c"));
  }

  @Test
  public void test_omaha_holdem_6941_2d3h5s9d9s_8d2c6h3d_5c7dJd2h_6s6cThKs_As4dTcAc_Kd5d8h2s() {
    assertEquals(
      "8d2c6h3d 5c7dJd2h Kd5d8h2s 6s6cThKs As4dTcAc",
      Solver.process("omaha-holdem 2d3h5s9d9s 8d2c6h3d 5c7dJd2h 6s6cThKs As4dTcAc Kd5d8h2s"));
  }

  @Test
  public void test_omaha_holdem_6942_2d3h9c9dQs_As3sKs6h_4h7dTd6s_Qc2hQhKd() {
    assertEquals(
      "4h7dTd6s As3sKs6h Qc2hQhKd",
      Solver.process("omaha-holdem 2d3h9c9dQs As3sKs6h 4h7dTd6s Qc2hQhKd"));
  }

  @Test
  public void test_omaha_holdem_6943_7d7s9cAhQc_Ad3h2s3c_2d8d4hTd_QhKhAcKs_9h8s6sKc_Jh7c5c8h_9d4sKd4d_8cTc3d4c() {
    assertEquals(
      "2d8d4hTd=8cTc3d4c 9d4sKd4d=9h8s6sKc Ad3h2s3c QhKhAcKs Jh7c5c8h",
      Solver.process("omaha-holdem 7d7s9cAhQc Ad3h2s3c 2d8d4hTd QhKhAcKs 9h8s6sKc Jh7c5c8h 9d4sKd4d 8cTc3d4c"));
  }

  @Test
  public void test_omaha_holdem_6944_3c4c7hKcTh_4dTsAhAs_5s2h6h8d_JhQd7dKh_6d5d9d2d_JdKsKd7s_3s6s3d5c_2s7c9cJs_Jc8s8h4h_8cAd6c4s() {
    assertEquals(
      "Jc8s8h4h 4dTsAhAs JhQd7dKh JdKsKd7s 3s6s3d5c=5s2h6h8d=6d5d9d2d 8cAd6c4s 2s7c9cJs",
      Solver.process("omaha-holdem 3c4c7hKcTh 4dTsAhAs 5s2h6h8d JhQd7dKh 6d5d9d2d JdKsKd7s 3s6s3d5c 2s7c9cJs Jc8s8h4h 8cAd6c4s"));
  }

  @Test
  public void test_omaha_holdem_6945_2c6sKsThTs_5cAc5h8d_2dQsJh4s_8hAs8c3c_9d5sQh4c_JdQd9s9c_2s8sTcTd_9h7d7c6d_Kd4hJsJc_7sAhAd5d() {
    assertEquals(
      "9d5sQh4c 5cAc5h8d 9h7d7c6d 8hAs8c3c JdQd9s9c Kd4hJsJc 7sAhAd5d 2dQsJh4s 2s8sTcTd",
      Solver.process("omaha-holdem 2c6sKsThTs 5cAc5h8d 2dQsJh4s 8hAs8c3c 9d5sQh4c JdQd9s9c 2s8sTcTd 9h7d7c6d Kd4hJsJc 7sAhAd5d"));
  }

  @Test
  public void test_omaha_holdem_6946_2h2s7hAhJd_8hAs8c5s_4dJsKd2d_5cAdJh6s_Th8s7s4s_2c5d8d9s() {
    assertEquals(
      "Th8s7s4s 8hAs8c5s 5cAdJh6s 2c5d8d9s 4dJsKd2d",
      Solver.process("omaha-holdem 2h2s7hAhJd 8hAs8c5s 4dJsKd2d 5cAdJh6s Th8s7s4s 2c5d8d9s"));
  }

  @Test
  public void test_omaha_holdem_6947_3s8d9cQdQs_4s8sTd5s_4hKsTcJs_6c8hJc5d_9sAs6dKc() {
    assertEquals(
      "4s8sTd5s 6c8hJc5d 9sAs6dKc 4hKsTcJs",
      Solver.process("omaha-holdem 3s8d9cQdQs 4s8sTd5s 4hKsTcJs 6c8hJc5d 9sAs6dKc"));
  }

  @Test
  public void test_omaha_holdem_6948_2h6d6sAdJc_Ks8h9hTh_9c4h2sQd_5s8d8s6h_KhJs5hJh_2c7d9d7h() {
    assertEquals(
      "Ks8h9hTh 9c4h2sQd 2c7d9d7h 5s8d8s6h KhJs5hJh",
      Solver.process("omaha-holdem 2h6d6sAdJc Ks8h9hTh 9c4h2sQd 5s8d8s6h KhJs5hJh 2c7d9d7h"));
  }

  @Test
  public void test_omaha_holdem_6949_3d5d6d7hAd_Th8h4c4h_4dAsQc7c_JsAh9dQh_2hTsAc6h() {
    assertEquals(
      "JsAh9dQh 2hTsAc6h 4dAsQc7c Th8h4c4h",
      Solver.process("omaha-holdem 3d5d6d7hAd Th8h4c4h 4dAsQc7c JsAh9dQh 2hTsAc6h"));
  }

  @Test
  public void test_omaha_holdem_6950_8sAhJdThTs_6c9d8cTc_Js4c4s6d_7h9hKc3h_5dJc2s4h_2hTdQs6s_5cKh9c7c() {
    assertEquals(
      "5dJc2s4h Js4c4s6d 2hTdQs6s 5cKh9c7c=7h9hKc3h 6c9d8cTc",
      Solver.process("omaha-holdem 8sAhJdThTs 6c9d8cTc Js4c4s6d 7h9hKc3h 5dJc2s4h 2hTdQs6s 5cKh9c7c"));
  }

  @Test
  public void test_omaha_holdem_6951_3s4s5c7h9h_8sJdKdAd_4h9s9cQc_7s4c5h5d_Td9dTs2d_7d8dJh6d_Jc6cTh4d_6hKs8cAc() {
    assertEquals(
      "8sJdKdAd Td9dTs2d 7s4c5h5d 4h9s9cQc Jc6cTh4d 6hKs8cAc=7d8dJh6d",
      Solver.process("omaha-holdem 3s4s5c7h9h 8sJdKdAd 4h9s9cQc 7s4c5h5d Td9dTs2d 7d8dJh6d Jc6cTh4d 6hKs8cAc"));
  }

  @Test
  public void test_omaha_holdem_6952_2h4d5d8hTs_2s5cKs9d_JhAh4h3h_2c4sAd4c_7hAcKd3d_As7dQs8s_9sKhQhTd() {
    assertEquals(
      "As7dQs8s 9sKhQhTd 2s5cKs9d 2c4sAd4c 7hAcKd3d=JhAh4h3h",
      Solver.process("omaha-holdem 2h4d5d8hTs 2s5cKs9d JhAh4h3h 2c4sAd4c 7hAcKd3d As7dQs8s 9sKhQhTd"));
  }

  @Test
  public void test_omaha_holdem_6953_7hJdKcKhTc_3c3h4c4s_QsAc6hKs_Kd9hTd2d_9d2s7s7d() {
    assertEquals(
      "3c3h4c4s QsAc6hKs 9d2s7s7d Kd9hTd2d",
      Solver.process("omaha-holdem 7hJdKcKhTc 3c3h4c4s QsAc6hKs Kd9hTd2d 9d2s7s7d"));
  }

  @Test
  public void test_omaha_holdem_6954_3hAsJcJsQc_9h6h4d4h_JdAcTdQh_KsKh5c2h_Qd5h3c9c_Ah6d4sJh_7d2c3s8s() {
    assertEquals(
      "7d2c3s8s 9h6h4d4h Qd5h3c9c KsKh5c2h Ah6d4sJh=JdAcTdQh",
      Solver.process("omaha-holdem 3hAsJcJsQc 9h6h4d4h JdAcTdQh KsKh5c2h Qd5h3c9c Ah6d4sJh 7d2c3s8s"));
  }

  @Test
  public void test_omaha_holdem_6955_2c3s5d6s8d_QdKdTs3d_7h5cKs7s_Ac9d6dTc_9s8s4s4c_7cAd4h2s_Td8h6hTh() {
    assertEquals(
      "QdKdTs3d Ac9d6dTc 7h5cKs7s 9s8s4s4c Td8h6hTh 7cAd4h2s",
      Solver.process("omaha-holdem 2c3s5d6s8d QdKdTs3d 7h5cKs7s Ac9d6dTc 9s8s4s4c 7cAd4h2s Td8h6hTh"));
  }

  @Test
  public void test_omaha_holdem_6956_2c2d4sAhTs_KcAd3c7s_3dTc9c5h_4h9h6sJs() {
    assertEquals(
      "4h9h6sJs KcAd3c7s 3dTc9c5h",
      Solver.process("omaha-holdem 2c2d4sAhTs KcAd3c7s 3dTc9c5h 4h9h6sJs"));
  }

  @Test
  public void test_omaha_holdem_6957_2c3c6hAdKc_8s8c9cQc_8d4d3hAs_6dTdQh5s_Kd9d3d9s_2s2h3sQs_AcJd6c4s_6s5c2dTc_TsQd7s5h() {
    assertEquals(
      "TsQd7s5h 6dTdQh5s Kd9d3d9s 8d4d3hAs 2s2h3sQs 6s5c2dTc 8s8c9cQc AcJd6c4s",
      Solver.process("omaha-holdem 2c3c6hAdKc 8s8c9cQc 8d4d3hAs 6dTdQh5s Kd9d3d9s 2s2h3sQs AcJd6c4s 6s5c2dTc TsQd7s5h"));
  }

  @Test
  public void test_omaha_holdem_6958_5cAdAsKcTh_Jd6c4h6d_7cQs2hKs_9s6hTc8d_3s4c7d4s_JsQh2c4d() {
    assertEquals(
      "3s4c7d4s Jd6c4h6d 9s6hTc8d 7cQs2hKs JsQh2c4d",
      Solver.process("omaha-holdem 5cAdAsKcTh Jd6c4h6d 7cQs2hKs 9s6hTc8d 3s4c7d4s JsQh2c4d"));
  }

  @Test
  public void test_omaha_holdem_6959_2d4c7dJsQd_9cTh4hJd_Jh3s2hKh_8d9h8sKc_2sAhJc8c_Ad6s2cQc_9dKd3c5c_TsQs5h7s_6d7cQhAs() {
    assertEquals(
      "8d9h8sKc 2sAhJc8c=Jh3s2hKh 9cTh4hJd Ad6s2cQc 6d7cQhAs=TsQs5h7s 9dKd3c5c",
      Solver.process("omaha-holdem 2d4c7dJsQd 9cTh4hJd Jh3s2hKh 8d9h8sKc 2sAhJc8c Ad6s2cQc 9dKd3c5c TsQs5h7s 6d7cQhAs"));
  }

  @Test
  public void test_omaha_holdem_6960_2d2s4c9dKh_6s9h9cTh_Qs4sQh8c_6h2c4dAc_As7cKc3d_2h3s8s5d() {
    assertEquals(
      "Qs4sQh8c As7cKc3d 2h3s8s5d 6h2c4dAc 6s9h9cTh",
      Solver.process("omaha-holdem 2d2s4c9dKh 6s9h9cTh Qs4sQh8c 6h2c4dAc As7cKc3d 2h3s8s5d"));
  }

  @Test
  public void test_omaha_holdem_6961_3s4h7c8sKc_Td6h2hKs_6s7hQc7s_AcAs2d5c_TcQsJdQd_Kh8d6cJh_Qh7dAdKd() {
    assertEquals(
      "TcQsJdQd Td6h2hKs AcAs2d5c Qh7dAdKd Kh8d6cJh 6s7hQc7s",
      Solver.process("omaha-holdem 3s4h7c8sKc Td6h2hKs 6s7hQc7s AcAs2d5c TcQsJdQd Kh8d6cJh Qh7dAdKd"));
  }

  @Test
  public void test_omaha_holdem_6962_3c5d6sAdKh_Tc4s4dTd_8c2dAhTh_9c2s3d4h_7sKdJs9s_8sJd5c3h_JhAs2cQs() {
    assertEquals(
      "Tc4s4dTd 7sKdJs9s 8c2dAhTh JhAs2cQs 8sJd5c3h 9c2s3d4h",
      Solver.process("omaha-holdem 3c5d6sAdKh Tc4s4dTd 8c2dAhTh 9c2s3d4h 7sKdJs9s 8sJd5c3h JhAs2cQs"));
  }

  @Test
  public void test_omaha_holdem_6963_2c3c8hKcTc_7c4sQc5h_Ad3dKd6s_3s9s7s8c_8dJs5c6c_Qs6d9c8s() {
    assertEquals(
      "Qs6d9c8s 3s9s7s8c Ad3dKd6s 8dJs5c6c 7c4sQc5h",
      Solver.process("omaha-holdem 2c3c8hKcTc 7c4sQc5h Ad3dKd6s 3s9s7s8c 8dJs5c6c Qs6d9c8s"));
  }

  @Test
  public void test_omaha_holdem_6964_2s5s9c9sJs_7sTs8s6c_AhKhJd7d() {
    assertEquals(
      "AhKhJd7d 7sTs8s6c",
      Solver.process("omaha-holdem 2s5s9c9sJs 7sTs8s6c AhKhJd7d"));
  }

  @Test
  public void test_omaha_holdem_6965_2h7c9hKdKs_JhQs8sAh_5s5c4h2c_6dAcJcKc_7hTc4dAd_2s7d5dJs_8dQd5h2d_As3s9c6s_8hJd4sTd() {
    assertEquals(
      "8hJd4sTd JhQs8sAh 8dQd5h2d 5s5c4h2c 2s7d5dJs 7hTc4dAd As3s9c6s 6dAcJcKc",
      Solver.process("omaha-holdem 2h7c9hKdKs JhQs8sAh 5s5c4h2c 6dAcJcKc 7hTc4dAd 2s7d5dJs 8dQd5h2d As3s9c6s 8hJd4sTd"));
  }

  @Test
  public void test_omaha_holdem_6966_5h6h7d9dQd_7s7h7c5d_Ah6sKsTs_3cKdAc8h() {
    assertEquals(
      "3cKdAc8h Ah6sKsTs 7s7h7c5d",
      Solver.process("omaha-holdem 5h6h7d9dQd 7s7h7c5d Ah6sKsTs 3cKdAc8h"));
  }

  @Test
  public void test_omaha_holdem_6967_2h3s5h5s6s_Ts9sQd2d_Tc4c7d6d_5cTd7sKd_AcAh8h9h_JhJsJdQh_7h8dKcTh_2cJc5dQs() {
    assertEquals(
      "7h8dKcTh JhJsJdQh AcAh8h9h 5cTd7sKd Tc4c7d6d Ts9sQd2d 2cJc5dQs",
      Solver.process("omaha-holdem 2h3s5h5s6s Ts9sQd2d Tc4c7d6d 5cTd7sKd AcAh8h9h JhJsJdQh 7h8dKcTh 2cJc5dQs"));
  }

  @Test
  public void test_omaha_holdem_6968_7dKcKhQdQs_9sTd7cJs_Ts4d2s3h_Th3c2cTc_9d4c4s5h_2d3d6h9c_KdQcAdJc() {
    assertEquals(
      "2d3d6h9c Ts4d2s3h 9d4c4s5h 9sTd7cJs Th3c2cTc KdQcAdJc",
      Solver.process("omaha-holdem 7dKcKhQdQs 9sTd7cJs Ts4d2s3h Th3c2cTc 9d4c4s5h 2d3d6h9c KdQcAdJc"));
  }

  @Test
  public void test_omaha_holdem_6969_4d5c9hJhTh_Kh3c2c9s_3s5h2s9c_4c4sTdAs() {
    assertEquals(
      "Kh3c2c9s 3s5h2s9c 4c4sTdAs",
      Solver.process("omaha-holdem 4d5c9hJhTh Kh3c2c9s 3s5h2s9c 4c4sTdAs"));
  }

  @Test
  public void test_omaha_holdem_6970_6c6h7h9sAh_4h2c8s5s_Qd3sAcTh_8c8dAd4c_7dTs5cTc_9cKdQh5h_Ks2s9dQc_3hJsJc4d() {
    assertEquals(
      "Ks2s9dQc 7dTs5cTc 3hJsJc4d 8c8dAd4c Qd3sAcTh 4h2c8s5s 9cKdQh5h",
      Solver.process("omaha-holdem 6c6h7h9sAh 4h2c8s5s Qd3sAcTh 8c8dAd4c 7dTs5cTc 9cKdQh5h Ks2s9dQc 3hJsJc4d"));
  }

  @Test
  public void test_omaha_holdem_6971_4c4d7c9cAh_6cTc4s7h_Ad3hQh7s() {
    assertEquals(
      "Ad3hQh7s 6cTc4s7h",
      Solver.process("omaha-holdem 4c4d7c9cAh 6cTc4s7h Ad3hQh7s"));
  }

  @Test
  public void test_omaha_holdem_6972_4c8c8dKcTh_Jh3cQc9s_3s5sAd7c_4h9c7h5h() {
    assertEquals(
      "3s5sAd7c 4h9c7h5h Jh3cQc9s",
      Solver.process("omaha-holdem 4c8c8dKcTh Jh3cQc9s 3s5sAd7c 4h9c7h5h"));
  }

  @Test
  public void test_omaha_holdem_6973_2h6dKcKsTc_5d4h6c2c_4c3h4s9h() {
    assertEquals(
      "4c3h4s9h 5d4h6c2c",
      Solver.process("omaha-holdem 2h6dKcKsTc 5d4h6c2c 4c3h4s9h"));
  }

  @Test
  public void test_omaha_holdem_6974_3c3s6sTdTs_Tc8d3d5d_Qd8s8h2c_9h3h9cKd() {
    assertEquals(
      "Qd8s8h2c 9h3h9cKd Tc8d3d5d",
      Solver.process("omaha-holdem 3c3s6sTdTs Tc8d3d5d Qd8s8h2c 9h3h9cKd"));
  }

  @Test
  public void test_omaha_holdem_6975_3h8cJcKdKs_7sTh8hAh_Tc9s4h6h_6s4d4cKc_7c9cTd2d_6cQcQs9h() {
    assertEquals(
      "7c9cTd2d=Tc9s4h6h 7sTh8hAh 6cQcQs9h 6s4d4cKc",
      Solver.process("omaha-holdem 3h8cJcKdKs 7sTh8hAh Tc9s4h6h 6s4d4cKc 7c9cTd2d 6cQcQs9h"));
  }

  @Test
  public void test_omaha_holdem_6976_3d4s5hKdQs_6hJsJcKh_6c8dJh2c_Qc8hTdAc_7hAh2s2d() {
    assertEquals(
      "Qc8hTdAc 6hJsJcKh 7hAh2s2d 6c8dJh2c",
      Solver.process("omaha-holdem 3d4s5hKdQs 6hJsJcKh 6c8dJh2c Qc8hTdAc 7hAh2s2d"));
  }

  @Test
  public void test_omaha_holdem_6977_3s6c8h8sAh_4dAs7d7s_Jh5h8c2h_TsQh3c6d_4cQcAc5c_3hJcJsKd_2sAdKs9c_9s5s2dTd_Qs9h4hTc_Jd6s2c8d() {
    assertEquals(
      "9s5s2dTd Qs9h4hTc TsQh3c6d 3hJcJsKd 4dAs7d7s 4cQcAc5c 2sAdKs9c Jh5h8c2h Jd6s2c8d",
      Solver.process("omaha-holdem 3s6c8h8sAh 4dAs7d7s Jh5h8c2h TsQh3c6d 4cQcAc5c 3hJcJsKd 2sAdKs9c 9s5s2dTd Qs9h4hTc Jd6s2c8d"));
  }

  @Test
  public void test_omaha_holdem_6978_2h3s5cAdJd_Jc4d9h5d_AcKcKs4h_8h7c6c7h() {
    assertEquals(
      "8h7c6c7h AcKcKs4h=Jc4d9h5d",
      Solver.process("omaha-holdem 2h3s5cAdJd Jc4d9h5d AcKcKs4h 8h7c6c7h"));
  }

  @Test
  public void test_omaha_holdem_6979_3s8d9hJcQh_8h9sTh8s_Kh8c7c5d_5cAh6cJd_4dTsJs6h_9cQc9dKs() {
    assertEquals(
      "Kh8c7c5d 5cAh6cJd 9cQc9dKs 4dTsJs6h=8h9sTh8s",
      Solver.process("omaha-holdem 3s8d9hJcQh 8h9sTh8s Kh8c7c5d 5cAh6cJd 4dTsJs6h 9cQc9dKs"));
  }

  @Test
  public void test_omaha_holdem_6980_2c3h9cJsKh_2sTs6h8d_4hJh7d5c_5hQdJc2h_9hAdTd4c_3s8cKcAs() {
    assertEquals(
      "2sTs6h8d 9hAdTd4c 4hJh7d5c 5hQdJc2h 3s8cKcAs",
      Solver.process("omaha-holdem 2c3h9cJsKh 2sTs6h8d 4hJh7d5c 5hQdJc2h 9hAdTd4c 3s8cKcAs"));
  }

  @Test
  public void test_omaha_holdem_6981_5hAsKdQcTd_8s4hJsJc_5c5d5sKs_6h9d9sKc() {
    assertEquals(
      "8s4hJsJc 6h9d9sKc 5c5d5sKs",
      Solver.process("omaha-holdem 5hAsKdQcTd 8s4hJsJc 5c5d5sKs 6h9d9sKc"));
  }

  @Test
  public void test_omaha_holdem_6982_6s7c7sJhQd_9dQs9h2d_6d8c2c2h() {
    assertEquals(
      "6d8c2c2h 9dQs9h2d",
      Solver.process("omaha-holdem 6s7c7sJhQd 9dQs9h2d 6d8c2c2h"));
  }

  @Test
  public void test_omaha_holdem_6983_5c7d9cAhKh_5d5s3d3h_KsKcAcTh_Js6c4h6s_Qd8h6h7c_4s2h8s8c_JhQs9h3s_AdJc4d9d_Qh7s4cQc_Td3c7h2d() {
    assertEquals(
      "Js6c4h6s Td3c7h2d 4s2h8s8c JhQs9h3s Qh7s4cQc AdJc4d9d 5d5s3d3h KsKcAcTh Qd8h6h7c",
      Solver.process("omaha-holdem 5c7d9cAhKh 5d5s3d3h KsKcAcTh Js6c4h6s Qd8h6h7c 4s2h8s8c JhQs9h3s AdJc4d9d Qh7s4cQc Td3c7h2d"));
  }

  @Test
  public void test_omaha_holdem_6984_5c7s8dJsTs_4c8h9dQc_5s7h6s4h_As2s6hJh_4dQh7dQd() {
    assertEquals(
      "4dQh7dQd 4c8h9dQc 5s7h6s4h As2s6hJh",
      Solver.process("omaha-holdem 5c7s8dJsTs 4c8h9dQc 5s7h6s4h As2s6hJh 4dQh7dQd"));
  }

  @Test
  public void test_omaha_holdem_6985_5d6d8d9sKd_3cThKc7c_QhJc7h7d_5h7sQs2s() {
    assertEquals(
      "QhJc7h7d 5h7sQs2s 3cThKc7c",
      Solver.process("omaha-holdem 5d6d8d9sKd 3cThKc7c QhJc7h7d 5h7sQs2s"));
  }

  @Test
  public void test_omaha_holdem_6986_7c9cJsQsTs_8d3sJd9h_7hAh8cTh_6c2sAs8h_3c2cJhTc_Qc6s3hQd() {
    assertEquals(
      "3c2cJhTc Qc6s3hQd 7hAh8cTh=8d3sJd9h 6c2sAs8h",
      Solver.process("omaha-holdem 7c9cJsQsTs 8d3sJd9h 7hAh8cTh 6c2sAs8h 3c2cJhTc Qc6s3hQd"));
  }

  @Test
  public void test_omaha_holdem_6987_2s7d8dThTs_JsAcAhAd_5s2d9c6h_4s5cTdTc_As8s3c8c_4c4hQs3s_Qh9d9s2c() {
    assertEquals(
      "4c4hQs3s Qh9d9s2c JsAcAhAd 5s2d9c6h As8s3c8c 4s5cTdTc",
      Solver.process("omaha-holdem 2s7d8dThTs JsAcAhAd 5s2d9c6h 4s5cTdTc As8s3c8c 4c4hQs3s Qh9d9s2c"));
  }

  @Test
  public void test_omaha_holdem_6988_5h7sAsJdTh_8c6d8dAc_Js3dKs4c_7cJhQc9d_Qd4dQh5s_Kc4h6h8h() {
    assertEquals(
      "Kc4h6h8h Js3dKs4c Qd4dQh5s 8c6d8dAc 7cJhQc9d",
      Solver.process("omaha-holdem 5h7sAsJdTh 8c6d8dAc Js3dKs4c 7cJhQc9d Qd4dQh5s Kc4h6h8h"));
  }

  @Test
  public void test_omaha_holdem_6989_4s7c7hAhQc_As9h2dKc_5c3c4dKd() {
    assertEquals(
      "5c3c4dKd As9h2dKc",
      Solver.process("omaha-holdem 4s7c7hAhQc As9h2dKc 5c3c4dKd"));
  }

  @Test
  public void test_omaha_holdem_6990_2d2h5s9sKd_Kh8dAc7h_Ts8sJcQd_4dQhJsAs() {
    assertEquals(
      "Ts8sJcQd 4dQhJsAs Kh8dAc7h",
      Solver.process("omaha-holdem 2d2h5s9sKd Kh8dAc7h Ts8sJcQd 4dQhJsAs"));
  }

  @Test
  public void test_omaha_holdem_6991_8c9hJdJsKs_Th5hAc4h_8s4d7c2c_KcTd2sTc_6sQs8hTs() {
    assertEquals(
      "Th5hAc4h 8s4d7c2c KcTd2sTc 6sQs8hTs",
      Solver.process("omaha-holdem 8c9hJdJsKs Th5hAc4h 8s4d7c2c KcTd2sTc 6sQs8hTs"));
  }

  @Test
  public void test_omaha_holdem_6992_2h3c3s4sAs_8cKd9s5s_Ac2s2d2c_QdJd9c4d_KhQhQs7d_6c7s5dAd_5h9hJs4c_Th8d4hTc() {
    assertEquals(
      "QdJd9c4d Th8d4hTc KhQhQs7d 5h9hJs4c 6c7s5dAd 8cKd9s5s Ac2s2d2c",
      Solver.process("omaha-holdem 2h3c3s4sAs 8cKd9s5s Ac2s2d2c QdJd9c4d KhQhQs7d 6c7s5dAd 5h9hJs4c Th8d4hTc"));
  }

  @Test
  public void test_omaha_holdem_6993_4s6s8dJsKc_8s4c4h5d_Kd5sQs3c_JhJdKhTc_9cKsAs8c() {
    assertEquals(
      "8s4c4h5d JhJdKhTc Kd5sQs3c 9cKsAs8c",
      Solver.process("omaha-holdem 4s6s8dJsKc 8s4c4h5d Kd5sQs3c JhJdKhTc 9cKsAs8c"));
  }

  @Test
  public void test_omaha_holdem_6994_7c7d8hQsTh_8s6d2d6s_Ks3h3c3d_Ts6c2sAh() {
    assertEquals(
      "Ks3h3c3d 8s6d2d6s Ts6c2sAh",
      Solver.process("omaha-holdem 7c7d8hQsTh 8s6d2d6s Ks3h3c3d Ts6c2sAh"));
  }

  @Test
  public void test_omaha_holdem_6995_8d9cJhKhQd_3dAc6cKd_2d7h7d9h_Ks5sJs9d_3hJd2s2c_Th2h7c6s_7s8hAd6d_4dKc4cAh() {
    assertEquals(
      "7s8hAd6d 2d7h7d9h 3hJd2s2c 3dAc6cKd=4dKc4cAh Ks5sJs9d Th2h7c6s",
      Solver.process("omaha-holdem 8d9cJhKhQd 3dAc6cKd 2d7h7d9h Ks5sJs9d 3hJd2s2c Th2h7c6s 7s8hAd6d 4dKc4cAh"));
  }

  @Test
  public void test_omaha_holdem_6996_3d5h9dAsTs_AhQcJd3s_Th7c4d4h_8d2dKsAc_2c5c8s4c_QdTd7h9s_6d8cKd3c_5d9hAdKc_8h6sKh2s() {
    assertEquals(
      "8h6sKh2s 6d8cKd3c Th7c4d4h 8d2dKsAc QdTd7h9s AhQcJd3s 5d9hAdKc 2c5c8s4c",
      Solver.process("omaha-holdem 3d5h9dAsTs AhQcJd3s Th7c4d4h 8d2dKsAc 2c5c8s4c QdTd7h9s 6d8cKd3c 5d9hAdKc 8h6sKh2s"));
  }

  @Test
  public void test_omaha_holdem_6997_2s3hAdKcTs_7sAs4sJd_KsTc9d3s_7cJh8sQd_2d9c9s7d_6d5d5s5c_6c4hJcKh_4dQhQs8h_3c8dAcJs_Ah7h8cQc() {
    assertEquals(
      "6d5d5s5c 2d9c9s7d 4dQhQs8h 6c4hJcKh 7sAs4sJd Ah7h8cQc KsTc9d3s 3c8dAcJs 7cJh8sQd",
      Solver.process("omaha-holdem 2s3hAdKcTs 7sAs4sJd KsTc9d3s 7cJh8sQd 2d9c9s7d 6d5d5s5c 6c4hJcKh 4dQhQs8h 3c8dAcJs Ah7h8cQc"));
  }

  @Test
  public void test_omaha_holdem_6998_2c3d5c5s8c_4sAd8sAc_Ah6d3h4h() {
    assertEquals(
      "4sAd8sAc Ah6d3h4h",
      Solver.process("omaha-holdem 2c3d5c5s8c 4sAd8sAc Ah6d3h4h"));
  }

  @Test
  public void test_omaha_holdem_6999_5c5h6hTcTd_3dThQs8s_9c4h3s5d_9d8hJdAd_7sQd6cAs_JhTs3h4c_KcKd7c9h_4d9s8cAc_Ks6s2d8d_Ah5sQh2s() {
    assertEquals(
      "4d9s8cAc 9d8hJdAd Ks6s2d8d 7sQd6cAs KcKd7c9h 9c4h3s5d Ah5sQh2s JhTs3h4c 3dThQs8s",
      Solver.process("omaha-holdem 5c5h6hTcTd 3dThQs8s 9c4h3s5d 9d8hJdAd 7sQd6cAs JhTs3h4c KcKd7c9h 4d9s8cAc Ks6s2d8d Ah5sQh2s"));
  }

}
